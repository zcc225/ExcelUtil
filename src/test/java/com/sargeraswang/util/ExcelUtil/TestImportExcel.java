/**
 * @author SargerasWang
 */
package com.sargeraswang.util.ExcelUtil;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * 测试导入Excel 97/2003
 */
public class TestImportExcel {
	
	public static void main(String[] args) {
		boolean flag  = true;
		int i= 0;
		while(flag){
			i++;
			System.out.println(i);
			if(i>3){
				flag = false;
			}
		}
		i = 0;
	}

  @Test
  public void importXls() throws FileNotFoundException {
	  ArrayList<String> arrayList = new ArrayList<String>();
	  ArrayList<String> end = new ArrayList<String>();
	  arrayList.add("数据文件");
//	  arrayList.add("30000-40000");
//	  arrayList.add("50000-70000");
//	  arrayList.add("70000-90000");
//	  arrayList.add("90000-110000");
//	  arrayList.add("110000-130000");
//	  arrayList.add("130000-150000");
//	  arrayList.add("150000-180000");
//	  arrayList.add("180000-210000");
//	  arrayList.add("210000-230000");
//	  arrayList.add("240000-270000");
	  for (String string : arrayList) {
		
		  extracted(string);
//		  end.add(string);
	  }
	  for (String string : end) {
		System.out.println(string);
	}
//    File f=new File("src/test/resources/test.xls");
  }

private void extracted(String s) throws FileNotFoundException {
	File f=new File("F:\\dataonline\\1.xls");
	  InputStream inputStream= new FileInputStream(f);
    
    ExcelLogs logs =new ExcelLogs();
    Collection<Map> importExcel = ExcelUtil.importExcel(Map.class, inputStream, "yyyy/MM/dd HH:mm:ss", logs , 0);
    
    for(Map m : importExcel){
      System.out.println(m);
    }
}

  @Test
  public void importXlsx() throws FileNotFoundException {
//    File f=new File("src/test/resources/test.xlsx");
	  File f=new File("F:\\dataonline\\1.xlsx");
    InputStream inputStream= new FileInputStream(f);

    ExcelLogs logs =new ExcelLogs();
    Collection<Map> importExcel = ExcelUtil.importExcel(Map.class, inputStream, "yyyy/MM/dd HH:mm:ss", logs , 0);

    for(Map m : importExcel){
      System.out.println(m);
    }
  }

}
