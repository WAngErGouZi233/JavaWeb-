package dao;

import entity.MyUser;
import util.DBconnect;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.lang.invoke.MutableCallSite;

public class UserDaoImplement implements UserDao {
    public boolean login(String name, String password) {
        boolean flag = false;
        try {
            try{
                DBconnect.init();
            }catch (Exception e){
                e.printStackTrace();
            }

            ResultSet rs = DBconnect.selectSql("select * from student where name='" + name + " 'and password='" + password + "';");
            while (rs.next()) {
                if (rs.getString("name").equals(name) && rs.getString("password").equals(password)) {
                    flag = true;
                }
            }
            DBconnect.closeConn();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }

    public boolean register(MyUser user) {
        boolean flag = false;
        try{
            DBconnect.init();
        }catch (Exception e){
            e.printStackTrace();
        }
        int i = DBconnect.addUpdateDelete("insert into student(name,password,id) " +
                "values('" + user.getName() + "','" + user.getPassword() + "','"+user.getId()+" ' )");
        if (i > 0) {
            flag = true;
        }
        DBconnect.closeConn();
        return flag;
    }

    public List<MyUser> getUserAll() {
        List<MyUser> list = new ArrayList<>();
        try {
            try{
                DBconnect.init();
            }catch (Exception e){
                e.printStackTrace();
            }
            ResultSet rs = DBconnect.selectSql("select * from student");
            while (rs.next()) {
                String nameone=rs.getString("name");
                String passwordone=rs.getString("password");
                String idone=rs.getString("id");
                MyUser user=new MyUser(nameone,passwordone,idone);
                list.add(user);
            }
            DBconnect.closeConn();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public boolean delete(String id) {
        boolean flag = false;
        try{
            DBconnect.init();
        }catch (Exception e){
            e.printStackTrace();
        }
        String sql = "delete from student where id='" + id+"'";
        int i = DBconnect.addUpdateDelete(sql);
        if (i > 0) {
            flag = true;
        }
        DBconnect.closeConn();
        return flag;
    }

    public boolean update(String name, String id) {
        boolean flag = false;
        try{
            DBconnect.init();
        }catch (Exception e){
            e.printStackTrace();
        }
        String sql = "update student set name ='" + name

                +"'"+"where id = '" + id+"'";

        int i = DBconnect.addUpdateDelete(sql);
        System.out.println("1"+" "+i);
        if (i > 0) {
            flag = true;
        }
        DBconnect.closeConn();
        return flag;
    }

}

