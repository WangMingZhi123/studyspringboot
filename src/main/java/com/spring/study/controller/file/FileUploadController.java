package com.spring.study.controller.file;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * 此方法的作用是上传文件
 * **/

@RestController
public class FileUploadController {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd/");

    @Value("${multipartUrl.path}")
    private String multipartUrl;

    @PostMapping("/upload")
    public String upload(MultipartFile uploadFile, HttpServletRequest request){
        String realPath = request.getSession().getServletContext().getRealPath("/uploadFile/");
        String format = sdf.format(new Date());
        File file = new File(multipartUrl + format);
        if(!file.isDirectory()){
            file.mkdirs();  //如果父文件夹不存在并且最后一级子文件夹不存在，它就自动新建所有路经里写的文件夹；如果父文件夹存在，它就直接在已经存在的父文件夹下新建子文件夹
        }
        String oldName = uploadFile.getOriginalFilename();
        String newName = UUID.randomUUID().toString() + oldName.substring(oldName.lastIndexOf("."),oldName.length());   //为保存的文件重新定义名字
        try{
            uploadFile.transferTo(new File(file,newName));    //文件保存操作
            String filePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + "/uploadFile/" +format + newName;
            return filePath;
        }catch (IOException e){
            e.fillInStackTrace();
        }
        return "上传失败";
    }

    //多文件上传
    @RequestMapping("/uploads")
    public String uploads(MultipartFile[] multipartFiles,HttpServletRequest request) throws IllegalStateException, IOException {
        String format = sdf.format(new Date());
        File file = new File(multipartUrl + format); //创建文件路径

        if (!file.isDirectory()){
            file.mkdirs();
        }

        for (MultipartFile multipartFile : multipartFiles){
            String oldName = multipartFile.getOriginalFilename();
            String newName = UUID.randomUUID().toString() + oldName.substring(oldName.lastIndexOf("."));

            multipartFile.transferTo(new File(file,newName));

            String filePath = file + newName;

            return filePath;
        }
        return "失败";

    }
}
