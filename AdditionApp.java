 class Addition{
	
	/**/
	
	public int add(int num1,int num2){
		
		int result=num1+num2;
		
		System.out.println("The Addition of the numbers is:"+result);
		
		return result;
}//end of add(-) method
}//end of the class
 class AdditionApp{
public static void main(String args[]){
	//Object creation
	Addition addition=new Addition();
	      addition.add(10,20);
	
	
	
}//end of the main method
}//end of the class