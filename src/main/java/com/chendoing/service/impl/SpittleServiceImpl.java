package com.chendoing.service.impl;

import com.chendoing.domain.Spittle;
import com.chendoing.service.SpittleService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class SpittleServiceImpl implements SpittleService {

    @Override
    public List<Spittle> findSpittles(long max, int count) {
        return createSpittleList(count);
    }

    @Override
    public Spittle findOne(long spittleId) {
        return new Spittle("Spittle",new Date());
    }

    private List<Spittle> createSpittleList(int count) {
        List<Spittle> spittles = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            spittles.add(new Spittle("Spittle " + i, new Date()));
        }
        return spittles;
    }
}
