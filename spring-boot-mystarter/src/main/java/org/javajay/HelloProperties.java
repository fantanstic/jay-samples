package org.javajay;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author jiajie
 * @date 2019-09-25 11:44
 */

@ConfigurationProperties(prefix = "javajay")
public class HelloProperties {
    private static final String DEFAULT_NAME = "大漠孤烟直";
    private static final String DEFAULT_MSG = "杏花牧童";
    private String name = DEFAULT_NAME;
    private String msg = DEFAULT_MSG;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
}
