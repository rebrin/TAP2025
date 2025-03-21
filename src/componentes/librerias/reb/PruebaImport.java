package componentes.librerias.reb;


import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class PruebaImport {
    public static void main(String[] args) {
        XYSeries series=new XYSeries("prdocuto A");
        series.add(1,1);
        series.add(2,2);
        series.add(6,10);
        series.add(5,12);
        series.add(8,13);

        XYSeries serie2=new XYSeries("prdocuto B");
        serie2.add(1,1);
        serie2.add(2,1);
        serie2.add(3,2);
        serie2.add(5,4);
        serie2.add(6,7);
        serie2.add(7,10);

        XYSeriesCollection dataset=new XYSeriesCollection(series);
        dataset.addSeries(serie2);
        JFreeChart chart= ChartFactory.createXYLineChart(
                "ventas 2025",
                "tiempo",
                "cantidad",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                false,false
        );

        ChartFrame ventana=new ChartFrame("libreria JFreeChart"
                ,chart);
        ventana.pack();
        ventana.setSize(800,600);
        ventana.setVisible(true);

    }
}
