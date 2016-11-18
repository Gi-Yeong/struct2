package com.mvc2.core;

import com.mvc2.controller.IndexImp;
import com.mvc2.controller.InterController;
import com.mvc2.controller.ListImp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class DispatcherServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doDo(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        doDo(req, resp);
    }

    private void doDo(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path = req.getServletPath();
        System.out.println(path);
        InterController ic = null;

        if (path.equals("/")) {
            ic = new IndexImp();
        } else if (path.equals("/list.do")){
            ic = new ListImp();
        }
        String url = ic.execute(req, resp);;
        String preifx = "/WEB-INF/page/";
        String suffix = ".jsp";

        req.getRequestDispatcher(preifx + url + suffix).forward(req, resp);

    }


}
