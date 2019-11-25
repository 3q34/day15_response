package cn.itcast.web.servlet;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by cdx on 2019/11/4.
 * desc:输出字节数据
 */
@WebServlet("/responseDemo5")
public class ResponseDemo5 extends HttpServlet {
    private static final String TAG = "ResponseDemo4";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        //获取字节输出流
        ServletOutputStream sos = resp.getOutputStream();
        sos.write("你好".getBytes("utf-8"));


    }
}
