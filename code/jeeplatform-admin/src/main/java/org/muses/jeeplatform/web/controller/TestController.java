package org.muses.jeeplatform.web.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author lichenghuai
 * @version 1.0
 * @date 2019/6/10 18:33
 * @description
 */
@Controller
public class TestController extends BaseController{
    @RequestMapping(value="/test",produces="text/html;charset=UTF-8")
    @ApiOperation(value = "ceshixia",notes = "")
    public String test()throws ClassNotFoundException{


        return "/login";
       /* ModelAndView mv = this.getModelAndView();
        mv.setViewName("login");
        // mv.setViewName("index");*/
       // return new ModelAndView("login");
    }
}
