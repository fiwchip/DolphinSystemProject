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
                    "\n1. Registrer nyt medlem." + "\n2. Rediger medlem" + "\n3. Slet medlem" + "\n4. Luk Dolphin System");
            menuChoice = sc.next().charAt(0);
            switch(menuChoice) {
                case '1' :
                     /** 
                    Diverse variable der bruges når nyt medlem skal ind i ArrayListen.
                    **/
                    String addUserResponse; //Holder brugerens svar om hvorvidt tilføj nyt medlem loop skal stoppes (j/n)
                    String firstName, surName, email, password, birthDate;
                    int memberID;
                    boolean hasPaid, isFemale, isTrainer, isActive;
                    double fee;
                    
                    
//                    /** Gammel kode fra inden menuen havde flere valgmuligheder **/
//                    String addMemberString;
//
//                    /** 
//                     Systemet spørger om man vil tilføje et nyt medlem til ArrayListen.
//                     **/
//                    System.out.println("Vil du tilføje et medlem? j/n");
//                    addMemberString = sc.next();
//
//                    
//
//                    if(addMemberString.equalsIgnoreCase("j")); {
//                    }
                    
                    boolean memberIDNotTaken = true;
                        do { 
                            System.out.println("Sæt medlemsid: " + 
                                        "\nFørste ciffer bestemmer brugerrettighedder." +
                                        "\n1 = Formand, 2 = Kasserer, 3 = Træner, 4 = Svømmer.");
                            memberID = sc.nextInt();
                            int searchListLength;
                            do {

                            searchListLength = memberList.size();
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
                        System.out.println("Er medlemmet en træner? (true/false)");
                        isTrainer = sc.nextBoolean();
                        System.out.println("Er medlemmet aktivt? (true/false)");
                        isActive = sc.nextBoolean();
                        System.out.println("Angiv medlemmets kontingentsafgift: ");
                        fee = sc.nextDouble();
                        System.out.println("Har medlemmet betalt? (true/false)");
                        hasPaid = sc.nextBoolean();
                        Member u1 = new Member(firstName, surName, email, birthDate, memberID, password, isFemale, isTrainer, isActive, fee, hasPaid);
                        memberList.add(u1);

                        System.out.println("Vil du tilføje et medlem mere? j/n");
                        addUserResponse = sc.next();
                        }while(addUserResponse.equalsIgnoreCase("j"));

                    /** 
                     FileOutputStreamen overskriver hele memberList.txt filen så de nye medlemmer
                     som lige er blevet tilføjet også er i filen.
                     Derfor var det nødvendigt at indlæse og oprette ArrayListen først oppe i starten
                     med FileInputStream.
                     **/

                    
                    break;
                case '2' : 
                    System.out.println("Indtast medlemsID for det medlem som skal redigeres: ");
                    int editSearch = sc.nextInt();
                    int editSearchListLength = memberList.size();
                    for (int i = 0; i < editSearchListLength; i++) {
                        if (memberList.get(i).getMemberID()==(editSearch)) {
                            boolean editMemberLoop = true;
                            while(editMemberLoop == true) {                            
                                System.out.println("Medlemmets nuværende data: \n");
                                System.out.println(memberList.get(i).printMember());
                                System.out.println("");
                                System.out.println("Hvad vil du redigere?"
                                        + "\n1. Fornavn. \n2. Efternavn. \n3. Email. \n4. Køn \n5. Træner status. "
                                        + "\n6. Aktiv/Passiv status. \n7. Kontingentafgift. \n8. Afslut redigering.");
                            
                                char editMember = sc.next().charAt(0);                                                   
                                switch(editMember) {
                                    case '1' :
                                        System.out.println("Angiv medlemmets nye fornavn:");
                                        String newFirstName = sc.next();
                                        memberList.get(i).setFirstName(newFirstName);
                                        break;
                                    case '2' :
                                        System.out.println("Angiv medlemmets nye efternavn:");
                                        String newSurName = sc.next();
                                        memberList.get(i).setSurName(newSurName);
                                        break;
                                    case '3' :
                                        System.out.println("Angiv medlemmets nye email:");
                                        String newEmail = sc.next();
                                        memberList.get(i).setEmail(newEmail);
                                        break;
                                    case '4' :
                                        System.out.println("Angiv medlemmets nye køn."
                                                + "\n Er medlemmet en kvinde? (true/false)");
                                        boolean newIsFemale = sc.nextBoolean();
                                        memberList.get(i).setIsFemale(newIsFemale);
                                        break;
                                    case '5' :
                                        System.out.println("Angiv medlemmets nye status."
                                                + "\n Er medlemmet en træner?");
                                        boolean newTrainer = sc.nextBoolean();
                                        memberList.get(i).setIsTrainer(newTrainer);
                                        break;
                                    case '6' :
                                        System.out.println("Angiv medlemmets nye status."
                                                + "Er medlemmet aktivt? (true/false)");
                                        boolean newIsActive = sc.nextBoolean();
                                        memberList.get(i).setIsActive(newIsActive);
                                        break;
                                    case '7' :
                                        System.out.println("Angiv medlemmets nye kontingentafgift:");
                                        double newFee = sc.nextDouble();
                                        memberList.get(i).setFee(newFee);
                                        break;
                                    case '8' :
                                        editMemberLoop = false;
                                        break;
                                    default :
                                        System.out.println("Ugyldigt valg, prøv igen.");

                                }
                            }
                        }
                    }
                    break;
                case '3' :
                    System.out.println("Indtast medlemsID for det medlem som skal slettes: ");
                    int deleteSearch = sc.nextInt();
                    int deleteSearchListLength = memberList.size();
                    for (int i = 0; i < deleteSearchListLength; i++) {
                        if (memberList.get(i).getMemberID()==(deleteSearch)) {
                            System.out.println("Er du sikker på at du vil slette dette medlem? (j/n)");
                            System.out.println(memberList.get(i).printMember());
                            String deleteMemberConfirm = sc.next();
                            if (deleteMemberConfirm.equalsIgnoreCase("j")) {
                                memberList.remove(i);
                                System.out.println("Medlemmet er blevet slettet.");
                            }
                            
                        }
                    }
                    choiceLoop = false;
                    break;   
                case '4' : 
                    choiceLoop = false;
                    break;
                default : 
                    System.out.println("Ugyldigt valg, prøv igen.");
            }   
        } 
        try {
                        FileOutputStream fos = new FileOutputStream("memberList.txt");
                        ObjectOutputStream oos = new ObjectOutputStream(fos);   
                        oos.writeObject(memberList); // write memberList to ObjectOutputStream
                        oos.close(); 
                    } catch(Exception ex) {
                        ex.printStackTrace();
                    }
    }   
}
