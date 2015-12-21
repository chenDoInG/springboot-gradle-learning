package com.chendoing.service.impl;

import com.chendoing.domain.Spitter;
import com.chendoing.service.SpitterService;
import org.springframework.stereotype.Service;

@Service
public class SpitterServiceImpl implements SpitterService {
    @Override
    public Spitter save(Spitter spitter) {
        return null;
    }

    @Override
    public Spitter findByUsername(String username) {
        Spitter spitter = new Spitter();
        spitter.setUsername("11111");
        spitter.setLastName("22222");
        spitter.setFirstName("3333333");
        return spitter;
    }
}
