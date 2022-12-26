import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int day, mounth;
        String zodiac = "";
        boolean isError = false;
        Scanner input = new Scanner(System.in);

        System.out.print("DOĞDUNUZ AY (SAYI OLARAK) : ");
        mounth = input.nextInt();
        System.out.print("DOĞDUĞUNUZ GÜN : ");
        day = input.nextInt();

        if (mounth==1){
            if(day >= 1 && day<= 31) {
                if(day < 22) {
                    zodiac = "Oğlak";
                } else {
                    zodiac = "Kova";
                }
            }else {
                isError = true;
            }
        }else if (mounth==2){
            if(day>=1 && day<=28 ) {
                if (day<20) {
                    zodiac = "Kova";
                }else {
                    zodiac = "Balık";
                }
            }else {
                isError = true;
            }
        } else if (mounth==3){
            if (day>=1 && day<=31){
                if (day<21){
                    zodiac="Balık";
                }else{
                    zodiac="Koç";
                }
            }else {
                isError=true;
            }
        } else if (mounth==4){
            if (day>=1 && day<=30){
                if(day<21){
                    zodiac="Koç";
                }else {
                    zodiac="Boğa";
                }
            }else {
                isError=true;
            }
        } else if (mounth==5){
            if (day>=1 && day<=31){
                if (day<22){
                    zodiac="Boğa";
                }else {
                    zodiac="İkizler";
                }
            }else {
                isError=true;
            }
        } else if (mounth==6){
            if (day>=1 && day<= 30) {
                if (day<23) {
                    zodiac="İkizler";
                }else {
                    zodiac="Yengeç";
                }
            }else{
                isError=true;
            }
        }else if (mounth==7){
            if(day>=1 && day<=31){
                if (day<23){
                    zodiac="Yengeç";
                }else{
                    zodiac="Aslan";
                }
            }else{
                isError=true;
            }
        } else if (mounth==8){
            if (day>=1 && day<= 31){
                if (day<23){
                    zodiac="Aslan";
                }else {
                    zodiac="Başak";
                }
            }else{
                isError=true;
            }
        }else if (mounth==9){
            if (day>=1 && day<=30){
                if (day<23){
                    zodiac="Başak";
                }else{
                    zodiac="Terazi";
                }
            }else {
                isError=true;
            }
        }else if (mounth==10){
            if (day>=1 && day<=31){
                if (day<23){
                    zodiac="Terazi";
                }else {
                    zodiac="Akrep";
                }
            }else {
                isError=true;
            }
        }else if (mounth==11){
            if (day>=1 && day<=30){
                if (day<22){
                    zodiac="Akrep";
                }else{
                    zodiac="Yay";
                }
            }else{
                isError=true;
            }
        }else if (mounth==12){
            if (day>=1 && day<=31){
                if (day<23){
                    zodiac="Yay";
                }else {
                    zodiac="Oğlak";
                }
            }else {
                isError=true;
            }
        }else {
            isError=true;
        }
        if (isError){
            System.out.println("HATALI GİRİŞ !");
        }else {
            System.out.println("Burcunuz : " + zodiac);
        }
    }


    }
