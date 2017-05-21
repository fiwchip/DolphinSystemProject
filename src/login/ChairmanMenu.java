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
    
    public static void chairmanMenu() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Member> memberList = new ArrayList<Member>();
       

        /** 
         FileInputStreamen læser memberList.txt filen, 
         og gendanner userList ArrayListen.
         Lige nu virker denne del ikke hvis memberList.txt 
         filen er blank.
         Dette bliver forhåbenligt ikke et problem, da der vel altid vil være
         mindst formandens login i filen.
         **/
        try {
            FileInputStream fis = new FileInputStream("memberList.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            memberList = (ArrayList<Member>)ois.readObject();

            ois.close();
        } catch(Exception ex) {
            ex.printStackTrace();
        }         
        
        
        char menuChoice;
        boolean choiceLoop = true;
        while (choiceLoop == true)
        {
            
            System.out.println("Velkommen formand, hvad vil du i dag?" +
                    "\n1. Registrer nyt medlem." + "\n2. Rediger medlem" + "\n3. Slet medlem");
            menuChoice = sc.next().charAt(0);
            switch(menuChoice) {
                case '1' :
                     /** 
                    Diverse variable der bruges når nyt medlem skal ind i ArrayListen.
                    **/
                    String addUserResponse = "";
                    String firstName, surName, email, password, birthDate;
                    int memberID;
                    boolean hasPaid, isFemale, isTrainer, isActive;
                    double fee;

                    boolean addMemberBoolean;

                    /** 
                     Systemet spørger om man vil tilføje et nyt medlem til ArrayListen.
                     **/
                    System.out.println("Vil du tilføje et medlem? true/false");
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

                            int searchListLength = memberList.size();
                            for (int i = 0; i < searchListLength; i++) {
                                if(memberList.get(i).getMemberID()==(memberID)) {
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
                        surName = sc.next();
                        System.out.println("Fødselsdato (dd.mm.yy):");
                        birthDate = sc.next();
                        System.out.println("E-mail:");
                        email = sc.next();
                        System.out.println("Er medlemmet en kvinde (true/false)");
                        isFemale = sc.nextBoolean();
                        System.out.println("Er medlemmet en træner? (true/false");
                        isTrainer = sc.nextBoolean();
                        System.out.println("Er medlemmet aktivt? (true/false");
                        isActive = sc.nextBoolean();
                        System.out.println("Angiv medlemmets kontingentsafgift: ");
                        fee = sc.nextDouble();
                        System.out.println("Har medlemmet betalt? (true/false)");
                        hasPaid = sc.nextBoolean();
                        Member u1 = new Member(String firstName, String surName, String email, String birthDate, int memberID, String password, boolean isFemale, boolean isTrainer, boolean isActive, double fee, boolean hasPaid);
                        memberList.add(u1);

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
                        oos.writeObject(memberList); // write MenuArray to ObjectOutputStream
                        oos.close(); 
                    } catch(Exception ex) {
                        ex.printStackTrace();
                    }
                    choiceLoop = false;
                    break;
                case '2' : 
                    choiceLoop = false;
                    break;
                case '3' :
                    choiceLoop = false;
                    break;       
            }
        
        
        
        
        }   
    }   
}
