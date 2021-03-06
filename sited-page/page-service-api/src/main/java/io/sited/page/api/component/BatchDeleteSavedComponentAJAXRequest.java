package io.sited.page.api.component;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 * @author chi
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class BatchDeleteSavedComponentAJAXRequest {
    @XmlElement(name = "ids")
    public List<String> ids;

    @XmlElement(name = "requestBy")
    public String requestBy;
}
