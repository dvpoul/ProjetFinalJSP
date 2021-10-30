/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author EWOL
 */
public class StageDataContext {

    public GestDriverManagerDataSource driverManagerDataSource = new GestDriverManagerDataSource();
    private final JdbcTemplate jdbcTemplate = driverManagerDataSource.createJdbcTemplate();

    // driverManagerDataSource.
    public void insertStage(int id_stage, int id_entreprise, String nom, String description, int categorie, Calendar dateStage) {
        //exécuter la requete
        jdbcTemplate.update("insert into stage(id_stage, id_entreprise, nom, description, categorie, date) values(?,?,?,?,?,?,?)",
                id_stage, id_entreprise, nom, description, categorie, dateStage);
        // new Object[]{l.getIsbn(), l.getAuteur(), l.getTitre(), l.getQuantite(), l.getPhoto(), l.getResume()});

    }

    public List<Stage> selectStage() {
        List<Stage> liste = this.jdbcTemplate.query("select id_stage, id_entreprise, nom, description, categorie, date from stage", new LivreMapper());
        return liste;
    }

    private class LivreMapper implements RowMapper<Stage> {

        @Override
        public Stage mapRow(ResultSet rs, int i) throws SQLException {
            return new Stage(rs.getInt("id_stage"), rs.getInt("id_entreprise"), rs.getString("nom"), rs.getString("description"), rs.getInt("categorie"), rs.getCalendar("dateStage"));
        }
    }

}
