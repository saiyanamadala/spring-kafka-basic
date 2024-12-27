package com.learn_kafka.kafka_driver.controller;

import com.learn_kafka.kafka_driver.service.CabLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/location")
public class CabLocationController {


    @Autowired
    private CabLocationService cabLocationService;

    @PostMapping
    public ResponseEntity updtaeLocation(){
        cabLocationService.updateLocation(Math.random()+","+Math.random());
        return new ResponseEntity<>(Map.of("message","Location Updated"), HttpStatus.OK);
    }
}
