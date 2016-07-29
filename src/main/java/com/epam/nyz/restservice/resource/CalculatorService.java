package com.epam.nyz.restservice.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.epam.nyz.restservice.model.CalculateResult;
import com.epam.zoltannyaray.commandlinecalculator.Expression;
import com.epam.zoltannyaray.commandlinecalculator.ExpressionBuilder;
import com.epam.zoltannyaray.commandlinecalculator.StandardOperatorPrecedenceProvider;

@Path("/calculator")
public class CalculatorService {

    private ExpressionBuilder expressionBuilder;

    public CalculatorService() {
        expressionBuilder = new ExpressionBuilder(new StandardOperatorPrecedenceProvider());
    }

    public CalculatorService(ExpressionBuilder expressionBuilder) {
        this.expressionBuilder = expressionBuilder;
    }

    @GET
    @Path("/calculate")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public CalculateResult calculate(@QueryParam("expression") String expressionString){
        Expression expression = expressionBuilder.buildExpression(expressionString);
        CalculateResult calculateResult = new CalculateResult(String.valueOf(expression.evaluate()));
        return calculateResult;
    }

}
