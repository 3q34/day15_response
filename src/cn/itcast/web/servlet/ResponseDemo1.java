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
@WebServlet("/responseDemo1")
public class ResponseDemo1 extends HttpServlet {
    private static final String TAG = "ResponseDemo1";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("utf-8");

        resp.getWriter().write("demo1");
        System.out.println("demo1");
//        resp.setStatus(302);
//        resp.setHeader("location", "/day15/responseDemo2");
        //req.setAttribute("msg", "hahah");
        //重定向
        //相对路径
        //resp.sendRedirect("responseDemo2");

        //绝对路径
        //resp.sendRedirect("/day15/responseDemo2");

        //动态虚拟目录
        String path=req.getContextPath();
        resp.sendRedirect(path+"/responseDemo2");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
