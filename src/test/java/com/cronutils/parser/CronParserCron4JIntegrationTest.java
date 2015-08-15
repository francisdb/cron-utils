package com.cronutils.parser;

import com.cronutils.model.CronType;
import com.cronutils.model.definition.CronDefinition;
import com.cronutils.model.definition.CronDefinitionBuilder;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CronParserCron4JIntegrationTest {
    private CronParser cron4jParser;

    @Before
    public void setUp() throws Exception {
        CronDefinition cronDefinition =  CronDefinitionBuilder.instanceDefinitionFor(CronType.CRON4J);
        cron4jParser = new CronParser(cronDefinition);
    }

    @Test
    public void testParseIssue32Expression01() throws Exception {
        String cronExpr = "* 1,2,3,4,5,6 * 1,2,3 *";
        cron4jParser.parse(cronExpr);
    }

    @Test
    public void testParseIssue32Expression02() throws Exception {
        String cronExpr = "* 1 1,2 * 4";
        cron4jParser.parse(cronExpr);
    }
}