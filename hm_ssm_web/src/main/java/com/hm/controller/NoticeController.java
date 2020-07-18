package com.hm.controller;

import com.hm.domain.Notice;
import com.hm.domain.Product;
import com.hm.domain.Schedule;
import com.hm.service.NoticeService;
import com.hm.service.ProductService;
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
@RequestMapping("/notice")
public class NoticeController {

    @Autowired
    private NoticeService noticeService;

    //查询全部产品
    @RequestMapping("/findAll.do")
    //@RolesAllowed("ADMIN")
    public ModelAndView findAll() throws Exception {
        ModelAndView mv = new ModelAndView();
        List<Notice> notices = noticeService.findAll();
        mv.addObject("noticeList",notices);
        mv.setViewName("notice-list");
        return mv;
    }

    @RequestMapping("/save.do")
    //@RolesAllowed("ADMIN")
    public String save(Notice notice){
        noticeService.save(notice);
        return "redirect:findAll.do";
    }

    @RequestMapping("/findById.do")
    public ModelAndView findById(@RequestParam(name = "id",required = true)String noticeId) throws Exception {
        ModelAndView mv=new ModelAndView();
        Notice notice = noticeService.findById(noticeId);
        mv.addObject("notice",notice);
        mv.setViewName("notice-show");
        return mv;
    }
}
