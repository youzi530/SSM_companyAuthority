package com.hm.controller;

import com.hm.domain.Product;
import com.hm.domain.Vote;
import com.hm.service.ProductService;
import com.hm.service.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.security.RolesAllowed;
import java.util.List;

/**
 * @author lq
 * @date 2020/5/27
 */
@Controller
@RequestMapping("/vote")
public class VoteController {

    @Autowired
    private VoteService voteService;

    //查询全部产品
    @RequestMapping("/findAll.do")
    //@RolesAllowed("ADMIN")
    public ModelAndView findAll() throws Exception {
        ModelAndView mv = new ModelAndView();
        List<Vote> votes = voteService.findAll();
        mv.addObject("votesList",votes);
        mv.setViewName("votes-list");
        return mv;
    }

    @RequestMapping("/save.do")
    //@RolesAllowed("ADMIN")
    public String save(Vote vote){
        voteService.save(vote);
        return "redirect:findAll.do";
    }
}
