package com.hivetech.mvc.service.impl;

import com.hivetech.mvc.entity.NewEntity;
import com.hivetech.mvc.repository.NewRepository;
import com.hivetech.mvc.service.NewServiceJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NewServiceJPAImpl implements NewServiceJPA {
    @Autowired
    private NewRepository newRepository;
    @Override
    public List<NewEntity> finaAll() {
        return newRepository.findAll();
    }
}
