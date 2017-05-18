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
        Scanner sc = new Scanner(System.in);
        ArrayList<User> userList = new ArrayList<User>();
        try {
            FileInputStream fis = new FileInputStream("memberList.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            userList = (ArrayList<User>)ois.readObject();

            ois.close();
        } catch(Exception ex) {
            ex.printStackTrace();
        }

        boolean loginSuccess = false;
        int loginMemberID;
        do {
        System.out.println("Login: " + 
                "\nMedlems ID: ");
        loginMemberID = sc.nextInt();
        System.out.println("Password: ");
        String loginPassword = sc.next();
        int searchListLength = userList.size();
        
        for (int i = 0; i < searchListLength; i++) {
                  if (userList.get(i).getMemberID()==(loginMemberID) && userList.get(i).getPassword().equals(loginPassword)) {
                      System.out.println("Login godkendt.");
                      loginSuccess = true;
                  } 
                  
        }
        //System.out.println(userList.toString());
        } while (loginSuccess == false);
        
        int firstDigit = loginMemberID/1000;
        System.out.println(firstDigit);
        char menu = (char)(firstDigit + '0');
        switch(menu) {
            case '1' :
                break;
            case '2' :
                break;
            case '3' :
                break;
        
        
        
        
        }
 }
}
