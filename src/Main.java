import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName,password,newUserName,newPassword;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız :");
        userName = inp.nextLine();

        System.out.print("Şifreniz :");
        password = inp.nextLine();



        if(userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş Yaptınız !");


        }else {
        System.out.print("Kullanıcı Bilgileriniz yanlış !");
        System.out.print("sifrenizi değiştirmek için a'ya basınız\n mevcut sifre ile devam etmek için b'ye basınız\n Seciminiz:");
            newUserName=inp.nextLine();
              if(newUserName.equals("b")){
                  System.out.println("Mevcut sife ile devam edebilirsiniz:");
              }else if (newUserName.equals("a")) {
                  System.out.println("Yeni Sifre Giriniz :");
                  newPassword = inp.nextLine();
                  if (newPassword.equals("java123") || newPassword.equals(password)) {
                      System.out.println("Yeni sifre eskisi ile ayni olamaz tekrar sifre olusturun ");
                  } else {
                      System.out.println("sifre basari ile degiştirildi.");
                  }
              } else {

                      System.out.println("hatali secim yaptınız lütfen tekrar deneyiniz");
                  }


        }



    }


}
