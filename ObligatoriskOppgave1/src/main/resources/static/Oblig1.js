let billetter = [];
let ut = "";


function kjopBillett() {
    let innData = [];
    innData.push(document.getElementById("antall").value);
    innData.push(document.getElementById("fornavn").value);
    innData.push(document.getElementById("etternavn").value);
    innData.push(document.getElementById("telefonnr").value);
    innData.push(document.getElementById("epost").value);

    let sjekk = false;

    for (let i in innData) {
        if(innData[i] === ""|| innData[i] === null) {
            document.getElementById("feil"+i).innerHTML = "Skriv noe inn i " + document.getElementById("lbl"+i).innerHTML;
            sjekk = true;
        } else {
            document.getElementById("feil"+i).innerHTML = "";
        }
    }
    if (sjekk) {
        return;
    }


    let billett = {
        film: document.getElementById("velgFilm").value,
        antall: document.getElementById("antall").value,
        fornavn: document.getElementById("fornavn").value,
        etternavn: document.getElementById("etternavn").value,
        telefonnr: document.getElementById("telefonnr").value,
        epost: document.getElementById("epost").value
    };

    billetter.push(billett);

    for (let i of billetter) {
        ut = "<tr><td>" + i.film +"</td><td>"+ i.antall +"</td><td>"+ i.fornavn +"</td>" +
            "<td>"+ i.etternavn +"</td><td>"+ i.telefonnr +"</td>"+
            "<td>"+ i.epost +"</td></tr>";
    }

    document.getElementById("registrer").innerHTML += ut;

    let inputFelt = document.getElementsByClassName("input");

    for (let i in inputFelt) {
        inputFelt[i].value = "";
    }
}

function slettInnhold() {
    billetter.length = 0;
    document.getElementById("registrer").innerHTML = "<tr><th> Film </th><th> Antall </th>" +
        "<th> Fornavn </th><th> Etternavn </th><th> Telefonnr </th><th> Epost </th></tr>";
}