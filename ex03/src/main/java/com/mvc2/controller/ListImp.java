package com.mvc2.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListImp implements InterController {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) {


        return "guest/list";
    }
}
