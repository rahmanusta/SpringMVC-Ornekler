            package com.kodcu.controller;

            import org.springframework.stereotype.Controller;
            import org.springframework.web.bind.annotation.RequestMapping;
            import org.springframework.web.servlet.ModelAndView;

            import java.util.Arrays;
            import java.util.List;

            /**
            * Created with IntelliJ IDEA.
            * User: usta
            * Date: 2/15/13
            * Time: 2:51 PM
            * To change this template use File | Settings | File Templates.
            */
            @Controller
            public class TableContoller {


            @RequestMapping(value = "/table")
            public ModelAndView getTable() {

            List<Customer> customerList =
                            Arrays.asList(
                            new Customer("Ali", "Veli", 10),
                            new Customer("Ali", "Veli", 11),
                            new Customer("Ali", "Veli", 12),
                            new Customer("Ali", "Veli", 13),
                            new Customer("Ali", "Veli", 14),
                            new Customer("Ali", "Veli", 15),
                            new Customer("Ali", "Veli", 16),
                            new Customer("Ali", "Veli", 17));

                ModelAndView modelAndView=new ModelAndView();
                modelAndView.setViewName("table");
                modelAndView.addObject("customers",customerList);

            return modelAndView;
            }
            }
