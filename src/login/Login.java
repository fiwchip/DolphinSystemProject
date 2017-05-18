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
public class Login {

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
        /** 
         Login:
         Brugeren indtaster et medlems ID og et password. Systemet søger
         * derefter igennem ArrayListen til den finder det medlemsID & password kombination.
         * Hvis systemet ikke finder kombinationen skal brugeren forsøge login igen.
         **/
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
        } while (loginSuccess == false);
        
        int firstDigit = loginMemberID/1000;
        System.out.println(firstDigit);
        char menu = (char)(firstDigit + '0');
        switch(menu) {
            case '1' :
                chairmanMenu();
                break;
            case '2' :
                treasurerMenu();
                break;
            case '3' :
                break;
            case '4' :
                break;
        
        
        
        
        }
    }
    //formandsmenu
    public static void chairmanMenu() {
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

    //Kasserermenuen
    public static void treasurerMenu() {
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
        
/**Alt dette nedenunder er ikke længere nødvendigt da det bliver klaret af
   createMember.java, og var egentligt kun brugt til at teste selve menuen med.
 **/       
//        String addUserResponse = "";
//        String firstName, lastName, email, gender;
//        int age, memberID;
//        boolean payStatus;
//        
//        boolean addMemberBoolean;
//        
//        System.out.println("Vil du tilføje et medlem til listen? true/false");
//        addMemberBoolean = sc.nextBoolean();
//        
//        if(addMemberBoolean == true) 
//        {
//            do { 
//            System.out.println("Angiv medlemsid: ");
//            memberID = sc.nextInt();
//            System.out.println("Fornavn:");
//            firstName = sc.next();
//            System.out.println("Efternavn:");
//            lastName = sc.next();
//            System.out.println("Alder:");
//            age = sc.nextInt();
//            System.out.println("E-mail:");
//            email = sc.next();
//            System.out.println("Køn:");
//            gender = sc.next();
//            System.out.println("Har medlemmet betalt? (true/false)");
//            payStatus = sc.nextBoolean();
//            User u1 = new User(memberID, firstName, lastName, age, email, gender, payStatus);
//            userList.add(u1);
//               
//            System.out.println("Vil du tilføje et medlem mere? j/n");
//            addUserResponse = sc.next();
//            }while(addUserResponse.equalsIgnoreCase("j"));
//        }
//        
//        System.out.println(userList.toString());
        
        
        char menuChoice;
        boolean choiceLoop = true;  
        while (choiceLoop == true)
        {       
            System.out.println("Velkommen kasserer, hvad vil du i dag?" +
                "\n1. Check kontingentrestance. " + "\n2. Registrér kontingentbetaling.");
            menuChoice = sc.next().charAt(0);
            switch(menuChoice) {
             case '1' :                
                System.out.println("Tjek betalinger."
                        + "\nMedlemmer der ikke har betalt kontingent: ");
                 boolean search = false;
                 int searchListLength = userList.size();
                 for (int i = 0; i < searchListLength; i++) {
                  if (userList.get(i).getPayStatus()==(search)) {
                      System.out.println("Medlemsid: " + userList.get(i).getMemberID());
                      System.out.println("Fornavn: " +userList.get(i).getFirstName());
                      System.out.println("Efternavn: " +userList.get(i).getLastName());
                      System.out.println("E-mail: " + userList.get(i).getEmail());
                      System.out.println("Betalt? " +userList.get(i).getPayStatus());
                      System.out.println("");
                  }
                }
                 
                choiceLoop = false;
                break;
             case '2' :
                System.out.println("Indtast medlems ID for det medlems som har betalt:");
                int paidMemberID = sc.nextInt();
                int searchListLength1 = userList.size();
                char betaltKontingent;
                for (int i = 0; i < searchListLength1; i++) {
                 if (userList.get(i).getMemberID()==(paidMemberID)) {
                     System.out.println("Har medlems: ");
                     System.out.println("Medlemsid: " + userList.get(i).getMemberID());
                     System.out.println("Fornavn: " +userList.get(i).getFirstName());
                     System.out.println("Efternavn: " +userList.get(i).getLastName());
                     System.out.println("betalt kontingent? (j/n)");
                     betaltKontingent = sc.next().charAt(0);
                     if (betaltKontingent == 'j') {
                         userList.get(i).setPayStatus(true);
                     }
                     
                 }
                
                }
                /** Skriv den nye payStatus boolean ind i memberList.txt filen **/
                try {
                    FileOutputStream fos = new FileOutputStream("memberList.txt");
                    ObjectOutputStream oos = new ObjectOutputStream(fos);   
                    oos.writeObject(userList); // write MenuArray to ObjectOutputStream
                    oos.close(); 
                    } catch(Exception ex) {
                          ex.printStackTrace();
                    }
                choiceLoop = false;
                break;
             default :
                System.out.println("Ugyldigt valg, prøv igen.");
            }
        }        
    }
}
