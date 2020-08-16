package com.azen.user.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Alias("car")
public class Car {
    private Integer cId;
    private Integer uId;
    private Integer coId;
    private Integer cNum;
    private Commodity commodity;
}
