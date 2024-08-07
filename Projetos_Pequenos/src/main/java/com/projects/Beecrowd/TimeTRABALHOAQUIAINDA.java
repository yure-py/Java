package com.projects.Beecrowd;

// Proximos problemas
// Calcular a diferença entre horas e minutos           diff hour minute
// Calcular a diferença entre dia, hora e minuto        diff(startHour, endHour, startMin, endMin)

public class TimeTRABALHOAQUIAINDA {
    static public int hourDiff(int startHour, int endHour) {
        if (startHour < endHour)
            return endHour - startHour;
        if (startHour > endHour)
            return (24+endHour) - startHour;
        return 24;
    }
}
