package com.xiaoya.infra.esbatis.annotations;

import com.xiaoya.infra.esbatis.handler.ResultHandler;

import java.lang.annotation.*;

/**
 * @Description:
 * @Author: zhuzhongji
 * @Date: 2019/5/7 18:30
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Result {
    Class<? extends ResultHandler> value();
}
