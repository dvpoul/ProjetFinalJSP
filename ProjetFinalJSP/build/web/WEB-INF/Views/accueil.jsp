<%-- 
    Document   : accueil
    Created on : 28 oct. 2021, 11 h 47 min 41 s
    Author     : dave-
--%>

    <%@ include file="header.jsp" %>  

        
    <div class="container"> 
        <h1 class="text-center">Page d'accueil</h1>
        <c:if test="${not empty username and not username.equals('anonymousUser')}"> 
        <h3 class="text-center pb-2">Bienvenue ${username}</h3>
        </c:if> 
        <div class="text-justify">
        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean sit amet odio lobortis, consectetur est vel, ultrices est. Cras nec viverra quam. Suspendisse ac urna sollicitudin, vestibulum velit vel, fringilla risus. Aliquam erat volutpat. Maecenas rutrum eget neque vitae eleifend. Suspendisse mauris sapien, venenatis vitae elementum sit amet, aliquet eget massa. In finibus mauris et convallis tincidunt. Vivamus id convallis quam. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Aliquam magna ipsum, eleifend non luctus eu, sagittis et erat. Nulla dolor mi, blandit in laoreet in, tempus non mi. In ac pellentesque ipsum. Suspendisse nec nibh metus.</p>

        <p>Integer nec molestie erat. In id lacus ac odio tempus posuere in at enim. Nullam in maximus magna. Vestibulum iaculis neque non nunc interdum commodo. Fusce egestas quam non quam bibendum, sed sagittis ipsum aliquam. Morbi feugiat lacinia nibh at malesuada. Mauris tortor libero, egestas id mattis eget, scelerisque sed ante. Ut ullamcorper accumsan consequat. Ut vitae venenatis nunc. Donec lacinia, purus nec pulvinar maximus, enim ipsum lacinia velit, non porttitor metus augue sit amet tellus. Nunc commodo auctor fermentum. Nunc at scelerisque nisi. Etiam fringilla egestas ipsum ut porttitor. Curabitur ut libero non neque tincidunt porttitor blandit ut erat. Nam nisl metus, efficitur quis leo nec, vestibulum pretium massa.</p>

        <p>Maecenas ultricies nisi ut quam elementum sodales in eget tortor. Donec nunc eros, rutrum dapibus condimentum non, ullamcorper at urna. Pellentesque vulputate ex eget magna congue euismod. Donec dictum leo id quam scelerisque porta. Donec tincidunt blandit ullamcorper. Morbi placerat pretium velit ac convallis. Sed gravida cursus magna, at lobortis diam tempor accumsan. Nunc ut tristique nisl.</p>
       
        </div>
    </div>        
        
    <%@ include file="footer.jsp" %>