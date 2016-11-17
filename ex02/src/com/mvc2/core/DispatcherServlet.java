package com.mvc2.core;

import com.mvc2.controller.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/")
public class DispatcherServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        try {
            doDispatcher(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            doDispatcher(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void doDispatcher(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String srvPath = request.getServletPath();
        System.out.println(srvPath);
        String url = "";

        CMDimp imp = null;
        // 객체 관리 (Spring - HandlerMapping)
        if (srvPath.equals("/")) {
            imp = new IndexController();
        } else if (srvPath.equals("/list.do")) {
            imp = new ListController();
        } else if (srvPath.equals("/add.do")) {
            imp = new AddController();
        } else if (srvPath.equals("/One.do")) {
            imp = new OneController();
        } else if (srvPath.equals("/update.do")) {
            imp = new UpdateController();
        }

        // Controller 선택 실행 (Spring - Adapter)
        if (imp != null) {
            url += imp.execute(request, response);
        }

        String prefix = "/WEB-INF/page";
        String suffix = ".jsp";

        url = prefix + url + suffix;

        // View 를 관리(Spring = ViewResolver)
        request.getRequestDispatcher(url).forward(request, response);

    }
}
