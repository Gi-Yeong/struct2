package com.hb.guest.controller;

import com.hb.guest.model.GuestDao;
import com.hb.guest.model.GuestDto;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

//@WebServlet("/guest/list.do")
public class ListController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GuestDao dao;
		ArrayList<GuestDto> list=null;
		try {
			dao = new GuestDao();
			list = dao.selectAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		request.setAttribute("alist", list);
		request.getRequestDispatcher("/WEB-INF/guest/list.jsp").forward(request, response);
	}

}
