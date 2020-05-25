package com.ddf.mainteam.controller;

import com.ddf.mainteam.service.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by InnocentTIALO on 5/23/2020.
 */
@Controller
@RequestMapping("/owners")
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/", "index", "index.html"})
    public String listOwners(Model model) {

        model.addAttribute("owners", ownerService.findAll());
        return "owners/index";
    }

}
