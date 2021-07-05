package com.zest.community.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class AlphaDaoM implements AlphaDao{
    @Override
    public String select() {
        return "MyBatis";
    }
}
