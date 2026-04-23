package thigk2.votrangiahung;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		SanPham sp1 = new SanPham("A001", "Bút chì", "Dụng cụ học tập", 5000);
		SanPham sp2 = new SanPham("A002", "Bút bi", "Dụng cụ học tập", 8000);
		SanPham sp3 = new SanPham("A003", "Panadol", "Thuốc", 22000);
		
		System.out.println("Sản phẩm 1: " + sp1.toString());
		System.out.println("Sản phẩm 2: " + sp2.toString());
		System.out.println("Sản phẩm 3: " + sp3.toString());
		
		Scanner sc = new Scanner(System.in);
		
		SanPham sp4 = new SanPham();
		
		System.out.println("Nhập thông tin sản phẩm thứ 4: ");
		System.out.println(" - Nhập mã sản phẩm: ");
		String maSP4 = sc.nextLine();
		sp4.setMaSP(maSP4);
		System.out.println(" - Nhập tên sản phẩm: ");
		String tenSP4 = sc.nextLine();
		sp4.setTenSP(tenSP4);
		System.out.println(" - Nhập loại sản phẩm: ");
		String loaiSP4 = sc.nextLine();
		sp4.setLoaiSP(loaiSP4);
		System.out.println(" - Nhập giá sản phẩm: ");
		int giaSP4 = sc.nextInt();
		sp4.setGiaSP(giaSP4);
		
		ArrayList<SanPham> ds = new ArrayList<SanPham>();
		ds.add(sp1);
		ds.add(sp2);
		ds.add(sp3);
		ds.add(sp4);
		for(SanPham sp : ds) {
			System.out.println(sp.toString());
		}
		
		System.out.println("Danh sách các sản phẩm thuộc loại Thực phẩm chức năng: ");
		for (int i = 0; i < ds.size(); i++) {
			if (ds.get(i).getLoaiSP().equals("Thực phẩm chức năng"))
				System.out.println(ds.get(i).toString());
		}
		
	}

}
