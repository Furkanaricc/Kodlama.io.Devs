package Kodlama.io.Devs.business.concretes.request;

import Kodlama.io.Devs.entities.concretes.Language;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpDateTechnologyRequest {
    private int id;
    private String name;
    private Language language;
}
