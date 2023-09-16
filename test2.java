import java.util.Scanner;
import java.util.Random;
public class test2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		short k=6;
		short[] c=new short[7];
		for (short i=0;i<c.length;i++){
			c[i]=k;
			k+=2;
		}
		float[] x=new float[16];
		float mxf=3.0f;
		float mnf=-11.0f;
		Random rnd = new Random();
		for(int i=0;i<x.length;i++){
			Double value=rnd.nextDouble();
			x[i] = (float) (value*(mxf-mnf)+mnf);
		}
		double[][] ms3=new double[7][];
		for(int i=0; i<ms3.length;i++){
			ms3[i]=new double[16];
		}
		for(int i=0;i<7;i++){
			if (c[i]==6){
				for(int j=0;j<16;j++){
					ms3[i][j]=Math.sin(Math.sin(Math.asin((x[j]-4)/14)));
				}
			}else{	
				if (c[i]==12 || c[i]==14 || c[i]==18){
					for(int j=0;j<16;j++){
						ms3[i][j]=Math.pow(Math.pow((1.0/2.0*(Math.pow(Math.E, x[j])+3.0/4)),Math.exp(Math.abs(x[j]))),1.0/3);
						}
				}else{
					for(int j=0;j<16;j++){
						ms3[i][j]=Math.pow(((Math.pow(x[j],1.0/3)/2.0)/((Math.pow(Math.sin(x[j]),Math.cos(x[j]))+1.0/4))),2)*Math.pow(Math.pow(Math.exp((2*Math.abs(x[j]))-0.5),1.0/3),3);
					}
				}
			
			
			}	
		}
		for (int i=0;i<7;i++){
			for (int j=0;j<16;j++){
				System.out.printf("%.3f",ms3[i][j]);
				System.out.print("    ");
			}
			System.out.println();
		}	
	}
}
