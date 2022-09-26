
package com.devculi.spring.message.core.domain;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Publisher
{
  private String id;
  private String name;
  private LocalDateTime publishTime;

  public void sendMessage(Message message) {
      // to-do something
  }

}
