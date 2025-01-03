<!DOCTYPE html>
<html>
<head>
    <title>Quiz</title>
</head>
<body>
    <h2>${question}</h2>
    <form action="quiz" method="POST">
        <input type="radio" name="answer" value="0" /> ${choices[0]}<br>
        <input type="radio" name="answer" value="1" /> ${choices[1]}<br>
        <input type="radio" name="answer" value="2" /> ${choices[2]}<br>
        <input type="radio" name="answer" value="3" /> ${choices[3]}<br>
        <input type="submit" value="Submit Answer">
    </form>
</body>
</html>
