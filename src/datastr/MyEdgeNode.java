package datastr;

public class MyEdgeNode {
	private int indexToVertice;
	private float weight;//TODO partaisit uz Ttype
	private MyEdgeNode nextEdge = null;

	public int getIndexToVertice() {
		return indexToVertice;
	}
	public float getWeight() {
		return weight;
	}
	public MyEdgeNode getNextEdge() {
		return nextEdge;
	}

	public void setIndexToVertice(int indexToVertice) {
		if(indexToVertice >= 0) {
			this.indexToVertice = indexToVertice;
		}
		else {
			this.indexToVertice = 0;
		}
	}
	public void setWeight(float weight) {
		if(weight > 0) {
			this.weight = weight;
		}
		else {
			this.weight = 1;
		}
	}
	public void setNextEdge(MyEdgeNode nextEdge) {
		this.nextEdge = nextEdge;
	}
	
	public MyEdgeNode(int indexToVertice, float weight) {
		setIndexToVertice(indexToVertice);
		setWeight(weight);
	}
	
	public String toString() {
		return "index to: " + indexToVertice + "(" + weight + ")";
	}

}
