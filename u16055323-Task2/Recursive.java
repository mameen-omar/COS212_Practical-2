/*	Mohamed Ameen Omar
	u16055323
	COS212
	Practical 2 - Friday
*/

public class Recursive
{
	public static double sum(Node temp)
	{
		if (temp == null)
		{
			return 0.0;
		}

		else
		{
			return temp.getValue() + sum(temp.getNextNode());
		}
	}

}