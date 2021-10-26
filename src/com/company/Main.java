package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        //2uzduotis

//        int first = (int) (Math.random() *5);
//        int second = (int) (Math.random() *5);
//
//        if (first == 0 || second == 0) {
//            System.out.println("dalyba is 0");
//        }
//        if (first !=0 && second !=0) {
//            if (first > second) {
//                System.out.println((double) Math.round((double) first / second * 100) / 100);
//            } else {
//                System.out.println((double) Math.round((double) second / first * 100) / 100);
//            }
//        }
        //3uzduotis

//        System.out.println("3uzduotis");
//        int first = (int) (Math.random() *26);
//        int second = (int) (Math.random() *26);
//        int third = (int) (Math.random() *26);
//
//        System.out.println(first + " " + second + " " + third);
//
//        if (first == second || second==third || first==third){
//            System.out.println("du vienodi");
//        }
//            if (first != second && second != third && first != third){
//               if(first > second && second > third){
//                   System.out.println(second);
//               }
//                if(first < second && second < third){
//                    System.out.println(second);
//                }
//               if (second > first && first > third){
//                   System.out.println(first);
//               }
//                if (second < first && first < third){
//                    System.out.println(first);
//                }
//               if (first > third && third > second ){
//                   System.out.println(third);
//               }
//                if (first < third && third < second ){
//                    System.out.println(third);
//                }
//            }
//


        //4uzduotis

//    System.out.println("4uzduotis");
//    int a = (int) (Math.random() *10) + 1;
//    int b = (int) (Math.random() *10) + 1;
//    int c = (int) (Math.random() *10) + 1;
//
//    System.out.println(a + " " + b + " " + c);
//
//    if(a + b > c && b + c > a && c + a > b){
//        System.out.println("Galima padaryti trikampį.");
//    }else{
//        System.out.println("Negalima padaryti trikampio.");
//    }

        //5uzduotis

//        System.out.println("5uzduotis");
//        int a = (int) (Math.random() *3);
//        int b = (int) (Math.random() *3);
//        int c = (int) (Math.random() *3);
//        int d = (int) (Math.random() *3);
//        int amount0 = 0;
//        int amount1 = 0;
//        int amount2 = 0;
//        System.out.println(a + " " + b + " " + c + " " + d);
//
//        if(a == 0){
//            amount0++;
//        }
//        if(b == 0){
//            amount0++;
//        }
//        if(c == 0){
//            amount0++;
//        }
//        if(d == 0){
//            amount0++;
//        }
//        System.out.println("Nulių skaičius: "+amount0);
//        if(a == 1){
//            amount1++;
//        }
//        if(b == 1){
//            amount1++;
//        }
//        if(c == 1){
//            amount1++;
//        }
//        if(d == 1){
//            amount1++;
//        }
//        System.out.println("Vienetų skaičius: "+amount1);
//        if(a == 2){
//            amount2++;
//        }
//        if(b == 2){
//            amount2++;
//        }
//        if(c == 2){
//            amount2++;
//        }
//        if(d == 2){
//            amount2++;
//        }
//        System.out.println("Dvejetų skaičius: "+amount2);

        //6uzduotis

//        int a = (-10) + (int)(Math.random() * ((10 - (-10)) + 1));
//        int b = (-10) + (int)(Math.random() * ((10 - (-10)) + 1));
//        int c = (-10) + (int)(Math.random() * ((10 - (-10)) + 1));
//        String aBrackets = "";
//        String bBrackets = "";
//        String cBrackets = "";
//
//        System.out.println(a + " " + b + " " + c);
//
//        if (a<0){
//            aBrackets = "[" + a + "]";
//        }
//        if (a>0){
//            aBrackets = "{" + a + "}";
//        }
//        if(a == 0){
//            aBrackets = "(" + a + ")";
//        }
//        if (b<0){
//            bBrackets = "[" + b + "]";
//        }
//        if (b>0){
//            bBrackets = "{" + b + "}";
//        }
//        if (b == 0){
//            bBrackets = "(" + b + ")";
//        }
//        if (c<0){
//            cBrackets = "[" + c + "]";
//        }
//        if (c>0){
//            cBrackets = "{" + c + "}";
//        }
//        if (c == 0){
//            cBrackets = "(" + c + ")";
//        }
//        System.out.println(aBrackets + " " + bBrackets + " " + cBrackets );
//
        //7uzduotis

//            int candleAmount = 5 + (int)(Math.random() * (3000 - 5) + 1);
//            double candlePrice = 1;
//            double toPay = candleAmount * candlePrice;
//            if (toPay >= 2000 ){
//            toPay = toPay * 0.96;
//            }else
//            if (toPay >= 1000){
//                toPay = toPay * 0.97;
//            }
//        double roundedToPay = Math.round(toPay * 100.00) / 100.00;
//        System.out.println("Perkamas žvakių kiekis: " + candleAmount + " | " + "Mokėti: " + roundedToPay);
//

        //2.Stringai

        //1uzduotis

//        String name = "Jackie";
//        String surname = "Chan";
//        if (name.length() > surname.length()){
//            System.out.println(name);
//        }else {
//            System.out.println(surname);
//        }

        //2uzduotis

//        String name = "Jackie";
//        String surname = "Chan";
//        System.out.println(name.toUpperCase());
//        System.out.println(surname.toLowerCase());

//        //3uzduotis

//        String name = "Jackie";
//        String surname = "Chan";
//        String initials = "" + name.charAt(0) + surname.charAt(0);
//        System.out.println(initials);

            //4uzduotis

//        String name = "Jackie";
//        String surname = "Chan";
//        String threeLetters = name.substring(name.length()-3) + surname.substring(surname.length()-3) ;
//        System.out.println(threeLetters);

//         //5uzduotis

//            String str = "An American in Paris";
//        System.out.println(str.replace("a","*").replace("A","*"));
//
//         //6uzduotis

//        String str1 = "Breakfast at Tiffany's";
//        String str2 = "2001: A Space Odyssey";
//        String str3 = "It's a Wonderful Life";
//        System.out.println(str.replaceAll("[AYEIOUayeiou]",""));
//        System.out.println(str1.replaceAll("[AYEIOUayeiou]",""));
//        System.out.println(str2.replaceAll("[AYEIOUayeiou]",""));
//        System.out.println(str3.replaceAll("[AYEIOUayeiou]",""));
//
//        //7uzduotis
//
//        String str5 = "Star Wars: Episode "+ " ".repeat( (int) (Math.random() * 10))+((int) (Math.random() * 7)+1) + " - A New Hope";
//        System.out.println(str5);
//        System.out.println((str5.substring(str5.length()-15, str5.length()-13)));
//







//CIKLAI

        //1uzduotis
//        int count = 0;
//        for (int i=0; i<300; i++){
//            int a = (int) (Math.random() *301);
//
//            if (a>275){
//                System.out.print("[" + a + "] ");
//            }else {
//                System.out.print(a + " ");
//            }
//            if (a>150){
//                count++;
//            }
//
//        }
//        System.out.println();
//        System.out.println("Didesnių už 150 skaičių buvo: " + count);

        /*//2uzduotis
        String text = "";
        for (int i = 1; i<3001; i++){

            if ( i%77 == 0){
                text += i + ",";
            }
        }

        System.out.print(text.substring(0,text.length()-1));
*/
        //3uzduotis

//        for(int i = 0; i<100; i++){
//            System.out.println("");
//            for(int j = 0; j<100; j++){
//                System.out.print("*");
//            }
//        }

        //5uzduotis

        //a dalis

//        int coinToss = (int) (Math.random() *2);
//        while( coinToss == 1){
//            System.out.println("Skaičius");
//            coinToss = (int) (Math.random() *2);
//        }
//        System.out.println("Herbas");

        //b dalis


//        int counterTails = 0;
//        while (counterTails < 3){
//            int coinToss = (int) (Math.random() *2);
//            if (coinToss ==1){
//                System.out.println("Skaicius");
//            }else{
//                System.out.println("Herbas");
//                counterTails++;
//            }
//        }

        //c dalis

//        int counterTails = 0;
//        while (counterTails <3){
//            int coinToss = (int) (Math.random() *2);
//            if ( coinToss == 0){
//                System.out.println("Herbas");
//                counterTails++;
//            }else{
//                System.out.println("Skaicius");
//                counterTails = 0;
//            }
//        }

        //6uzduotis

//            int pointsPetras = 0;
//            int pointsKazys = 0;
//            while (pointsPetras < 222 && pointsKazys < 222 ){
//                int gamePetras = 10 + (int) (Math.random() * ((20 - 10) + 1));
//                int gameKazys = 5 + (int) (Math.random() * ((25 - 5) + 1));
//                pointsKazys += gameKazys;
//                pointsPetras += gamePetras;
//            }
//            System.out.println("Kazys surinko: " + pointsKazys);
//            System.out.println("Petras surinko: " + pointsPetras);
//            if (pointsKazys > pointsPetras){
//                System.out.println("Laimejo Kazys");
//            }else{
//                System.out.println("Laimejo Petras");
//            }

        //8uzduotis

        //a dalis


//        int nailsAmount = 5;
//        int hitCounter = 0;
//        int nailLength = 85;
//        for(int i=0; i<nailsAmount;i++) {
//            int nailDepth = 0;
//            while (nailDepth < nailLength) {
//                int hitDepth = 5 + (int) (Math.random() * ((20 - 5) + 1));
//                nailDepth += hitDepth;
//                hitCounter ++;
//            }
//        }
//        System.out.println("Sukalti " + nailsAmount + " vinis. Prireike " + hitCounter + " mazu smugiu.");


        //b dalis

//        int nailsAmount = 5;
//        int hitCounter = 0;
//        int nailLength = 85;
//        for(int i=0; i<nailsAmount;i++) {
//            int nailDepth = 0;
//            while (nailDepth < nailLength) {
//                int hitOrMiss = (int) (Math.random() *2);
//                if(hitOrMiss == 1) {
//                    int hitDepth = 20 + (int) (Math.random() * ((30 - 20) + 1));
//                    nailDepth += hitDepth;
//                }
//                hitCounter++;
//            }
//        }
//        System.out.println("Sukalti " + nailsAmount + " vinis. Prireike " + hitCounter + " dideliu smugiu.");



        //Masyvai

        //1uzduotis

        int[] randomNum = new int[30];
        for (int i=0; i< randomNum.length; i++){
            randomNum[i] = 5 + (int) (Math.random() * ((25 - 5) + 1));
        }
        for (int i = 0; i < randomNum.length; i++) {
            System.out.print(randomNum[i] + " ");
        }
        System.out.println();

        //2uzduotis

        //a dalis
        int biggerThanTen = 0;
        for (int i = 0; i < randomNum.length; i++) {
            if (randomNum[i] > 10){
              biggerThanTen++;
            }
        }
        System.out.println("Didesniu uz 10 skaiciu yra: "+ biggerThanTen);

        //b dalis   REIKIA FIXINT, nes gali kartotis max reiksme
        int biggestValue = 0;
        int biggestIndex = 0;
        for (int i = 0; i < randomNum.length; i++) {
            if ( randomNum[i] > biggestValue){
                biggestValue = randomNum[i];
                biggestIndex = i;
            }
        }
        System.out.println("Didziausia reiksme: " + biggestValue + " jos indeksas: " + biggestIndex);


        //c dalis
        int sumEven = 0;
        for (int i = 0; i < randomNum.length; i++) {
            if (i % 2 ==0){
                sumEven += randomNum[i];
            }
        }
        System.out.println("Lyginiu indexu reiksmiu suma: " + sumEven);

        //d dalis
        int[] randomNumD = new int[30];
        for (int i = 0; i < randomNum.length; i++) {
            randomNumD[i]= randomNum[i] - i;
        }
        System.out.println("Masyvas");





















    }
    }


