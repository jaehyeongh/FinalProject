package com.project.saishu.controller;

import com.project.saishu.logging.Logging;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class indexController {
    private Logger logger = new Logging(this.getClass()).getLogger();

    @GetMapping("/")
    public String get(HttpServletRequest request){
        logger.info("connected from: "+request.getRemoteAddr());
        return "index";
    }

}
