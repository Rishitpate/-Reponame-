package classes;

public class Cuboid {
	int width;
	int height;
	int depth;
	
	Cuboid(int width, int height, int depth){
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	Cuboid(int width, int height){
		this.width = width;
		this.height = height;
		this.depth = 10;
	}
	
	Cuboid(int dimension){
		this.width = dimension;
		this.height = dimension;
		this.depth = dimension;
	}
	
	Cuboid(){
		this.width = 10;
		this.height = 10;
		this.depth = 10;
	}
	
	int volume() {
		return width*height*depth;
	}
	
	public static void main(String[] args) {
			 
		 Cuboid stdCuboid = new Cuboid(10,20,30);
		 System.out.println(stdCuboid.volume());
		 
		 Cuboid Cuboidwithfixeddepth = new Cuboid(10,20);
		 System.out.println(Cuboidwithfixeddepth.volume());
		 
		 Cuboid cube = new Cuboid(10);
		 System.out.println(cube.volume());
		 
		 Cuboid defaultCuboid = new Cuboid();
		 System.out.println(defaultCuboid.volume());
	}

}
