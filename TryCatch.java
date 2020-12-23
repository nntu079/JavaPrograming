	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1,b=1;
		int nums[]= new int[3];
		
		try {//Trong đây tối đa 1 lỗi thôi vì có lỗi là nó nhảy xuống catch luôn nhiều lỗi dùng nhiều try
			System.out.println("START");
			int c=a/b;
			nums[3]=1;
		} catch(ArithmeticException e) {
			System.out.println(e);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}finally //Ít dùng
		{
			System.out.println("Finally");
		}
		
		System.out.println("END");
		
	}
