package summer2019;

public class House {

	private int numRooms;
	private double size;
	private int floors;
	
	public House() {
		numRooms = 18;
		size = 3000;
		floors = 3;
	}
	
	public int getNumRooms() {
		return numRooms;
	}
	
	public void setNumRooms (int newNumRooms) {
		numRooms = newNumRooms;
	}
	
	public double getSize () {
		return size;
	}
	
	public void setSize(double newSize) {
		size = newSize;
	}
	
	public int getfloors() {
		return floors;
	}
	
	public void setfloors(int newFloors) {
		floors = newFloors;
	}
	
	public void buildfloor() {
		floors = floors + 1;
	}
	
	public void upsize() {
		size = size * 1.3;
	}
	public void removeRen(int minusFloors) {
		floors = floors - minusFloors;
	}
}
