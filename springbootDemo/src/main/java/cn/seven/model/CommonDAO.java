package cn.seven.model;

import java.io.Serializable;

/**
 * ClassName:    CommonDAO
 * Package:    cn.seven.model
 * Description: 公共的DAO类
 * Datetime:    2020/5/26   8:36
 *
 * @Author: charon
 */
public class CommonDAO implements Serializable {

    /**序列化标识*/
    private static final long serialVersionUID = 3400041763655982976L;

    /**主键id*/
    private String id;

    /**乐观锁版本号*/
    private int optimisticLockVersion;

    /**
     * @return the value of id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the id
     *
     * @param id id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the value of optimisticLockVersion
     */
    public int getOptimisticLockVersion() {
        return optimisticLockVersion;
    }

    /**
     * Sets the optimisticLockVersion
     *
     * @param optimisticLockVersion optimisticLockVersion
     */
    public void setOptimisticLockVersion(int optimisticLockVersion) {
        this.optimisticLockVersion = optimisticLockVersion;
    }

    @Override
    public String toString() {
        return "CommonDAO{" +
                "id='" + id + '\'' +
                ", optimisticLockVersion=" + optimisticLockVersion +
                '}';
    }

}
