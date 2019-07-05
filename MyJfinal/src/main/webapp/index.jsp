<html>
<body>
<h2>Hello Jfinal!</h2>
<br />
全部数据显示：
<br />
#(obj.user)
<br />
<br />
单条数据显示：
<br />
#(obj.user[0])
<br />
<br />
单条属性显示：
<br />
#(obj.user[0].name)
<br />
<br />
空数据显示：
<br />
#(obj.users == null ? "数据为空" : obj.users[0].account)
</body>
</html>
