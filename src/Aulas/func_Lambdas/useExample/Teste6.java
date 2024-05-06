package Aulas.func_Lambdas.useExample;

import Aulas.func_Lambdas.lambdasExample.StringFunc;

public class Teste6 {

    static String strChange(StringFunc a, String b){
        return a.run(b);
    }

    public static void iniciar() {
        String in = "Lambda Expression Expand Java";
        String out;

        StringFunc reverse = (str) -> {
            StringBuilder result = new StringBuilder();

            for (int i = str.length()-1; i >= 0; i--)
                result.append(str.charAt(i));

            return result.toString();
        };

        out = strChange(reverse, in);
        
        System.out.println("Here is input String: " + in);
        System.out.println("Here is input String: " + out);
    }
}
