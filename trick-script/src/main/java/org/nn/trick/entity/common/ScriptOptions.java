package org.nn.trick.entity.common;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 选项
 *
 * @author yangxiao
 * @since V1.0.0 2023/01/11
 */
@Entity
@Table(name = "t_script_options")
public class ScriptOptions extends PanacheEntity {

    @Column
    public Long stageId;

    @Column
    public Integer orderNum;

    @Column
    public Long nextStageId;
}
