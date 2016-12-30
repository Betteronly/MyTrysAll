package com.betteronly.teachtools;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.betteronly.teachtools.entity.GradeAndClass;
import com.betteronly.teachtools.entity.HomeWorks;
import com.betteronly.teachtools.service.TeachToolsService;

@Controller
@RequestMapping("/teachtools/*")
public class TeachToolsController {

    @Autowired
    TeachToolsService teachToolsService;

    // @Autowired
    // HomeWorks homeWorks;

    public TeachToolsController() {
        super();
    }

    @RequestMapping(value = "/schools", method = RequestMethod.GET)
    public String schools(Model model) {
        String schoolId = "huoying";
        List<GradeAndClass> allGradeAndClasses = teachToolsService.getGradeAndClasses(schoolId);

        model.addAttribute("allGradeAndClasses", allGradeAndClasses);
        return "teachtools/schools";
    }

    @RequestMapping(value = "/homeworks", method = RequestMethod.POST)
    public String schools_bootstrap(HttpServletRequest request, String selectedSchoolId, Model model) {
        String schoolId0 = selectedSchoolId; // 参数传入方式
        String schoolId = request.getParameter("selectedSchoolId"); // 获取参数方式
        String gradeId = request.getParameter("selectedGradeId"); // 获取参数方式
        String gradeClassId = request.getParameter("selectedGradeClassId");
        String homeWorkDate = "2016/12/25";
        HomeWorks homeWorks = teachToolsService.getHomeWorks(schoolId, gradeId, gradeClassId, homeWorkDate);

        model.addAttribute("homeWorks", homeWorks);
        return "teachtools/homeworks";
    }

    @RequestMapping(value = "/schools_easyui", method = RequestMethod.GET)
    public String schools_easyui(Model model) {
        List<Object> tasks = new ArrayList<>();

        Map<String, String> mapTasks = new HashMap<>();
        mapTasks.put("school", "霍营小学");
        mapTasks.put("grade", "一年级");
        mapTasks.put("class", "一班");
        tasks.add(mapTasks);

        Map<String, String> mapTasks2 = new HashMap<>();
        mapTasks2.put("school", "霍营小学");
        mapTasks2.put("grade", "二年级");
        mapTasks2.put("class", "二班");
        tasks.add(mapTasks2);

        model.addAttribute("classes", tasks);
        model.addAttribute("tStat.count", 10);
        return "teachtools/schools_easyui";
    }

    @RequestMapping(value = "schools_thymeleaf", method = RequestMethod.GET)
    public String schools_thymeleaf(Model model) {
        List<Object> tasks = new ArrayList<>();

        Map<String, String> mapTasks = new HashMap<>();
        mapTasks.put("school", "霍营小学");
        mapTasks.put("grade", "一年级");
        mapTasks.put("class", "一班");
        tasks.add(mapTasks);

        Map<String, String> mapTasks2 = new HashMap<>();
        mapTasks2.put("school", "霍营小学");
        mapTasks2.put("grade", "二年级");
        mapTasks2.put("class", "二班");
        tasks.add(mapTasks2);

        model.addAttribute("classes", tasks);
        model.addAttribute("tStat.count", 10);
        return "teachtools/schools_thymeleaf";
    }

    @RequestMapping(value = "/schools1", method = RequestMethod.GET)
    public ModelAndView schools1(Model model) {
        ModelAndView mov = new ModelAndView();
        mov.setViewName("teachtools");

        Map<String, String> mapTasks = new HashMap<>();
        mapTasks.put("school", "霍营小学");
        mapTasks.put("grade", "一年级");
        mapTasks.put("class", "四班");

        List<Object> tasks = new ArrayList<>();
        tasks.add(mapTasks);

        mov.addObject("classes", tasks);
        mov.addObject("tStat.count", 10);
        return mov;
    }

    @RequestMapping(value = "/json/datagriddata", method = RequestMethod.GET)
    @ResponseBody
    public Object datagrid() {
        // model.addAttribute("recipient", "World");

        // TeachToolsEntity teachToolsEntity = new TeachToolsEntity();
        // teachToolsEntity.setTotal("1");

        Map<String, Object> result = new HashMap<String, Object>();
        result.put("total", "1");

        List<Map<String, String>> rows = new ArrayList<>();
        Map<String, String> row1 = new HashMap<String, String>();
        row1.put("itemid", "EST-1");
        row1.put("productid", "FI-SW-01");
        row1.put("unitcost", "11.00");
        row1.put("listprice", "11.00");
        row1.put("attr1", "Large");
        row1.put("status", "P");
        rows.add(row1);

        Map<String, String> row2 = new HashMap<String, String>();
        row2.put("itemid", "EST-2");
        row2.put("productid", "FI-SW-02");
        row2.put("unitcost", "22.00");
        row2.put("listprice", "22.00");
        row2.put("attr1", "Spotted Adult Female");
        row2.put("status", "S");
        rows.add(row2);

        Map<String, String> row3 = new HashMap<String, String>();
        row3.put("itemid", "EST-3");
        row3.put("productid", "FI-SW-03");
        row3.put("unitcost", "33.00");
        row3.put("listprice", "33.00");
        row3.put("attr1", "Venomless");
        row3.put("status", "E");
        rows.add(row3);

        result.put("rows", rows);

        return result;
    }

    // @RequestMapping(value = "/test", method = RequestMethod.GET)
    // public ModelAndView save(String name1, String password1) {
    // name1 = "李荣";
    // System.out.println("接收到的信息:" + name1);
    // ModelAndView mov = new ModelAndView();
    // mov.setViewName("succ2");
    // mov.addObject("name", name1);
    // mov.addObject("passwd", password1);
    // mov.addObject("msg", "保存成功");
    // return mov;
    // }
}
