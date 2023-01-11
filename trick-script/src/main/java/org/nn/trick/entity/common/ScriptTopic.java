package org.nn.trick.entity.common;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 主题
 *
 * @author yangxiao
 * @since V1.0.0 2023/01/11
 */
@Entity
@Table(name = "t_script_topic")
public class ScriptTopic extends PanacheEntity {

    @Column(length = 100)
    public String topicName;
}
