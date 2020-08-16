package com.azen.user.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Alias("account")
public class Account {
    private Integer aId;
    private Integer uId;
    private String aBalance;
    private String aBankcard;
}
