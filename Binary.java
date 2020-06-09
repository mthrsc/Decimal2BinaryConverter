/*
Binary.java
@author MthRsc
5 2 2020
*/

import javax.swing.JOptionPane;

public class Binary{
	public static void main(String args[]){

		//Variables
		Compute cp=new Compute();
		int input;

		//Input
		input=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a decimal (65535 max): "));
		cp.setInputForCalculation(input);

		//Process
		cp.Compute();

		//Output
		if(input<256){
			JOptionPane.showMessageDialog(null, "Result for " + input + ":" + "\n"+"(Read binary from bottom to top)" + " \n" + input + "/2=" + cp.dec1 + " Modulo: " + cp.bin1 + "\n" + cp.dec1 + "/2=" + cp.dec2 + " Modulo:  " + cp.bin2 + "\n"+ cp.dec2 + "/2=" + cp.dec3 + " Modulo:  " + cp.bin3 + "\n"+ cp.dec3 + "/2=" + cp.dec4 + " Modulo:  " + cp.bin4 + "\n" + cp.dec4 + "/2=" + cp.dec5 + " Modulo:  " + cp.bin5 + "\n" + cp.dec5 + "/2=" + cp.dec6 + " Modulo:  " + cp.bin6 + "\n" + cp.dec6 + "/2=" + cp.dec7 + " Modulo:  " + cp.bin7 + "\n" + cp.dec7 + "/2=" + cp.dec8 + " Modulo:  " + cp.bin8 + "\n");
		}
		else if(input>=256){
			JOptionPane.showMessageDialog(null, "Result for " + input + ":" + "\n"+"(Read binary from bottom to top)" + " \n" + input + "/2=" + cp.dec1 + " Modulo: " + cp.bin1 + "\n" + cp.dec1 + "/2=" + cp.dec2 + " Modulo:  " + cp.bin2 + "\n"+ cp.dec2 + "/2=" + cp.dec3 + " Modulo:  " + cp.bin3 + "\n"+ cp.dec3 + "/2=" + cp.dec4 + " Modulo:  " + cp.bin4 + "\n" + cp.dec4 + "/2=" + cp.dec5 + " Modulo:  " + cp.bin5 + "\n" + cp.dec5 + "/2=" + cp.dec6 + " Modulo:  " + cp.bin6 + "\n" + cp.dec6 + "/2=" + cp.dec7 + " Modulo:  " + cp.bin7 + "\n" + cp.dec7 + "/2=" + cp.dec8 + " Modulo:  " + cp.bin8 + "\n"+ cp.dec8 + "/2=" + cp.dec9 + " Modulo:  " + cp.bin9 + "\n"+ cp.dec9 + "/2=" + cp.dec10 + " Modulo:  " + cp.bin10 + "\n"+ cp.dec10 + "/2=" + cp.dec11 + " Modulo:  " + cp.bin11 + "\n"+ cp.dec11 + "/2=" + cp.dec12 + " Modulo:  " + cp.bin12 + "\n"+ cp.dec12 + "/2=" + cp.dec13 + " Modulo:  " + cp.bin13 + "\n"+ cp.dec13 + "/2=" + cp.dec14 + " Modulo:  " + cp.bin14 + "\n"+ cp.dec14 + "/2=" + cp.dec15 + " Modulo:  " + cp.bin15 + "\n"+ cp.dec15 + "/2=" + cp.dec16 + " Modulo:  " + cp.bin16 + "\n");
		}
	}
}