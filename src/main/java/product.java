import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "servlet", value = "/index")

public class product extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String str = req.getParameter("description");
        float price = Float.parseFloat(req.getParameter("price"));
        float dis = Float.parseFloat(req.getParameter("discount"));

        float amount= (float) (price * dis * 0.01);
        float disPrice = price-amount;

        // resp.setCharacterEncoding("UTF-8");
        // resp.setContentType("text/html; charset=UTF-8");
        PrintWriter writer = resp.getWriter();
        writer.println("<html><meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>");
        writer.println("<h1>Description: " + str + "</h1>");
        writer.println("<h1>Discount Amount: " + amount + "</h1>");
        writer.println("<h1>Discount Price: " + disPrice + "</h1>");
        writer.println("</html>");
    }
}
