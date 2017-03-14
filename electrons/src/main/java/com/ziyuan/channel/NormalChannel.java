package com.ziyuan.channel;

import com.ziyuan.events.Electron;

import java.util.concurrent.TimeUnit;

/**
 * NormalChannel
 *
 * @author ziyuan
 * @since 2017-03-10
 */
public class NormalChannel extends AbstractChannel {

    @Override
    public boolean publish(String tag, Electron electron) {
        super.publish(tag, electron);
        return true;
    }


    @Override
    public void close() {

    }

    @Override
    public void regist() {

    }

    @Override
    public void handle() {

    }

    @Override
    public void confLimitRate(boolean limitRate, double perSecond, boolean warmup, int warmupPeriod, TimeUnit unit, int waitLimit, TimeUnit waitUnit) {

    }
}
