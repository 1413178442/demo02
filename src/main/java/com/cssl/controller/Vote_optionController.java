package com.cssl.controller;


import com.cssl.entity.Vote_user;
import com.cssl.service.IVote_optionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author .
 * @since 2020-10-09
 */
@Controller
public class Vote_optionController {

    @Resource
    IVote_optionService optionService;

    @RequestMapping("option.action")
    public String option(Model model, Integer vsid, HttpSession session){
        Map<String, Object> optionmap = optionService.optionmap(vsid);

        model.addAttribute("optionmap",optionmap);

        model.addAttribute("type",optionService.subject(vsid));

        model.addAttribute("option",optionService.optionlist(vsid));

        model.addAttribute("user",(Vote_user)session.getAttribute("status"));
        return "vote";
    }

}
