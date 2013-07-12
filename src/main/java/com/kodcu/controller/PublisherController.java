package com.kodcu.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: usta
 * Date: 2/15/13
 * Time: 4:24 PM
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class PublisherController {

    private static Logger logger=Logger.getLogger(PublisherController.class);

    @ModelAttribute("publishers")
    public List<Publisher> getPublishers(){
        Publisher publisher1=new Publisher();
        publisher1.setEmail("pub1@gmail.com");
        publisher1.setPublisherName("pub1Name");

        Publisher publisher2=new Publisher();
        publisher2.setEmail("pub2@gmail.com");
        publisher2.setPublisherName("pub2Name");

        Book book1=new Book();
        book1.setAuthorName("Book3Author");
        book1.setBookName("Book3Name");
        book1.setPrice(10D);

        Book book2=new Book();
                book2.setAuthorName("Book3Author");
                book2.setBookName("Book3Name");
                book2.setPrice(10D);

        Book book3=new Book();
                book3.setAuthorName("Book3Author");
                book3.setBookName("Book3Name");
                book3.setPrice(10D);

        publisher1.setPublishedBooks(Arrays.asList(book1));
        publisher2.setPublishedBooks(Arrays.asList(book2,book3));
        if (logger.isDebugEnabled()){
            System.out.println("-*-*-*-*-*-*-*-");
            logger.debug(Arrays.asList(publisher1,publisher2));
            System.out.println("-*-*-*-*-*-*-*-");
        }

      return Arrays.asList(publisher1,publisher2);
    }

    @RequestMapping("/publisher")
    public String publishIt(){

        return "publisher" ;

    }
}
