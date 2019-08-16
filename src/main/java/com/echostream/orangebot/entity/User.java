package com.echostream.orangebot.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value="telegram 用户实体")
@Data
public class User {
    @ApiModelProperty(value="null")
    private Integer id;

    @ApiModelProperty(value="telegram 用户 id")
    private String userId;

    @ApiModelProperty(value="是否是机器人")
    private Boolean isBot;

    @ApiModelProperty(value="用户名字")
    private String firstName;

    @ApiModelProperty(value="用户姓氏")
    private String lastName;

    @ApiModelProperty(value="用户名称，可为空")
    private String username;

    @ApiModelProperty(value="用户IETF语言标签")
    private String languageCode;

    @ApiModelProperty(value="null")
    private Date sysCreateTime;

    @ApiModelProperty(value="null")
    private Date sysUpdateTime;
}