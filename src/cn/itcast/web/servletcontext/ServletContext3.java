package cn.itcast.web.servletcontext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

/**
 * Created by cdx on 2019/11/4.
 * desc:获取MIME类型
 * servletContext获取文件服务器中真实路径
 */
@WebServlet("/servletContextDemo3")
public class ServletContext3 extends HttpServlet {
    private static final String TAG = "ServletContext";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        javax.servlet.ServletContext servletContext = req.getServletContext();
        String realPath=servletContext.getRealPath("a.txt");
        System.out.println(realPath);
        File file=new File(realPath);

    }
}
