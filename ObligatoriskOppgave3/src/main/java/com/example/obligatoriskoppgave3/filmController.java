package com.example.obligatoriskoppgave3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class filmController {

    @Autowired
    private filmRepository rep;

    @PostMapping("/lagre")
    public void lagreFilm (film innFilm) {
        rep.lagreFilm(innFilm);
    }

    @GetMapping("/hentFilmer")
    public List<filmTittel> hentFilmer() {
        List<filmTittel> filmListe = new ArrayList<>();
        filmListe.add(new filmTittel("Spider-man"));
        filmListe.add(new filmTittel("Interstellar"));
        filmListe.add(new filmTittel("Batman"));
        return filmListe;
    }

    @GetMapping("/hentAlle")
    public List<film> hentAlle() {
        return rep.sorter();
    }

    @GetMapping("/slettAlle")
    public void slettAlle () {
        rep.slettAlle();
    }
}
