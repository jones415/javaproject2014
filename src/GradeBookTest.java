
public class GradeBookTest  {

	public static void main(String[] args) {
		
		GradeBook myGradeBook = new GradeBook();
		HelloAgain yanto = new HelloAgain();
		YantoHelper helper = new YantoHelper();
		
		int number1 = 10;
		int number2 = 12;
		
		yanto.helloNow();
		myGradeBook.displayMessage();
		myGradeBook.mySecondMessage();
		myGradeBook.myThirdMessage();
		helper.addingOn(77877676);
		helper.addingOn();
		System.out.println(number1 + number2);
		
		while (number1 != number2)
		{
			System.out.println("they are not  equal");
			break;
		}
		
	
			
	}

}
