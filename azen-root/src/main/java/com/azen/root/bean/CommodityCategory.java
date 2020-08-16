package com.azen.root.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Alias("commodityCategory")
public class CommodityCategory {
    private Integer cyId;
    private String cyType;
}
