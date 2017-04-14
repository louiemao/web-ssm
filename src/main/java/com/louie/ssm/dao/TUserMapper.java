package com.louie.ssm.dao;

import com.louie.ssm.model.TUser;
import com.louie.ssm.model.TUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface TUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_USER
     *
     * @mbg.generated
     */
    long countByExample(TUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_USER
     *
     * @mbg.generated
     */
    int deleteByExample(TUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_USER
     *
     * @mbg.generated
     */
    @Delete({
        "delete from T_USER",
        "where ID = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_USER
     *
     * @mbg.generated
     */
    @Insert({
        "insert into T_USER (ID, USER_NAME, ",
        "USER_PHONE, USER_EMAIL, ",
        "USER_PWD, PWD_SALT, ",
        "CREATE_TIME, MODIFY_TIME, ",
        "IS_DELETE)",
        "values (#{id,jdbcType=BIGINT}, #{userName,jdbcType=VARCHAR}, ",
        "#{userPhone,jdbcType=VARCHAR}, #{userEmail,jdbcType=VARCHAR}, ",
        "#{userPwd,jdbcType=VARCHAR}, #{pwdSalt,jdbcType=VARCHAR}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{modifyTime,jdbcType=TIMESTAMP}, ",
        "#{isDelete,jdbcType=TINYINT})"
    })
    int insert(TUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_USER
     *
     * @mbg.generated
     */
    int insertSelective(TUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_USER
     *
     * @mbg.generated
     */
    List<TUser> selectByExample(TUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_USER
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "ID, USER_NAME, USER_PHONE, USER_EMAIL, USER_PWD, PWD_SALT, CREATE_TIME, MODIFY_TIME, ",
        "IS_DELETE",
        "from T_USER",
        "where ID = #{id,jdbcType=BIGINT}"
    })
    @ResultMap("com.louie.ssm.dao.TUserMapper.BaseResultMap")
    TUser selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_USER
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TUser record, @Param("example") TUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_USER
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TUser record, @Param("example") TUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_USER
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_USER
     *
     * @mbg.generated
     */
    @Update({
        "update T_USER",
        "set USER_NAME = #{userName,jdbcType=VARCHAR},",
          "USER_PHONE = #{userPhone,jdbcType=VARCHAR},",
          "USER_EMAIL = #{userEmail,jdbcType=VARCHAR},",
          "USER_PWD = #{userPwd,jdbcType=VARCHAR},",
          "PWD_SALT = #{pwdSalt,jdbcType=VARCHAR},",
          "CREATE_TIME = #{createTime,jdbcType=TIMESTAMP},",
          "MODIFY_TIME = #{modifyTime,jdbcType=TIMESTAMP},",
          "IS_DELETE = #{isDelete,jdbcType=TINYINT}",
        "where ID = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TUser record);
}