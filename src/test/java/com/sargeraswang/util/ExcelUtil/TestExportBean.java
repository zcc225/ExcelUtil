package com.sargeraswang.util.ExcelUtil;

import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.*;

public class TestExportBean {
    @Test
    public void exportXls() throws IOException {
        //用排序的Map且Map的键应与ExcelCell注解的index对应
        Map<String,String> map = new LinkedHashMap<>();
        map.put("a","姓名");
        map.put("b","年龄");
        map.put("c","性别");
        map.put("d","出生日期");
        Collection<Object> dataset=new ArrayList<Object>();
        dataset.add(new Model("", "", "",null));
        dataset.add(new Model(null, null, null,null));
        dataset.add(new Model("王五", "34", "男",new Date()));
        File f=new File("test.xls");
        OutputStream out =new FileOutputStream(f);
        
        ExcelUtil.exportExcel(map, dataset, out);
        out.close();
    }
    
    class Model{
    	String name;
    	String age;
    	String aa;
    	Date time;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAge() {
			return age;
		}
		public void setAge(String age) {
			this.age = age;
		}
		public String getAa() {
			return aa;
		}
		public void setAa(String aa) {
			this.aa = aa;
		}
		public Date getTime() {
			return time;
		}
		public void setTime(Date time) {
			this.time = time;
		}
		public Model(String name, String age, String aa, Date time) {
			super();
			this.name = name;
			this.age = age;
			this.aa = aa;
			this.time = time;
		}
    	
    }
}
