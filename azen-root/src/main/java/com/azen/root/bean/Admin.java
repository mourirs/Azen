package com.azen.root.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Alias("admin")
public class Admin {
    private Integer adId;
    private String adAcct;
    private String adName;
    private String adPawd;
    private String adEmail;
    private String adTime;
}
