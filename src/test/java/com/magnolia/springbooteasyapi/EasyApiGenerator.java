package com.magnolia.springbooteasyapi;


import com.magnolia.springbooteasyapi.core.ProjectConstant;
import freemarker.template.TemplateExceptionHandler;
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
import java.util.Locale;

/**
 * 自动生成器
 * 如果异常自动回滚
 */
@Transactional(rollbackFor = Exception.class)
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
    public static void createMapperAndModel()
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

    /**
     * 创建Service
     */
    public static void createService() throws Exception {

    }

    /**
     * 创建controller
     */
    public static void createController() throws Exception {

    }

    /***
     * 获取Freemarker的模板Configuration
     * @return
     * @throws IOException
     */
    public freemarker.template.Configuration getConfiguration() throws IOException {
        freemarker.template.Configuration configuration =
                new freemarker.template.Configuration(freemarker.template.Configuration.VERSION_2_3_0);
        configuration.setDirectoryForTemplateLoading(new File(ProjectConstant.TEMPLATE_FILE_PATH));
        configuration.setEncoding(Locale.CHINA, "UTF-8");
        configuration.setTemplateExceptionHandler(TemplateExceptionHandler.IGNORE_HANDLER);
        return configuration;
    }



}
