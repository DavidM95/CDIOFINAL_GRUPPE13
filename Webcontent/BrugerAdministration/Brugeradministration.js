function opretBruger() {
    event.preventDefault();
    var data = $('#opretbruger').serializeJSON();
    $.ajax({
        url: '/rest/UserService/',
        method: 'POST',
        contentType: "application/json", // det visender er json
        data: data,
        success: function (data) {
            alert(JSON.stringify(data));
        },
        error: function (jqXHR, textStatus, errorThrown) {
            alert(jqXHR.responseText);
        }
    });
}


function getBruger() {
    ID = $('#ID').val();
    event.preventDefault();
    $.ajax({
        url: '/rest/UserService/' + ID,
        method: "GET",
        success:
            function (data) {

                $("#usertablebody").empty();
                $("#usertablebody").append(generateUserHTML(data));

            },
        error: function (jqXHR, textStatus, errorThrown) {
            alert(jqXHR.responseText);
        }
    });
}

function getRetBruger() {
    ID = $('#ID').val();
    event.preventDefault();
    $.ajax({
        url: '/rest/UserService/' + ID,
        method: "GET",
        success:
            function (data) {

                $("#usertablebody").empty();
                $("#usertablebody").append(lavBrugerRetHTML(data));

            },
        error: function (jqXHR, textStatus, errorThrown) {
            alert(jqXHR.responseText);
        }
    });
}


function getAlleBrugere() {
    event.preventDefault();
    $.ajax({
        url: '/rest/UserService/seallebrugere',
        method: "GET",
        success:
            function (data) {
                $("#alluserstablebody").empty();
                $.each(data, function (i, elt) {
                    $('#alluserstablebody').append(generateUserHTML(elt));
                });
            },
        error: function (jqXHR, textStatus, errorThrown) {
            alert(jqXHR.responseText);
        }
    });
}


function lavBrugerRetHTML(brugerDTO) {
    return 'ID: <br>\n' +
        '<input type="text" name="brugerId" id="brugerId" value=' + brugerDTO.brugerId + ' readonly>\n' +
        '<br>\n' +
        'Brugernavn:<br>\n' +
        '<input type="text" name="brugerNavn" id="brugerNavn" value=' + brugerDTO.brugerNavn + '>\n' +
        '<br>\n' +
        'Initialer:<br>\n' +
        '<input type="text" name="brugerIni" id="brugerIni" value=' + brugerDTO.brugerIni + '>\n' +
        '<br>\n' +
        'Password:<br>\n' +
        '<input type="text" name="brugerPassword" id="brugerPassword" value=' + brugerDTO.brugerPassword + '>\n' +
        '<br>\n' +
        'Rolle:<br>\n' +
        '<input type="text" name="brugerRole" id="brugerRole" value=' + brugerDTO.brugerRole + '>\n' +
        '<br>\n' +
        'Aktiv: <br>\n' +
        '<input type="text" name="erAktiv" id="erAktiv" value=' + brugerDTO.erAktiv + ' readonly>\n' +
        '<br>' + '<button onclick="retBruger()"> Opdater Bruger</button>';

}

function generateUserHTML(brugerDTO) {
    return '<tr><td>' + brugerDTO.brugerId + '</td>' +
        '<td>' + brugerDTO.brugerNavn + '</td>' +
        '<td>' + brugerDTO.brugerIni + '</td>' +
        '<td>' + brugerDTO.brugerPassword + '</td>' +
        '<td>' + brugerDTO.brugerRole + '</td>' +
        '<td>' + brugerDTO.erAktiv + '</td></tr>'
}

function setBrugerAktivitet() {
    ID = $('#ID').val();
    event.preventDefault();
    $.ajax({
        url: '/rest/UserService/setBrugerAktivitet/' + ID,
        method: "POST",
        success:
            function () {
                alert("Brugerens aktivitet er nu ændret");
            },
        error: function (jqXHR, textStatus, errorThrown) {
            alert(jqXHR.responseText);
        }
    })
}


function retBruger() {
    event.preventDefault();
    var data = $('#retbrugerform').serializeJSON();
    $.ajax({
        url: '/rest/UserService/update/',
        contentType: "application/json", // det
        method: "POST",// visender er json
        data: data,
        success:
            function () {
                alert("Brugeren er nu opdateret");
            },
        error: function (jqXHR, textStatus, errorThrown) {
            alert(jqXHR.responseText);
        }
    })

}





