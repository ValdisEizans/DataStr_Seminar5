package datastr;

public class MyGraph<Ttype> {
	private MyVerticeNode<Ttype>[] verticeNodes;
	private final int DEFAULT_SIZE = 10;
	private int size = DEFAULT_SIZE;
	private int howManyElements = 0;

	public int getHowManyElements() {
		return howManyElements;
	}
	
	public MyGraph() {
		verticeNodes = new MyVerticeNode[size];
	}
	
	public MyGraph(int size) {
		if(size > 0) {
			this.size = size;
		}
		verticeNodes = new MyVerticeNode[this.size];
	}
	
	//vai tukss
	private boolean isEmpty() {
		return (howManyElements == 0); 
	}
	
	//vai pilns
	private boolean isFull() {
		return (howManyElements == size); 
	}
	
	//resize
	private void resize() {
		int newSize = (howManyElements < 200) ? (size*2) : (int)(size*1.5);
		MyVerticeNode<Ttype>[] newVerticeNode = new MyVerticeNode[newSize]; 
				
		for(int i=0; i < howManyElements; i++) {
			newVerticeNode[i] = verticeNodes[i];
		}
		
		verticeNodes = newVerticeNode;
		size = newSize;
		System.gc();
	}

	
}
