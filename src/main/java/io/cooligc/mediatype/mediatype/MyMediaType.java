package io.cooligc.mediatype.mediatype;

import org.springframework.http.MediaType;
import org.springframework.util.MimeType;

public class MyMediaType extends MediaType {
    public static final String CUSTOMER_SERVICE_V2 = "application/vnd.cooligc.customers+v2.json";
    public static final MimeType CUSTOMER_V2_MIME = new MyMediaType("application", "vnd.cooligc.customers+v2.json");
    public static final String CUSTOMER_SERVICE_V3 = "application/vnd.cooligc.customers+v3.json";
    public static final MimeType CUSTOMER_V3_MIME = new MyMediaType("application", "vnd.cooligc.customers+v3.json");
    public MyMediaType(String type, String subtype) {
        super(type, subtype);
    }
}
