package com.xiaoya.infra.esbatis.parser.nodes;

import com.xiaoya.infra.esbatis.parser.DynamicContext;
import com.xiaoya.infra.esbatis.utils.MvelUtils;

/**
 * @Description:
 * @Author: zhuzhongji
 * @Date: 2019/5/7 18:32
 */
public class IfNode implements XmlNode {
    private final String test;
    private final XmlNode contents;

    public IfNode(XmlNode contents, String test) {
        this.test = test;
        this.contents = contents;
    }

    @Override
    public boolean apply(DynamicContext context) {
        if (MvelUtils.evalBoolean(test, context.getBindings())) {
            contents.apply(context);
            return true;
        }
        return false;
    }

}
