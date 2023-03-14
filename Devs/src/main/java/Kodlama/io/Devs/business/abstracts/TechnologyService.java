package Kodlama.io.Devs.business.abstracts;
import java.util.*;

import Kodlama.io.Devs.business.concretes.request.CreateTechnologyRequest;
import Kodlama.io.Devs.business.concretes.request.DeleteLanguageRequest;
import Kodlama.io.Devs.business.concretes.request.UpDateLanguageRequest;
import Kodlama.io.Devs.business.concretes.response.GetAllLanguageResponse;
import Kodlama.io.Devs.business.concretes.response.GetAllTechnologyResponse;

public interface TechnologyService {
    static List<GetAllTechnologyResponse> getAll() {
        return null;
    }

    public GetAllLanguageResponse getById(int id);
    void add (CreateTechnologyRequest createTechnologyRequest) throws Exception;
    void delete(DeleteLanguageRequest deleteLanguageRequest) throws Exception;
    void update(UpDateLanguageRequest upDateLanguageRequest) throws  Exception;


}
