package Kodlama.io.Devs.business.abstracts;

import Kodlama.io.Devs.entities.concretes.Language;
import java.util.*;

public interface LanguageService {

    List<Language> getAll();
    void addLanguage(Language language);
    void deleteLanguage(int id);
    void updateLanguage(Language exLanguage,Language newLanguage);
    Language getLanguageById(int id);
    void  isNameEmpty(Language language);
    void isNameAlreadyExist(Language language);


}
