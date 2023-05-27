package com.example.myweb.entity;

//从hdfs中返回可能是文件，也可能是目录，这个类就是用来和HDFS中的 FileStatus对应的（从hdfs中返回的是FileStatus类型，HDFSObject类型用来把FileStatus转化为HDFSObject）
public class HDFSObject {
    private String path;
    private String name;
    private boolean directory;
    private String username;

    private  Long capacity;

    private Long remaining;

    private Long used;

    public Long getCapacity() {
        return capacity;
    }

    public void setCapacity(Long capacity) {
        this.capacity = capacity;
    }

    public Long getRemaining() {
        return remaining;
    }

    public void setRemaining(Long remaining) {
        this.remaining = remaining;
    }

    public Long getUsed() {
        return used;
    }

    public void setUsed(Long used) {
        this.used = used;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPath() {
        return path;
    }

    public void setDirectory(boolean directory) {
        this.directory = directory;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDirectory() {
        return directory;
    }

    public void setIsdirectory(boolean isdirectory) {
        this.directory = isdirectory;
    }

    public String getAccessTime() {
        return accessTime;
    }

    public void setAccessTime(String accessTime) {
        this.accessTime = accessTime;
    }

    public long getLen() {
        return len;
    }

    public void setLen(long len) {
        this.len = len;
    }

    private String accessTime;
    private long len;
}
