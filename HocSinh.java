import java.net.SocketTimeoutException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class HocSinh extends Nguoi {
    String MaHS;
    int SoBuoiVangMat;
    int SoLanDiMuon;

    public HocSinh(){

    }

    public int getSoLanDiMuon() {
        return SoLanDiMuon;
    }

    public void setSoLanDiMuon(int soLanDiMuon) {
        SoLanDiMuon = soLanDiMuon;
    }

    public int getSoBuoiVangMat() {
        return SoBuoiVangMat;
    }

    public void setSoBuoiVangMat(int soBuoiVangMat) {
        SoBuoiVangMat = soBuoiVangMat;
    }

    public String getMaHS() {
        return MaHS;
    }

    public void setMaHS(String maHS) {
        MaHS = maHS;
    }

    public HocSinh(String hoTen, String namSinh, String diaChi, String gioiTinh, String maHS, int soBuoiVangMat, int soLanDiMuon){
        super(hoTen, diaChi, namSinh, gioiTinh);
        this.MaHS = maHS;
        this.SoBuoiVangMat = soBuoiVangMat;
        this.SoLanDiMuon = soLanDiMuon;
    }

    @Override
    public void NhapTT(){
        Scanner scanner = new Scanner(System.in);

        super.NhapTT();
        System.out.println("Nhap ma hoc sinh");
        MaHS = scanner.nextLine();
        System.out.println("Nhap so lan vang mat : ");
        SoBuoiVangMat = scanner.nextInt();
        System.out.println("So lan di muon: ");
        SoLanDiMuon = scanner.nextInt();


    }

    public void XuatTT(){
        super.XuatTT();
        System.out.println("Ma hoc sinh: "+ this.MaHS);
        System.out.println("So lan di muon: "+ this.SoLanDiMuon);
        System.out.println("So lan vang mat: "+ this.SoBuoiVangMat);
    }
}
