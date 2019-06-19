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


function getBruger() {
        alert("jeg er her");
        event.preventDefault();
        var data = $('#getbrugerID').serializeJSON();
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

        $.get("rest/createUser", function (data, status) {
        alert(data);
        document.getElementById("id").value = data.brugerId;
        document.getElementById("brugernavn").value = data.brugerNavn;
        document.getElementById("brugerini").value = data.brugerIni;
        document.getElementById("brugerpassword").value = data.brugerPassword;
        document.getElementById("brugerrolle").value = data.brugerRole;
        alert(status);
         })

}
function seallebrugere() {
    $.get("rest/createUser", function (data, status) {
        alert(data);
        document.getElementById("seallebrugere").value = data;

        alert(status);
    })
}




