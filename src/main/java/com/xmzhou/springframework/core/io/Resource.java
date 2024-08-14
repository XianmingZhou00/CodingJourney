package com.xmzhou.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * Description:
 * Author: Xianming Zhou
 * CreateTime: 2024/8/13 13:13
 */
public interface Resource {

    InputStream getInputStream() throws IOException;
}
