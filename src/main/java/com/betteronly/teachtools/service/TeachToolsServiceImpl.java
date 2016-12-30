package com.betteronly.teachtools.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.betteronly.teachtools.entity.GradeAndClass;
import com.betteronly.teachtools.entity.HomeWork;
import com.betteronly.teachtools.entity.HomeWorks;

@Service
public class TeachToolsServiceImpl implements TeachToolsService {

    // @Autowired
    // private HomeWorks homeWorks;

    @Override
    public String getSchoolsAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<GradeAndClass> getGradeAndClasses(String schoolId) {
        // TODO Auto-generated method stub
        List<GradeAndClass> lstGradeAndClasses = new ArrayList<>();
        GradeAndClass gradeAndClass1 = new GradeAndClass();
        gradeAndClass1.setSchool("霍营小学");
        gradeAndClass1.setSchoolId("huoying");
        gradeAndClass1.setGrade("一年级");
        gradeAndClass1.setGradeId("grade01");
        gradeAndClass1.setGradeClass("四班");
        gradeAndClass1.setGradeClassId("class04");
        lstGradeAndClasses.add(gradeAndClass1);

        GradeAndClass gradeAndClass2 = new GradeAndClass();
        gradeAndClass2.setSchool("霍营小学");
        gradeAndClass1.setSchoolId("huoying");
        gradeAndClass2.setGrade("二年级");
        gradeAndClass1.setGradeId("grade02");
        gradeAndClass2.setGradeClass("一班");
        gradeAndClass1.setGradeClassId("class01");
        lstGradeAndClasses.add(gradeAndClass2);

        GradeAndClass gradeAndClass3 = new GradeAndClass();
        gradeAndClass3.setSchool("霍营小学");
        gradeAndClass1.setSchoolId("huoying");
        gradeAndClass3.setGrade("三年级");
        gradeAndClass1.setGradeId("grade03");
        gradeAndClass3.setGradeClass("二班");
        gradeAndClass1.setGradeClassId("class02");
        lstGradeAndClasses.add(gradeAndClass3);

        return lstGradeAndClasses;
    }

    @Override
    public HomeWorks getHomeWorks(String schoolId, String gradeId, String classId, String homeWorkDate) {
        // TODO Auto-generated method stub
        HomeWorks homeWorks = new HomeWorks();
        List<HomeWork> listHomeWorks = new ArrayList<>();

        HomeWork homeWork1 = new HomeWork();
        homeWork1.setCourse("语文");
        homeWork1.setDeadline("当天");
        homeWork1.setPicPath("语文161223.jpg");
        homeWork1.setContent("抄写生字：日，火，水");
        homeWork1.setCompletionStatus("未完成");
        listHomeWorks.add(homeWork1);

        HomeWork homeWork2 = new HomeWork();
        homeWork2.setCourse("数学");
        homeWork2.setDeadline("当天");
        homeWork2.setPicPath("kittens.jpg");
        homeWork2.setContent("完成习题P113");
        homeWork2.setCompletionStatus("未完成");
        listHomeWorks.add(homeWork2);

        HomeWork homeWork3 = new HomeWork();
        homeWork3.setCourse("英语");
        homeWork3.setDeadline("下周一");
        homeWork3.setPicPath("kittens.jpg");
        homeWork3.setContent("完成绘本Unit6");
        homeWork3.setCompletionStatus("未完成");
        listHomeWorks.add(homeWork3);

        homeWorks.setListHomeWorks(listHomeWorks);

        return homeWorks;
    }

}
