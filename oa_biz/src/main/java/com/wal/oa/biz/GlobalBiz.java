package com.wal.oa.biz;

import com.wal.oa.entity.Employee;

public interface GlobalBiz {
    Employee login(String sn, String password);

    void changPassword(Employee employee);
}
