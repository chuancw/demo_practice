package orm;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import orm.MybatisGeneratorjavaUserinfo;
import orm.MybatisGeneratorjavaUserinfoExample;

public interface MybatisGeneratorjavaUserinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCOTT.MYBATIS_GENERATORJAVA_USERINFO
     *
     * @mbggenerated Tue May 17 16:48:30 CST 2016
     */
    int countByExample(MybatisGeneratorjavaUserinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCOTT.MYBATIS_GENERATORJAVA_USERINFO
     *
     * @mbggenerated Tue May 17 16:48:30 CST 2016
     */
    int deleteByExample(MybatisGeneratorjavaUserinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCOTT.MYBATIS_GENERATORJAVA_USERINFO
     *
     * @mbggenerated Tue May 17 16:48:30 CST 2016
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCOTT.MYBATIS_GENERATORJAVA_USERINFO
     *
     * @mbggenerated Tue May 17 16:48:30 CST 2016
     */
    int insert(MybatisGeneratorjavaUserinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCOTT.MYBATIS_GENERATORJAVA_USERINFO
     *
     * @mbggenerated Tue May 17 16:48:30 CST 2016
     */
    int insertSelective(MybatisGeneratorjavaUserinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCOTT.MYBATIS_GENERATORJAVA_USERINFO
     *
     * @mbggenerated Tue May 17 16:48:30 CST 2016
     */
    List<MybatisGeneratorjavaUserinfo> selectByExample(MybatisGeneratorjavaUserinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCOTT.MYBATIS_GENERATORJAVA_USERINFO
     *
     * @mbggenerated Tue May 17 16:48:30 CST 2016
     */
    MybatisGeneratorjavaUserinfo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCOTT.MYBATIS_GENERATORJAVA_USERINFO
     *
     * @mbggenerated Tue May 17 16:48:30 CST 2016
     */
    int updateByExampleSelective(@Param("record") MybatisGeneratorjavaUserinfo record, @Param("example") MybatisGeneratorjavaUserinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCOTT.MYBATIS_GENERATORJAVA_USERINFO
     *
     * @mbggenerated Tue May 17 16:48:30 CST 2016
     */
    int updateByExample(@Param("record") MybatisGeneratorjavaUserinfo record, @Param("example") MybatisGeneratorjavaUserinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCOTT.MYBATIS_GENERATORJAVA_USERINFO
     *
     * @mbggenerated Tue May 17 16:48:30 CST 2016
     */
    int updateByPrimaryKeySelective(MybatisGeneratorjavaUserinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCOTT.MYBATIS_GENERATORJAVA_USERINFO
     *
     * @mbggenerated Tue May 17 16:48:30 CST 2016
     */
    int updateByPrimaryKey(MybatisGeneratorjavaUserinfo record);
}