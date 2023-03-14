package Kodlama.io.Devs.business.concretes;

import Kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Devs.business.concretes.request.CreateLanguageRequest;
import Kodlama.io.Devs.business.concretes.request.DeleteLanguageRequest;
import Kodlama.io.Devs.business.concretes.request.UpDateLanguageRequest;
import Kodlama.io.Devs.business.concretes.response.GetAllLanguageResponse;
import Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LanguageManager implements LanguageService {

    private LanguageRepository languageRepository;

    @Autowired
    public LanguageManager(LanguageRepository languageRepository){
        super();
        this.languageRepository=languageRepository;
    }

    public List<GetAllLanguageResponse> getAll() {
        return null;
    }

    @Override
    public GetAllLanguageResponse getById(int id) {
        return null;
    }

    @Override
    public void add(CreateLanguageRequest createProgrammingLanguageRequest) throws Exception {

    }

    @Override
    public void delete(DeleteLanguageRequest deleteLanguageRequest) throws Exception {

    }

    @Override
    public void upDate(UpDateLanguageRequest upDateLanguageRequest) throws Exception {

    }
}
