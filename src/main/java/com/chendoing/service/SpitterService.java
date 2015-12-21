package com.chendoing.service;

import com.chendoing.domain.Spitter;

public interface SpitterService {

    Spitter save(Spitter spitter);
    Spitter findByUsername(String username);
}
