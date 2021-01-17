package be.exam.driver.service.mapper;

import be.exam.driver.domain.DriverEntity;
import be.exam.driver.service.dto.Driver;
import org.springframework.stereotype.Component;

@Component
public class DriverMapper {

    public DriverEntity toEntity(Driver driver){
        return new DriverEntity(driver.getId(), driver.getName(), driver.getAge(), driver.getNationality());
    }

    public Driver toDTO(DriverEntity driverEntity){
        return new Driver(driverEntity.getId(),  driverEntity.getName(), driverEntity.getAge(), driverEntity.getNationality());
    }
}
