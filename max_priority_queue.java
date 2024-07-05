package CodingNinjas;

public class max_priority_queue {


		private ArrayList<Integer> heap;

		public PQ() {
			heap = new ArrayList<Integer>();
		}

		boolean isEmpty() {
			// Implement the isEmpty() function here
	        return heap.size() == 0;
		}

		int getSize() {
			// Implement the getSize() function here
	        return heap.size();
		}

		int getMax() {
			// Implement the getMax() function here
	        return heap.get(0);
		}

	    
		void insert(int element){
			heap.add(element);
			int childIndex = heap.size() - 1;
			int parentIndex = (childIndex - 1) / 2;

			while(childIndex > 0){
				if(heap.get(childIndex) > heap.get(parentIndex)){
					int temp = heap.get(childIndex);
					heap.set(childIndex, heap.get(parentIndex));
					heap.set(parentIndex, temp);
					childIndex = parentIndex;
					parentIndex = (childIndex - 1) / 2;
				}else{
					return;
				}
			}
		}

	    
		
		int removeMax() {
			if(isEmpty()){
				// Throw an exception
		     return (Integer.MIN_VALUE);
			}
			int temp = heap.get(0);
			heap.set(0, heap.get(heap.size() - 1));
			heap.remove(heap.size() - 1);
			int index = 0;
			int minIndex = index;
			int leftChildIndex = 1;
			int rightChildIndex = 2;

			while(leftChildIndex < heap.size()){

				if(heap.get(leftChildIndex) > heap.get(minIndex)){
					minIndex = leftChildIndex;
				}
				if(rightChildIndex < heap.size() && heap.get(rightChildIndex) > heap.get(minIndex)){
					minIndex = rightChildIndex;
				}
				if(minIndex == index){
					break;
				}else{
					int temp1 = heap.get(index);
					heap.set(index, heap.get(minIndex));
					heap.set(minIndex, temp1);
					index = minIndex;
					leftChildIndex = 2 * index + 1;
					rightChildIndex = 2 * index + 2;
				}
			}
			return temp;

		}
	
}
