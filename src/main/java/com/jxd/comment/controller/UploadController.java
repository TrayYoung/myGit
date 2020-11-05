package com.jxd.comment.controller;

import com.jxd.comment.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.ClassUtils;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @ClassName UploadController
 * @Description My Java programs
 * @Author li Xuewei
 * @Date 2020/10/22
 * @Version 1.0
 */
@Controller
public class UploadController {

    @Autowired
    private IEmpService empService;

    //上传照片
    @RequestMapping(value = "/uploadFile",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String imageUpload(@RequestParam("file") MultipartFile file) throws IOException{

        //确定文件上传位置
        String path = ClassUtils.getDefaultClassLoader().getResource("").getPath()+"static/";

        System.out.println(path);
        //判断文件夹是否存在，不存在则创建新的
        File file_save = new File(path);
        if (!file_save.exists()){
            //创建目录
            file_save.mkdir();
        }
        //处理文件名，添加UUID，保证每个文件全局唯一
        String fname_old = file.getOriginalFilename();//获取源文件名
        //获取UUID,包含数字字母，全局唯一的32位字符串
        String uuid = java.util.UUID.randomUUID().toString();
        String fname_new = uuid + "_" + fname_old;
        System.out.println(uuid);

        //保存文件到服务器
        File file_final = new File(path,fname_new);
        file.transferTo(file_final);
        return fname_new;
    }
}
