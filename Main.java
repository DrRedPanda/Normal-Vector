import java.util.*;

class Main {
  public static void main(String[] args) {
    menu();
  }
  public static void menu() {
    Scanner s = new Scanner(System.in);
    System.out.println("3D Vecter-Plane Calculator");
    System.out.println("  1. Two Parallel Planes w/ Two Points");
    System.out.println("  2. Equation of Plane w/ Three Points");
    System.out.println("  3. Two Points and Perpendicular Plane");
    System.out.println("  4. Cross Product / Find Area");
    System.out.print("Select an operation: ");
    int select = s.nextInt();
    if (select == 1) {
      System.out.print("\033[H\033[2J");
      System.out.flush();
      par();
    }
    else if (select == 2) {
      System.out.print("\033[H\033[2J");
      System.out.flush();
      threepoint();
    }
    else if (select == 3) {
      System.out.print("\033[H\033[2J");
      System.out.flush();
      pointperp();
    }
    else if (select == 4) {
      System.out.print("\033[H\033[2J");
      System.out.flush();
      cross();  
    }
  }
    public static void par() {
    Scanner s = new Scanner(System.in);
    System.out.println("Two Parallel Planes");
    System.out.println("Please enter point in Plane 1");
    System.out.print("x = ");
    int x = s.nextInt();
    System.out.println("  ");
    System.out.print("y = ");
    int y = s.nextInt();
    System.out.println("  ");
    System.out.print("z = ");
    int z = s.nextInt();
    System.out.println("  ");
    System.out.println("Please enter the equation of Plane 2");
    System.out.print("x = ");
    int x1 = s.nextInt();
    System.out.println("  ");
    System.out.print("y = ");
    int y1 = s.nextInt();
    System.out.println("  ");
    System.out.print("z = ");
    int z1 = s.nextInt();
    System.out.println("  ");
    int x2 = x1;
    int y2 = y1;
    int z2 = z1;
    int c = (x1*(-x)) + (z1*(-z)) + (y1*(-y));
    System.out.println("The equation of the plane is " + x2 + "x + " + y2 + "y + " + z2+ "z + " + c + "= 0");
    complete();
  }
  public static void threepoint() {
    Scanner s = new Scanner(System.in);
    System.out.println("Plane with Three Points");
    System.out.println("Please Point 1");
    System.out.print("x = ");
    int px1 = s.nextInt();
    System.out.println("  ");
    System.out.print("y = ");
    int py1 = s.nextInt();
    System.out.println("  ");
    System.out.print("z = ");
    int pz1 = s.nextInt();
    System.out.println("  ");
    System.out.println("Please Point 2");
    System.out.print("x = ");
    int px2 = s.nextInt();
    System.out.println("  ");
    System.out.print("y = ");
    int py2 = s.nextInt();
    System.out.println("  ");
    System.out.print("z = ");
    int pz2 = s.nextInt();
    System.out.println("  ");
    System.out.println("Please Point 3");
    System.out.print("x = ");
    int px3 = s.nextInt();
    System.out.println("  ");
    System.out.print("y = ");
    int py3 = s.nextInt();
    System.out.println("  ");
    System.out.print("z = ");
    int pz3 = s.nextInt();
    System.out.println("  ");
    int vx = px2 - px1;
    int vy = py2 - py1;
    int vz = pz2 - pz1;
    int ux = px3 - px2;
    int uy = py3 - py2;
    int uz = pz3 - pz2;
    int nx = (vy * uz) - (vz * uy);
    int ny = (vx * uz) - (vz * ux);
    int nz = (vx * uy) - (vy * ux);
    int c = (nx*(-px3)) + ((-ny)*(-py3)) + (nz*(-pz3));
    System.out.println("The equation of the plane is " + nx + "x - " + ny + "y + " + nz+ "z + " + c + " = 0");
    complete();
  }
  public static void pointperp() {
    Scanner s = new Scanner(System.in);
    System.out.println("Find Plane w/ Two Points and Perpendicular Plane");
    System.out.println("Please Point 1");
    System.out.print("x = ");
    int px1 = s.nextInt();
    System.out.println("  ");
    System.out.print("y = ");
    int py1 = s.nextInt();
    System.out.println("  ");
    System.out.print("z = ");
    int pz1 = s.nextInt();
    System.out.println("  ");
    System.out.println("Please Point 2");
    System.out.print("x = ");
    int px2 = s.nextInt();
    System.out.println("  ");
    System.out.print("y = ");
    int py2 = s.nextInt();
    System.out.println("  ");
    System.out.print("z = ");
    int pz2 = s.nextInt();
    System.out.println("  ");
    System.out.println("Please enter the equation of Plane 2");
    System.out.print("x = ");
    int x1 = s.nextInt();
    System.out.println("  ");
    System.out.print("y = ");
    int y1 = s.nextInt();
    System.out.println("  ");
    System.out.print("z = ");
    int z1 = s.nextInt();
    System.out.println("  ");
    int vx = px2 - px1;
    int vy = py2 - py1;
    int vz = pz2 - pz1;
    int nx = (vy * z1) - (vz * y1);
    int ny = (vx * z1) - (vz * x1);
    int nz = (vx * y1) - (vy * x1);
    int c = (nx*(-px1)) + ((-ny)*(-py1)) + (nz*(-pz1));
    System.out.println("The equation of the plane is " + nx + "x - " + ny + "y + " + nz+ "z + " + c + " = 0");
    complete();
  }
  public static void cross() {
    Scanner s = new Scanner(System.in);
    System.out.println("Cross Product / Area of Parallelogram");
    System.out.println("  ");
    System.out.println("Vector 1");
    System.out.print("i = ");
    int vx = s.nextInt();
    System.out.println("  ");
    System.out.print("j = ");
    int vy = s.nextInt();
    System.out.println("  ");
    System.out.print("k = ");
    int vz = s.nextInt();
    System.out.println("  ");
    System.out.println("Vector 2");
    System.out.print("i = ");
    int ux = s.nextInt();
    System.out.println("  ");
    System.out.print("j = ");
    int uy = s.nextInt();
    System.out.println("  ");
    System.out.print("k = ");
    int uz = s.nextInt();
    System.out.println("  ");
    int nx = (vy * uz) - (vz * uy);
    int ny = (vx * uz) - (vz * ux);
    int nz = (vx * uy) - (vy * ux);
    System.out.println(nx + "i - " + ny + "j + " + nz + "k");
    System.out.println("  ");
    System.out.println("Would you like to find area? (y/n)");
    String dummy = s.nextLine();
    String ans = s.nextLine();
    if (ans.equals("y")) {
      double a = area(nx, ny, nz);
      System.out.println("  ");
      System.out.println("Your area is " + a);
      complete();
    }
    else {
      complete();
    }
  }
  public static double area(int a, int b, int c) {
    int areasquared = ((a*a) + (b*b) + (c*c));
    double area = Math.sqrt(areasquared);
    return area;
  }
  public static void complete() {
    Scanner s = new Scanner(System.in);
    System.out.println("  ");
    System.out.println("Would you like to run again? (y/n)");
    String rep = s.nextLine();
    if (rep.equals("y")) {
      System.out.print("\033[H\033[2J");
      System.out.flush();
      menu();
    }
    else {
      return;
    }
  }
}