<%-- 
    Document   : footer
    Created on : Oct. 30, 2021, 11:01:37 a.m.
    Author     : EWOL
--%>

<c:set var="dateJour" value="<%=new java.util.Date()%>" />  

<%-- ***peut mettre mt-auto pour fixer footer en bas au lieu de css--%>
<footer class="footer text-center">
            
                <p>1234 rue Principale, Gatineau(Qc) J5F 4K9</p>                  
                <p><f:formatDate pattern = "yyyy-MM-dd" value = "${dateJour}" /></p>
                <p>&copy;2021 All Rights Reserved - Dave Pouliot</p>  
                            
        </footer>
                <script src="<c:url value='/ressources/js/script.js' />"></script>
    </body>
</html>