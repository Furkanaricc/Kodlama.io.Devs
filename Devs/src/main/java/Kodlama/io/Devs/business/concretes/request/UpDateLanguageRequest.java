package Kodlama.io.Devs.business.concretes.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpDateLanguageRequest {
    private int id;
    private String name;

}
