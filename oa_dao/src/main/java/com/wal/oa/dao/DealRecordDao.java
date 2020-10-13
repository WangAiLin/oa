package com.wal.oa.dao;

import com.wal.oa.entity.DealRecord;
import com.wal.oa.entity.Department;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("dealRecordDao")
public interface DealRecordDao {

    void insert(DealRecord dealRecord);

    List<DealRecord> selectByClaimVoucher(int cvid);
}
