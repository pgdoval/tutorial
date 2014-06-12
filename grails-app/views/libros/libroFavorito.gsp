<!--
  To change this template, choose Tools | Templates
  and open the template in the editor.
-->

<%@ page contentType="text/html;charset=UTF-8" %>

<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Sample title</title>
  </head>
  <body>
    <h1>El libro favorito de ${persona.name} es ${persona.libroFavorito.titulo}</h1><g:link action="libroFavorito" id="2">Libro de id 2</g:link>
  </body>
</html>
