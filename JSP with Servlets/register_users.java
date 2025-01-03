<!DOCTYPE html>
<html>
<head>
    <title>Register</title>
</head>
<body>
    <h2>User Registration</h2>
    <form action="register" method="POST">
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required><br><br>

        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required><br><br>

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required><br><br>

        <input type="submit" value="Register">
    </form>
    <br>
    <a href="login.jsp">Already have an account? Log in</a>
</body>
</html>
