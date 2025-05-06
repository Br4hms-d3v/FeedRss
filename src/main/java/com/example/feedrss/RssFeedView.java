//package com.example.feedrss;
//
//import com.rometools.rome.feed.rss.Channel;
//import com.rometools.rome.feed.rss.Description;
//import com.rometools.rome.feed.rss.Item;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import org.springframework.stereotype.Component;
//import org.springframework.web.servlet.view.feed.AbstractRssFeedView;
//
//import java.util.Arrays;
//import java.util.Date;
//import java.util.List;
//import java.util.Map;
//
//@Component
//public class RssFeedView extends AbstractRssFeedView {
//
//    @Override
//    protected void buildFeedMetadata(Map<String, Object> model, Channel channel, HttpServletRequest request) {
//        channel.setTitle("Title"); //Here is my Concern
//        channel.setDescription("Description"); //Here is my Concern
//        channel.setLink("www.mydomain.com"); //Here is my Concern
//        channel.setUri("www.mydomain.com"); //Here is my Concern
//    }
//
//    @Override
//    protected List<Item> buildFeedItems(Map<String, Object> model, HttpServletRequest request, HttpServletResponse response) throws Exception {
//        Item item = new Item();
//        Date postDate = new Date();
//        item.setTitle("title"); //Here is my Concern
//        item.setLink("www.mydomain.com/"); //Here is my Concern
//        item.setUri("/www.mydomain.com/"); //Here is my Concern
//        item.setPubDate(postDate);
//        item.setAuthor("Me");
//        Description description = new Description();
//        description.setValue("Description"); //Here is my Concern
//        item.setDescription(description);
//
//
//        return Arrays.asList(item);
//    }
//}
