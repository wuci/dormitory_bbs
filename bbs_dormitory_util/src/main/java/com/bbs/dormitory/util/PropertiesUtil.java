package com.bbs.dormitory.util;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {
    protected static final Logger LOGGER = Logger.getLogger(PropertiesUtil.class);

    public static String readParamValueByProperties(String paramName) {
        try {
            Properties properties = new Properties();
            // 使用ClassLoader加载properties配置文件生成对应的输入流
            InputStream in = PropertiesUtil.class.getClassLoader().getResourceAsStream("configure.properties");
            // 使用properties对象加载输入流
            properties.load(in);
            //获取key对应的value值
            return properties.getProperty(paramName);
        } catch (IOException e) {
            LOGGER.info("读取文件失败了,请检查文件路径是否存在", e);
            return "";
        }

    }
}
