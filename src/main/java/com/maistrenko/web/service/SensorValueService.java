package com.maistrenko.web.service;

import com.maistrenko.web.jpa.ValueRepository;
import com.maistrenko.web.model.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SensorValueService {
    private final ValueRepository repository;

    public SensorValueService(ValueRepository repository) {
        this.repository = repository;
    }

    public Value saveValue(Value value){
        return repository.save(value);
    }

    public List<Value> getAllValues(){
        return repository.findAll();
    }
}
