package com.polytech.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by sydne on 13/12/2016.
 */
@Controller
public class JSPController {

    @RequestMapping(value="/",method = RequestMethod.GET)
    public ModelAndView test(HttpServletRequest request, HttpServletResponse response) {
        // force html
        return new ModelAndView("index");
    }

}
