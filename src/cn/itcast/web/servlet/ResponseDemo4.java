package cn.itcast.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by cdx on 2019/11/4.
 * desc:输出字符数据
 */
@WebServlet("/responseDemo4")
public class ResponseDemo4 extends HttpServlet {
    private static final String TAG = "ResponseDemo4";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        //resp.setContentType("text/html;charset=utf-8");

        resp.setCharacterEncoding("utf-8");
        resp.setHeader("content-type", "text/html");

        //1获取字符输出流
        PrintWriter pw = resp.getWriter();

        //2获取输出数据
        pw.write("你好 response");


    }
}
