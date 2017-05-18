/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DolphinSystem;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class TreasurerMenu {


    public static void main(String args[]) {
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
