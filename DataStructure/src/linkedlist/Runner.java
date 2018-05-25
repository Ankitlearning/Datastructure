package linkedlist;

/* We require main() where we can create the linked list object 
 * 
 */
public class Runner 
{

	public static void main(String[] args) 
	{
		LinkedList  list=new LinkedList();//bubble is for debugging , for that go to debug mode after this 
		//go to run-->debug-->select the method in main() and press the f5 .
		list.insertend(20);     //0th object
		list.insertend(21);		//1st object
		list.insertend(12);		//index 2nd object
					
		list.insertAtStart(25);		//0index now 
		list.insertAt(2,55);
		list.deleteAt(2);
		list.show();	
		
		
		

	}

}
