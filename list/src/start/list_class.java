package start;

public class list_class {

	private int[] mArray = { 10, 25, 55, 63, 82, 213, 423, 1, 1, 233 };

	public list_class() {
		System.out.println(toDing());
		sotierer();
		System.out.println(toDing());
	}

	public void sotierer() {
		int i =0;
		while (i < mArray.length) {
			vergleiche();
			i++;
		}

	}

	public void vergleiche() {
		System.out.println("hi");
		int temp;

		for (int i = 0; i <= mArray.length - 2; i++) {

			if (mArray[i] > mArray[i + 1]) {
				temp = mArray[i];
				mArray[i] = mArray[i + 1];
				mArray[i + 1] = temp;

			}

		}

	}

	public boolean isSotiert() {

//		int i = mArray.length;
//
//		if (mArray[0] <= mArray[1] && mArray[1] <= mArray[2] && mArray[2] <= mArray[3] && mArray[3] <= mArray[4]
//				&& mArray[4] <= mArray[5] && mArray[5] <= mArray[6] && mArray[6] <= mArray[7] && mArray[7] <= mArray[8]
//				&& mArray[8] <= mArray[9]) {
//			System.out.println("true");
//			return true;
//		} else {
//			System.out.println("false");
//			System.out.println(toDing());
//			return false;
//		}

		
		for(int i = 0; i< mArray.length-1;i++){
			if(mArray[i]>mArray[i+1]){
				System.out.println(toDing());
				return false;
			}
		}
		return true;
		
//		String s ="";
//		int temp = mArray.length;
//		int i = 0;
//		while(i <= temp-1){
//			if(i == 0){
//				s = "mArray[0]<=mArray[1]";
//			}else{
//				
//				s = s+"&&mArray["+i+"] <= mArray["+i+1+"]";
//			}
//		}
//		if(s){
//			return true;
//		}else{
//			return false;
//		}
	}

	public String toDing() {

		String s = "";
		for (int i : mArray) {
			s = s + i + ";";
		}

		return s;
	}

}
