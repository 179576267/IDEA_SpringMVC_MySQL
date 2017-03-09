package com.wzf.util;


import org.apache.log4j.Logger;

/**
 * Created by bean on 2016/9/28.
 */
public class ServerConfig {

    private static Logger logger = Logger.getLogger(ServerConfig.class);

    public final static String VER_PRODUCT = "PRODUCT";
    public final static String VER_TEST = "TEST";
    public final static String VER_DEV = "DEV";

    /**
     * 服务器开发版本
     */
    public static String applicationVersion;

    /**
     * 数字版本
     */
    public static String versionNumber;

    ////////////////////////////以下是用来给用户发欢迎消息的一些数据
    /** 系统ID */
    public static String SYSTEM_GUID;
    /** 系统昵称 */
    public static String SYSTEM_NAME;
    /** 系统头像 */
    public static String SYSTEM_ICON;
    /** 系统欢迎消息 */
    public static String SYSTEM_MSG;

    /**
     * 资源服务器路径
     */
    public static String RESOURCE_PATH;

    /**
     * 是否是资源服务器
     */
    public static boolean isResource;

    ///////////////////////////苹果推送参数　
    /** 苹果推送host */
    public static String APPLE_PUSH_HOST = "gateway.sandbox.push.apple.wzf";
    /** 苹果推送port */
    public static int APPLE_PUSH_PORT = 2195;
    /** 苹果推送证书 */
    public static String APPLE_PUSH_P12 = "/voipService.p12";
    /** 苹果推送证书密码 */
    public static String APPLE_PUSH_P12_PWD = "123456";

    ////////////////////////////////环信参数　
    // API_HTTP_SCHEMA
    public static String EASEMOB_API_HTTP_SCHEMA = "https";
    // API_SERVER_HOST
    public static String EASEMOB_API_SERVER_HOST = "a1.easemob.wzf";
    // APPKEY
    public static String EASEMOB_APPKEY = "douqu#yuepai";
//    public static String EASEMOB_APPKEY = "douqu#quyuedan";
    // APP_CLIENT_ID
    public static String EASEMOB_APP_CLIENT_ID = "YXA6IfxlQGU1EeaoqRdq6SEsrg";
//    public static String EASEMOB_APP_CLIENT_ID = "YXA64mimMJbNEeavWTGeMPybPg";
    // APP_CLIENT_SECRET
    public static String EASEMOB_APP_CLIENT_SECRET = "YXA6BdC30cWeI6A83FKAHvAOE1_rU_0";
//    public static String EASEMOB_APP_CLIENT_SECRET = "YXA6KcMuceZRL6zyZ_Zlo1WDOmQuVCE";
    // DEFAULT_PASSWORD
    public static String EASEMOB_DEFAULT_PASSWORD = "123456";
    /** USER_ROLE_APPADMIN value: appAdmin */
    public static String EASEMOB_USER_ROLE_APPADMIN = "appAdmin";

    ////////////////////////////////短信参数
    //短信签名
    public static String PHONE_MESSAGE_SIGNATURE = "";
    //短信URL
    public static String PHONE_MESSAGE_URL = "";

    /**
     * token过期时间
     */
    public static int TOKEN_EXPIRE_SECONDS = 3600;

    /**
     * 通话金额已分为单位
     * */
    public static int CALL_TAKE_NOTES_MONEY = 100;


    public static void init(){

        initConfig();

    }

    /**
     * 配置信息
     */
    private static void initConfig(){
        logger.info("服务器正在启动-----------");
    }

    /**
     * 是否是正式版本
     * @return
     */
    public static boolean isProduct(){
        return applicationVersion.equals(VER_PRODUCT);
    }

    public static boolean isDev(){
        return applicationVersion.equals(VER_DEV);
    }

    public static boolean isTest(){
        return applicationVersion.equals(VER_TEST);
    }

    /**
     * 是否资源服务器
     * @return
     */
    public static boolean isResource(){
        return isResource;
    }




}
