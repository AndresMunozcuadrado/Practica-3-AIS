package es.codeurjc.test;

public class CalculatorParser {

    public int parse(String expression) {
        String trimmedExpression = expression.trim();

        validateExpression(trimmedExpression);

        if (trimmedExpression.contains("+")) {
            return handleAddition(trimmedExpression);
        }

        if (trimmedExpression.contains("-")) {
            return handleSubtraction(trimmedExpression);
        }

        return parseNumber(trimmedExpression);
    }

    private void validateExpression(String expression) {
        if (!expression.matches("[0-9+\\-\\s]+")) {
            throw new IllegalArgumentException("Invalid expression");
        }
    }

    private int handleAddition(String expression) {
        String[] parts = expression.split("\\+", 2);
        return parse(parts[0]) + parse(parts[1]);
    }

    private int handleSubtraction(String expression) {
        int lastMinus = expression.lastIndexOf('-');
        if (lastMinus > 0) {
            String left = expression.substring(0, lastMinus);
            String right = expression.substring(lastMinus + 1);
            return parse(left) - parse(right);
        }
        return parseNumber(expression); // Handles cases like "-5"
    }

    private int parseNumber(String expression) {
        return Integer.parseInt(expression.trim());
    }
}