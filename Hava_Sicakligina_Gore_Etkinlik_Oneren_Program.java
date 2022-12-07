import java.util.Scanner;

public class Hava_Sicakligina_Gore_Etkinlik_Oneren_Program {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int heat;

        System.out.println("Lütfen bir sıcaklık giriniz: ");
        heat=input.nextInt();

        System.out.println("Girdiğiniz sıcaklık değerine göre öneri/öneriler aşağıdadır: \n ");
        if(heat<5){
            System.out.println("Kayak yapabilirsiniz");
        } else if (heat<=25) {
            //1. yol
            /*
            if(heat<=15){
                System.out.println("Sinemaya gidebilirsiniz.");
            }

            if (heat>=10){
                System.out.println("Pikniğe gidebilirsiniz.");
            }
             */

            //2. yol
            if(heat<10){
                System.out.println("Sinemaya gidebilirsiniz.");
            } else if (heat>=10 && heat <=15) {
                System.out.println("Bu hava sıcaklığına göre iki öneri vardır:\n " +
                        "1- Sinemaya gidebilirsiniz\n 2- Pikniğe gidebilirsiniz");
            }
            else{
                System.out.println("Pikniğe gidebilirsiniz.");
            }
        }
        else{
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}
