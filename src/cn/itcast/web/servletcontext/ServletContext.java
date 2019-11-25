package cn.itcast.web.servletcontext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by cdx on 2019/11/4.
 * desc:servletContext
 */
@WebServlet("/servletContextDemo1")
public class ServletContext extends HttpServlet {
    private static final String TAG = "ServletContext";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        javax.servlet.ServletContext servletContext1 = req.getServletContext();
        javax.servlet.ServletContext servletContext2 = getServletContext();
        System.out.println(servletContext1);
        System.out.println(servletContext2);
        System.out.println(servletContext1 == servletContext2);
        Object msg = servletContext1.getAttribute("msg");
        System.out.println(msg);
    }
}
