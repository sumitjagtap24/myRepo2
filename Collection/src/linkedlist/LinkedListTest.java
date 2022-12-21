package linkedlist;

//import array.Kite;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Kite k1 = new Kite ("Red","Jack" , 50, true);
		Kite k2 = new Kite ("Blue","John" , 40, true);
		Kite k3 = new Kite ("Green","Ross" , 70, true);
		Kite k4 = new Kite ("Black","Jos" , 30, true);
		
		k1.next = k2;
		k2.next = k3;
		k3.next = k4;

		System.out.println("K1 :" +k1);
		System.out.println("K2 :" +k2);
		System.out.println("K3 :" +k3);
		System.out.println("K4 :" +k4);
		System.out.println("-------------------");
		
		System.out.println("k1 :" +k1.hashCode());
		System.out.println("k2 :" +k2.hashCode());
		System.out.println("k3 :" +k3.hashCode());
		//System.out.println("k4 :" +k4.hashCode());
		System.out.println("--------------------");

		
		System.out.println("k1.next : " +k1.next.hashCode());
		System.out.println("k2.next : " +k2.next.hashCode());
		System.out.println("k3.next : " +k3.next.hashCode());
		System.out.println("k4.next : " +k4.next);

	}

}
	class Kite{
		String color;
		String owner;
		int length;
		boolean flying;
		
		public Kite() {
			super();
			// TODO Auto-generated constructor stub
		}
		Kite next;
		
		public Kite(String color, String owner, int length, boolean flying) {
			this.color = color;
			this.owner = owner;
			this.length = length;
			this.flying = flying;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public String getOwner() {
			return owner;
		}
		public void setOwner(String owner) {
			this.owner = owner;
		}
		public int getLength() {
			return length;
		}
		public void setLength(int length) {
			this.length = length;
		}
		public boolean isFlying() {
			return flying;
		}
		public void setFlying(boolean flying) {
			this.flying = flying;
		}
		@Override
		public String toString() {
			return "Kite [color=" + color + ", owner=" + owner + ", length=" + length + ", flying=" + flying + "]";
		}
		
		

		
	}