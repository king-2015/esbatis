package com.xiaoya.infra.esbatis.parser.nodes;

import com.xiaoya.infra.esbatis.parser.DynamicContext;

/**
 * @Description:
 * @Author: zhuzhongji
 * @Date: 2019/5/7 18:33
 */
public interface XmlNode {

    boolean apply(DynamicContext context);
}
