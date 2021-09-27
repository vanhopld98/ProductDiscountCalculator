import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscounntServlet", value = "/convert")
public class DiscountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int listPrice = Integer.parseInt(request.getParameter("listPrice"));
        int discountPercent = Integer.parseInt(request.getParameter("discountPercent"));

        double DiscountAmount = listPrice * discountPercent * 0.01;
        double DiscountPrice = listPrice - DiscountAmount;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Discount Amount: " + DiscountAmount + "</h1>");
        writer.println("<h1>Discount Price: " + DiscountPrice + "</h1>");
        writer.println("</html>");
    }
}
