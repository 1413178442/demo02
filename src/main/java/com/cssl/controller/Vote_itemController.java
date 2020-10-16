package com.cssl.controller;


import com.cssl.entity.Vote_item;
import com.cssl.entity.Vote_user;
import com.cssl.service.IVote_itemService;
import com.cssl.service.IVote_subjectService;
import com.cssl.service.IVote_userService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
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
public class Vote_itemController {
    @Resource
    IVote_itemService itemService;

    @Resource
    IVote_userService userService;

    @Resource
    IVote_subjectService subjectService;

    @RequestMapping("/votect.action")
    @ResponseBody
    public boolean items(Integer vsid, HttpSession session){
        Vote_user status = (Vote_user)session.getAttribute("status");
        Map<String,Object>map=new HashMap<>();
        map.put("vuid",status.getVu_user_id());
        map.put("vsid",vsid);
        return itemService.voteitem(map);
    }

    @RequestMapping("voteadd.action")
    @ResponseBody
    public void voteadd(Integer vid,Integer vsid,HttpSession session){
        Vote_item vote_item = new Vote_item();
        Vote_user status = (Vote_user)session.getAttribute("status");
        vote_item.setVu_user_id(status.getVu_user_id());
        vote_item.setVo_id(Long.valueOf(vid));
        vote_item.setVs_id(Long.valueOf(vsid));
        itemService.voteadd(vote_item);
    }

    @RequestMapping("Vote-voteSave.action")
    public String show(Model model,HttpSession session){
        model.addAttribute("list",subjectService.subjectlist());
        model.addAttribute("user",(Vote_user)session.getAttribute("status"));
        return "votelist";
    }

}
