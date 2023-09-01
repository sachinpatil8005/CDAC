package OOP;

public class MyNumber {
	
		private int data;
		
		
		public MyNumber(){
			data = 0;
		}
		public MyNumber(int data)
		{
			this.data=data;
		}
		
		
		public boolean isNegative(){
			return (this.data < 0);
		}
		public boolean isPositive(){
			return (this.data > 0);
		}
		public boolean isZero(){
			return (this.data == 0);
		}
		public boolean isEven(){
			return (this.data%2 == 0);
		}
		public boolean isOdd(){
			return (!(this.data%2 == 0));
		}

}
