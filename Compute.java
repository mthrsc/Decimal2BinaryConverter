/*
Compute.java
@author MthRsc
5 2 2020
*/ 

public class Compute{

	public int inputC;
	public int dec1, dec2, dec3, dec4, dec5, dec6, dec7, dec8, dec9, dec10, dec11, dec12, dec13, dec14, dec15, dec16;
	public int bin1, bin2, bin3, bin4, bin5, bin6, bin7, bin8, bin9, bin10, bin11, bin12, bin13, bin14, bin15, bin16;

	public void setInputForCalculation(int a){
		inputC=a;
	}

	public void Compute(){
		bin1=bin2=bin3=bin4=bin5=bin6=bin7=bin8=bin9=bin10=bin11=bin12=bin13=bin14=bin15=bin16=0;

		do{
			dec1=inputC/2;
			bin1=inputC%2;
			inputC=inputC/2;

			dec2=inputC/2;
			bin2=inputC%2;
			inputC=inputC/2;

			dec3=inputC/2;
			bin3=inputC%2;
			inputC=inputC/2;

			dec4=inputC/2;
			bin4=inputC%2;
			inputC=inputC/2;

			dec5=inputC/2;
			bin5=inputC%2;
			inputC=inputC/2;

			dec6=inputC/2;
			bin6=inputC%2;
			inputC=inputC/2;

			dec7=inputC/2;
			bin7=inputC%2;
			inputC=inputC/2;

			dec8=inputC/2;
			bin8=inputC%2;
			inputC=inputC/2;

			dec9=inputC/2;
			bin9=inputC%2;
			inputC=inputC/2;

			dec10=inputC/2;
			bin10=inputC%2;
			inputC=inputC/2;

			dec11=inputC/2;
			bin11=inputC%2;
			inputC=inputC/2;

			dec12=inputC/2;
			bin12=inputC%2;
			inputC=inputC/2;

			dec13=inputC/2;
			bin13=inputC%2;
			inputC=inputC/2;

			dec14=inputC/2;
			bin14=inputC%2;
			inputC=inputC/2;

			dec15=inputC/2;
			bin15=inputC%2;
			inputC=inputC/2;

			dec16=inputC/2;
			bin16=inputC%2;
			inputC=inputC/2;
		}
		while(inputC>0);



	}
}