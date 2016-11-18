package com.mvc2.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IndexController implements CMDimp {

    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("POJO 클래스 실행");
        return "/index";
    }
}
