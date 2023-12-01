import java.util.Scanner;
    public class bai26 {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Menu: ");
            System.out.println("1. Phương trình bậc nhất 1 ẩn.");
            System.out.println("2. Hệ phương trình bậc nhất 2 ẩn. ");
            System.out.println("3. Phương trình bậc hai 1 ẩn ");
            System.out.println("Nhập lựa chọn của bạn: ");
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                    giaiPhuongTrinhBacNhat();
                    break;
                case 2:
                    giaiHePhuongTrinh();
                    break;
                case 3:
                    giaiPhuongTrinhBacHai();
                    break;
                default:
                    System.out.println("Chọn sai mời bạn chọn lại!");

            }
        }
        //    Giải phương trình bậc nhất 1 ẩn
        public static void giaiPhuongTrinhBacNhat(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Giai phuong trinh ax+b=0");
            System.out.println("Nhập hệ số a= ");
            double a = scanner.nextDouble();
            System.out.println("Nhập hệ số b= ");
            double b = scanner.nextDouble();
            double result = -b/a;
            if(a==0){
                if(b==0) { System.out.println("Phương trình có vô số nghiệm");}
                else System.out.println("Phương trình vô nghiệm");
            }
            else System.out.println("Phương trình có nghiệm là x = " + result);
        }
        //    Giải hệ phương trình hai ẩn
        public static void giaiHePhuongTrinh() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Giải hệ phương trình \n a1x + b1y = c1 \n a2x + b2y = c2");
            System.out.println("Nhập hệ số a1 b1 c1: ");
            String line = scanner.nextLine();
            // Phân tách chuỗi đầu vào thành các phần tử riêng biệt
            String[] num1 = line.split(" ");
            //Chuyển đổi các phần tử thành các giá trị só
            double a1 = Double.parseDouble(num1[0]);
            double b1 = Double.parseDouble(num1[1]);
            double c1 = Double.parseDouble(num1[2]);
            System.out.println("Nhập hệ số a2 b2 c2: ");
            String string = scanner.nextLine();
            // Phân tách chuỗi đầu vào thành các phần tử riêng biệt
            String[] num2 = string.split(" ");
            //Chuyển đổi các phần tử thành các giá trị só
            double a2 = Double.parseDouble(num2[0]);
            double b2 = Double.parseDouble(num2[1]);
            double c2 = Double.parseDouble(num2[2]);

            //Sử dụng ma trận để tính
            double D = a1 * b2 - a2 * b1;
            double D1 = c1 * b2 - c2 * b1;
            double D2 = a1 * c2 - a2 * c1;
            if (D != 0) {
                double x = D1 / D;
                double y = D2 / D;
                System.out.println("Hệ phương trình có nghiệm là: ");
                System.out.println("x = " + x);
                System.out.println("y = " + y);
            } else {
                if (D1 == 0 && D2 == 0) {
                    System.out.println("Hệ phương trình đã cho có vô số nghiệm.");
                } else System.out.println("Hệ phương trình đã cho có vô số nghiệm.");
            }
        }
        //    Giải phương trình bậc 2
        public static void giaiPhuongTrinhBacHai(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Giải phương trình ax^2 + bx + c = 0");
            System.out.println("Nhập vào hệ số a b c: ");
            String line = scanner.nextLine();
            // Phân tách chuỗi đầu vào thành các phần tử riêng biệt
            String[] num = line.split(" ");
            //Chuyển đổi các phần tử thành các giá trị só
            double a = Double.parseDouble(num[0]);
            double b = Double.parseDouble(num[1]);
            double c = Double.parseDouble(num[2]);
            double delta = b * b - 4 * a * c;
            if (a == 0) {
                System.out.println("Đây không phải là phương trình bậc hai.");
            } else if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có hai nghiệm phân biệt:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phương trình có nghiệm kép:");
                System.out.println("x = " + x);
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }

        }
    }
