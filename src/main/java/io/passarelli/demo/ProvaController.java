package io.passarelli.demo;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.sql.SQLException;

@RestController
public class ProvaController {

    @GetMapping("/testDb")
    public String dbTest() throws SQLException {
        DriverManagerDataSource datasource = new DriverManagerDataSource();
        datasource.setUrl("jdbc:postgresql://localhost:5432/dev");
        datasource.setDriverClassName("org.postgresql.Driver");
        datasource.setUsername("ale");
        datasource.setPassword("Porcodio11@#");
        return datasource.getConnection().getSchema();
    }
}
