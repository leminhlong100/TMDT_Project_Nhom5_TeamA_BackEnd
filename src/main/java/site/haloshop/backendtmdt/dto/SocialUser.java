package site.haloshop.backendtmdt.dto;

import java.time.LocalDateTime;
import java.util.Date;

public class SocialUser {

    private Long id;


    private String accountName;


    private String password;


    private String fullName;


    private String address;


    private String email;


    private String phone;


    private String isDelete;


    private String isActive;

    private String image;

    private Date create_at;
    private Integer type;

    private String idOther;


    private String currentPassword;

    public Date getCreate_at() {
        return create_at;
    }

    public void setCreate_at(Date create_at) {
        this.create_at = create_at;
    }

    private Date timestamp;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getIdOther() {
        return idOther;
    }

    public void setIdOther(String idOther) {
        this.idOther = idOther;
    }

    public String getCurrentPassword() {
        return currentPassword;
    }

    public void setCurrentPassword(String currentPassword) {
        this.currentPassword = currentPassword;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public SocialUser(String accountName, String fullName, String password, String email, String image, String idOther, Date create_At, Integer type) {
        this.accountName = accountName;
        this.fullName = fullName;
        this.password = password;
        this.email = email;
        this.image = image;
        this.idOther = idOther;
        this.create_at = create_At;
        this.type =type;
    }
}
