package com.danielflower.crank4j.sharedstuff;

import java.util.concurrent.TimeUnit;

public class Constants {
    public static final int MAX_REQUEST_HEADERS_SIZE = 4 * 8192;
    public static final int MAX_RESPONSE_HEADERS_SIZE = 8192;
    public static final long MAX_TOTAL_TIME = TimeUnit.HOURS.toMillis(24);
}
