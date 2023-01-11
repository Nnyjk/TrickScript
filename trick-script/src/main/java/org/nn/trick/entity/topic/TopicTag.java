package org.nn.trick.entity.topic;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 主题标记
 *
 * @author yangxiao
 * @since V1.0.0 2023/01/11
 */
@Entity
@Table(name = "t_topic_tag")
public class TopicTag extends PanacheEntity {

    @Column
    public Long topicId;

    @Column(length = 20)
    public String tagName;
}
