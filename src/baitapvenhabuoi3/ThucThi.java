package baitapvenhabuoi3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ThucThi {
    public static void main(String[] args) {
        SanPham sanPham;
        ArrayList<SanPham> sanPhamArrayList = new ArrayList<>();
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng các loại sản phẩm:");
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("\nNhập thông tin sản phẩm thứ " + (i + 1));
            sanPham = new SanPham();
            sanPham.NhapThongTinSanPham();
            sanPhamArrayList.add(sanPham);
        }
        //Sắp xếp sản phẩm theo thành tiền giảm dần
        Collections.sort(sanPhamArrayList, new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                if (o1.getThanhTien() < o2.getThanhTien()) {
                    return 1;
                } else {
                    if (o1.getThanhTien() == o2.getThanhTien()) {
                        return 0;
                    } else {
                        return -1;
                    }
                }
            }
        });
        //Hiển thị thông tin sản phẩm
        System.out.println("\n================Thông tin các loại sản phẩm================");
        for (int i = 0; i < sanPhamArrayList.size(); i++) {
            System.out.println("\nthông tin sản phẩm thứ " + (i + 1));
            sanPhamArrayList.get(i).HienThiThongTinSanPham();
        }


    }
}
