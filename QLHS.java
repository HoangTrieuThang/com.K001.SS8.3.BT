public class QLHS {
    public static void main(String[] args) {
        HocSinh hocSinh = new HocSinh();
        int lc = 4;
        System.out.println("nhap lua chọn \n1. Nhap thong tin hoc sinh. \n2 Xuat thong tin hoc sinh. \n3 Thoat.");
        switch (lc){
            case 1:
                hocSinh.NhapTT();
                break;
            case 2:
                hocSinh.XuatTT();
                break;
            case 3:
                break;

                default:
                    break;
        }

    }
}
