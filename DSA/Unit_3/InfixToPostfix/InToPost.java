public class InToPost
{
    // operator check
    static boolean isOperator(char c)
    {
        return c == '+' || c == '-' || c == '*' || c == '/';
    } //-end of isOp()

    // Precedence
    static int precedence(char operator)
    {
        switch(operator)
        {
            case '+': 
            case '-': 
                    return 1;

            case '*':
            case '/': 
                    return 1;

            default: return -1;
        }
    } //-end of precedence()

    // convert infix to postfix
    public static String infixToPostfix(String infix)
    {
        char[] stack = new char[infix.length()];
        int tos = -1;
        StringBuilder postfix = new StringBuilder();

        for(int i=0; i<infix.length(); i++)
        {
            char ch = infix.charAt(i);
            if(Character.isLetterOrDigit(ch))
            {
                // OPERAND - Append to postfix [Step 2]
                postfix.append(ch);
            }
            else if(ch == '(')
            {
                // OPEN PARENTHESIS - Push [Step 4]
                tos++;
                stack[tos] = ch;
            }
            else if(ch == ')')
            {
                // CLOSE PARENTHESIS - Pop till '(' [Step 5]
                while(stack[tos] != '(')
                {
                    postfix.append(stack[tos]);
                    tos--;
                } //-end of while
                tos--; // Pop the '('
            }
            else if(isOperator(ch))
            {
                // OPERATOR - Pop till step 3b
                while(tos >= 0 && precedence(ch) <= precedence(stack[tos]))
                {
                    postfix.append(stack[tos]);
                    tos--;
                } //-end of while

                // Push current ch
                tos++;
                stack[tos] = ch;
            }
        } //-end of for

        // Pop remaining characters from stack
        while(tos >= 0)
        {
            postfix.append(stack[tos]);
            tos--;
        }

        return postfix.toString();

    } //-end of infixToPostfix()
    // string builder -> mutable

    // --- Main ---
    public static void main(String[] args)
    {
        // String infix = "A*1/(B*9)+2";
        // String infix = "A+B*C+D";
        String infix = "(A+B)*(C/D)";

        String result = infixToPostfix(infix);
        System.out.println("Infix Expression: " + infix);
        System.out.println("Postfix Expression: " + result);
    } //-end of main()
    
} //-end of InToPost class