package com.action;

import domain.User;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 * Created by timhuo on 2017/2/21.
 */
@Controller("userAction")
@Scope("prototype")
public class UserAction extends BaseAction<User> {
    public String test(){
        return SUCCESS;
    }
}
