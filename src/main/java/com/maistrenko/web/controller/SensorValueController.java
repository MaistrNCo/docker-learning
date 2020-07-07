package com.maistrenko.web.controller;

import com.maistrenko.web.model.Value;
import com.maistrenko.web.service.SensorValueService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SensorValueController {
    private final SensorValueService service;

    public SensorValueController(SensorValueService service) {
        this.service = service;
    }

    @PostMapping(value = "/sensor")
    public Value saveValue(@RequestBody Value value){

        return service.saveValue(value);
    }

    @GetMapping(value = "/sensor")
    public List<Value> getValues(){
        return service.getAllValues();
    }
}
