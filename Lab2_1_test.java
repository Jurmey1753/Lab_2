public class Lab2_1_test
{
	public static void main(String []args)
	{
		Lab2_1 obj1 = new Lab2_1();

		obj1.push(2);
		obj1.push(4);
		obj1.push(6);

		System.out.println(obj1.isEmpty());
		System.out.println(obj1.size());
		System.out.println(obj1.top());
		System.out.println(obj1.pop());
	}
}