//
//  commented class to show the new class BigBrotherWithQueueUsingTimerAndMessageAnalyzer
//
// package io.github.dinolupo.di.presentation;
//
//import javax.annotation.PostConstruct;
//import javax.annotation.PreDestroy;
//import javax.annotation.Resource;
//import javax.ejb.*;
//import java.util.Date;
//import java.util.concurrent.CopyOnWriteArrayList;
//
///**
// * Created by dinolupo.github.io on 23/06/16.
//
// */
//
//@Startup
//@ConcurrencyManagement(ConcurrencyManagementType.BEAN)
//@Singleton
//public class BigBrotherWithQueueUsingTimer {
//
//    CopyOnWriteArrayList<String> messageQueue;
//
//    @Resource
//    TimerService timerService;
//    Timer timer;
//
//    @PostConstruct
//    public void initialize(){
//        this.messageQueue = new CopyOnWriteArrayList<>();
//        ScheduleExpression scheduleExpression = new ScheduleExpression();
//        scheduleExpression.second("*/3").minute("*").hour("*");
//        this.timer = timerService.createCalendarTimer(scheduleExpression);
//
//    }
//
//    public void gatherEverything(String message){
//        messageQueue.add(message);
//    }
//
//    //@Timeout
//    public void batchAnalyze(){
//        System.out.printf("**************** Analyzing at %s ***************\n", new Date());
//        for (String message: messageQueue) {
//            System.out.printf("---- Working on message: %s\n", message);
//            messageQueue.remove(message);
//        }
//    }
//
//
//    @PreDestroy
//    void preDestroy() {
//        System.err.println("*************************** DESTROYING TIMER ***********************************");
//        timer.cancel();
//        timer = null;
//        }
//
//}
