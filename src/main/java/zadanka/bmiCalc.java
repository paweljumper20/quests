package zadanka;

import java.util.Scanner;

public class bmiCalc {
    zawodnik paulina  = new zawodnik();


    public void bmiCalculate(){
        Scanner s = new Scanner(System.in);
        System.out.println("Ile ważysz? ");
        double weightInp = s.nextInt();
        paulina.setWeight(weightInp);
        System.out.println("Ile masz wzrostu? ");
        double heightInp = s.nextInt();
        paulina.setHeight(heightInp/100);
        double bmi = paulina.getWeight()/Math.pow(paulina.getHeight(), 2);
        if(bmi < 18.5){
            System.out.printf("Twoje BMI to:  %.3f masz niedowagę!", bmi);
        } else if (bmi > 18.5 && bmi < 25){
            System.out.printf("Twoje BMI to:  %.3f jesteś normalna", bmi);
        } else {System.out.printf("Twoje BMI to:  %.3f jesteś gruba!", bmi);}

    }
}
