package data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TopicList {
    ArrayList<Topic> topics = new ArrayList<>();

    // Add a new topic to the list.


    // Show all topics and sorted in ascending order by name.
    public void showTopics() {
        if (topics.isEmpty()) {
            System.out.println("Topic list is empty");
            return;
        }
        Collections.sort(topics, new Comparator<Topic>() {
            @Override
            public int compare(Topic t1, Topic t2) {
                return t1.getName().compareToIgnoreCase(t2.getName());
            }
        });

        for (Topic topic : topics) {
            topic.toString();
        };
    }
    
}
