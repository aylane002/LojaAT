import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionListener;
import java.util.ArrayList;
import java.util.List;

@WebListener()
public class InicializaUsuariosListener implements ServletContextListener,
        HttpSessionListener, HttpSessionAttributeListener {


    public InicializaUsuariosListener() {
    }

    public void contextInitialized(ServletContextEvent sce) {
     Cliente u1 = new Cliente("aylane", "aylane@gmail.com", "12345");
     Cliente u2 = new Cliente("Merciana", "merciana@gmail.com", "67890");
     Cliente u3 = new Cliente("Taniro", "taniro@gmail.com", "trabalho");

        List<Cliente> clienteList = new ArrayList<>();
        clienteList.add(u1);
        clienteList.add(u2);
        clienteList.add(u3);

        ServletContext servletContext = sce.getServletContext();
        servletContext.setAttribute("clientes", clienteList);

    }

    public void contextDestroyed(ServletContextEvent sce) {

    }


}
