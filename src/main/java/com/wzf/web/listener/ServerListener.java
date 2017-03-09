package com.wzf.web.listener;

import com.wzf.util.ServerConfig;
import org.apache.log4j.Logger;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

//import wzf.yuepai.job.JobManager;

/**
* Created by bean on 2016/8/26.
*/
public class ServerListener implements ServletContextListener
{
    private Logger logger = Logger.getLogger(this.getClass());



    @Override
    public void contextInitialized(ServletContextEvent sce)
    {
//        String ver = sce.getServletContext().getInitParameter("spring.profiles.active");
//        ServerConfig.applicationVersion = ver.toUpperCase();
        logger.info("服务器开发版本-----------【" + ServerConfig.applicationVersion + "】");

        logger.info("=======contextInitialized success========自定义监听，加载配置信息========================");
        ServerConfig.init();
        logger.info("=======contextInitialized success========自定义监听，加载配置信息结束========================");

//        if(!ver.toUpperCase().equals(ServerConfig.applicationVersion.toUpperCase())){
//            try {
//                throw new Exception("版本配置错误");
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }


        //logger.info("Start JobManager========START===============================!");
//        JobManager.getInstance().runJob();
        //logger.info("Start JobManager=======END================================!");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce)
    {
        logger.info("Close Server....============================.");

//        if(!ServerConfig.isResource()) {
//            JobManager.getInstance().getService().shutdown();
//        }

    }
}
