package com.sailing.bdip.metadata.service;

import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserInfoServiceImplTest {

//    @Autowired
//    private IUserInfoService userInfoService;
//
//    @Test
//    public void findUserInfoList() {
//        List<UserInfo> userInfoList = userInfoService.findUserInfoList();
//        System.out.println("userInfoList"+userInfoList);
//    }
//
//    @Test
//    public void insertUserInfo() throws Exception {
//        UserInfo userInfo = new UserInfo();
//        userInfo.setUserName("004");
//        userInfo.setBirth(new Date());
//        userInfo.setCreater("wanggang");
//        userInfo.setCreateTime(new Date());
//        userInfo.setCreater("lili");
//        userInfo.setUpdateTime(new Date());
//        Boolean reuslt =  userInfoService.insertUserInfo(userInfo);
//        System.out.println(reuslt);
//    }
//
//    @Test
//    public void updateUserInfo() {
//    }
//
//    @Test
//    public void deleteById() {
//    }
//
//    @Test
//    public void findByPage(){
//        int pageNo = 1; //显示第一页
//        int pageSize = 1; //每页显示条数
//        UserInfo userInfo = null;
//        PageInfo<UserInfo> page = userInfoService.findByPage(pageNo, pageSize, userInfo);
//
//        System.out.println(page.getList().size());
//    }
}