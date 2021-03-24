package controller;

import java.awt.EventQueue;

import gui.MainGUI;

public class MainController {
	private MainGUI window;
	
	public MainController() {
		this.window = new MainGUI();
	}
	
	public void displayMainGUI() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window.viewMainGUI();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
