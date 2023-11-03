package com.mycompany.tugaspbo;

import java.util.Scanner;

/**
 *
 * @author Fredericus
 */
public class App { 
    public static void main(String[] args) throws Exception { 
        Phone xiaomi = new xiaomi(); 
        Phone iphone = new Iphone(); 
 
        PhoneUser Erik  = new PhoneUser(xiaomi); 
        PhoneUser Imanuel = new PhoneUser(iphone); 
        Scanner input = new Scanner(System.in); 
         int pil; 
 
        do { 
            System.out.println("APLIKASI INTERFACE"); 
            System.out.println(""); 
            System.out.println("Silahkan pilih HP"); 
            System.out.println("1. Xiaomi"); 
            System.out.println("2. Iphone"); 
            System.out.println("0. Keluar Aplikasi"); 
            System.out.println(""); 
            System.out.print("Pilih   : ");             
            pil = input.nextInt(); 
 
            System.out.println(""); 
            System.out.println(""); 
             switch (pil) {                 
                 case 1 :                     
                     do { 
                        System.out.println("Menu HP Xiaomi"); 
                        System.out.println("1. Nyalakan HP"); 
                        System.out.println("2. Matikan HP"); 
                        System.out.println("3. Perbesar Volume"); 
                        System.out.println("4. Perkecil Volume"); 
                        System.out.println("0. Keluar");                         
                        System.out.print("Silahkan pilih : ");                         
                        pil = input.nextInt(); 
 
                        System.out.println("");                         
                        System.out.println(""); 
                         switch (pil) {                             
                             case 1 : 
                                Erik.turnOnThePhone();                                 
                                break; 

                            case 2 : 
                                Erik.turnOffThePhone();                                 
                                break;                             
                            case 3 : 
                                Erik.makePhoneLouder();                                 
                                break;                             
                            case 4 : 
                                Erik.makePhoneSilent();                                 
                                break;                             
                            case 0 :                                 
                                main(args);                                 
                                break;                             
                            default : 
                                System.out.println("Pilihan salah..."); 
                        } 
 
                    } while (pil != 0);                     
                     break;                 
                 case 2 :                     
                     do { 
                        System.out.println("Menu HP Iphone"); 
                        System.out.println("1. Nyalakan HP"); 
                        System.out.println("2. Matikan HP"); 
                        System.out.println("3. Perbesar Volume"); 
                        System.out.println("4. Perkecil Volume"); 
                        System.out.println("0. Keluar");                         
                        System.out.print("Silahkan pilih : ");                         
                        pil = input.nextInt(); 
 
                        System.out.println("");                         
                        System.out.println(""); 
                         switch (pil) {                             
                             case 1 : 
                                Imanuel.turnOnThePhone();                                 
                                break;                             
                             case 2 : 
                                Imanuel.turnOffThePhone();                                 
                                break;                             
                             case 3 : 
                                Imanuel.makePhoneLouder();                                 
                                break;                             
                             case 4 : 
                                Imanuel.makePhoneSilent();                                 
                                break;                             
                             case 0 :                                 
                                 main(args);                                 
                                 break; 
 
                        default : 
                            System.out.println("Pilihan salah...."); 
                        } 
                    } while (pil != 0);                     
                     break;                 
                 case 0 : 
                    System.out.println("Selamat tinggal...."); 
                    System.out.println(""); 
                    System.out.println("");                     
                    System.exit(0);                     
                    break;                 
                 default : 
                 System.out.println("Pilihan salah...."); 
            } 
 
        } while (pil != 0); 
    } 
} 
 
