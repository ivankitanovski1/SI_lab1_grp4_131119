class Point {
	String id
	double x,y;

	String color;

	public Point(int xx, int yy) {
		x = xx;
		y = yy;
	}

	public getX() {
		return x;
	}

	public void setX(int xx) {
		x = xx;
	}

	public getY() {
		return y;
	}

	public void setY(int yy) {
		y = yy;
	}

	public void move (char xDirection, char yDirection) {
		switch(xDirection) {
			case 'L': x = x - 1; break;
			case 'R': x = x + 1; break;
		}
		switch(yDirection) {
			case 'U': y = y + 1; break;
			case 'D': y = y - 1; break;
		}
	}

	public void draw () {
		System.out.println(x,y);
	}



}