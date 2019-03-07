package com.example.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.List;

@Controller
public class FileUploadController {

    @RequestMapping("/upload")
    public String upload(){
        return "/fileupload";
    }

    @RequestMapping("/uploadBatch")
    public String uploadBatch(){
        return "/multifFileUpload";
    }

    @ResponseBody
    @RequestMapping(value = "/uploadFile",method = RequestMethod.POST)
    public String upload(@RequestParam("file")MultipartFile file ) throws IOException {

        if(file!=null && !file.isEmpty()){
            BufferedOutputStream out = new BufferedOutputStream(
                    new FileOutputStream(new File(file.getOriginalFilename())));
            out.write(file.getBytes());
            out.flush();
            out.close();
        }

        return "upload success";
    }

    @ResponseBody
    @RequestMapping(value = "/uploadBatchFile", method = RequestMethod.POST)
    public String uploadBatchFile(HttpServletRequest request) throws IOException {

        List<MultipartFile> file = ((MultipartHttpServletRequest)request).getFiles("file");
        for (MultipartFile multipartFile: file) {
            if(file!=null && !file.isEmpty()){
                BufferedOutputStream out = new BufferedOutputStream(
                        new FileOutputStream(new File(multipartFile.getOriginalFilename())));
                out.write(multipartFile.getBytes());
                out.flush();
                out.close();
            }
        }
        return  "upload success";
    }
}
