package org.brainship;

import org.brainship.util.Console;
import org.brainship.util.Global;

public class App 
{
    public static void main( String[] args )
    {
		Global.start();
        while(Global.isRunning()) 
		{
			Console.print("Brainship >> ");
			String st = Global.getInput();
			if("end".equals(st) || "exit".equals(st)) Global.end();
		}
    }
}
