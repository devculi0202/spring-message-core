package com.devculi.spring.message.core.helper;


import com.devculi.spring.message.core.domain.Message;
import com.devculi.spring.message.core.listener.MessageListener;

/**
 * An object which can be used to listen to the number of active consumers
 * available on a given destination.
 *
 *
 */
public class ConsumerEventSource implements MessageListener
{

    @Override
    public void onMessage(Message message)
    {

    }

}
