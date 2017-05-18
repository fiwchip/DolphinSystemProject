/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nikolaj Reichardt
 */
public class ChairmanMenu {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<User> userList = new ArrayList<User>();
       

        /** 
         FileInputStreamen læser memberList.txt filen, 
         og gendanner userList ArrayListen.
         Lige nu virker denne dle ikke hvis memberList.txt 
         filen er blank.
         Dette bliver forhåbenligt ikke et problem, da der vel altid vil være
         mindst formandens login i filen.
         **/
        try {
            FileInputStream fis = new FileInputStream("memberList.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            userList = (ArrayList<User>)ois.readObject();

            ois.close();
        } catch(Exception ex) {
            ex.printStackTrace();
        }         
        
       
        /** 
         Diverse variable der bruges når nyt medlem skal ind i ArrayListen.
         **/
        String addUserResponse = "";
        String firstName, lastName, email, gender, password;
        int age, memberID;
        boolean payStatus;
        
        boolean addMemberBoolean;
        
        /** 
         Systemet spørger om man vil tilføje et nyt medlem til ArrayListen.
         **/
        System.out.println("Vil du tilføje et medlem til listen? true/false");
        addMemberBoolean = sc.nextBoolean();
        
        boolean memberIDNotTaken = true;
        
        if(addMemberBoolean == true) 
        {
            do { 
                System.out.println("Sæt medlemsid: " + 
                            "\nFørste ciffer bestemmer brugerrettighedder." +
                            "\n1 = Formand, 2 = Kasserer, 3 = Træner, 4 = Svømmer.");
                memberID = sc.nextInt();
                do {
                
                int searchListLength = userList.size();
                for (int i = 0; i < searchListLength; i++) {
                    if(userList.get(i).getMemberID()==(memberID)) {
                        System.out.println("MedlemsID er allerede i brug, vælg et nyt.");
                        memberID = sc.nextInt();
                        memberIDNotTaken = false;
                    } 
                }
              } while(memberIDNotTaken == true);
            System.out.println("Sæt password");
            password = sc.next();
            System.out.println("Fornavn:");
            firstName = sc.next();
            System.out.println("Efternavn:");
            lastName = sc.next();
            System.out.println("Alder:");
            age = sc.nextInt();
            System.out.println("E-mail:");
            email = sc.next();
            System.out.println("Køn:");
            gender = sc.next();
            System.out.println("Har medlemmet betalt? (true/false)");
            payStatus = sc.nextBoolean();
            User u1 = new User(memberID, password, firstName, lastName, age, email, gender, payStatus);
            userList.add(u1);
               
            System.out.println("Vil du tilføje et medlem mere? j/n");
            addUserResponse = sc.next();
            }while(addUserResponse.equalsIgnoreCase("j"));
        }
        
        /** 
         FileOutputStreamen overskriver hele memberList.txt filen så de nye medlemmer
         som lige er blevet tilføjet også er i filen.
         Derfor var det nødvendigt at indlæse og oprette ArrayListen først oppe i starten
         med FileInputStream.
         **/
        
        try {
            FileOutputStream fos = new FileOutputStream("memberList.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);   
            oos.writeObject(userList); // write MenuArray to ObjectOutputStream
            oos.close(); 
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        
    
    
    }
    
    
}
