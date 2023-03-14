package Kodlama.io.Devs.business.concretes;

import Kodlama.io.Devs.business.abstracts.TechnologyService;
import Kodlama.io.Devs.business.concretes.request.CreateTechnologyRequest;
import Kodlama.io.Devs.business.concretes.request.DeleteLanguageRequest;
import Kodlama.io.Devs.business.concretes.request.UpDateLanguageRequest;
import Kodlama.io.Devs.business.concretes.response.GetAllLanguageResponse;
import Kodlama.io.Devs.business.concretes.response.GetAllTechnologyResponse;
import Kodlama.io.Devs.dataAccess.abstracts.TechnologyRepository;

import java.util.List;

public class TechnologyManager implements TechnologyService {
    private TechnologyRepository technologyRepository;
     public TechnologyManager(TechnologyRepository technologyRepository){
         super();
         this.technologyRepository=technologyRepository;
     }


    public List<GetAllTechnologyResponse> getAll() {
        return null;
    }

    @Override
    public GetAllLanguageResponse getById(int id) {
        return null;
    }

    @Override
    public void add(CreateTechnologyRequest createTechnologyRequest) throws Exception {

    }

    @Override
    public void delete(DeleteLanguageRequest deleteLanguageRequest) throws Exception {

    }

    @Override
    public void update(UpDateLanguageRequest upDateLanguageRequest) throws Exception {

    }
}
