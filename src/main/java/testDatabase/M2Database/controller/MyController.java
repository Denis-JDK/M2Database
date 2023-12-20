package testDatabase.M2Database.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import testDatabase.M2Database.entity.AddressEntity;
import testDatabase.M2Database.model.UserDto;
import testDatabase.M2Database.service.MyService;

@RestController
public class MyController {

private final MyService myService;


    @Autowired
    private AddressEntity address;

    public MyController(MyService myService) {
        this.myService = myService;
    }
    @GetMapping
    public UserDto getMyEntity(){
        return myService.getMyEntity();
    }

    @GetMapping("/get")
    public ResponseEntity<AddressEntity> get(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(address);
    }

}
