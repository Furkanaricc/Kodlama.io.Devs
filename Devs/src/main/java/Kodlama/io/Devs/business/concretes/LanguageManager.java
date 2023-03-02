package Kodlama.io.Devs.business.concretes;

import Kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Devs.entities.concretes.Language;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;

@Service
public class LanguageManager implements LanguageService {

    private LanguageRepository languageRepository;

    @Override
    public List<Language> getAll() {

        languageRepository.getAll();
        return null;
    }

    @Override
    public void addLanguage(Language language) {
        Scanner scan1= new Scanner(System.in);
        System.out.println("Dil adı girin.");
        String nameAdd=scan1.nextLine();
        Scanner scan2=new Scanner(System.in);
        System.out.println("Id giriniz.");
        int idAdd=scan2.nextInt();

    }

    @Override
    public void deleteLanguage(int id) {
        languageRepository.deleteLanguage(id);

    }

    @Override
    public void updateLanguage(Language exLanguage, Language newLanguage) {
        isNameEmpty(newLanguage);
        languageRepository.updateLanguage(exLanguage,newLanguage);
    }

    @Override
    public Language getLanguageById(int id) {
        languageRepository.getLanguageById(id);
        return null;
    }

    @Override
    public void isNameEmpty(Language language) {

        if(language.getName().isEmpty()){
            System.out.println("İsim boş olamaz.");
            return;
            }

    }

    @Override
    public void isNameAlreadyExist(Language language) {
        List<Language> allLangguages = languageRepository.getAll();
        for(Language l:allLangguages) {
            if(l.getName().equals(language.getName())) {

                System.out.println("Aynı isim tekrar edemez");
            }
        }

    }

  /*  @Autowired
    public LanguageManager(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }
*/

}
