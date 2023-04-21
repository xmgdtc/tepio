package org.xmgdtc.account.entity.test;

import javax.persistence.Column;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Table(name = "t_paytype_a")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class PayTypeAEntity extends AbsPayTypeEntity {

    @Column(name = "a")
    private String a;
}
