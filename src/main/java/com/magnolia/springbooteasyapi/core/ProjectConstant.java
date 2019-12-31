package com.magnolia.springbooteasyapi.core;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 范昊
 * 项目中所用到的常量单位
 */
public final class ProjectConstant {

    /**
     *  项目基础包名
     */
    public static final String PACKAGE_URL = "com.magnolia.springbooteasyapi";

    /**
     * 实体类生成的包
     */
    public static final String MODEL_PACKAGE = PACKAGE_URL + ".model";
    /**
     * Service生成的包
     */
    public static final String SERVICE_PACKAGE = PACKAGE_URL + ".service";
    /**
     * Mapper生成的包
     */
    public static final String MAPPER_PACKAGE = PACKAGE_URL + ".mapper";
    /**
     * Controller生成的包
     */
    public static final String CONTROLLER_PACKAGE = PACKAGE_URL + ".controller";

    public static final String TEMPLATE_FILE_PATH = PACKAGE_URL+"";

    //>>>>>>>>>>>>>----------------------------------------------------------------------

    /**
     * @author作者信息
     */
    public static final String AUTHOR = "fanhao";
    /**
     * 日期
     */
    public static final String DATE = new SimpleDateFormat("yyyy/MM/dd").format(new Date());



}
