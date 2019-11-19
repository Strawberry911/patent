package com.suixingpay.patent.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Getter
@Setter
@ToString
public class Index {
    private int indexId;//指标id
    private int indexPatentId;//专利id
    private String indexContent;//指标专利
    private Date indexCreateDate;//指标创建时间
}
