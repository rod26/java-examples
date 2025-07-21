public class Constructor4 {
  int width;
  int height;

  public Constructor4(int width, int height) {
    this.width = width;
    this.height = height;
  }

  public int getArea() {
    return width * height;
  }

  public static void main(String[] args) {
    Constructor4 rect1 = new Constructor4(5, 10);
    Constructor4 rect2 = new Constructor4(7, 3);

    int area1 = rect1.getArea();
    int area2 = rect2.getArea();

    System.out.println("Area of rect1: " + area1);
    System.out.println("Area of rect2: " + area2);
  }
}