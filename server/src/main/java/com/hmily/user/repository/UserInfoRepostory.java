package com.hmily.user.repository;

import com.hmily.user.dataobject.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserInfoRepostory extends JpaRepository<UserInfo, String> {

	UserInfo findByOpenid(String openid);
}
