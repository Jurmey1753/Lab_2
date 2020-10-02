public class Lab2_1
{
	int max = 10;
	int top = -1;
	int size = 0;
	int [] array = new int[max];

	public void push(int e)
	{
		if(size == 0)
		{
			array[0]=e;
			top=0;
		}
		else
		{
			array[top+1]=e;
			top++;
		}
		size = size+1;
	}
	public int pop()
	{
		if(size==0)
		{
			System.out.println("Empty");
		}
		else
		{
			top = array[top-1];
			size = size-1;
		}
		return array[top+1];
	}
	public int size()
	{
		return size;
	}
	public int top()
	{
		if(top==-1)
		{
			return 0;
		}
			return array[top];
	}
	public boolean isEmpty()
	{
		if(size==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}