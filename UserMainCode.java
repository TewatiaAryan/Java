import java.io.*;
import java.util.*;
class UserMainCode{
public int reducedArrCount(int[] input1,int input2){
 int l = input1.length;
		if(l % 2 == 0){
			for(int i=0;i<l;i++){
				input1[i] = 0;
				i++;
			}
		}
		else{
			for(int i=1;i<l;i++){
				input1[i] = 1;
				i++;
			}
		}
		int sum = 0;
		for(int j=0;j<l;j++){
			sum += input1[j];
		}
		
		while(sum > 9){
			int x=0,sum1=0;
			int temp = sum;
			while(temp > 0){
				x = temp%10;
				sum1 += x;
				temp /= 10;
			}
			sum = sum1;
		}
		return sum;

		//throw new UnsupportedOperationException("reducedArrCount(int[] input1,int input2)");
	}
	
}
