<%-- 
    Document   : header
    Created on : Oct. 30, 2021, 11:01:24 a.m.
    Author     : EWOL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "f" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix = "fn" uri = "http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <!-- link stylesheet -->
        <link rel="stylesheet" href="<c:url value='/ressources/css/style.css' />"/>
    </head>
    <body>
        <c:url var="accUrl" value="/librairie/accueil"></c:url>
        <c:url var="achatUrl" value="/achat/listeLivres"></c:url>
        <c:url var="adminUrl" value="/admin/ajouterLivre"></c:url>
        <c:url var="panierUrl" value="/achat/afficherPanier"></c:url>       
        <c:url var="inscriptiontUrl" value="/Login/register"></c:url>
        <c:url var="connexionUrl" value="/Login/login"></c:url>
        <c:url var="deconnexionUrl" value="/Login/logout"></c:url>     
          <div id="banniere">
                <img src="<c:url value='/ressources/img/home.jpg' />" alt="banniere"/> 
            </div>

                    <nav class="navbar container justify-content-center" id="website-menu">

                         <ul class="nav py-2">
                           <li class="nav-item item">
                             <a class="nav-link" href="${accUrl}">Accueil</a>
                           </li>
                           <li class="nav-item item">
                             <a class="nav-link" href="${achatUrl}">Achat</a>
                           </li>
                           <li class="nav-item item">
                             <a class="nav-link" href="${adminUrl}">Administration</a>
                           </li>
                           
                           <c:if test="${empty username or username.equals('anonymousUser')}">
                           <li class="nav-item">
                             <a class="nav-link" href="${inscriptiontUrl}">S'inscrire</a>
                           </li>
                           <li class="nav-item">
                             <a class="nav-link" href="${connexionUrl}">Connexion</a>
                           </li>
                           </c:if>
                           <c:if test="${not empty username and not username.equals('anonymousUser')}">  
                           <li class="nav-item my-auto">
                             <!--<a class="nav-link" href="${deconnexionUrl}">Déconnexion</a>-->
                             <form action="${deconnexionUrl}" method='POST'>
                                 <button class="btn btn-link" name="submit" type="submit">Déconnexion</button>
                                <input  type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
                             </form>
                           </li>
                           </c:if>
                         </ul> 
                    </nav>

         