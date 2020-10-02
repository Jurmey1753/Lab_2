class linklist 
{
	Node front;
	Node tail;
	int size;

	public linklist()
	{
		front = null;
		tail = null;
		size = 0;
	}

	public void enqueue(int e)
	{
		Node newest = new Node(e, null);
		if(size == 0)
		{
			front = newest;
			tail = newest;
			System.out.println("Enqueue" +e);
		}
		else
		{
			tail.setNext(newest);
			tail = newest;
			System.out.println("Enqueue" +e);
		}
		size = size + 1;
	}

	public int dequeue()
	{
		int deletedElement = front.getElement();
		if(isEmpty())
		{
			return 1;
		}
		else
		{
			front = front.getNext();
			size -= 1;
			System.out.println("Dequeue :" +deletedElement);
		}
		return deletedElement;
	}

	public boolean isEmpty()
	{
		if(size == 0)
		{
			return true;
		}
		return false;
	}

	public int printFrontElement()
	{
		int frontElement = front.getElement();
		if(size == 0)
		{
			System.out.println("Error");
		}
		else
		{
			return frontElement;
		}
		return frontElement;
	}

	public int len()
	{
		if(isEmpty())
		{
			return 1;
		}
		return size;
	}

}
class Node
{
	private int element;
	private Node next;

	public Node(int element, Node next)
	{
		this.element = element;
		this.next = next;
	}

	public int getElement()
	{
		return element;
	}
	public Node getNext()
	{
		return next;
	}
	public void setElement(int e)
	{
		element = e;
	}
	public void setNext(Node e)
	{
		next = e;
	}
}

public class Lab2_2
{
	public static void main(String []args)
	{
		linklist obj = new linklist();

		obj.enqueue(8);
		obj.enqueue(1);
		obj.enqueue(2);
		obj.enqueue(7);
		obj.dequeue();

		assert(obj.isEmpty() == false);
		assert(obj.printFrontElement() == 4);
		assert(obj.len() == 3);

		System.out.println("The first element of stack is : " +obj.printFrontElement());
		System.out.println("All are successfully tested!");
	}
}