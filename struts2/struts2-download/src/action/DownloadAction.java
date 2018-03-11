package action;

import java.io.InputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class DownloadAction extends ActionSupport {
	        private InputStream downloadFile;
             public void setDownloadFile(InputStream downloadFile) {
				this.downloadFile = downloadFile;
			}
			public InputStream getDownloadFile(){
            	   return ServletActionContext.getServletContext().getResourceAsStream("/upload/a.png");
            	   
             }
             public String execute() throws Exception{
            	  return super.execute();
             }
             
}
