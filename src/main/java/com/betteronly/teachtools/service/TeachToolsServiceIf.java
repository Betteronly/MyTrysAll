package com.betteronly.teachtools.service;

import com.betteronly.teachtools.entity.HomeWorks;

public interface TeachToolsServiceIf {

    public String getSchoolsAll();

    public String getGradeAndClasses(String schoolId);

    public HomeWorks getHomeWorks(String schoolId, String gradeId, String classId, String homeWorkDate);
}
