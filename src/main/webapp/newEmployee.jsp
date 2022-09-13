<%@include file="header1.html"%>
<div class="col-md-offset-6" style="padding:75px; border-style: double">
    <div style="-moz-text-size-adjust: auto">
<h2 align="center">New Employee Registration Form</h2>
<form  action="newemployee" method="POST">
    <table>
        <tr>
            <td>
                <label for="empName">NAME</label>
                <input type="text" name="empName" id="empName">
            </td>
        </tr>
        <tr>
            <td>
                <label for="empEmail">EMAIL</label>
                <input type="text" name="empEmail" id="empEmail">
            </td>
        </tr>
        <tr>
            <td>
                <label for="password">PASSWORD</label>
                <input type="password" name="password" id="password">
            </td>
        </tr>
        <tr>
            <td>
                <label for="empl_Type">EMPL TYPE 1/2</label>
                <input type="text" name="empl_Type" id="empl_Type">
            </td>
        </tr>
    </table>
    <div align="center"><input type="submit" value="Submit" > |<input type="reset" value="Reset"></div>
</form>
</div>
</div>

<%@include file="footer1.html"%>