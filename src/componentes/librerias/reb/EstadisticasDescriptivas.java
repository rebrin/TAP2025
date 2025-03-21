package componentes.librerias.reb;


import org.apache.commons.math4.legacy.stat.descriptive.DescriptiveStatistics;

public class EstadisticasDescriptivas {
    public static void main(String[] args) {
        DescriptiveStatistics stats = new DescriptiveStatistics();
        stats.addValue(80);
        stats.addValue(90);
        stats.addValue(70);
        stats.addValue(81);
        stats.addValue(95);
        stats.addValue(99);
        stats.addValue(100);
        stats.addValue(60);
        System.out.println("mejor calificacion "+stats.getMax());
        System.out.println("peor calificacion "+stats.getMin());
        System.out.println("promedio "+stats.getMean());
        System.out.println("desviacion estandar "+stats.getStandardDeviation());

    }
}
