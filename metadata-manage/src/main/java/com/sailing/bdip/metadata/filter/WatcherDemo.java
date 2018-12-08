package com.sailing.bdip.metadata.filter;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 */
public class WatcherDemo implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        if(arg.toString().equals("openWindows")){
            System.out.println("已经打开窗口");
          //变化的结构
            //权限匹配
            //发给对应的应用

        }
    }
}
