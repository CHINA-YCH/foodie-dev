package com.imooc.service;

import com.imooc.pojo.Stu;

/**
 * @author :Administrator
 * @path :StuService
 * @date :2023-06-11 17:27:07
 * @describe :interface
 */
public interface StuService {
    /**
     * -
     *
     * @param id -
     * @return -
     */
    Stu getStuInfo(int id);

    /**
     * -
     */
    void saveStu();

    /**
     * -
     *
     * @param id -
     */
    void updateStu(int id);

    /**
     * -
     *
     * @param id -
     */
    void deleteStu(int id);
}
