package org.tnsif.acc.c2tc.oops;


	class Human{
		private String name;
		private int ages;
		public void setNames(String name) {
			this.name = name;
		}
		public String getNames() {
			return name;
		}
		public void setAges(int ages) {
			this.ages = ages;
		}
		
		public int getAges() {
			return ages;
		}
		
		
	}
	public class EncapsulationDemo {
	public static void main(String[] args) {
		Human obj = new Human();
		obj.setNames("Neha");
		obj.setAges(21);
		System.out.println(obj.getNames());
		System.out.println(obj.getAges());
		 
		obj.setNames("Hemanth");
		obj.setAges(34);
		System.out.println(obj.getNames());
		System.out.println(obj.getAges());

	}

}
