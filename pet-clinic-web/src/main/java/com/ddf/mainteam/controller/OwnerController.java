package com.ddf.mainteam.controller;

import com.ddf.mainteam.service.AbstractDdfService;
import com.ddf.mainteam.service.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by InnocentTIALO on 5/23/2020.
 */
@Controller
@RequestMapping("/owners")
public class OwnerController extends DdfAbstractController {

    private final String templateFolderName = "owners";

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @Override
    AbstractDdfService getEntityService() {
        return ownerService;
    }

    @Override
    String getTemplateFolderName() {
        return templateFolderName;
    }

}
