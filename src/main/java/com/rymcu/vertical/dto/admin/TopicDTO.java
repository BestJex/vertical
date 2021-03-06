package com.rymcu.vertical.dto.admin;

import com.rymcu.vertical.dto.Author;
import lombok.Data;

import java.util.List;

/**
 * @author ronger
 */
@Data
public class TopicDTO {

    private Integer idTopic;

    private String topicTitle;

    private String topicUri;

    private String topicIconPath;

    private String topicDescription;

    private String topicStatus;

    private Integer topicTagCount;

    private List<TagDTO> tags;

}
