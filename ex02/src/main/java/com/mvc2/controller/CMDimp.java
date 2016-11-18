package com.mvc2.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface CMDimp {
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
