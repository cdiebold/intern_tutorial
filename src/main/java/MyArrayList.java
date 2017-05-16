class MyArrayList {
	private int size;
	private int [] array;
	private int capacity;

	public MyArrayList(){
		size = 0;
		capacity = 10;
		array = new int[capacity];
	}

	public MyArrayList(int capacity){
		this();
		this.capacity = capacity;
	}

	@Override public String toString(){
		if(size == 0) return "[ ]";
		StringBuilder sb = new StringBuilder();
		sb.append("[ ");
		for(int i = 0; i < size; i++){
			sb.append(array[size]).append(",");
		}
		sb.append(" ]");
		return sb.toString();
	}





}
