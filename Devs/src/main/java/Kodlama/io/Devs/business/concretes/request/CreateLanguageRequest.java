package Kodlama.io.Devs.business.concretes.request;

import Kodlama.io.Devs.entities.concretes.Language;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateLanguageRequest {
    //Api'den gelen kısım buraası. Bu nokta apiden geleni class'a çevirdiğimiz nokta, biz de buna response cevaplar oluşturuyoruz.
    private int id;
    private String name;

}
