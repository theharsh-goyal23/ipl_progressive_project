package com.wecp.progressive.service.impl;

import java.util.List;

import com.wecp.progressive.dao.CricketerDAO;
import com.wecp.progressive.entity.Cricketer;
import com.wecp.progressive.service.CricketerService;

public class CricketerServiceImplJdbc implements CricketerService {

    private CricketerDAO cricketerDAO;

    public CricketerServiceImplJdbc (CricketerDAO cricketerDAO){
        this.cricketerDAO = cricketerDAO;
    }

    

    @Override
    public Integer addCricketer(Cricketer cricketer) {
        
        return -1;
    }

    @Override
    public List<Cricketer> getAllCricketers() {
        
        return List.of();
    }

    @Override
    public List<Cricketer> getAllCricketersSortedByExperience() {
        
        return List.of();
    }

    public void updateCricketer(Cricketer cricketer){

    }
    public void deleteCricketer(int cricketerId){

    }
    public Cricketer getCricketerById(int cricketerId){
        return null;
    }
}