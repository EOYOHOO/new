/*
*  Copyright 2019-2020 Zheng Jie
*
*  Licensed under the Apache License, Version 2.0 (the "License");
*  you may not use this file except in compliance with the License.
*  You may obtain a copy of the License at
*
*  http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing, software
*  distributed under the License is distributed on an "AS IS" BASIS,
*  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*  See the License for the specific language governing permissions and
*  limitations under the License.
*/
package org.el.modules.news.service.dto;

import lombok.Data;
import java.sql.Timestamp;
import java.io.Serializable;
import java.util.List;

/**
* @website https://el-admin.vip
* @description /
* @author qingtian@gmail.com
* @date 2022-05-08
**/
@Data
public class NewsArticleDto implements Serializable {

    /** 主键 */
    private Integer id;

    /** 创建人 */
    private String createBy;

    /** 创建时间 */
    private Timestamp createTime;

    /** 更新人 */
    private String updateBy;

    /** 更新时间 */
    private Timestamp updateTime;

    /** 标题 */
    private String title;

    /** 摘要 */
    private String excerpt;

    /** 新闻分类ID */
    private Integer category;

    /** 封面图片 */
    private String img;

    /** 正文 */
    private String content;

    /** 作者 */
    private Long author;

    /** 阅读量 */
    private Integer views;

    /** 标签列表 */
    private List<Integer> tags;
}