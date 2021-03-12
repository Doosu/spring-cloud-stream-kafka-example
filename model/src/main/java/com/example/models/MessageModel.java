package com.example.models;

import com.example.enums.MessageModelType;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MessageModel {

  private long id;
  private MessageModelType type;
  private String outgoing;
  private String content;
  private List<String> receivers;

}
