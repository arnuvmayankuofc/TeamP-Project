package application;

import java.util.*;

import model.Logic;
import javafx.application.Application;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Would you like to play the Text-Based version, or the GUI-based version? '1' / '2'");
		Scanner input = new Scanner(System.in);
		int versionInt = Integer.parseInt(input.nextLine());
		if (versionInt == 1) {
			Logic logic = new Logic(new TextVisualizer());
			logic.run();
		}
		else {	
			new Thread() {
	            @Override
	            public void run() {
	                javafx.application.Application.launch(GUI.class, args);
	            }
	        }.start();
	        GUI startUp = GUI.waitForStartUpTest();
			Logic logic = new Logic(startUp);
			logic.run();
		}
	}

}
