Java求体积：
package all12;
import java.util.Scanner;
public class All9 {
		public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			int choice = 0;
	        while (choice != 5) {
	            System.out.println("请选择要计算的形状：");
	            System.out.println("1. 计算立方体体积");
	            System.out.println("2. 计算圆柱体体积");
	            System.out.println("3. 计算圆锥体体积");
	            System.out.println("4. 计算球体体积");
	            System.out.println("5. 退出系统");
	            choice = scanner.nextInt();
	            switch(choice) {
	                case 1:
	                    System.out.println("输入立方体的尺寸（长、宽、高）：");
	                    double cuboidLength = scanner.nextDouble();
	                    double cuboidWidth = scanner.nextDouble();
	                    double cuboidHeight = scanner.nextDouble();
	                    double cuboidVolume = calculateCuboidVolume(cuboidLength, cuboidWidth, cuboidHeight);
	                    System.out.println("立方体的体积 = " + cuboidVolume);
	                    break;
	                case 2:
	                    System.out.println("输入圆柱体的尺寸（半径、高）：");
	                    double cylinderRadius = scanner.nextDouble();
	                    double cylinderHeight = scanner.nextDouble();
	                    double cylinderVolume = calculateCylinderVolume(cylinderRadius, cylinderHeight);
	                    System.out.println("圆柱体的体积 = " + cylinderVolume);
	                    break;
	                case 3:
	                    System.out.println("输入圆锥体的尺寸（半径、高）：");
	                    double coneRadius = scanner.nextDouble();
	                    double coneHeight = scanner.nextDouble();
	                    double coneVolume = calculateConeVolume(coneRadius, coneHeight);
	                    System.out.println("圆锥体的体积 = " + coneVolume);
	                    break;
	                case 4:
	                    System.out.println("输入球体的尺寸（半径）：");
	                    double sphereRadius = scanner.nextDouble();
	                    double sphereVolume = calculateSphereVolume(sphereRadius);
	                    System.out.println("球体的体积 = " + sphereVolume);
	                    break;
	                case 5:
	                    System.out.println("退出系统。");
	                    break;
	                default:
	                    System.out.println("无效的选项，请重新选择。");
	                    break;
	            }
	        }
	    }
		public static double calculateCuboidVolume(double length, double width, double height) {
	        return length * width * height;
	    }
	    public static double calculateCylinderVolume(double radius, double height) {
	        return Math.PI * Math.pow(radius, 2) * height;
	    }
	    public static double calculateConeVolume(double radius, double height) {
	        return (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
	    }
	    public static double calculateSphereVolume(double radius) {
	        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
	    }
	}

