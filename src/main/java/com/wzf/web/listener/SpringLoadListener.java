package com.wzf.web.listener;


//import org.apache.log4j.Logger;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;


/**
 * Created by bean on 2016/8/26.
 */
@Component("BeanDefineConfigueLoad")
public class SpringLoadListener implements ApplicationListener<ContextRefreshedEvent>
{
    private Logger logger = Logger.getLogger(this.getClass());

//    @Autowired
//    ActiveService activeService;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event)
    {
        if(event.getApplicationContext().getParent() == null)
        {//root application context 没有parent，他就是老大.
            logger.info("Spring start===================================");

//            if(!ServerConfig.isResource())
//            {
//
//
//            }

//            activeService.reduceUserActive();
        }


    }

}
