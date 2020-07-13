package com.hivetech.mvc.service.impl;

import com.hivetech.mvc.service.HomeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class HomeServiceImpl implements HomeService {

    @Override
    public List<String> loadMenu() {
        List<String> menus =new ArrayList<>();
        menus.add("Java");
        menus.add("C#");
        menus.add("javascript");
        menus.add("Liên hệ");
        return menus;
    }
}
