package baitapvenhabuoi3;

import java.util.Scanner;

public class SanPham {
    private String maSanPham;
    private String tenSanPham;
    private int giaBan;
    private int soLuong;
    private int soLuongMua;
    private double thanhTien;

    public void NhapThongTinSanPham() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã sản phẩm: ");
        maSanPham = scanner.nextLine();
        System.out.print("Nhập tên sản phẩm: ");
        tenSanPham = scanner.nextLine();
        System.out.print("Nhập giá bán sản phẩm: ");
        giaBan = scanner.nextInt();
        System.out.print("Nhập số lượng sản phẩm trong kho: ");
        soLuong = scanner.nextInt();
        System.out.print("Nhập số lượng sản phẩm cần mua: ");
        soLuongMua = scanner.nextInt();
        while (soLuongMua > soLuong) {
            System.out.println("Trong kho có " + soLuong + " sản phẩm. Hãy nhập lại giá trị");
            System.out.print("Nhập số lượng sản phẩm cần mua: ");
            soLuongMua = scanner.nextInt();
        }
        scanner.nextLine();
    }

    public void HienThiThongTinSanPham() {
        System.out.println("Mã sản phẩm: " + maSanPham);
        System.out.println("Tên sản phẩm: " + tenSanPham);
        System.out.println("Giá bán của sản phẩm: " + giaBan);
        System.out.println("Số lượng sản phẩm: " + soLuong);
        System.out.println("Số lượng sản phẩm cần mua: " + soLuongMua);
        getThanhTien();
    }

    //Tính toán số tiền thu được tương ứng với số lượng sản phẩm bán
    public double getThanhTien() {
        if (soLuongMua > 20) {
            thanhTien = giaBan * soLuongMua * 0.85;

        } else {
            thanhTien = giaBan * soLuongMua;
        }
        System.out.println("Số tiền bán của mã sản phẩm " + maSanPham + " là: " + thanhTien);
        return this.thanhTien;
    }
}
