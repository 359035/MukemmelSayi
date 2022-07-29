/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mukemmelsayi;

/**
 *
 * @author Samsung
 */
import java.util.Scanner;
public class MukemmelSayi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.print("Bir sayi giriniz:");
        int a=input.nextInt();
        int total=0;
        
        for(int i=1;i<a;i++){
            if(a%i==0){
                total+=i;
            }
        }
        
        if(total==a){
            System.out.println(a+" Sayisi Mukemmel Sayidir.");
        }else{
            System.out.println(a+" Sayisi Mukemmel Sayi Degildir.");
        }
    }
    
}
