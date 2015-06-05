package com.otw1248.ppp.dict.web;

import com.otw1248.ppp.dict.b.BaseController;
import com.otw1248.ppp.dict.s.NCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Stephen Xianwei Zhang on 6/5/2015.
 */
@Controller
@RequestMapping("/dict")
public class DictController extends BaseController {

    @Autowired
    private NCService ncService;

    @RequestMapping(method = RequestMethod.GET)
    public String queryDict(@RequestParam(value = "dictVL") String dictVL, Model model) {
        String result = "Please follow the wechat account:swxotw1248 to have fun.";
        if (dictVL != null && dictVL.length() > 0) {
            result = ncService.queryNC(dictVL);
        }
        model.addAttribute("result", result);
        return "home";
    }
}
