package gorzela.izabela.MapStructDemo.entities.basicMappings;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MessageDto {

    private String title;
    private String senderName;
    private String recipientName;
}