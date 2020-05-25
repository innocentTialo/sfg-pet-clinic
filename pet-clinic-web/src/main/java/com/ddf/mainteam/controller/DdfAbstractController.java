package com.ddf.mainteam.controller;

import com.ddf.mainteam.service.AbstractDdfService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by InnocentTIALO on 5/25/2020.
 */
@Controller
public abstract class DdfAbstractController {

    @RequestMapping({"", "/", "index", "index.html"})
    public String findAll(Model model) {
        model.addAttribute(getTemplateFolderName(), getEntityService().findAll());
        return getTemplateFolderName() + "/index";
    }

    abstract AbstractDdfService getEntityService();

    abstract String getTemplateFolderName();
}
