/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

/**
 *
 * @author Nikolaj Reichardt
 */
public class Login {

    /**
     * pt. sker der ikke det helt store her, endnu.
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        ArrayList<User> userList = new ArrayList<User>();
        try {
            FileInputStream fis = new FileInputStream("memberList.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            userList = (ArrayList<User>)ois.readObject();

            ois.close();
        } catch(Exception ex) {
            ex.printStackTrace();
        } 
        System.out.println(userList.toString());
    }
}
