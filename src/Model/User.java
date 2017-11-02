package Model;

/**
 * Created by Bianca on 2/11/2017.
 */
public abstract class User {
    private String name;
    private String mail;
    private String cellphone;
    private String password;

    public User(String name, String mail, String cellphone, String password){
        this.name = name;
        this.mail = mail;
        this.cellphone = cellphone;
        this.password = password;
    }

    public String getName(){return name;}
    public String getMail(){return mail;}
    public String getCellphone(){return cellphone;}
    public String getPassword(){return password;}
    public void setName(String newName){name = newName;}

    public void logOut(){
        System.out.println("Logged out");
        //cerrar ventana de usuario
    }
}
