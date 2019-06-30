import java.util.Scanner;

public class Nguoi {
    String hoTen;
    String namSinh;
    String diaChi;
    int gioiTinh;

    public Nguoi(){
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Nguoi(String hoTen, String namSinh, String diaChi, int gioiTinh){
        hoTen = hoTen;
        namSinh = namSinh;
        diaChi = diaChi;
        gioiTinh = gioiTinh;
    }

    public void NhapTT(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ho Ten SV: ");
        hoTen = scanner.nextLine();
        System.out.println("Nam Sinh: ");
        namSinh = scanner.nextLine();
        System.out.println("Dia chi : ");
        diaChi = scanner.nextLine();
        System.out.println("Gioi tinh (1 Nam ; 2 Nu) : ");
        gioiTinh = scanner.nextInt();
    }

    public void XuatTT(){
        System.out.println("Ho ten: "+ this.hoTen);
        System.out.println("Nam sinh: "+ this.namSinh);
        System.out.println("Dia chi : "+ this.diaChi);
        System.out.println("Gioi tinh: "+ this.gioiTinh);


    }

}
