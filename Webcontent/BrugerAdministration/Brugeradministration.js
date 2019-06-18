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
            alert(textStatus);
            alert(errorThrown);

        }
    });
}


// function GET() {
//     $.get("rest/createUser", function (data, status) {
//         $("#sebruger").html(data);
//         alert(status);
//     })
// }




