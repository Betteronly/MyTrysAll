package com.betteronly.teachtools;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeachToolsService {

    @Autowired
    private HomeWorks homeWorks;

    public String getSchools() {
        return null;
    }

    public HomeWorks getHomeWorks(String schoolId) {

        // List<HomeWork> listHomeWorks = new ArrayList<>();

        HomeWork homeWork1 = new HomeWork();
        homeWork1.setCourse("语文");
        homeWork1.setDeadline("当天");
        homeWork1.setPicPath("kittens.jpg");
        homeWork1.setContent("抄写生字：日，火，水");
        homeWorks.getListHomeWorks().add(homeWork1);

        HomeWork homeWork2 = new HomeWork();
        homeWork2.setCourse("霍营小学");
        homeWork2.setDeadline("下周一");
        homeWork2.setPicPath("语文161223.jpg");
        homeWork2.setContent("背诵课文P113");
        homeWorks.getListHomeWorks().add(homeWork2);

        return homeWorks;
    }
}
