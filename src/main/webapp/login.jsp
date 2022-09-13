<%@include file="header1.html"%>

<div class="card" align="center">
  <div>
      <form action="LoginServlet" method="post">
        <div class>
          <label>Username</label>
          <input type="text" name="username" id="username">
        </div>
        <div>
          <label>Password</label>
          <input type="password" name="password" id="password">
        </div>
        <input type="submit" value="Login">

      </form>
  </div>
</div>

<%@include file="footer1.html"%>