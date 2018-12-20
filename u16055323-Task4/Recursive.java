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
			//compare
			if(temp.getValue() < temp.getNextNode().getValue())
			{
				//merge current with last

				//go to the second last node
				Node secondLast = temp;
				while(secondLast.getNextNode().getNextNode() != null)
				{
					secondLast = secondLast.getNextNode();
				}

				temp.setValue(temp.getValue() + secondLast.getNextNode().getValue());

				//make second last the last node
				secondLast.setNextNode(null);

			}

			//run again
			mergeSomeNodes(temp.getNextNode());
		}
	}
}
