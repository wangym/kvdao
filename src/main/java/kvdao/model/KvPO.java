package kvdao.model;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
import java.util.Date;

/**
 * @author yumin
 * @since 2015-11-27
 */
public class KvPO implements Serializable {
    @Getter
    private Long id;

    @Getter
    private Date gmtCreate;

    @Getter
    private Date gmtModified;

    @Getter
    private Integer rowStatus;

    @Getter
    private Integer rowVersion;

    @Getter
    @Setter
    private String key;

    @Getter
    @Setter
    private String value;
}
