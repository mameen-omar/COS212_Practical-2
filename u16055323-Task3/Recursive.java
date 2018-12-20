/*	Mohamed Ameen Omar
	u16055323
	COS212
	Practical 2 - Friday
*/

public class Recursive
{
	public static void mergeSomeNodes(Node temp)
	{
		if(temp == null || temp.getNextNode() == null)
		{
			return;
		}

		else
		{

			//compare current and next
			//if less than we need to merge
			if(temp.getValue() < (temp.getNextNode()).getValue() )
			{
				//set current to merged value
				temp.setValue(temp.getValue() + (temp.getNextNode()).getValue());
				//set next to the node after the one merged
				temp.setNextNode( (temp.getNextNode()).getNextNode() );

			}

			//run again with the next node
			mergeSomeNodes(temp.getNextNode());
		}
	}
}
