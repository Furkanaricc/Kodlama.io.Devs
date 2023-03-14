package Kodlama.io.Devs.webApi;
import java.util.*;

import Kodlama.io.Devs.business.abstracts.TechnologyService;
import Kodlama.io.Devs.business.concretes.request.CreateTechnologyRequest;
import Kodlama.io.Devs.business.concretes.request.DeleteLanguageRequest;
import Kodlama.io.Devs.business.concretes.request.UpDateLanguageRequest;
import Kodlama.io.Devs.business.concretes.response.GetAllLanguageResponse;
import Kodlama.io.Devs.business.concretes.response.GetAllTechnologyResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

public class TechnologyController {
    private TechnologyService technologyService;

    @Autowired
    public TechnologyController(TechnologyService technologyService){
        this.technologyService=technologyService;
    }
    @GetMapping("(/getAll")
    public List<GetAllTechnologyResponse>getAll(){
        return TechnologyService.getAll();
    }
    @GetMapping("/getById/{id}")
    public GetAllLanguageResponse getById(CreateTechnologyRequest createTechnologyRequest){
        return  this.technologyService.getById(createTechnologyRequest.getId());
    }
    @PostMapping("/add")
    public void add(CreateTechnologyRequest createTechnologyRequest)throws Exception{
        this.technologyService.add(createTechnologyRequest);

    }
    @DeleteMapping("/delete")
    public void delete(DeleteLanguageRequest deleteLanguageRequest)throws Exception{
        this.technologyService.delete(deleteLanguageRequest);
    }
    @PutMapping("/update/{id")
    public void update(UpDateLanguageRequest upDateLanguageRequest)throws Exception{
        this.technologyService.update(upDateLanguageRequest);
    }


}

