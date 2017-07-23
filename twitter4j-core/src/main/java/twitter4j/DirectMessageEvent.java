package twitter4j;

import java.util.Date;

/**
 * Created by aman.choudhary on 22/07/17.
 */
public interface DirectMessageEvent {

    String getType();

    long getId();

    Date getCreatedTimestamp();

    long getRecipientId();

    long getSenderId();

    String getText();

    UserMentionEntity[] getUserMentionEntities();

    URLEntity[] getUrlEntities();

    HashtagEntity[] getHashtagEntities();

    MediaEntity[] getMediaEntities();

    SymbolEntity[] getSymbolEntities();
}
