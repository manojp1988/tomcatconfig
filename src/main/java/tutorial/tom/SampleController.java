package tutorial.tom;

/**
 * Created by manojperiathambi on 6/24/16.
 */

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLException;

@Controller
public class SampleController {

    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello() {
        return "Hello World";
    }
}