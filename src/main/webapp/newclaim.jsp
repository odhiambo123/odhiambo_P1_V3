<%@include file="header1.html"%>

<div class="col-md-offset-6" style="padding:75px; border-style: double">
    <div style="-moz-text-size-adjust: auto">
        <form  action="registerClaim" method="POST">
            <table>
                <tr>
                    <td>
                        <label for="claimDate">Claim Date</label>
                        <input type="text" name="claimDate" id="claimDate">
                    </td>
                </tr>

                <tr>
                    <td>
                        <label for="claimAmount">Amount</label>
                        <input type="text" name="claimAmount" id="claimAmount">
                    </td>
                </tr>
                <tr>
                    <td>
                        <label for="description">Description</label>
                        <input type="text" name="description" id="description">
                    </td>
                </tr>
                <tr>
                    <td>
                        <label for="approved">Approved? true/false</label>
                        <input type="text" name="approved" id="approved">
                    </td>
                </tr>
                <tr>
                    <td>
                        <label for="empId">Employee Id</label>
                        <input type="text" name="empId" id="empId">
                    </td>
                </tr>

                <tr>
                    <td>
                    <td>
                        <input type="submit" value="SUBMIT" name="submit" id="submit">
                        <input type="reset" value="Reset">
                    </td>
                </tr>
            </table>
        </form>
    </div>
</div>


<%@include file="footer1.html"%>
