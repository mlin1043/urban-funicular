public class NodeArray {
	private String [] arr;
	private NodeArray child;

	public NodeArray (String [] arr) {
		this.arr = arr;
		child = null;
	}

	public static void main(String [] args) {
		String [] array = { "Java", "is", "fun", ","};
	
		NodeArray na = new NodeArray(array);

		System.out.println(na);
		
		System.out.println(na.arr);
	}
	
	public String toString() {
		if(arr.length == 0) return "[]";
		String s = "";
		s += "{ ";
		s += arr[0];
		for (int i = 1; i < arr.length; i++){
			if(arr[i] == ","){
				s += ", ','";} 
			else{
				s += ", "+arr[i];}		
		}
		s += " }"; 
		return s;
	}
}		
