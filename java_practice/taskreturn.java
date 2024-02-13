class O{
	int a=10;
	static int b=5;
	}
	
	class T{
		public int add(int c,int d){
			System.out.print("c+d ");
			return(c+d);
		}
		
		public static int sub(){
			O rr = new O();
			System.out.print("a-b ");
			return(rr.a-O.b);
		}
		
		public void mul(int e,int f){
			System.out.print("e*f ");
			System.out.println(e*f);
		}
		
		public static void div(){
			O aa = new O();
			System.out.print("a/b ");
			System.out.println((aa.a)/O.b);
		}
	}
		
		class h{
			public static void main(String []args){
				T uu = new T();
				System.out.println(uu.add(6,10));
				
				System.out.println(T.sub());
				
				T vv = new T();
				vv.mul(10,3);
				
				T.div();
				
				int t=uu.add(6,10)+T.sub();
				System.out.println("addition of two methods "+t);
			}
		}																																																																																																																																																																																																																																																																																																																				