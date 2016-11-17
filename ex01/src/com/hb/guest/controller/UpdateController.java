package com.hb.guest.controller;

import com.hb.guest.model.GuestDao;
import com.hb.guest.model.GuestDto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/geust/edit.do")
public class UpdateController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String url = "./list.do";
        String[] params = new String[3];
        params[0] = request.getParameter("sabun");
        params[1] = request.getParameter("name");
        params[2] = request.getParameter("pay");



        for (int i = 0; i < params.length; i++) {
            params[i] = params[i].trim();
        }

        try {
            int sabun = Integer.parseInt(params[0]);
            String name = params[1];
            int pay = Integer.parseInt(params[2]);

            GuestDto dto = new GuestDto();
            dto.setSabun(sabun);
            dto.setName(name);
            dto.setPay(pay);

            GuestDao dao = new GuestDao();
            dao.updateOne(dto);


        } catch (NumberFormatException e) {
            url = "./edit.do?dix=" + params[0];
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            response.sendRedirect(url);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String param = request.getParameter("idx");
        int sabun = Integer.parseInt(param);

        GuestDao dao = null;
        try {
            dao = new GuestDao();
            GuestDto dto = dao.selectOne(sabun);
            request.setAttribute("bean", dto);

        } catch (Exception e) {
            e.printStackTrace();
        }

        request.setAttribute("title", "수정");
        request.setAttribute("action", "action=\"edit.do\"");
        request.getRequestDispatcher("/WEB-INF/guest/add.jsp").forward(request, response);
    }
}
