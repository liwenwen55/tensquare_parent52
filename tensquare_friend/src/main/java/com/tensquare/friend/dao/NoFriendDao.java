package com.tensquare.friend.dao;


import com.tensquare.friend.pojo.NoFriend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

/**
 * 交友数据访问层
 */
public interface NoFriendDao extends JpaRepository<NoFriend, String> {
    /**
     * 根据用户ID与被关注用户ID查询记录个数
     *
     * @param userid
     * @param friendid
     * @return
     */

    public NoFriend findByUseridAndFriendid(String userid, String friendid);
}