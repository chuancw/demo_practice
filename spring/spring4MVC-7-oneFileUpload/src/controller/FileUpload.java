package controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils; //这里需要加载一个jar包
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
public class FileUpload {
      @RequestMapping("/oneFileUpload")
      public void oneFileUpload(MultipartHttpServletRequest request,HttpServletResponse response){
    	  try{
    		  System.out.println("username="+request.getParameter("username"));
    		  MultipartFile file=request.getFile("uploadFile");
    		  String uploadFileName=file.getOriginalFilename();
    		  
    		  InputStream i=file.getInputStream();
    		  
    		  String dir=request.getSession().getServletContext().getRealPath("/upload");
    		  
    		  File f=new File(dir,uploadFileName);
    		  FileOutputStream o=new FileOutputStream(f);
    		  IOUtils.copy(i,o);
    	  }
    	  catch(Exception e){
    		e.printStackTrace();  
    	  }
      }
}
