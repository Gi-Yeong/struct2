package com.hb.guest.controller;

import com.hb.guest.model.GuestDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/guest/del.do")
public class DeleteController extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String url = "./list.do";
        int sabun = Integer.parseInt(request.getParameter("idx").trim());


        try {
            GuestDao dao = new GuestDao();
            dao.deleteOne(sabun);
        } catch (Exception e) {
            url = "detail.do?idx=" + sabun;
        } finally {

        }
        response.sendRedirect(url);
    }
}
