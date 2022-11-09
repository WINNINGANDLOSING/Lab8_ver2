class Lab8Exericse {
    
    public static int cal(int a, int b, String operator)
    {
        if(operator == "+")
        {
            return a + b;
        }
        else if(operator == "-")
        {
            return a - b;
        }
        else if(operator == "*")
        {
            return a*b;
        }
        else
        {
            return a/b;
        }
    }

}