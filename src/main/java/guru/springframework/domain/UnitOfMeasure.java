package guru.springframework.domain;

import lombok.*;
import org.hibernate.annotations.Generated;

import javax.persistence.*;

@Data
@Entity
public class UnitOfMeasure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

}
