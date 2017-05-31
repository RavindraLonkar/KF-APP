package com.org.utils;

public class Response {
    private String status;
    private String fileType;
    private Object data;
     
    public Response(){
         
    }
     
    public Response(String status, Object data,String fileType){
        this.status = status;
        this.data = data;
        this.fileType=fileType;
    }
 
    public String getStatus() {
        return status;
    }
 
    public void setStatus(String status) {
        this.status = status;
    }
 
    public Object getData() {
        return data;
    }
 
    public void setData(Object data) {
        this.data = data;
    }

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
    
}
