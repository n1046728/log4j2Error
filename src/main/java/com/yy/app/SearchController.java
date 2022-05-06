package com.yy.app;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: 24只羊羊羊
 * @Date: 2021-12-12
 * @Description:
 */

// 由于Log4j2组件在处理程序日志记录时存在JNDI注入缺陷，
// 未经授权的攻击者利用该漏洞，可向目标服务器发送精心构造的恶意数据，触发Log4j2组件解析缺陷，实现目标服务器的任意代码执行，获得目标服务器权限。

@RestController
@RequestMapping("/api")
public class SearchController {
    private static final Logger logger = LogManager.getLogger(SearchController.class);

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String search(@RequestBody String keyWord) {
        logger.info("search requestParam:{}", keyWord);
        // 搜索逻辑
        return "返回成功";
    }

}
