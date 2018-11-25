package cn.wj.bean;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-11-24
 */
public class SysRole {
    private String id;

    private String name;

    /**
     * 是否可用,1：可用，0不可用
     */
    private String available;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available == null ? null : available.trim();
    }
}