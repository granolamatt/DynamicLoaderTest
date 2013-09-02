package dynamicloadertest;

import com.granolamatt.logger.LoggerOut;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/calc")
public class CalcREST {

    public CalcREST() {
        LoggerOut.println("New Calcrest made");
    }

    @GET
    @Path("/loop")
    @Produces(MediaType.TEXT_PLAIN)
    public String addPlainText() {
        int one  = 0;
        while(one < 1) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(CalcREST.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return "";
    }

    @GET
    @Path("/add/{a}/{b}")
    @Produces(MediaType.TEXT_PLAIN)
    public String addPlainText(@PathParam("a") double a, @PathParam("b") double b) {
        return (a + b) + "";
    }

    @GET
    @Path("/sub/{a}/{b}")
    @Produces(MediaType.TEXT_PLAIN)
    public String subPlainText(@PathParam("a") double a, @PathParam("b") double b) {
        return (a - b) + "";
    }

    @GET
    @Path("/add/{a}/{b}")
    @Produces(MediaType.TEXT_XML)
    public String add(@PathParam("a") double a, @PathParam("b") double b) {
        return "<?xml version=\"1.0\"?>" + "<result>" + (a + b) + "</result>";
    }

    @GET
    @Path("/sub/{a}/{b}")
    @Produces(MediaType.TEXT_XML)
    public String sub(@PathParam("a") double a, @PathParam("b") double b) {
        return "<?xml version=\"1.0\"?>" + "<result>" + (a - b) + "</result>";
    }
}
