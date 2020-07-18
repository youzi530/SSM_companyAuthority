package com.hm.controller;

import com.hm.domain.Orders;
import com.hm.domain.Product;
import com.hm.domain.Schedule;
import com.hm.domain.Vote;
import com.hm.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.security.RolesAllowed;
import java.util.List;

/**
 * @author lq
 * @date 2020
 */

@Controller
@RequestMapping("/schedule")
public class ScheduleController {

    @Autowired
    private ScheduleService scheduleService;

    //查询全部产品
    @RequestMapping("/findAll.do")
    //@RolesAllowed("ADMIN")
    public ModelAndView findAll() throws Exception {
        ModelAndView mv = new ModelAndView();
        List<Schedule> schedules = scheduleService.findAll();
        mv.addObject("scheduleList",schedules);
        mv.setViewName("schedule-list");
        return mv;
    }

    @RequestMapping("/save.do")
    //@RolesAllowed("ADMIN")
    public String save(Schedule schedule){
        scheduleService.save(schedule);
        return "redirect:findAll.do";
    }

    @RequestMapping("/choose.do")
    //@RolesAllowed("ADMIN")
    public String choose(Schedule schedule){
        System.out.println(schedule);
        System.out.println("id:"+schedule.getId());
        System.out.println("id:"+schedule.getIsvote());
        //scheduleService.choose(schedule);
        return "redirect:findAll.do";
    }


    @RequestMapping("/findById.do")
    public ModelAndView findById(@RequestParam(name = "id",required = true)String scheduleId) throws Exception {
        ModelAndView mv=new ModelAndView();
        Schedule schedule = scheduleService.findId(scheduleId);
        mv.addObject("schedule",schedule);
        mv.setViewName("schedule-show");
        return mv;
    }
    @RequestMapping("/detailsById.do")
    public ModelAndView detailsById(@RequestParam(name = "id",required = true)String scheduleId) throws Exception {
        ModelAndView mv=new ModelAndView();
        Schedule schedule = scheduleService.findId(scheduleId);
        mv.addObject("schedule",schedule);
        mv.setViewName("vote-show");
        return mv;
    }

}
