package Kodlama.io.Devs.dataAccess.abstracts;

import Kodlama.io.Devs.entities.concretes.Technology;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TechnologyRepository extends JpaRepository<Technology,Integer> {
    //JPA İLE bütün fonksiyonlar neredeyse hazır.
    //CONCRETE 'ı yok. Bellekte implemente etmiş gibi
    //bir class oluşturuyor. Ekstra gerekmiyor.

}
