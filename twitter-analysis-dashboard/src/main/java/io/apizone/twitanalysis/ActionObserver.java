/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.apizone.twitanalysis;

/**
 *
 * @author shoaibjdev
 */
public interface ActionObserver {
    
    void setActionExecutor(ActionExecutor ae);
    
    void connect();
    
    void disconnect();
}
