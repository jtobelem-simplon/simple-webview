package webview;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		new Thread(new Main()).start(); // this will call your Main 
		
		Scanner saisie = new Scanner(System.in);
		System.out.println("will now play an other video (after enter key)");
		saisie.nextLine();
		
		Main.setID(Main.NERY_ID);
		
		saisie.close();
        
        
    }


	
}
