package Kodlama.io.Devs.business.concretes.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllTechnologyResponse {
    private int id;
    private String name;
    private String language;
}
