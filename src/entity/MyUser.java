package entity;

public class MyUser {
    private String name;
    private String password;
    private String id;

    public MyUser(){}

    public MyUser(String name,String password,String id){
        this.name=name;
        this.password=password;
        this.id=id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public MyUser(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String username) {
        this.name = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}

