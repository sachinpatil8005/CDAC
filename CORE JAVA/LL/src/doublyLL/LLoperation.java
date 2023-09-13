package doublyLL;


import java.util.Scanner;





public class LLoperation {
   
	    Node head; 
	     class Node
	     {
	    	 String data;
	    	 Node preNode,nextNode;
	     
		     public Node(String data)
		     {
		    	 this.data=data;
		    	 this.preNode=preNode;
		    	 this.nextNode=nextNode;
		     }
	     }
	     
	     
	    
	     public void addpos(String data,int pos)
	     {
	    	 Node newNode=new Node(data);
	    	if(head==null)
	    	{
	    		head=newNode;
	    		return;
	    	}
	    	if(pos==1)
	    	{
	    		head.preNode=newNode;
	            newNode.nextNode=head;
	            head=newNode;
		    }
	    	else if(pos>1)
	    	{   
	    		Node curNode=head;
	    		for(int i=1;i<pos-1;i++)
	    			curNode=curNode.nextNode;
	    		newNode.nextNode=curNode.nextNode;
	    		newNode.preNode=curNode;
	    		curNode.nextNode=newNode;
	    	}
	         
	     }	
	     public int count()
	     {
	     	int count=0;
	     	Node curNode=head;
	     	while(curNode!=null)
	     	{
	     		count++;
	     		curNode=curNode.nextNode;
	     	}
	     	return count;
	     }
	     
	     public void dletepos(int pos)
	     {
	    	 Node curNode=head;
	    	 if(head==null)
	    	 {
	    		 System.out.println("link list is empty");
	    		 return;
	    	 }
	    	 else if(pos==1)
	    	 {
	    		curNode=curNode.nextNode;
	    		head=curNode;
	    		curNode.preNode=null;
	    		return;
	    	 }
	    	 else if(pos<count())
	    	 {
	    		 for(int i=1;i<pos-1;i++)
	    			curNode=curNode.nextNode; 
                    curNode.nextNode.preNode=null;
                    curNode.nextNode=curNode.nextNode.nextNode;
                    curNode.nextNode.preNode=curNode;
                    return;    		 
	    	 }
	    	 else 
	    		 {
           for(int i=1;i<count();i++)
              curNode=curNode.nextNode;
              curNode.nextNode.preNode=null;
              curNode.nextNode=null;
	    		 }
			
	     }
	
	      
	     public void search(String data)
	     {
	    	 Node curNode=head;
	    	 if(head==null)
	    	 {
	    		 System.out.println("list is empty");
	    	      return;
	    	 }
	    
		     int count=1;
		     while(curNode!=null)
		     {
		    	 if(curNode.data.equalsIgnoreCase(data))
		    	 {
		    		 System.out.println(count);
		    		 break;
		    	 }
		    	 count++;
		    	 curNode=curNode.nextNode;
		     
		     }
	     
	     }
	
	public void modify(String data,String data1)
	{
		if(head==null)
		{
			System.out.println("empty");
			return;
		}
		Node curNode=head;
		while(curNode!=null)
		{
			if(curNode.data.equalsIgnoreCase(data))
			{
				curNode.data=data1;
				System.out.println("sucessfully moified");
			     break;
			}
			curNode=curNode.nextNode;
			if(curNode==null)
			{
				System.out.println("unsuccessfull");
			}
		}
	}
	
	public void sort()
	{
		if(head==null)
		{
			System.out.println("empty-not sorted");
			return;
		}
		String tempNode;
		Node point=null;
		Node curNode=head;
		while(curNode!=null)
		{
			  point=curNode.nextNode;
			while(point!=null)
			{
				int comparison = point.data.compareTo(curNode.data);
				if(comparison<0)
				{
					tempNode=point.data;
					point.data=curNode.data;
					curNode.data=tempNode;
				}
				point=point.nextNode;
			}
			
			curNode=curNode.nextNode;
		}
	}
	
	public void display()
	{
		Node curNode=head;
		while(curNode!=null)
		{
			System.out.print(curNode.data+"-->");
			curNode=curNode.nextNode;
		}
		System.out.println("null");
	}
	public void reverse()
	{
		Node curNode;
		for(curNode=head;curNode.nextNode!=null;curNode=curNode.nextNode);
		while(curNode!=null)
		{
			System.out.print(curNode.data+"-->");
			curNode=curNode.preNode;
		}
		System.out.println("null");
	}
	
	
	
	public static void main(String[] args) {
		LLoperation LL=new LLoperation();
		LL.addpos("1", 0);
		LL.addpos("2", 1);
		LL.display();
		LL.reverse();
		LL.addpos("3", 3);
        LL.display();
        //LL.dletepos(2);
        LL.sort();
        LL.display();
        LL.modify("3", "4");
        LL.display();
        LL.search("4");
        
		
	}

}
