package tutorial.tom;

/**
 * Created by manojperiathambi on 6/24/16.
 */
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLException;

@Controller
public class SampleController {

    @Autowired
    private JdbcTemplate template;

    @RequestMapping("/factoryBean")
    @ResponseBody
    public String factoryBean() throws SQLException {
        return "DataSource retrieved from JNDI using JndiObjectFactoryBean: " + template.getDataSource().getConnection().toString();
    }

    @RequestMapping("/direct")
    @ResponseBody
    public String direct() throws NamingException {
        return "DataSource retrieved directly from JNDI: " +
                new InitialContext().lookup("java:comp/env/jdbc/myDataSource");
    }

}