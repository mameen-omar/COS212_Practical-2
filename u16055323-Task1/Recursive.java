/*	Mohamed Ameen Omar
	u16055323
	COS212
	Practical 2 - Friday
*/


public class Recursive
{
	public static void addScalar(Node _node, double scalar)
	{
		if(_node == null)
		{
			return;
		}

		else
		{
			//add scalar to current node
			_node.setValue(_node.getValue() + scalar);
			//increase scalar
			scalar++;
			//set next node
			_node = _node.getNextNode();

			//call function again
			addScalar(_node,scalar);

		}
	}

}
