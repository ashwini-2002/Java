//lambda expression:

//package Ashwini;
//
//interface drawable{
//	void draw();
//}
//public class IntroductionLambda {
//	
//public static void main(String[] args) {
//	drawable d=()->{
//		System.out.println("Drawing");
//	};
//	 d.draw();
//}
//}




//package Ashwini;
//
//interface Add {
//    void sum(int a, int b);
//}
//
//public class IntroductionLambda {
//
//    public static void main(String[] args) {
//
//        Add a = (x, y) -> {
//            System.out.println(x + y);
//        };
//
//        a.sum(10, 20);
//    }
//}

package Ashwini;

interface validator{
	boolean validator(String input);
}
public class IntroductionLambda {
	
public static void main(String[] args) {
	validator emailcheck=email->email.contains("@12");
	{
		System.out.println(emailcheck.validator("test@gmail.com"));
	};
	
}
}

