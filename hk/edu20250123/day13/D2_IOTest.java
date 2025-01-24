package hk.edu20250123.day13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class D2_IOTest {

	public static void main(String[] args) {
		
	}
	
	//파일을 읽고 출력하기
	public static void test01() {
		InputStream in =null;
		OutputStream out = null;
		
		try {
			in=new FileInputStream("C:\\Users\\hkedu\\ddd.txt");
			out=new OutputStream("C:\\Users\\hkedu\\outputHello.txt");
			
			int i=0; //byte단위로 읽어서 데어터를 저장할 변수
			while((i=in.read())!=-1) {
				System.out.println("");
				out.write(i);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			//스트림은 사용이 끝나면 반드시 종료해준다.
			//마지막에 사용한 것부터 닫는다.
			try {
				if(out!=null) {
					out.close();
				}
				if(in!=null) {
					in.close();
				}
				
				}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		
	}
	//한번에 읽을 때 크기를 
	
}

