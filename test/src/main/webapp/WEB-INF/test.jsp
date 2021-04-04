<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Test</title>
    </head>
    <body>
        <p>Ceci est une page générée depuis une JSP.</p>
        <p>
            ${test}
            ${param.Author}
        </p>
        <p>
            Récupération du bean :
            ${TheBean.firstName}
            ${TheBean.lastName}
        </p>
    </body>
</html>