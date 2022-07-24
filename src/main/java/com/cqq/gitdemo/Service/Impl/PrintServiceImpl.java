package com.cqq.gitdemo.Service.Impl;

import com.cqq.gitdemo.Service.PrintService;
import org.springframework.stereotype.Service;

@Service
public class PrintServiceImpl implements PrintService {


    @Override
    public String printsome(int i) {

        String str = "";

        if(i == 1){
            str = "输出了：1 a的Springboot的okki";
        }else if(i == 2){
            str = "输出了：2 a的Springboot的okki";
        }else{
            str = "输出了：int a的Springboot的okki";
        }

        return str;
    }

}