package com.gokhankaplan.kullaniciadivesifre;

import java.util.Scanner;

public class KullaniciAdiVeSifre {
    public static void main(String[] args){
        String userName, password, sıfırlama, newpassword;
        Scanner input = new Scanner(System.in);
        System.out.println("Kullanıcı adınızı giriniz: ");
        userName = input.next();
        System.out.println("Sifrenizi giriniz: ");
        password = input.next();

        if (userName.equals("gokhankaplan") && (password.equals("java123"))) {
            System.out.println("Başarıyla giriş yaptınız!");
        }
            else {
                System.out.println("Sifrenizi yanlış girdiniz!");
                System.out.println("Sifrenizi sıfırlamak ister misiniz?");
                sıfırlama = input.next();
                if (sıfırlama.equals("evet")) {
                    System.out.println("Yeni sifreyi giriniz: ");
                    newpassword = input.next();
                    if (newpassword.equals("java123")) {
                        System.out.println("Aynı şifre oluşturulamaz. Lütfen farklı bir şifre oluşturun!");
                    }
                    else {
                    System.out.println("Yeni sifre olusturuldu!");
                    }
                }

                else if (sıfırlama.equals("hayır")){
                    System.out.println("Sen bilirsin! ");
                }
                }



            }




        }

