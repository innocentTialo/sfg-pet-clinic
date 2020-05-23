package com.ddf.mainteam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by InnocentTIALO on 5/23/2020.
 */
@Controller
@RequestMapping("/owners")
public class OwnerController {

    @RequestMapping({"", "/", "index", "index.html"})
    public String listOwners() {
        return "owners/index";
    }

}
