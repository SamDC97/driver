package be.exam.driver.service;

import be.exam.driver.domain.DriverEntity;
import be.exam.driver.domain.repository.DriverRepository;
import be.exam.driver.service.dto.Driver;
import be.exam.driver.service.mapper.DriverMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class DriverService {

    @Autowired
    private DriverMapper driverMapper;
    @Autowired
    private DriverRepository driverRepository;

    public void addDriver(Driver driver){
        driverRepository.save(driverMapper.toEntity(driver));
    }

    public List<Driver> getAll(){
        return StreamSupport.stream(driverRepository.findAll().spliterator(), false)
                .map(d -> driverMapper.toDTO(d))
                .collect(Collectors.toList());
    }

    public  Driver getById(Long id){
        Optional<DriverEntity> optionalDriverEntity = driverRepository.findById(id);
        if (optionalDriverEntity.isPresent()){
            return driverMapper.toDTO(optionalDriverEntity.get());
        }
        return null;
    }
}
