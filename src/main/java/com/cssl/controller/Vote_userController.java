package com.cssl.controller;


import com.cssl.entity.Vote_user;
import com.cssl.service.IVote_subjectService;
import com.cssl.service.IVote_userService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author .
 * @since 2020-10-09
 */
@Controller
public class Vote_userController {

    @Resource
    IVote_userService userService;

    @Resource
    IVote_subjectService subjectService;


    @RequestMapping("User-login.action")
    public String login(Vote_user user, HttpSession session, Model model){
        Vote_user voteuser = userService.voteuser(user);
        if (voteuser==null){
            return "login";
        }
        session.setAttribute("status",voteuser);
        model.addAttribute("list",subjectService.subjectlist());
        model.addAttribute("user",voteuser);
        return "votelist";
    }

    @RequestMapping("showuser.action")
    @ResponseBody
    public boolean showuser(String name){
        return userService.showuser(name);
    }
    @RequestMapping("User-register.action")
    public String adduser(Vote_user user){
        if(userService.adduser(user)){
            return "login";
        }else {
            return "regist";
        }
    }



}
