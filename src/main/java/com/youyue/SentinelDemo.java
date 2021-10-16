package com.youyue;

import com.alibaba.csp.sentinel.Entry;
import com.alibaba.csp.sentinel.SphU;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author lei_she
 * @version 1.0
 * @create_time 2021-10-08 11:03
 */
public class SentinelDemo {

    public static void main(String[] args){
//        initFlowRules();//初始化规则
//        while (true) {
//            Entry entry = null;
//            try {
//                entry = SphU.entry("HelloWorld1");
//                /*您的业务逻辑 - 开始*/
//                System.out.println("hello world");
//                TimeUnit.MILLISECONDS.sleep(500);
//                /*您的业务逻辑 - 结束*/
//            } catch (BlockException e1) {
//                /*流控逻辑处理 - 开始*/
//                System.out.println("block!");
//                try {
//                    TimeUnit.MILLISECONDS.sleep(200);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                /*流控逻辑处理 - 结束*/
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            } finally {
//                if (entry != null) {
//                    entry.exit();
//                }
//            }
//        }

        byte[] bytes = new byte[10];
        System.out.println(bytes);
    }

    private static void initFlowRules(){
        List<FlowRule> rules = new ArrayList<>();
        FlowRule rule = new FlowRule();
        rule.setResource("HelloWorld1");
        rule.setGrade(RuleConstant.FLOW_GRADE_QPS);
        // Set limit QPS to 20.
        rule.setCount(1);
        rules.add(rule);
        FlowRuleManager.loadRules(rules);
    }
}
