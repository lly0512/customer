package net.marssky.accountsvc.controller;

import net.marssky.accountsvc.config.MyConfig;
import net.marssky.accountsvc.dto.AccountDto;
import net.marssky.accountsvc.model.User;
import net.marssky.accountsvc.service.AccountService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/account")
public class AccountController {

    Log log = LogFactory.getLog(AccountController.class);

    @Autowired
    AccountService accountService;

    @Autowired
    Environment enviroment;

    @Value("${message}")
    private String msg;

    @Autowired
    MyConfig myConfig;

    @RequestMapping("/create")
    public String CreateAccount(@RequestBody AccountDto accountDto){

        log.info(enviroment.getProperty("message"));
        log.info(msg);

        log.info(myConfig.getMessage());
        log.info(myConfig.getName());

        log.info("调用账户服务模块的createAccount方法来注册");
        log.info(accountDto.getEmail());

        log.debug("查询");
        List<User> list = this.accountService.getUser();
        System.out.println(list);
        return "success";
    }

    @RequestMapping("/get_accounts")
    public List<User> CreateAccount(){
        System.out.println("查询");
        List<User> list = this.accountService.getUser();
        System.out.println(list);
        return list;
    }
}
