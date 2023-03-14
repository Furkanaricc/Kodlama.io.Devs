package Kodlama.io.Devs.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Technologies")

public class Technology {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int İd;
    @Column(name="name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "language_id")
    private  Language language;

}
