package com.chendoing.service;

import com.chendoing.domain.Spittle;

import java.util.List;

public interface SpittleService {
    List<Spittle> findSpittles(long max, int count);
    Spittle findOne(long spittleId);
}
