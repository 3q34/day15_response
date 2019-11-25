package cn.itcast.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by cdx on 2019/11/1.
 * desc:重定向
 */
@WebServlet("/responseDemo2")
public class ResponseDemo2 extends HttpServlet {
    private static final String TAG = "ResponseDemo1";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setStatus(302);
//        resp.setHeader("location","/day15/responseDemo2");

        //不可以共享数据
//        Object msg = req.getAttribute("msg");
//        System.out.println(  msg);
        resp.getWriter().write("demo2");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
