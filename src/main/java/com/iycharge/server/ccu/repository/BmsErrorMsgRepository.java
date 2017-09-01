package com.iycharge.server.ccu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iycharge.server.ccu.msg.entity.BmsErrorMsg;

/**
 * BMS错误报文DAO接口
 * @author bwang
 */
@Repository
public interface BmsErrorMsgRepository extends JpaRepository<BmsErrorMsg, Long> {

}
