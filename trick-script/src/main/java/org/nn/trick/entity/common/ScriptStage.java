package org.nn.trick.entity.common;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 阶段（舞台）
 *
 * @author yangxiao
 * @since V1.0.0 2023/01/11
 */
@Entity
@Table(name = "t_script_stage")
public class ScriptStage extends PanacheEntity {

    @Column
    public Long topicId;

    @Column(length = 100)
    public String stageName;

    @Column
    public Boolean endStage = Boolean.FALSE;
}
