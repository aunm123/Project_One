package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Created by timhuo on 2017/2/21.
 */
public class BaseAction<T> extends ActionSupport implements ModelDriven<T> {

    private T model;

    public T getModel() {
        return model;
    }

    public BaseAction() {
        ParameterizedType genericSuperclass = (ParameterizedType) this.getClass().getGenericSuperclass();
        Type[] arguments = genericSuperclass.getActualTypeArguments();
        Class<T> type = (Class<T>) arguments[0];
        try {
            model = type.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
