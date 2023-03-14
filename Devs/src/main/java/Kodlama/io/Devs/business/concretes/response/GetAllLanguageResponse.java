package Kodlama.io.Devs.business.concretes.response;

import Kodlama.io.Devs.entities.concretes.Technology;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllLanguageResponse {
    private int id;
    private String name;
    List<Technology>technology;
}
