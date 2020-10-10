package com.github.tornaia.cf.win.cfapi.api;

import java.nio.file.Path;

public class ConnectSyncRootCommand {

    private final Path syncRootPath;

    public ConnectSyncRootCommand(Path syncRootPath) {
        this.syncRootPath = syncRootPath;
    }

    public Path getSyncRootPath() {
        return syncRootPath;
    }

    @Override
    public String toString() {
        return "ConnectSyncRootCommand{" +
                "syncRootPath=" + syncRootPath +
                '}';
    }
}
