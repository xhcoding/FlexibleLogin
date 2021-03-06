/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2015 games647 and contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.github.games647.flexiblelogin.config;

import ninja.leaping.configurate.objectmapping.Setting;
import ninja.leaping.configurate.objectmapping.serialize.ConfigSerializable;

@ConfigSerializable
public class SQLConfiguration {

    @Setting(comment = "SQL server type. You can choose between h2, SQLite and MySQL")
    private SQLType type = SQLType.H2;

    @Setting(comment = "Path where the database is located. This can be a file path (h2/SQLite) or an IP/Domain(MySQL)")
    private String path = "%DIR%";

    @Setting(comment = "Port for example MySQL connections")
    private int port = 3306;

    @Setting(comment = "Database name")
    private String database = "flexiblelogin";

    @Setting(comment = "Username to login the database system")
    private String username = "";

    @Setting(comment = "Password in order to login")
    private String password = "";

    @Setting(comment = "It's strongly recommended to enable SSL and setup a SSL certificate if the MySQL server isn't " +
            "running on the same machine")
    private boolean useSSL = false;

    public SQLType getType() {
        return type;
    }

    public String getPath() {
        return path;
    }

    public int getPort() {
        return port;
    }

    public String getDatabase() {
        return database;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isUseSSL() {
        return useSSL;
    }
}
