package com.zh.test;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.model.AccessControlList;
import com.aliyun.oss.model.CannedAccessControlList;
import org.junit.Test;


public class OSSTest {

    // Endpoint以杭州为例，其它Region请按实际情况填写。
    String endpoint = "oss-cn-beijing.aliyuncs.com";   //华北2（北京的写法）
    // 阿里云主账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM账号进行API访问或日常运维，请登录RAM控制台创建RAM账号。
    String accessKeyId = "LTAI5tDEBi8uzT6tuxVzHkP7";
    String accessKeySecret = "icSDxG8ZJb8B15pA1FuotkrFk26Nz5";
    String bucketName = "zhouhui-srb";

    @Test
    public void testCreateBucket(){

        // 创建OSSClient实例。
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
        // 创建存储空间。
        ossClient.createBucket(bucketName);
        // 关闭OSSClient。
        ossClient.shutdown();
    }


    @Test
    public void testGetBucketAcl(){
        // 创建OSSClient实例。
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

        // 获取存储空间的访问权限。
        AccessControlList acl = ossClient.getBucketAcl(bucketName);
        System.out.println(acl.toString());

        // 关闭OSSClient。
        ossClient.shutdown();
    }

    @Test
    public void testSetBucketAcl(){
        // 创建OSSClient实例。
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

        // 设置存储空间的访问权限为私有。
        ossClient.setBucketAcl(bucketName, CannedAccessControlList.PublicRead);

        // 关闭OSSClient。
        ossClient.shutdown();
    }

    @Test
    public void testDoesBucketExist(){

        // 创建OSSClient实例。
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

        // 判断存储空间examplebucket是否存在。如果返回值为true，则存储空间存在，否则存储空间不存在。
        boolean exists = ossClient.doesBucketExist("test");
        System.out.println(exists);

        // 关闭OSSClient。
        ossClient.shutdown();
    }
}
