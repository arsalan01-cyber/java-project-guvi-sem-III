<web-app xmlns="http://java.sun.com/xml/ns/javaee"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://java.sun.com/xml/ns/javaee
             http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd"
         version="3.0">

    <servlet>
        <servlet-name>QuizServlet</servlet-name>
        <servlet-class>com.quizgame.servlet.QuizServlet</servlet-class>
        <load-on-startup>1</load-on-startup>
    </servlet>

    <servlet-mapping>
        <servlet-name>QuizServlet</servlet-name>
        <url-pattern>/quiz</url-pattern>
    </servlet-mapping>

</web-app>
