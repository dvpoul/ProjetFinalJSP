/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author EWOL
 */
public class GestDriverManagerDataSource {

    private String classeName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private String url = "jdbc:sqlserver://localhost:1434;databaseName=projetFinalJSP";
    private String useName = "sa";
    private String password = "sql";

    public String getClasseName() {
        return classeName;
    }

    public void setClasseName(String classeName) {
        this.classeName = classeName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUseName() {
        return useName;
    }

    public void setUseName(String useName) {
        this.useName = useName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public GestDriverManagerDataSource(String classeName, String url, String useName, String password) {
        this.classeName = classeName;
        this.url = url;
        this.useName = useName;
        this.password = password;

    }

    public GestDriverManagerDataSource() {
    }

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate createJdbcTemplate() {

        DriverManagerDataSource jdbc = new DriverManagerDataSource(this.url, this.useName, this.password);
        jdbc.setDriverClassName(this.classeName);

        this.jdbcTemplate = new JdbcTemplate(jdbc);

        return this.jdbcTemplate;

    }
}
