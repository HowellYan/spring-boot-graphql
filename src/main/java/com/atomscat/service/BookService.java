//package com.atomscat.service;
//
//import com.google.common.collect.ImmutableMap;
//import graphql.schema.DataFetcher;
//import graphql.schema.idl.RuntimeWiring;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.core.annotation.Order;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;
//
//import javax.annotation.PostConstruct;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Map;
//
//import static graphql.schema.idl.TypeRuntimeWiring.newTypeWiring;
//
//
//@Component
//public class BookService {
//
//    @Autowired
//    private RuntimeWiring.Builder builder;
//
//    @Bean
//    public RuntimeWiring.Builder builderWiring() {
//        return RuntimeWiring.newRuntimeWiring();
//    }
//
//    private static List<Map<String, String>> books = Arrays.asList(
//            ImmutableMap.of("id", "book-1",
//                    "name", "Harry Potter and the Philosopher's Stone",
//                    "pageCount", "223",
//                    "authorId", "author-1"),
//            ImmutableMap.of("id", "book-2",
//                    "name", "Moby Dick",
//                    "pageCount", "635",
//                    "authorId", "author-2"),
//            ImmutableMap.of("id", "book-3",
//                    "name", "Interview with the vampire",
//                    "pageCount", "371",
//                    "authorId", "author-3")
//    );
//
//    @PostConstruct
//    public void init() {
//        builder.type(newTypeWiring("Query")
//                .dataFetcher("bookList", getBookListDataFetcher()));
//    }
//
//    public DataFetcher getBookListDataFetcher() {
//        return dataFetchingEnvironment -> {
//            return books;
//        };
//    }
//
//
//}
