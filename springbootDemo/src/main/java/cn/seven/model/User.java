package cn.seven.model;

/**
 * ClassName:    User
 * Package:    cn.seven.controller
 * Description:
 * Datetime:    2020/5/4   21:16
 *
 * @Author: charon
 */
public class User extends CommonDAO  {

    /**序列化标识*/
    private static final long serialVersionUID = -4756134008295525840L;

    /**用户名称*/
    private String username;

    /**真实姓名*/
    private String realName;

    /**性别*/
    private Integer sex;

    /**手机号*/
    private String mobile;

    /**邮箱*/
    private String email;

    /**备注*/
    private String note;

    /**密码*/
    private String password;

    /**
     * @return the value of username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the username
     *
     * @param username username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the value of realName
     */
    public String getRealName() {
        return realName;
    }

    /**
     * Sets the realName
     *
     * @param realName realName
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * @return the value of sex
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * Sets the sex
     *
     * @param sex sex
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * @return the value of mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * Sets the mobile
     *
     * @param mobile mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * @return the value of email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email
     *
     * @param email email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the value of note
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the note
     *
     * @param note note
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * @return the value of password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the password
     *
     * @param password password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", realName='" + realName + '\'' +
                ", sex=" + sex +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", note='" + note + '\'' +
                '}';
    }

}