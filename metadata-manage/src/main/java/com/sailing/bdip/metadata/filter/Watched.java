package com.sailing.bdip.metadata.filter;

import java.util.Observable;

/**
 * 被观察者
 */
public class Watched extends Observable {
    public void notifyObservers(Object arg){
        super.setChanged();
        super.notifyObservers(arg);
    }

}
