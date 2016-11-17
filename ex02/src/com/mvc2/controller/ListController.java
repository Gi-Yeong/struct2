package com.mvc2.controller;

import com.mvc2.model.GuestDao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListController implements CMDimp {
    private GuestDao dao;

    public ListController(GuestDao dao) {
        this.dao = dao;
    }

    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("POJO 클래스 실행-List");

//        request.setAttribute("list", dao.selectAll());

        return "/list";
    }
}
