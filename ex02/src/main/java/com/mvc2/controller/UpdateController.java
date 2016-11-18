package com.mvc2.controller;

import com.mvc2.model.GuestDao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateController implements CMDimp {
    private GuestDao dao;

    public UpdateController(GuestDao dao) {
        this.dao = dao;
    }

    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

        return null;
    }
}
