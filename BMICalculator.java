package day3;

import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args)
	{
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Enter you Weight in KG");
		double weight = Scanner.nextDouble();
		System.out.println("Enter you Height in CM");
		double height = Scanner.nextDouble();
		double BMI;
		if (height != 0)
		{
			BMI = weight /(height*height)*10000;
		}
		else
		{
			BMI = 0;
		}
		if (BMI ==0)
		{
			System.out.println("Invalid values provided. BMI can't be calculated");
		}
		else if (BMI >0 && BMI <18.5)
		{
			System.out.println("Your BMI is "+BMI+". You are Underweight");
		}
		else if (BMI >=18.5 && BMI<24.9)
		{
			System.out.println("Your BMI is "+BMI+". You weight is Normal");
		}
		else if (BMI >=25 && BMI<29.9)
		{
			System.out.println("Your BMI is "+BMI+". You are Overweight");
		}
		else if (BMI >=30)
		{
			System.out.println("Your BMI is "+BMI+". You have Obesity ");
		}
		Scanner.close();
	}

}
