<%@include file="header1.html"%>

<div class="col-md-offset-6" style="padding:75px; border-style: double">
  <div style="-moz-text-size-adjust: auto">
      <form  action="login" method="POST">
        <table>
          <tr>
            <td>
              <label for="empEmail">Email</label>
              <input type="text" name="email" id="empEmail">
            </td>
          </tr>

            <tr>
                <td>
                  <label for="password">Password</label>
                  <input type="password" name="password" id="password">
                </td>
            </tr>
            <tr>
            <td>
            <td>
              <input type="submit" value="Login" name="login" id="login">
              <input type="reset" value="Reset">
            </td>
            </tr>
        </table>
        </form>
    </div>
</div>
<input type="submit" value="Login">

<%@include file="footer1.html"%>