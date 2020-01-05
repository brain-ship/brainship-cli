package org.brainship.util;

import java.util.Scanner;

public class Global
{
	private static boolean isProgramRunning;
	
	private static Scanner sc;
	
	public static void start() {
		isProgramRunning = true;
		sc = new Scanner(System.in);
	}
	
	public static boolean isRunning() {
		return isProgramRunning;
	}
	
	public static String getInput() {
		return sc.nextLine();
	}
	
	public static void end() {
		isProgramRunning = false;
		postTerminationProcesses();
	}
	
	private static void postTerminationProcesses() {
		sc.close();
	}
}