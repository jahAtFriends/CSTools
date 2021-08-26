package org.friendsbalt.csadvanced;

import processing.core.PApplet;

public class ProcessingTest extends PApplet {
	
	public static void main(String[] args) {
		
		String[] processingArgs = {"ProcessingTest"};
		ProcessingTest myTest = new ProcessingTest();
		PApplet.runSketch(processingArgs, myTest);
		
	}
	
	public void settings() {
		size(300,300);
	}
	
	public void draw() {
		
	}
	
}