function opretBruger() {
    alert("jeg er her");
    event.preventDefault();
    var data = $('#opretbruger').serializeJSON();
    alert(data);
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


function getBruger(test) {
    alert("Silent dead");
    ID = $('#ID').val();
    alert(ID);
    event.preventDefault();
    alert(test);
    $.ajax({
        url: '/rest/UserService/' + ID,
        method: "GET",
        success:
            function (data) {
                alert(test);
                if (test === undefined) {
                    alert("JEG ER HELT SIKKERT IKKE JULEMANDEN");
                    $("#usertablebody").empty();
                    $("#usertablebody").append(generateUserHTML(data));

                } else {
                    alert("JEG ER HELT SIKKERT JULEMANDEN");
                    $("#usertablebody").empty();
                    $("#usertablebody").append(lavBrugerRetHTML(data));
                }
            },
        error: function (jqXHR, textStatus, errorThrown) {
            alert(jqXHR.responseText);
        }
    });
}


function brugerDerSkalRettes() {
    alert("sovs");
    var y = 32;
    getBruger(y);
    event.preventDefault();

    /*$.ajax({
        url: '/rest/UserService/' + ID,
        method: "GET",
        success:
            function (data) {
                // $("#usertablebody").empty();
                // $("#usertablebody").append(generateUserHTML(data));
            },
        error: function (jqXHR, textStatus, errorThrown) {
            alert(jqXHR.responseText);
        }
    });*/

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
    alert("jeg er her");
    event.preventDefault();
    alert(ID)
    $.ajax({
        url: '/rest/UserService/setBrugerAktivitet/' + ID,
        method: "POST",
        success:
            function () {
                alert("nu er jeg her")
            },
        error: function (jqXHR, textStatus, errorThrown) {
            alert(jqXHR.responseText);
        }
    })
}


function retBruger() {
    alert("retBruger");
    event.preventDefault();
    var data = $('#retbrugerform').serializeJSON();
    alert(data.toString());
    $.ajax({
        url: '/rest/UserService/update/',
        contentType: "application/json", // det
        method: "POST",// visender er json
        data: data,
        success:
            function () {
                alert("ændret");
            },
        error: function (jqXHR, textStatus, errorThrown) {
            alert(jqXHR.responseText);
        }
    })

}





