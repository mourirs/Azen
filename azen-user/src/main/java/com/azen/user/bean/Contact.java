package com.azen.user.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Alias("contact")
public class Contact {
    private Integer ctId;
    private String ctName;
    private String ctEmail;
    private String ctMessage;
}
