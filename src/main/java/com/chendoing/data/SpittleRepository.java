package com.chendoing.data;

import com.chendoing.domain.Spittle;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SpittleRepository {
    List<Spittle> findSpittles(long max, int count);
    Spittle findOne(long spittleId);
}
