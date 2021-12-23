package simplecircularlinkedlist;

public class scircular
{
	private Node Head;
	private int size;
	
	class Node
		{
			private Node next;
			private int data;
		}
	void create(int value)
	{
		size++;
		Node temp=new Node();
		temp.data=value;
		if(Head==null)
		{
			Head=temp;
			temp.next=temp;
		}
		else
		{
			Node cpy=Head;
			while(cpy.next!=Head)
			{
				cpy=cpy.next;
			}
			cpy.next=temp;
			temp.next=Head;
		}
	}
	void display()
	{
		if(size==0)
		{
			System.out.println("list is empty");
		}
		else
		{
			Node temp=Head;
			while(temp.next!=Head)
			{
				System.out.print("\t");
				System.out.println("\t"+temp.data+"->->->"+temp.next);

				temp=temp.next;
			}
			System.out.print("\t");
			System.out.println("\t"+temp.data+"->->->"+temp.next);

		}
	}
	void insertatbeg(int value)
	{
		Node temp=new Node();
		temp.data=value;
		if(Head==null)
		{
			Head=temp;
			temp.next=Head;
		}
		else
		{
			Node cpy=Head;
			Node cpy2=Head;
			while(cpy.next!=Head)
			{
				cpy=cpy.next;
			}
			temp.next=cpy2;
			cpy.next=temp;
			Head=temp;
		}
			size++;
		
	}
		
	void insertatpos(int value,int pos)
	{
		size++;
		Node temp=new Node();
		temp.data=value;
		if(pos==1)
		{
			Node cpy=Head;
			Node cpy2=Head;
			while(cpy.next!=Head)
			{
				cpy=cpy.next;
			}
			temp.next=cpy2;
			cpy.next=temp;
			Head=temp;
		}
		else
		{
			Node cpy=Head;
			for(int i=1;i<pos-1;i++)
			{
				cpy=cpy.next;
			}
			Node cpy2=cpy.next;
			cpy.next=temp;
			temp.next=cpy2;
			
		}	
	}
	void deleteatbeg()
	{
		if(size==0)
		{
			Head=null;
		}
		else
		{
			Node cpy=Head;
			Node cpy2=Head;
			while(cpy.next!=Head)
			{
				cpy=cpy.next;
			}
			Node temp=cpy2.next;;
			cpy.next=temp;
			Head=temp;
			size--;
		}
	}
	void deleteatend()
	{
		if(size==0)
		{
			Head=null;
		}
		else
		{
			Node cpy2=Head;
			Node temp=Head;
			while(temp.next!=Head)
			{
				cpy2=temp;
				temp=temp.next;
			}
			Node cpy=cpy2;
			cpy.next=Head;
			size--;
		}
		
	}
	void deleteatpos(int pos)
	{
		if(size==0)
		{
			Head=null;
		}
		else
		{
			if(pos==1)
			{
				Node cpy=Head;
				Node cpy2=Head;
				while(cpy.next!=Head)
				{
					cpy=cpy.next;
				}
				Node temp=cpy2.next;;
				cpy.next=temp;
				Head=temp;

			}
			else
			{
			Node temp=Head;
			Node cpy=Head;
			for(int i=1;i<pos-1;i++)
			{
				temp=temp.next;
			}
			int j=1;
			while(j<pos)
			{
				cpy=cpy.next;
				j++;
			}
			Node last1=cpy.next;
			temp.next=last1;
			Head=temp;
			}
			size--;
		}
		
	}
	void sizeoflist()
	{
		System.out.println(size);
	}

}
