/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2012-2020. All rights reserved.
 */

package com.huawei.bigdata.oozie.examples;

import java.io.File;

/**
 * The Constant Setting of Oozie Example
 *
 * @since 2020-09-30
 */
public class Constant {
    /** Submit User Name */
    public static String SUBMIT_USER = "oozieuser";

    /** Oozie Url */
    public static String OOZIE_URL_DEFALUT = "https://10-162-17-112:21003/oozie/";

    /** User Directory */
    public static String USER_DIR = "user.dir";

    /** Application Path */
    public static String APPLICATION_PATH =
            new StringBuilder(System.getProperty(USER_DIR))
                    .append(File.separator)
                    .append("src")
                    .append(File.separator)
                    .append("main")
                    .append(File.separator)
                    .append("resources")
                    .append(File.separator)
                    .toString();
}