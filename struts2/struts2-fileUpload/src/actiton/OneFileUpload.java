package actiton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class OneFileUpload extends ActionSupport{
        private File uploadOneFile;
        private String uploadOneFileContentType;
        private String uploadOneFileFileName;
        
	
      



		public File getUploadOneFile() {
			return uploadOneFile;
		}






		public void setUploadOneFile(File uploadOneFile) {
			this.uploadOneFile = uploadOneFile;
		}






		public String getUploadOneFileContentType() {
			return uploadOneFileContentType;
		}






		public void setUploadOneFileContentType(String uploadOneFileContentType) {
			this.uploadOneFileContentType = uploadOneFileContentType;
		}






		public String getUploadOneFileFileName() {
			return uploadOneFileFileName;
		}






		public void setUploadOneFileFileName(String uploadOneFileFileName) {
			this.uploadOneFileFileName = uploadOneFileFileName;
		}






		public String execute()  {
			try{
			 //文件输入流
			   InputStream is =new FileInputStream(uploadOneFile);
			 //设置文件上传目录
			   String path=ServletActionContext.getServletContext().getRealPath("/uploadOne");
			 //设置目标文件
			   File f=new File(path,this.getUploadOneFileFileName());
			  //创建一个输出流
			   OutputStream os=new FileOutputStream(f);
			   //设置缓存
			   byte[] buffer =new byte[1024];
			   int len=0;
			   while((len=is.read(buffer))>0){
				   os.write(buffer, 0, len);
				     
			   }
			   os.close();
			   is.close();
			}
			catch(FileNotFoundException e){
				System.out.println("没有找到文件");
			}
			catch(IOException e){
				System.out.println("读写错误");
			}
			   return "success";
			   
		}
        
}
