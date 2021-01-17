package be.exam.driver.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Driver {

    private Long id;
    private String name;
    private Long age;
    private String nationality;
}
