package thigk2.votrangiahung;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		SanPham sp1 = new SanPham("A001", "Bút chì", "Thường", 5000);
		SanPham sp2 = new SanPham("A002", "Bút bi", "Thường", 8000);
		SanPham sp3 = new SanPham("A003", "Bút bi Arono", "Cao cấp", 22000);
		
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
		System.out.println(" - Nhập tên sản phẩm: ");
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
		
	}

}
