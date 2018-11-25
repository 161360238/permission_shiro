package cn.wj.bean;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-11-24
 */
public class SysUser {
    /**
     * Ö÷¼ü
     */
    private String id;

    /**
     * ÕËºÅ
     */
    private String usercode;

    /**
     * ÐÕÃû
     */
    private String username;

    /**
     * ÃÜÂë
     */
    private String password;

    /**
     * ÑÎ
     */
    private String salt;

    /**
     * ÕËºÅÊÇ·ñËø¶¨£¬1£ºËø¶¨£¬0Î´Ëø¶¨
     */
    private String locked;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUsercode() {
        return usercode;
    }

    public void setUsercode(String usercode) {
        this.usercode = usercode == null ? null : usercode.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public String getLocked() {
        return locked;
    }

    public void setLocked(String locked) {
        this.locked = locked == null ? null : locked.trim();
    }
}