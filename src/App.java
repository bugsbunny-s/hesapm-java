import java.util.Scanner;

public class App {

    static void plus(){
        Scanner inp = new Scanner(System.in);
        int number, sayac, result = 0;

        System.out.print("Gireceğin sayı miktarı : ");
        sayac = inp.nextInt();

        for(int i=1; i<= sayac;i++){
            System.out.print(i + ". sayı : ");
            number =  inp.nextInt();
            result += number;
        }
        System.out.println("Sonuç : " + result); 
        }

        static void minus(){
            Scanner inp = new Scanner(System.in);
            int number,sayac,result=0;

            System.out.print("Gireceğin sayı miktarı : ");
            sayac=inp.nextInt();

            for(int i=1; i<=sayac; i++){
                System.out.print(i + ". sayı : ");
                number = inp.nextInt();
                if(i == 1){
                    result += number;
                    continue;
                }
                result -= number;
            }        
            System.out.println("sonuc : " + result);
        }
        

        static void times(){
            Scanner inp = new Scanner(System.in);
            int number,sayac,result=1;

            System.out.print("Gireceğin sayı miktarı : ");
            sayac=inp.nextInt();

            for(int i=1; i<=sayac; i++){
                System.out.print(i + ". sayı : ");
                number = inp.nextInt();
                result *= number;
            }        
            System.out.println("sonuc : " + result);
        }
        
        static void divided(){
            Scanner inp = new Scanner(System.in);
            double number,result=0.0;

            System.out.print("Gireceğin sayı miktarı : ");
            int sayac=inp.nextInt();

            for(int i=1; i<=sayac; i++){
                System.out.print(i + ". sayı : ");
                number = inp.nextDouble();
                if(i != 1 && number == 0){
                    System.out.println("Bölen Sıfır(0) Girilemez.");
                    continue;
                }
                if(i == 1){
                    result = number;
                    continue;
                }
                result /= number;
            }        
            System.out.println("sonuc : " + result);
        }
        
        static void power(){
            Scanner inp = new Scanner(System.in);
            System.out.print("Taban değerini giriniz : ");
            int a = inp.nextInt();
            System.out.print("Üs değerini giriniz : ");
            int b = inp.nextInt();

            int result = 1;

            for(int i=1 ; i<=b; i++){
                result *= a;
            }
            System.out.println("sonuc : "+ result);
        }

        static void factorial(){
            Scanner inp = new Scanner(System.in);
            System.out.print("Sayı Giriniz : ");
            int n = inp.nextInt();

            int result =1;
            for (int i=1; i<=n; i++){
                result *=i;
            }
            System.out.println("Sonuc : "+ result);
        }

        static void modd(){
            Scanner inp = new Scanner(System.in);
            int number,result=0;
            System.out.println("Modunu almak istediğiniz 2 sayıyı belirtiniz.");
            for(int i=1; i<=2; i++){
                System.out.print(i + ". sayı : ");
                number = inp.nextInt();
                if(i != 1 && number == 0){
                    System.out.println("Bölen Sıfır(0) Girilemez.");
                    continue;
                }
                if(i == 1){
                    result = number;
                    continue;
                }
                result %= number;
            }        
            System.out.println("Modunuz : " + result);
        }

        static void calc(){
            Scanner inp = new Scanner((System.in));
            System.out.print("Kısa Kenarı giriniz : ");
            int a = inp.nextInt();
            System.out.print("Uzun Kenarı giriniz : ");
            int b = inp.nextInt();

            System.out.println("Çevresi : " + (2 * (a + b)));
            System.out.println("Alanı : "+ (a*b));
        }

    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner(System.in);
        int select; 

        String menu= "1- Toplama İşlemi \n"+
        "2- Çıkarma İşlemi \n"+
        "3- Çarpma İşlemi \n"+
        "4- Bölme İşlemi \n"+
        "5- Üslü Sayı Hesaplama \n"+
        "6- Faktoriyel Hesaplama \n"+
        "7- Mod Alma \n"+
        "8- Dikdörtgen Alan ve Çevre Hesaplama \n"+
        "0- Çıkış Yap";
        
        while(true){
            System.out.println(menu);
            System.out.print("bir işlem seçiniz : ");
            select=inp.nextInt();
            
            if(select == 0){
                System.out.println("bays");
                break;
            }
            switch(select){
                case 1:
                plus();
                break;

                case 2:
                minus();
                break;

                case 3:
                times();
                break;

                case 4:
                divided();
                break;
                
                case 5:
                power();
                break;

                case 6 :
                factorial();
                break;

                case 7:
                modd();
                break;
                
                case 8:
                calc();
                break;

                default: 
                System.out.println("Geçersiz bir değer girdiniz.");
                break;
            }
        }
    }
}