package cn.itcast.web.download;

import cn.itcast.web.utils.DownLoadUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by cdx on 2019/11/5.
 * desc:
 */
@WebServlet("/servletimg")
public class ServletImg extends HttpServlet {
    private static final String TAG = "ServletImg";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        //filename
        String filename = req.getParameter("filename");

        ServletContext context = req.getServletContext();
        String realPath = context.getRealPath("/img/" + filename);
        FileInputStream fis = new FileInputStream(realPath);

        String mimetype = context.getMimeType(filename);
        resp.setHeader("content-type", mimetype);

        String agent = req.getHeader("user-agent");
        filename = DownLoadUtils.getFileName(agent, filename);

        resp.setHeader("content-disposition", "attachment;filename=" + filename);



        ServletOutputStream sos = resp.getOutputStream();
        byte[] buff = new byte[1024 * 6];
        int len = 0;
        while ((len = fis.read(buff)) != -1) {
            sos.write(buff, 0, len);
        }
        sos.close();
        fis.close();

    }
}
