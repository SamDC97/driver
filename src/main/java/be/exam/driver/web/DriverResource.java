package be.exam.driver.web;

import be.exam.driver.service.DriverService;
import be.exam.driver.service.dto.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DriverResource {

    @Autowired
    private DriverService driverService;

    @PostMapping("/add-driver")
    private void addDriver(@RequestBody Driver driver){
        driverService.addDriver(driver);
    }

    @GetMapping("/drivers")
    private ResponseEntity<List<Driver>> getAll(){
        List<Driver> driverList = driverService.getAll();
        return new ResponseEntity<>(driverList, HttpStatus.OK);
    }

    @GetMapping("/driver/{id}")
    private ResponseEntity<Driver> getById(@PathVariable Long id){
        return new ResponseEntity<>(driverService.getById(id), HttpStatus.OK);
    }
}
