package LinkList;


public class AddDelOpLL {

	Node head;
	 class Node
	 {
		 String data;
		 Node next;
		 
		 public Node(String data)
		 {
			 this.data=data;
			 this.next=null;
		 }
	 }
	 
	 //addition
	 
	 public void addFirst(String data)
	 {
		 Node newNode=new Node(data);
		 if(head==null)
		 {
			 head=newNode;
			 return;
		 }
		 
		 newNode.next=head;
		 head=newNode;
	 }
	 
	 public void addlast(String data)
	 {
		 Node newNode=new Node(data);
		 if(head==null)
		 {
			 head=newNode;
			 return;
		 }
		 
		 Node curNode=head;
		 while(curNode.next!=null)
		 {
			 curNode=curNode.next;
			 
		 }
		 curNode.next=newNode;
	 }
	 
	 public void addPosi(String data,int pos)
	 {
		 Node newNode= new Node(data); 
		 
			if(head==null)
			{
		      head=newNode;
		      return;
			}
			else if(pos==1)
			{
				newNode.next=head;
				head=newNode;
				return;
			}
			else if(pos>1)
			{
			 Node curNode=head;
			for(int i=1;i<pos-1;i++)
			{
				curNode=curNode.next;
			}
			newNode.next=curNode.next;
			curNode.next=newNode;
			
			} 
	 }
	 
	
	  
	 
	 
	 //delete
	 
	 public void deleteFirst()
	 {
	    
		  if(head==null)
		  {
			  System.out.println("list is empty");
		  }
		  if(head.next==null)
		  {
			  head=null;
		  }
		  else 
		  {
			head=head.next;
		  }
		  
	 }
	 
	 public void dleteLast()
	 {
		 if(head==null)
		 {
			 System.out.println("List is empty");
		 }
		 if(head.next==null)
		 {
			 head=null;
		 }
		 else {
			 Node curNode=head;
			 while(curNode.next.next!=null)
			 {
				 curNode=curNode.next;
				
			 }
                
			 curNode.next=null;
		 }
		 		 
	 }
	 
	 public void delPos(int pos)
	 {
		
		 if(head==null)
		 {
			 System.out.println("LL isempty");
		 }
		 else if(pos==1)
		 {
			 Node tempNode=head.next;
			 head=null;
			 head=tempNode;
		 }
		 else if (pos>1)
		 {  
			 Node curNode=head;
			for(int i=1;i<pos-1;i++)
			{
				curNode=curNode.next;
			}
		   curNode.next=curNode.next.next;
		   
		 }
	 }
	 
	 private void search(String data) {
		
		 if(head==null)
		 {
			 System.out.println("LinkList is empty");
			 return;
		 }
		 int count=1;
		 Node curNode=head;
		 while(curNode!=null)
		 {
			 if(curNode.data.equalsIgnoreCase(data))
			 {
				 System.out.println("data is found at"+count);
			      break;
			 }
			 count++;
			 curNode=curNode.next;
			 
			 
			 if(curNode==null)
			 {
				 System.out.println("not found");
			 }
		 }

	}

	 public void print()
	 {
		 if(head==null)
              System.out.println("link list is null");
		 
		 Node curNode=head;
		 while(curNode!=null)
		 {
			 System.out.print(curNode.data+"-->");
			 curNode=curNode.next;
		 }
		System.out.println("null");
	 }

	 public void reversePrint()
	 {

		 Node preNode=head;
		 Node curNode=preNode.next;
		 Node nexNode=curNode.next;
		 
		 while(curNode!=null)
		 {
			                                              //this method made LL as reverse;
			  curNode.next=preNode;
			  
			  preNode=curNode;
			  curNode=nexNode;
			  if(nexNode!=null)
			   nexNode=nexNode.next;
			  
		 }
		 head.next=null;
		 head=preNode;
	
	}
      
	 public void printrever()
	 {
		Node curNode=head;
		for(int i=0;i<countNode();i++)
		{
			for(int j=1;j<countNode()-i;j++)             //this method only print reverse not make
			{
				curNode=curNode.next;
			}
			System.out.print(curNode.data+"-->");
			if(curNode==head)
				break;
			
			curNode=head;
			
		}
		 
	 }
	 
	 public int countNode()
	 {
		 Node curNode=head;
		 int count=0;
		 while(curNode!=null)
		 {
			count++;
			 curNode=curNode.next;
		 }
		 return count;
	 }
	 
	 public void modify(String data,String data1)
	 {
	    	 if(head==null) {
	    		System.out.println("empty");
	    		 return;
	    	 }
	    	Node curNode=head;
	    	while(curNode!=null)
	    	{
	    		if(curNode.data.equalsIgnoreCase(data))
	    		{  
	    			curNode.data=data1;
	    			System.out.println("modifing succefully done");
	    			break;
	    		}
	    		curNode=curNode.next;
	    		if(curNode==null)
	    		{
	    			System.out.println("unsuccessfull");
	    		}
	    	}
	 }
	 
	 public static void main(String[] args) {
		AddDelOpLL ls=new AddDelOpLL();
//		ls.addFirst("a");
//		ls.addFirst("is");
//		//ls.print();
//		ls.addlast("link list");
//		ls.addFirst("this");
//		//ls.print();
//		ls.deleteFirst();
//		ls.dleteLast();
//		//ls.print();
//		ls.addPosi("1", 1);
//		ls.addPosi("2", 2);
//		ls.addPosi("3", 3);
//		ls.print();
//		ls.delPos(5);
//		ls.print();
	
        ls.addFirst("1");
        ls.addlast("2");
        ls.addlast("3");
        ls.addlast("4");
        ls.print();
       // ls.search("3");
        ls.reversePrint();
        ls.print();
        ls.addlast("3");
        ls.reversePrint();
        ls.print();
       // ls.printrever();
        ls.modify("1", "10");
        ls.delPos(4);
        ls.print();
	}
}
