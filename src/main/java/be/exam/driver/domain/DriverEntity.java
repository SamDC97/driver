package be.exam.driver.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DriverEntity {

    @Id
    private Long id;
    private String name;
    private Long age;
    private String nationality;
}
