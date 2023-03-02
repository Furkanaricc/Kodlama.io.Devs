package Kodlama.io.Devs.webApi;

import Kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Devs.entities.concretes.Language;
import jakarta.validation.constraints.Max;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
    private LanguageService languageService;

    @Autowired
    public LanguagesController(LanguageService languageService) {
        this.languageService = languageService;
    }
    public void insertNewLanguage(@RequestBody Language language){
        languageService.addLanguage(language);
    }

    @GetMapping("/getAll")
    public List<Language> getAll(){
        return languageService.getAll();
    }
   
}
