package org.brainship.util;

public class CommandParser
{
	public static void parse(String st)
	{
		if("end".equals(st) || "exit".equals(st)) Global.end();
	}
}