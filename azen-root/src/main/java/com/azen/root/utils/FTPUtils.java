package com.azen.root.utils;
 
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
 
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;
 
/**
 * FTP服务器工具类
 * 
 */
public class FTPUtils {
	
	/**
	 * 上传文件至FTP服务器
	 * 
	 * @param url
	 * 		服务器IP地址
	 * @param port
	 * 		服务器端口
	 * @param userName
	 * 		用户登录名
	 * @param password
	 * 		用户登录密码
	 * @param storePath
	 * 		服务器文件存储路径
	 * @param fileName
	 * 		服务器文件存储名称
	 * @param is
	 * 		文件输入流
	 * @return
	 * 		<b>true</b>：上传成功
	 * 		<br/>
	 * 		<b>false</b>：上传失败
	 */
	public static boolean storeFile (String url, int port, String userName, String password, String storePath, String fileName, InputStream is) {
		boolean result = false;
		FTPClient ftp = new FTPClient();
		try {
			// 连接至服务器，端口默认为21时，可直接通过URL连接
			ftp.connect(url ,port);
			// 登录服务器
			ftp.login(userName, password);
			// 判断返回码是否合法
			if (!FTPReply.isPositiveCompletion(ftp.getReplyCode())) {
				// 不合法时断开连接
				ftp.disconnect();
				// 结束程序
				return result;
			}
			// 判断ftp目录是否存在，如果不存在则创建目录，包括创建多级目录
			String s = "/"+storePath;
			String[] dirs = s.split("/");
			ftp.changeWorkingDirectory("/");			
	            //按顺序检查目录是否存在，不存在则创建目录  
	            for(int i=1; dirs!=null&&i<dirs.length; i++) {  
	                if(!ftp.changeWorkingDirectory(dirs[i])) {  
	                    if(ftp.makeDirectory(dirs[i])) {  
	                        if(!ftp.changeWorkingDirectory(dirs[i])) {  
	                            return false;  
	                        }  
	                    }else {  
	                        return false;                         
	                    }  
	                }  
	            }  
			// 设置文件操作目录
			ftp.changeWorkingDirectory(storePath);
			// 设置文件类型，二进制
			ftp.setFileType(FTPClient.BINARY_FILE_TYPE);
			// 设置缓冲区大小
			ftp.setBufferSize(3072);
			// 上传文件
			result = ftp.storeFile(fileName, is);
			// 关闭输入流
			is.close();
			// 登出服务器
			ftp.logout();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 判断输入流是否存在
				if (null != is) {
					// 关闭输入流
					is.close();
				}
				// 判断连接是否存在
				if (ftp.isConnected()) {
					// 断开连接
					ftp.disconnect();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
}