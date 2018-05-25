package linkedlist;

/* We require linked list class which can 
 * insertatend(3) 
 * insertatstart(2) 
 * insertinbetween(2,4)
 * delete(2) delete from index 2nd
 * show()
 */
public class LinkedList 
{
                                  //every list must have head node know if its first node
	Node head;
	public void insertend(int data )
	{
		                         //to insert we would require the node 
		Node node =new Node();
		node.data=data;
		node.next=null;
		
		if (head==null)
		{
			head=node;
		}
		else 
		{
			Node n=head;
			while(n.next!=null)
			{
				n=n.next;
			}
			
			n.next=node;
		}
	}
	
	public void insertAtStart(int data)
	{
		Node node =new Node();
		node.data=data;
				
		node.next=head;
		head=node;
	}
	
	public void insertAt(int index,int data)
	{
		Node node =new Node();
		node.data=data;
		node.next=null;
		
		if(index==0)
		{
			insertAtStart(data);
		}
		else
		{
			//traversing is required
			Node n=head;
			for(int i=0;i<index-1;i++)
			{
				n=n.next;
			}
			node.next=n.next;
			n.next=node;
		}
	}
	
	public void deleteAt(int index)
	{  
		Node n1;
		if (index==0)
		{
			head=head.next;
		}
		else
		{
			Node n=head;
			for(int i=0;i<index-1;i++)
			{
				n=n.next;
			}
		      n1=n.next;
		      n.next=n1.next;
		      //System.out.println("n1 is " +n1);
		      n1=null; //nullifying it to make it able for the garbage collection
		}
	}
	
	public void show()
	{
		//we would need to traverse from start to last 
		Node node=head;
		
		while(node.next!=null)
		{
			node=node.next;
			System.out.println(node.data);
		}
		System.out.println(node.data);
		
	}
	
	
}
