package Kodlama.io.Devs.dataAccess.concretes;

import Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Devs.entities.concretes.Language;

import java.util.ArrayList;
import java.util.List;

public class InMemoryLanguageRepository implements LanguageRepository {

    List<Language> languages;


    @Override
    public List<Language> getAll() {
        return languages;
    }

    @Override
    public void addLanguage(Language language) {
        languages= new ArrayList<Language>();
        languages.add(new Language("Java",1));
        languages.add(new Language("Php",2));
        languages.add(new Language("C#",3));
        languages.add(new Language("Phyton",4));

    }

    @Override
    public void deleteLanguage(int id) {
        languages.remove(id);
    }

    @Override
    public void updateLanguage(Language exLanguage, Language newLanguage) {
        languages.set(exLanguage.getId(),newLanguage);

    }

    @Override
    public Language getLanguageById(int id) {
        return languages.get(id);
    }
}
