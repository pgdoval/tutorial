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
    <table>
        <th><td>Título</td><td>Descripción</td></th>
        <g:each var="book" in="${persona.librosEscritos}">
            <tr><td>Title: ${book.titulo}</td>
            <td>Author: ${book.descripcion}</td></tr>
        </g:each>
        
        
    
    </table>
  </body>
</html>
