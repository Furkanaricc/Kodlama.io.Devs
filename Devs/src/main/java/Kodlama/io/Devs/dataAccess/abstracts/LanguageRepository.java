package Kodlama.io.Devs.dataAccess.abstracts;

import Kodlama.io.Devs.entities.concretes.Language;
import java.util.*;

public interface LanguageRepository {

    List<Language> getAll();
    void addLanguage(Language language);
    void deleteLanguage(int id);
    void updateLanguage(Language exLanguage,Language newLanguage);
    Language getLanguageById(int id);
}
