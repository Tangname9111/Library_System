package com.team6.bms.utils;

import java.util.Map;

public class MyUtils {

    // 方便分页
    public static void parsePageParams(Map<String, Object> params) {
        int page = Integer.parseInt((String) params.get("page"));
        int size = Integer.parseInt((String) params.get("limit"));
        params.put("begin", (page - 1) * size);
        params.put("size", size);
    }

}
