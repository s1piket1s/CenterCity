package com.cetnetcity.server.servlets;

import com.cetnetcity.server.work.GpsApi;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/car")
public class DataGps extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        if (request.getParameter("button1") != null) {
            try {
                String carData = GpsApi.postRequest();
                request.setAttribute("carText", carData);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        request.getRequestDispatcher("car_data.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.getRequestDispatcher("car_data.jsp").forward(request, response);

    }

}
