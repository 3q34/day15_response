package cn.itcast.web.servletcontext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by cdx on 2019/11/4.
 * desc:获取MIME类型
 */
@WebServlet("/servletContextDemo2")
public class ServletContext2 extends HttpServlet {
    private static final String TAG = "ServletContext";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        javax.servlet.ServletContext servletContext = req.getServletContext();
        resp.setContentType("text/html;charset=utf-8");
        String filename = "a.jpg";
        String mimeType = servletContext.getMimeType(filename);
        System.out.println(mimeType);
        //域对象：共享数据
        servletContext.setAttribute("msg", "你好，中国");

    }
}
