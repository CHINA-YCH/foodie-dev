package com.imooc.service;

import com.imooc.pojo.Stu;

/**
 * @author :Administrator
 * @path :StuService
 * @date :2023-06-11 17:27:07
 * @describe :interface
 */
public interface StuService {
    public Stu getStuInfo(int id);

    public void saveStu();

    public void updateStu(int id);

    public void deleteStu(int id);
}
