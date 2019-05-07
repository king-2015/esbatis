package com.xiaoya.infra.esbatis.annotations;

import java.lang.annotation.*;

/**
 * @Description:
 * @Author: zhuzhongji
 * @Date: 2019/5/7 18:30
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
public @interface Param {
    String value();
}
