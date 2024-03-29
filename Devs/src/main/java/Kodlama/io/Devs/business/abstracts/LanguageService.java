package Kodlama.io.Devs.business.abstracts;

import Kodlama.io.Devs.business.concretes.request.CreateLanguageRequest;
import Kodlama.io.Devs.business.concretes.request.DeleteLanguageRequest;
import Kodlama.io.Devs.business.concretes.request.UpDateLanguageRequest;
import Kodlama.io.Devs.business.concretes.response.GetAllLanguageResponse;
import java.util.*;
public interface LanguageService {

    static List<GetAllLanguageResponse> getAll() {
        return null;
    }

    public GetAllLanguageResponse getById(int id);
    void add(CreateLanguageRequest createProgrammingLanguageRequest) throws Exception;
    void delete(DeleteLanguageRequest deleteLanguageRequest) throws Exception;
    void upDate (UpDateLanguageRequest upDateLanguageRequest) throws Exception;



}
