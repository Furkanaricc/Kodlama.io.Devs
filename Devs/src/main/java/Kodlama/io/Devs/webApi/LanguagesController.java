package Kodlama.io.Devs.webApi;

import Kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Devs.business.concretes.request.CreateLanguageRequest;
import Kodlama.io.Devs.business.concretes.request.DeleteLanguageRequest;
import Kodlama.io.Devs.business.concretes.request.UpDateLanguageRequest;
import Kodlama.io.Devs.business.concretes.response.GetAllLanguageResponse;
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
    @GetMapping("/getAll")
    public List<GetAllLanguageResponse>getAll(){
        return LanguageService.getAll();

    }@GetMapping("/getbyid/{id}")
    public GetAllLanguageResponse getById(CreateLanguageRequest createRequest) {
        return this.languageService.getById(createRequest.getId());
    }
    @PostMapping("/add")
    public void add(CreateLanguageRequest createRequest) throws Exception {
        this.languageService.add(createRequest);
    }

    @DeleteMapping("/delete")
    public void delete(DeleteLanguageRequest deleteLanguageRequest)throws Exception{
        this.languageService.delete(deleteLanguageRequest);
    }

    @PutMapping("/update/{id}")
    public void update(UpDateLanguageRequest upDateLanguageRequest)throws  Exception{
        this.languageService.upDate(upDateLanguageRequest);
    }

}





























