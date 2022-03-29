package com.example.obligatoriskoppgave3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class filmRepository {

    @Autowired
    private JdbcTemplate db;

    public void lagreFilm(film innFilm) {
        String sql = "INSERT INTO film (tittel, antall, fornavn, etternavn, telefonnr, epost) VALUES(?,?,?,?,?,?)";
        db.update(sql, innFilm.getTittel(), innFilm.getAntall(),innFilm.getFornavn(),innFilm.getEtternavn(),
                innFilm.getTelefonnr(),innFilm.getEpost());
    }

    public List<film> hentAlleFilmer() {
        String sql = "SELECT * FROM film";
        List<film> alleFilmer = db.query(sql, new BeanPropertyRowMapper(film.class));
        return alleFilmer;
    }

    public void slettAlle() {
        String sql = "DELETE FROM film";
        db.update(sql);
    }
}
