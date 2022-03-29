$(function(){
    hentAlleFilmer();
});

function hentAlleFilmer() {
    $.get("/hentFilmer", function (filmer) {
        formaterFilmer(filmer);
    });
}

function formaterFilmer(filmTittel) {
    let ut = "<select id='valgtFilm'>";
    for (const film of filmTittel) {
        ut += "<option>"+film.tittel+"</option>"
    }
    ut+= "</select>";
    $("#velgFilm").html(ut);
}

function registrer(filmer) {
    let innData = [];
    const film = {
        tittel: $("#valgtFilm").val(),
        antall: $("#antall").val(),
        fornavn: $("#fornavn").val(),
        etternavn: $("#etternavn").val(),
        telefonnr: $("#telefonnr").val(),
        epost: $("#epost").val()
    };

    innData.push($("#antall").val())
    innData.push($("#fornavn").val())
    innData.push($("#etternavn").val())
    innData.push($("#telefonnr").val())
    innData.push($("#epost").val())

    let sjekk = false;

    for (let i in innData) {
        if (innData[i] === "" || innData[i] === null) {
            $("#feil" + i).html("Må fylle inn " + $("#lbl" + i).html());
            sjekk = true;
        } else {
            $("#feil" + i).html("");
        }
    }

    if (sjekk) {
        return;
    }

    $.post("/lagre",film, function(){
        hentAlle();
    })
    $("#antall").val("")
    $("#fornavn").val("")
    $("#etternavn").val("")
    $("#telefonnr").val("")
    $("#epost").val("")
}
function hentAlle() {
    $.get("/hentAlle", function (filmer) {
        formaterData(filmer)
    });
}

function formaterData(filmer) {
    let ut = "<table class='table table-striped'><tr><th>Film</th><th>Antall</th><th>Fornavn</th><th>Etternavn</th><th>Telefonnr</th><th>Epost</th></tr>";
    for (const film of filmer) {
        ut += "<tr><td>" + film.tittel +"</td><td>"+ film.antall +"</td><td>"+ film.fornavn +"</td>" +
            "<td>"+ film.etternavn +"</td><td>"+ film.telefonnr +"</td>"+
            "<td>"+ film.epost +"</td></tr>";
    }
    ut+= "</table>";
    $("#resultat").html(ut);
}

function slettAlle() {
    $.get("/slettAlle", function (data) {
        hentAlle();
    })
}