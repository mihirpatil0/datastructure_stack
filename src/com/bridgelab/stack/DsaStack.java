package com.bridgelab.stack;

/*********************************************
 * @author mihir
 *
 * @since 02-July-2021
 * 
 * Implementing Data Structure Concept Of Stack
 * using LinkedLlist
 *********************************************/

public class DsaStack
{
	Node top;
	int size;
	
	/**
	 * Name : push
	 * 
	 * Description : pushing element over the other to represent stack.
	 * 
	 * @param element
	 * 
	 * Algorithm : This method accepts element which is int type.
	 * each new element will get added stacked upon the previous data/element which was passed earlier.
	 * 
	 * Modification : First commit 02-July-2021
	 */
	public void push(int element)
	{
		Node tempNode = new Node(element);
		tempNode.link = top;
		top = tempNode;
		size++;
	}
	
	/**
	 * Name : displayStack
	 * 
	 * Description : Printing stack element.
	 */
	public void displayStack()
	{
		Node curruent = top;
		
		while(curruent != null)
		{
			System.out.println(curruent.data);
			curruent = curruent.link;
		}
	}
}
