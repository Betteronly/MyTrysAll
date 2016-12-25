package com.betteronly.teachtools.entity;

import java.util.List;

/**
 * 家庭作业一览
 * 
 * @author Better
 *
 */
public class HomeWorks {
    // 作业一览
    // @Autowired
    private List<HomeWork> listHomeWorks;

    public List<HomeWork> getListHomeWorks() {
        return listHomeWorks;
    }

    public void setListHomeWorks(List<HomeWork> listHomeWorks) {
        this.listHomeWorks = listHomeWorks;
    }

}
