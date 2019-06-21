function userLogin() {
    event.preventDefault();
    var data = $('#loginform').serializeJSON();
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
        }
    });
    window.setTimeout(redirect, 3000);
    // redirect();


}

function redirect() {
    window.location.replace("/BrugerAdministration/BrugerAdministration.html")
}




