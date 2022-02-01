package com.dream25.instagram.downloader.listener;

import com.dream25.instagram.downloader.api.model.NodeModel;
import com.dream25.instagram.downloader.api.model.TrayModel;

public interface UserListInterface {
    void FacebookUserListClick(int i, NodeModel nodeModel);

    void FacebookUserListClick(int i, TrayModel trayModel);
}