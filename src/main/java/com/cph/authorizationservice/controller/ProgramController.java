package com.cph.authorizationservice.controller;

import com.cph.authorizationservice.model.SearchResultsDto;
import com.cph.authorizationservice.service.ServiceDispatcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProgramController {
    @Autowired
    ServiceDispatcher serviceDispatcher;

    @RequestMapping({ "/search" })
    public SearchResultsDto firstPage(@RequestParam String q)
    {
        return serviceDispatcher.searchPrograms(q);
    }


}
