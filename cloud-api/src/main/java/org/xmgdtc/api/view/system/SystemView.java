package org.xmgdtc.api.view.system;

import lombok.Getter;
import lombok.Setter;
import org.xmgdtc.api.view.IdBaseView;


@Getter
@Setter
public class SystemView extends IdBaseView {

    /**
     * 微服务名称
     */
    private String name;


    /**
     * 微服务对应的系统api前缀
     */
    private String path;

}
