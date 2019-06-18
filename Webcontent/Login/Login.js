
function userLogin() {
    alert("jeg er her");
    event.preventDefault();
    var data = $('#loginform').serializeJSON();
    alert(data);
    $.ajax({
        url: '/rest/loginService/',
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




