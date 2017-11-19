package com.volkovich.gift.cucumber.stepdefs;

import com.volkovich.gift.GiftappApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = GiftappApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
