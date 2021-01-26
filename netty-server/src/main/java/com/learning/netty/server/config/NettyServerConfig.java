package com.learning.netty.server.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Netty服务器配置信息
 * <p>
 */
@Component
public class NettyServerConfig {

    /**
     * 端口
     */
    @Value("${netty.port}")
    private int port;
    /**
     * 最大线程数
     */
    @Value("${netty.maxThreads}")
    private int maxThreads;
    /**
     * 最大数据包长度
     */
    @Value("${netty.max_frame_length}")
    private int maxFrameLength;

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public int getMaxThreads() {
        return maxThreads;
    }

    public void setMaxThreads(int maxThreads) {
        this.maxThreads = maxThreads;
    }

    public int getMaxFrameLength() {
        return maxFrameLength;
    }

    public void setMaxFrameLength(int maxFrameLength) {
        this.maxFrameLength = maxFrameLength;
    }
}
