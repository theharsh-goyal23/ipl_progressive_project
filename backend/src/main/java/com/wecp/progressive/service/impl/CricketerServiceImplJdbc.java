package com.wecp.progressive.service.impl;

import java.sql.SQLException;
import java.util.Comparator;
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
    public Integer addCricketer(Cricketer cricketer)throws SQLException {
        
        return cricketerDAO.addCricketer(cricketer);

    }

    @Override
    public List<Cricketer> getAllCricketers() throws SQLException{
        
       return cricketerDAO.getAllCricketers();
    }

    @Override
    public List<Cricketer> getAllCricketersSortedByExperience() throws SQLException{
        
        List<Cricketer> sortedCricketers = cricketerDAO.getAllCricketers();
        if(!sortedCricketers.isEmpty()){
            sortedCricketers.sort(Comparator.comparing(Cricketer::getExperience));
        }
        return sortedCricketers;
    }

    public void updateCricketer(Cricketer cricketer)throws SQLException{
        cricketerDAO.updateCricketer(cricketer);

    }
    public void deleteCricketer(int cricketerId)throws SQLException{
        cricketerDAO.deleteCricketer(cricketerId);

    }
    public Cricketer getCricketerById(int cricketerId)throws SQLException{
        return cricketerDAO.getCricketerById(cricketerId);
    }
}