/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class TreasurerMenu {


    public static void treasurerMenu() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Member> memberList = new ArrayList<Member>();
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
            System.out.println("Velkommen kasserer, hvad vil du i dag?" +
                "\n1. Check kontingentrestance. " + "\n2. Registrér kontingentbetaling.");
            menuChoice = sc.next().charAt(0);
            switch(menuChoice) {
             case '1' :                
                System.out.println("Tjek betalinger."
                        + "\nMedlemmer der ikke har betalt kontingent: ");
                 boolean search = false;
                 int searchListLength = memberList.size();
                 for (int i = 0; i < searchListLength; i++) {
                  if (memberList.get(i).getHasPaid()==(search)) {
                      System.out.println("Medlemsid: " + memberList.get(i).getMemberID());
                      System.out.println("Fornavn: " +memberList.get(i).getFirstName());
                      System.out.println("Efternavn: " +memberList.get(i).getSurName());
                      System.out.println("E-mail: " + memberList.get(i).getEmail());
                      System.out.println("Betalt? " +memberList.get(i).getHasPaid());
                      System.out.println("");
                  }
                }
                 
                choiceLoop = false;
                break;
             case '2' :
                System.out.println("Indtast medlems ID for det medlems som har betalt:");
                int paidMemberID = sc.nextInt();
                int searchListLength1 = memberList.size();
                char betaltKontingent;
                for (int i = 0; i < searchListLength1; i++) {
                 if (memberList.get(i).getMemberID()==(paidMemberID)) {
                     System.out.println("Har medlems: ");
                     System.out.println("Medlemsid: " + memberList.get(i).getMemberID());
                     System.out.println("Fornavn: " +memberList.get(i).getFirstName());
                     System.out.println("Efternavn: " +memberList.get(i).getSurName());
                     System.out.println("betalt kontingent? (j/n)");
                     betaltKontingent = sc.next().charAt(0);
                     if (betaltKontingent == 'j') {
                         memberList.get(i).setHasPaid(true);
                     }
                     
                 }
                
                }
                /** Skriv den nye payStatus boolean ind i memberList.txt filen **/
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
             default :
                System.out.println("Ugyldigt valg, prøv igen.");
            }
        }        
    }
}
