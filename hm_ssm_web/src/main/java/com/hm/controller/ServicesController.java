package com.hm.controller;

import com.hm.domain.Product;
import com.hm.domain.Schedule;
import com.hm.domain.Services;
import com.hm.service.ProductService;
import com.hm.service.ServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.security.RolesAllowed;
import java.util.List;

/**
 * @author lq
 * @date 2020/5/27
 */
@Controller
@RequestMapping("/services")
public class ServicesController {

    @Autowired
    private ServicesService servicesService;

    //查询全部产品
    @RequestMapping("/findAll.do")
    //@RolesAllowed("ADMIN")
    public ModelAndView findAll() throws Exception {
        ModelAndView mv = new ModelAndView();
        List<Services> services = servicesService.findAll();
        mv.addObject("servicesList",services);
        mv.setViewName("services-list");
        return mv;
    }

    @RequestMapping("/save.do")
    //@RolesAllowed("ADMIN")
    public String save(Services services){
        servicesService.save(services);
        return "redirect:findAll.do";
    }

    @RequestMapping("/order.do")
    public String order(@RequestParam(name = "id",required = true)String servicesId) throws Exception {
        //Schedule schedule = scheduleService.findId(scheduleId);
        servicesService.order(servicesId);
        return "redirect:findAll.do";
    }

    @RequestMapping("/lend.do")
    public String lend(@RequestParam(name = "id",required = true)String servicesId) throws Exception {
        //Schedule schedule = scheduleService.findId(scheduleId);
        servicesService.lend(servicesId);
        return "redirect:findAll.do";
    }
}
