package school;

import java.util.Scanner;

public class User {



    static Scanner sc=new Scanner(System.in);

     private int id;

      String Username;
     String Usermail;

     public int getId(){
         return this.id;
     }


     public void setId(int id){
         this.id=id;

     }

    public static Scanner getSc() {
        return sc;
    }

    public String getUsername() {
        return Username;
    }

    public String getUsermail() {
        return Usermail;
    }
    //metodos

    public  void CreateUser(){

    }


    public   void ListUser(){
    }




}
