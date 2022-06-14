package experience;

public class Split {


    //        inche oop obekt koxmnoroshvac lezu javan himky obekten e (oop en)
//        poliformiz inkapsulacia abstrakcia  jarangakanuntyun
//        abstrakci mek yndanur gaxapar
//        inkapsulatia - modifikatrnernor pablic prayvit ----
//        jangargakanutyun - java chka bazmajarangakanutyun
//        abstrakcia mek yndanur gaxapar
    String text = "ես քեզ սիրում եմ ջավա";


    void print() {
        String[] str = text.split(" ");
        System.out.println(str[0] + "," + str[1] + "/" + str[2]);
    }
}

