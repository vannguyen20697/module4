<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        th, td, tr {
            border: 1px solid black;
            border-collapse: collapse;
        }
    </style>
</head>
<body>
<h1> To Khai Y Te</h1>
<div style="width: 100% ; border: 1px">
    <form:form action="save" method="post" modelAttribute="customer">
        <span>Ho va Ten :</span>
        <form:input path="name"/>
        <br>
        <br>

        <span>Ngay thang nam sinh</span>
        <form:input path="date"/>

        <span> Gioi Tinh</span>
        <form:select path="gender">
            <form:option value="Nam">Nam</form:option>
            <form:option value="Nu">Nu</form:option>
            <form:option value="Khac">Khac</form:option>
        </form:select>

        <span> Quoc Gia</span>
        <form:select path="country">
            <form:option value="Viet Nam">Viet Nam</form:option>
            <form:option value="USA">USA</form:option>
            <form:option value="China">China</form:option>
            <form:option value="Laos">Laos</form:option>
            <form:option value="Khac">Khac</form:option>
        </form:select>
        <span>So Cmnd/Cccd :</span>
        <form:input path="cccd"/>
        <br>
        <br>
        <span> Thong tin di lai</span>
        <form:radiobutton path="go" value="Tau bay"/> Tau Bay
        <form:radiobutton path="go" value="Tau thuyen" /> Tau thuyen
        <form:radiobutton path="go" value="Oto"/>Oto
        <form:radiobutton path="go" value="Khac"/>Khac
        <br>
        <br>
        <span> So hieu phuong tien</span>
        <form:input path="seriVehicle"/>
        <span> So ghe </span>
        <form:input path="numChair"/>
        <br>
        <br>
        <span> Ngay khoi hanh</span>
        <form:input path="dateStart"/>
        <span> Ngay ket thuc</span>
        <form:input path="dateEnd"/>
        <br>
        <br>
        <span> Trong vong 14 ngay co di qua thanh pho nao ?</span>
        <form:input path="note"/>
        <br>
        <br>
        <span> Tinh thanh pho</span>
        <form:input path="city"/>

        <span> Quan/Huyen</span>
        <form:input path="district"/>


        <span> Xa/Phuong/Thi tran</span>
        <form:input path="commune"/>

        <br>
        <br>

        <span> Dia chi tam tru</span>
        <form:input path="address"/>

        <br>
        <br>

        <span> So dien thoai</span>
        <form:input path="phone"/>

        <span>Email</span>
        <form:input path="email"/>
        </table>
        <form:button id="button" type="submit">Save</form:button>
    </form:form>
</div>
</body>
</html>