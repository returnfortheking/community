package com.zest.community.dao;

import org.springframework.stereotype.Repository;

@Repository("alphaH")
public class AlphaDaoH implements AlphaDao{
    @Override
    public String select() {
        return "Hibernate";
    }
}
