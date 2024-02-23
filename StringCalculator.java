package com.limelight;

public class StringCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	new StringCalculator().add("1,3,\n345");
	}
	int add(String numbers){
		int j=0;
		if(numbers.contains("-")){
			throw new RuntimeException("negative numbers not allowed"+numbers);
		}else if(numbers.substring(numbers.indexOf("\n")).equals("\n")){
			throw new RuntimeException("Special characters not allowed"+numbers);
		}
		else{
			String[] arrayNumbers= numbers.split(",");
				for(int i=0;i<arrayNumbers.length;i++){
						j+=Integer.parseInt(arrayNumbers[i].replaceAll("\n", ""));
				}
				System.out.println(j);
		}
		
		return j;
	}
}
