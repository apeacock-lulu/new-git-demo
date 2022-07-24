package com.cqq.gitdemo.controller;

import com.cqq.gitdemo.Service.Impl.PrintServiceImpl;
import com.cqq.gitdemo.Service.PrintService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@CrossOrigin
@RequestMapping("/gitdemo")
public class PrintController {

    @Resource
    private PrintService printService;

    @RequestMapping("/print01")
    public String printMethod(int intChoose){

        return printService.printsome(intChoose);
    }

}
