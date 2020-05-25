package com.ddf.mainteam.controller;

import com.ddf.mainteam.service.AbstractDdfService;
import com.ddf.mainteam.service.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by InnocentTIALO on 5/23/2020.
 */
@Controller
@RequestMapping("/vets")
public class VetController extends DdfAbstractController {

    private final String indexPagePath = "vets";

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @Override
    AbstractDdfService getEntityService() {
        return vetService;
    }

    @Override
    String getTemplateFolderName() {
        return indexPagePath;
    }
}
