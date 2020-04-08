package com.flash.common.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.flash.common.utils.AddressUtils;
import lombok.Data;

import java.util.Date;

/**
 * 当前在线会话 sys_user_online
 *
 * @author ruoyi
 */
@Data
public class SysUserOnline extends BaseEntity {
    /**
     * 用户会话id
     */
    @TableId
    private String sessionId;

    /**
     * 部门名称
     */
    private String deptName;

    /**
     * 登录名称
     */
    private String loginName;

    /**
     * 登录IP地址
     */
    private String ipaddr;

    /**
     * 登录地址
     */
    private String longinLocation;

    /**
     * 浏览器类型
     */
    private String browser;

    /**
     * 操作系统
     */
    private String os;

    /**
     * session创建时间
     */
    private Date startTimestamp;

    /**
     * session最后访问时间
     */
    private Date lastAccessTime;

    /**
     * 超时时间，单位为分钟
     */
    private Long expireTime;

    /**
     * 在线状态
     */
    private OnlineSession.OnlineStatus status = OnlineSession.OnlineStatus.on_line;

    /**
     * 备份的当前用户会话
     */
    @TableField(exist = false)
    private OnlineSession session;

    /**
     * 设置session对象
     */
    public static final SysUserOnline fromOnlineSession(OnlineSession session) {
        SysUserOnline online = new SysUserOnline();
        online.setSessionId(String.valueOf(session.getId()));
        online.setDeptName(session.getDeptName());
        online.setLoginName(session.getLoginName());
        online.setStartTimestamp(session.getStartTimestamp());
        online.setLastAccessTime(session.getLastAccessTime());
        online.setExpireTime(session.getTimeout());
        online.setIpaddr(session.getHost());
        online.setLonginLocation(AddressUtils.getRealAddressByIP(session.getHost()));
        online.setBrowser(session.getBrowser());
        online.setOs(session.getOs());
        online.setStatus(session.getStatus());
        online.setSession(session);
        return online;
    }


    @Override
    public String toString() {
        return "UserOnline [sessionId=" + sessionId + ", deptName=" + deptName + ", loginName=" + loginName
                + ", ipaddr=" + ipaddr + ", browser=" + browser + ", os=" + os + ", startTimestamp=" + startTimestamp
                + ", lastAccessTime=" + lastAccessTime + ", expireTime=" + expireTime + ", status=" + status
                + ", session=" + session + "]";
    }

}
