package com.project.IPL.controller;

import com.project.IPL.service.MatchService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pricing")
public class IPLController {
    private MatchService pricingService;

}
