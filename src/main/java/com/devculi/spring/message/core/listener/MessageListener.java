package com.devculi.spring.message.core.listener;

import com.devculi.spring.message.core.domain.Message;

/** A MessageListener object is used to receive asynchronously delivered messages.*/
public interface MessageListener
{
  /** Passes a message to the listener. */
  void onMessage(Message message);
}
