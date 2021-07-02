package com.bridgelab.stack;

public class Main
{
	public static void main(String[] args)
	{
		DsaStack dsaStackObject = new DsaStack();
		//pushing elements into stack.
		dsaStackObject.push(70);
		dsaStackObject.push(30);
		dsaStackObject.push(56);
		
		//printing stack.
		dsaStackObject.displayStack();
	}
}
