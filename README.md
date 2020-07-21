# JavaWeb-
filter包 
过滤器，解决中文字符集乱码
EncodingFilter类用来解决中文字符集乱码，实现Filter接口，并重写doFilter函数

util 包
数据库连接工具类
DBconnect类用来处理对数据库的连接操作

entity 包
实体类
MyUser实体类，对应数据库中的Student表,表中每个字段在实体中为一个属性

dao包
数据操作类
UserDao接口 
UserDaoImplement类是接口对应的方法实现类

servlet包
loginServlet类用来实现对用户登录的操作
registerServlet类用来实现用户注册的操作
shouAllServlet类用来返回数据库中所有用户信息
updateServlet类用来更新用户信息
deleteServlet类用来删除用户信息

各类jsp文件
login.jsp//登录页面
success.jsp//登录成功
register.jsp//注册页面
showAll.jsp//管理页面
addUpdateDeleteFail.jsp//管理页面
addUpdateDeleteSuccess.jsp//管理页面

web.xml的配置信息
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns="http://xmlns.jcp.org/xml/ns/javaee"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd"
         version="4.0">
         
    <display-name></display-name>
    
    <filter>
        <filter-name>EncodingFilter</filter-name>
        <filter-class>filter.EncodingFilter</filter-class>
    </filter>

    <filter-mapping>
        <filter-name>EncodingFilter</filter-name>
        <url-pattern>/*</url-pattern> 
    </filter-mapping>
    
    <servlet>
        <servlet-name>loginServlet</servlet-name>
        <servlet-class>servlet.loginServlet</servlet-class>
    </servlet>

    <servlet>
        <servlet-name>registerServlet</servlet-name>
        <servlet-class>com.servlet.registerServlet</servlet-class>
    </servlet>
    
    <servlet>
        <servlet-name>showAllServlet</servlet-name>
        <servlet-class>servlet.showAllServlet</servlet-class>
    </servlet>
    
    <servlet>
        <servlet-name>deleteServlet</servlet-name>
        <servlet-class>com.servlet.deleteServlet</servlet-class>
    </servlet>
    
    <servlet>
        <servlet-name>updateServlet</servlet-name>
        <servlet-class>servlet.updateServlet</servlet-class>
    </servlet>
    
    <servlet-mapping>
        <servlet-name>loginServlet</servlet-name>
        <url-pattern>/loginServlet</url-pattern>
    </servlet-mapping>
    
    <servlet-mapping>
        <servlet-name>registerServlet</servlet-name>
        <url-pattern>/registerServlet</url-pattern>
    </servlet-mapping>
    
    <servlet-mapping>
        <servlet-name>showAllServlet</servlet-name>
        <url-pattern>/showAllServlet</url-pattern>
    </servlet-mapping>
    
    <servlet-mapping>
        <servlet-name>deleteServlet</servlet-name>
        <url-pattern>/deleteServlet</url-pattern>
    </servlet-mapping>
    
    <servlet-mapping>
        <servlet-name>updateServlet</servlet-name>
        <url-pattern>/updateServlet</url-pattern>
    </servlet-mapping>
    
    <welcome-file-list>
        <welcome-file>login.jsp</welcome-file>
    </welcome-file-list>
    
</web-app>
