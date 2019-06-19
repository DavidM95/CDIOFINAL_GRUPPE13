function opretBruger() {
    alert("jeg er her");
    event.preventDefault();
    var data = $('#opretbruger').serializeJSON();
    alert(data);
    $.ajax({
        url: '/rest/createUser/',
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


function getBruger(ID) {
    if(!ID && ID!=0){
        ID = $('#ID').val();
    }
    alert(ID);
    event.preventDefault();

    $.ajax({
        url: '/rest/createUser/' + ID,
        method: "GET",
        success:
        function (data) {
            $("#usertablebody").empty();
            $("#usertablebody").append(generateUserHTML(data));
            /*            $.each(data, function (i, elt) {
                            alert("DATA!");
                            $('#usertablebody').append(generateUserHTML(elt));
                        });*/

        },
        error: function (jqXHR, textStatus, errorThrown) {
            alert(jqXHR.responseText);
        }
    });
}

function generateUserHTML(brugerDTO) {
    return '<tr><td>' + brugerDTO.brugerId + '</td>' +
        '<td>' + brugerDTO.brugerNavn + '</td>' +
        '<td>' + brugerDTO.brugerIni + '</td>' +
        '<td>' + brugerDTO.brugerPassword + '</td>' +
        '<td>' + brugerDTO.brugerRole + '</td>'
    /*'<tr><td>' + .id + '</td>' +
        '<td>' + ingredient.name + '</td>' +
        '<td>' + ingredient.amount + '</td>' +*/
}

function getAlleBrugere() {
    $.get('rest/createUser/seallebrugere', function (data, status) {
        alert(data);
        document.getElementById("id").value = data.brugerId;
        document.getElementById("brugernavn").value = data.brugerNavn;
        document.getElementById("brugerini").value = data.brugerIni;
        document.getElementById("brugerpassword").value = data.brugerPassword;
        document.getElementById("brugerrolle").value = data.brugerRole;
        alert(status);
    })
}




