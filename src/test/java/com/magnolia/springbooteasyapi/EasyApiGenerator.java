package com.magnolia.springbooteasyapi;


import org.junit.platform.engine.ConfigurationParameters;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 * 自动生成器
 */
@Transactional
@Rollback
public class EasyApiGenerator {

    public static void main(String[] args) {

    }

    /**
     * ------>根据Mybatis逆向工程创建，详细内容请参考Mybatis逆向工程配置
     * 根据数据库创建Model和Mapper
     * @throws IOException
     * @throws XMLParserException
     * @throws InvalidConfigurationException
     * @throws SQLException
     * @throws InterruptedException
     */
    public void createMapperAndModel()
            throws IOException, XMLParserException, InvalidConfigurationException, SQLException, InterruptedException {
        List<String> warnings = new LinkedList<>();
        boolean overWrite = true;
        File configFile = new File("generator.xml");
        ConfigurationParser configurationParser = new ConfigurationParser(warnings);
        Configuration configuration = configurationParser.parseConfiguration(configFile);
        DefaultShellCallback defaultShellCallback = new DefaultShellCallback(overWrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(configuration, defaultShellCallback, warnings);
        myBatisGenerator.generate(null);
    }

    



}
