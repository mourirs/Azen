package com.azen.user.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Alias("commodity")
public class Commodity {
    private Integer coId;
    private String coName;
    private Integer coPrice;
    private Integer coGrounding;
    private Integer coNum;
    private Integer cyId;
    private String coImage;

    public Commodity(Integer coId, Integer coNum) {
        this.coId = coId;
        this.coNum = coNum;
    }
}
