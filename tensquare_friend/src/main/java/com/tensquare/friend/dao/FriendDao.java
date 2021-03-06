package com.tensquare.friend.dao;

import com.tensquare.friend.pojo.Friend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

/**
 * 交友数据访问层
 */
public interface FriendDao extends JpaRepository<Friend, String> {
    /**
     * 根据用户ID与被关注用户ID查询记录个数
     *
     * @param userid
     * @param friendid
     * @return
     */

    public Friend findByUseridAndFriendid(String userid, String friendid);

    /**
     * 更新为互相喜欢
     *
     * @param userid
     * @param friendid
     */
    @Modifying
    @Query(value = "update tb_friend SET islike=? where userid=? and friendid =?", nativeQuery = true)
    public void updateIsLike(String userid, String friendid, String islike);
}