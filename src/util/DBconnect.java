package util;
import java.sql.*;

public class DBconnect {static String url="jdbc:mysql://localhost:3306/DataTest?useSSL=false";
    static String user="root";
    static String pw = "8421";
    static Connection conn=null;
    static PreparedStatement ps=null;
    static ResultSet rs=null;
    static Statement st=null;

    public static void init() throws SQLException, ClassNotFoundException {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn= DriverManager.getConnection(url, user, pw);
        }catch (Exception e){
            System.out.println("SQL程序初始化失败");
            e.printStackTrace();
        }
    }

    public static int addUpdateDelete(String sql){
        int i=0;
        try{
            ps=conn.prepareStatement(sql);
            boolean flag= ps.execute();
            if(flag==false){
                i++;
            }
        }catch(Exception e){
            System.out.println("数据库增删改异常 ");
            e.printStackTrace();
        }
        return i;
    }

    public static ResultSet selectSql(String sql){
        try{
            ps=conn.prepareStatement(sql);
            rs=ps.executeQuery();

        }catch(Exception e){
            System.out.println("数据库查询异常");
            e.printStackTrace();
        }
        return rs;
    }

    public static  void closeConn(){
        try{
            conn.close();
        }catch(Exception e){
            System.out.println("数据库关闭异常");
            e.printStackTrace();
        }
    }
}
