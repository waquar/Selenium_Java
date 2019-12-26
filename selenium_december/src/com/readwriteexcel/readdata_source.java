package com.readwriteexcel;

public class readdata_source extends Xls_Reader{


	public readdata_source(String path) {
		super(path);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "D:\\selenium_java\\Excel Files\\readdata.xlsx";
		Xls_Reader read = new Xls_Reader(path);
		try {
			read.isSheetExist("0");
		}catch(Exception e){
			System.out.println("gfhgfh");
		}
		
		
	}

}
