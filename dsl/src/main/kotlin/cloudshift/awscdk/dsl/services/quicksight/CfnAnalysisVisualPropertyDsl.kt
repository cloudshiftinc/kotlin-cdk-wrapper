@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * A visual displayed on a sheet in an analysis, dashboard, or template.
 *
 * This is a union type structure. For this structure to be valid, only one of the attributes can be
 * defined.
 *
 * Example:
 *
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-visual.html)
 */
@CdkDslMarker
public class CfnAnalysisVisualPropertyDsl {
  private val cdkBuilder: CfnAnalysis.VisualProperty.Builder = CfnAnalysis.VisualProperty.builder()

  /**
   * @param barChartVisual A bar chart.
   * For more information, see [Using bar
   * charts](https://docs.aws.amazon.com/quicksight/latest/user/bar-charts.html) in the *Amazon
   * QuickSight User Guide* .
   */
  public fun barChartVisual(barChartVisual: IResolvable) {
    cdkBuilder.barChartVisual(barChartVisual)
  }

  /**
   * @param barChartVisual A bar chart.
   * For more information, see [Using bar
   * charts](https://docs.aws.amazon.com/quicksight/latest/user/bar-charts.html) in the *Amazon
   * QuickSight User Guide* .
   */
  public fun barChartVisual(barChartVisual: CfnAnalysis.BarChartVisualProperty) {
    cdkBuilder.barChartVisual(barChartVisual)
  }

  /**
   * @param boxPlotVisual A box plot.
   * For more information, see [Using box
   * plots](https://docs.aws.amazon.com/quicksight/latest/user/box-plots.html) in the *Amazon
   * QuickSight User Guide* .
   */
  public fun boxPlotVisual(boxPlotVisual: IResolvable) {
    cdkBuilder.boxPlotVisual(boxPlotVisual)
  }

  /**
   * @param boxPlotVisual A box plot.
   * For more information, see [Using box
   * plots](https://docs.aws.amazon.com/quicksight/latest/user/box-plots.html) in the *Amazon
   * QuickSight User Guide* .
   */
  public fun boxPlotVisual(boxPlotVisual: CfnAnalysis.BoxPlotVisualProperty) {
    cdkBuilder.boxPlotVisual(boxPlotVisual)
  }

  /**
   * @param comboChartVisual A combo chart.
   * For more information, see [Using combo
   * charts](https://docs.aws.amazon.com/quicksight/latest/user/combo-charts.html) in the *Amazon
   * QuickSight User Guide* .
   */
  public fun comboChartVisual(comboChartVisual: IResolvable) {
    cdkBuilder.comboChartVisual(comboChartVisual)
  }

  /**
   * @param comboChartVisual A combo chart.
   * For more information, see [Using combo
   * charts](https://docs.aws.amazon.com/quicksight/latest/user/combo-charts.html) in the *Amazon
   * QuickSight User Guide* .
   */
  public fun comboChartVisual(comboChartVisual: CfnAnalysis.ComboChartVisualProperty) {
    cdkBuilder.comboChartVisual(comboChartVisual)
  }

  /**
   * @param customContentVisual A visual that contains custom content.
   * For more information, see [Using custom visual
   * content](https://docs.aws.amazon.com/quicksight/latest/user/custom-visual-content.html) in the
   * *Amazon QuickSight User Guide* .
   */
  public fun customContentVisual(customContentVisual: IResolvable) {
    cdkBuilder.customContentVisual(customContentVisual)
  }

  /**
   * @param customContentVisual A visual that contains custom content.
   * For more information, see [Using custom visual
   * content](https://docs.aws.amazon.com/quicksight/latest/user/custom-visual-content.html) in the
   * *Amazon QuickSight User Guide* .
   */
  public fun customContentVisual(customContentVisual: CfnAnalysis.CustomContentVisualProperty) {
    cdkBuilder.customContentVisual(customContentVisual)
  }

  /**
   * @param emptyVisual An empty visual.
   */
  public fun emptyVisual(emptyVisual: IResolvable) {
    cdkBuilder.emptyVisual(emptyVisual)
  }

  /**
   * @param emptyVisual An empty visual.
   */
  public fun emptyVisual(emptyVisual: CfnAnalysis.EmptyVisualProperty) {
    cdkBuilder.emptyVisual(emptyVisual)
  }

  /**
   * @param filledMapVisual A filled map.
   * For more information, see [Creating filled
   * maps](https://docs.aws.amazon.com/quicksight/latest/user/filled-maps.html) in the *Amazon
   * QuickSight User Guide* .
   */
  public fun filledMapVisual(filledMapVisual: IResolvable) {
    cdkBuilder.filledMapVisual(filledMapVisual)
  }

  /**
   * @param filledMapVisual A filled map.
   * For more information, see [Creating filled
   * maps](https://docs.aws.amazon.com/quicksight/latest/user/filled-maps.html) in the *Amazon
   * QuickSight User Guide* .
   */
  public fun filledMapVisual(filledMapVisual: CfnAnalysis.FilledMapVisualProperty) {
    cdkBuilder.filledMapVisual(filledMapVisual)
  }

  /**
   * @param funnelChartVisual A funnel chart.
   * For more information, see [Using funnel
   * charts](https://docs.aws.amazon.com/quicksight/latest/user/funnel-visual-content.html) in the
   * *Amazon QuickSight User Guide* .
   */
  public fun funnelChartVisual(funnelChartVisual: IResolvable) {
    cdkBuilder.funnelChartVisual(funnelChartVisual)
  }

  /**
   * @param funnelChartVisual A funnel chart.
   * For more information, see [Using funnel
   * charts](https://docs.aws.amazon.com/quicksight/latest/user/funnel-visual-content.html) in the
   * *Amazon QuickSight User Guide* .
   */
  public fun funnelChartVisual(funnelChartVisual: CfnAnalysis.FunnelChartVisualProperty) {
    cdkBuilder.funnelChartVisual(funnelChartVisual)
  }

  /**
   * @param gaugeChartVisual A gauge chart.
   * For more information, see [Using gauge
   * charts](https://docs.aws.amazon.com/quicksight/latest/user/gauge-chart.html) in the *Amazon
   * QuickSight User Guide* .
   */
  public fun gaugeChartVisual(gaugeChartVisual: IResolvable) {
    cdkBuilder.gaugeChartVisual(gaugeChartVisual)
  }

  /**
   * @param gaugeChartVisual A gauge chart.
   * For more information, see [Using gauge
   * charts](https://docs.aws.amazon.com/quicksight/latest/user/gauge-chart.html) in the *Amazon
   * QuickSight User Guide* .
   */
  public fun gaugeChartVisual(gaugeChartVisual: CfnAnalysis.GaugeChartVisualProperty) {
    cdkBuilder.gaugeChartVisual(gaugeChartVisual)
  }

  /**
   * @param geospatialMapVisual A geospatial map or a points on map visual.
   * For more information, see [Creating point
   * maps](https://docs.aws.amazon.com/quicksight/latest/user/point-maps.html) in the *Amazon
   * QuickSight User Guide* .
   */
  public fun geospatialMapVisual(geospatialMapVisual: IResolvable) {
    cdkBuilder.geospatialMapVisual(geospatialMapVisual)
  }

  /**
   * @param geospatialMapVisual A geospatial map or a points on map visual.
   * For more information, see [Creating point
   * maps](https://docs.aws.amazon.com/quicksight/latest/user/point-maps.html) in the *Amazon
   * QuickSight User Guide* .
   */
  public fun geospatialMapVisual(geospatialMapVisual: CfnAnalysis.GeospatialMapVisualProperty) {
    cdkBuilder.geospatialMapVisual(geospatialMapVisual)
  }

  /**
   * @param heatMapVisual A heat map.
   * For more information, see [Using heat
   * maps](https://docs.aws.amazon.com/quicksight/latest/user/heat-map.html) in the *Amazon QuickSight
   * User Guide* .
   */
  public fun heatMapVisual(heatMapVisual: IResolvable) {
    cdkBuilder.heatMapVisual(heatMapVisual)
  }

  /**
   * @param heatMapVisual A heat map.
   * For more information, see [Using heat
   * maps](https://docs.aws.amazon.com/quicksight/latest/user/heat-map.html) in the *Amazon QuickSight
   * User Guide* .
   */
  public fun heatMapVisual(heatMapVisual: CfnAnalysis.HeatMapVisualProperty) {
    cdkBuilder.heatMapVisual(heatMapVisual)
  }

  /**
   * @param histogramVisual A histogram.
   * For more information, see [Using
   * histograms](https://docs.aws.amazon.com/quicksight/latest/user/histogram-charts.html) in the
   * *Amazon QuickSight User Guide* .
   */
  public fun histogramVisual(histogramVisual: IResolvable) {
    cdkBuilder.histogramVisual(histogramVisual)
  }

  /**
   * @param histogramVisual A histogram.
   * For more information, see [Using
   * histograms](https://docs.aws.amazon.com/quicksight/latest/user/histogram-charts.html) in the
   * *Amazon QuickSight User Guide* .
   */
  public fun histogramVisual(histogramVisual: CfnAnalysis.HistogramVisualProperty) {
    cdkBuilder.histogramVisual(histogramVisual)
  }

  /**
   * @param insightVisual An insight visual.
   * For more information, see [Working with
   * insights](https://docs.aws.amazon.com/quicksight/latest/user/computational-insights.html) in the
   * *Amazon QuickSight User Guide* .
   */
  public fun insightVisual(insightVisual: IResolvable) {
    cdkBuilder.insightVisual(insightVisual)
  }

  /**
   * @param insightVisual An insight visual.
   * For more information, see [Working with
   * insights](https://docs.aws.amazon.com/quicksight/latest/user/computational-insights.html) in the
   * *Amazon QuickSight User Guide* .
   */
  public fun insightVisual(insightVisual: CfnAnalysis.InsightVisualProperty) {
    cdkBuilder.insightVisual(insightVisual)
  }

  /**
   * @param kpiVisual A key performance indicator (KPI).
   * For more information, see [Using
   * KPIs](https://docs.aws.amazon.com/quicksight/latest/user/kpi.html) in the *Amazon QuickSight User
   * Guide* .
   */
  public fun kpiVisual(kpiVisual: IResolvable) {
    cdkBuilder.kpiVisual(kpiVisual)
  }

  /**
   * @param kpiVisual A key performance indicator (KPI).
   * For more information, see [Using
   * KPIs](https://docs.aws.amazon.com/quicksight/latest/user/kpi.html) in the *Amazon QuickSight User
   * Guide* .
   */
  public fun kpiVisual(kpiVisual: CfnAnalysis.KPIVisualProperty) {
    cdkBuilder.kpiVisual(kpiVisual)
  }

  /**
   * @param lineChartVisual A line chart.
   * For more information, see [Using line
   * charts](https://docs.aws.amazon.com/quicksight/latest/user/line-charts.html) in the *Amazon
   * QuickSight User Guide* .
   */
  public fun lineChartVisual(lineChartVisual: IResolvable) {
    cdkBuilder.lineChartVisual(lineChartVisual)
  }

  /**
   * @param lineChartVisual A line chart.
   * For more information, see [Using line
   * charts](https://docs.aws.amazon.com/quicksight/latest/user/line-charts.html) in the *Amazon
   * QuickSight User Guide* .
   */
  public fun lineChartVisual(lineChartVisual: CfnAnalysis.LineChartVisualProperty) {
    cdkBuilder.lineChartVisual(lineChartVisual)
  }

  /**
   * @param pieChartVisual A pie or donut chart.
   * For more information, see [Using pie
   * charts](https://docs.aws.amazon.com/quicksight/latest/user/pie-chart.html) in the *Amazon
   * QuickSight User Guide* .
   */
  public fun pieChartVisual(pieChartVisual: IResolvable) {
    cdkBuilder.pieChartVisual(pieChartVisual)
  }

  /**
   * @param pieChartVisual A pie or donut chart.
   * For more information, see [Using pie
   * charts](https://docs.aws.amazon.com/quicksight/latest/user/pie-chart.html) in the *Amazon
   * QuickSight User Guide* .
   */
  public fun pieChartVisual(pieChartVisual: CfnAnalysis.PieChartVisualProperty) {
    cdkBuilder.pieChartVisual(pieChartVisual)
  }

  /**
   * @param pivotTableVisual A pivot table.
   * For more information, see [Using pivot
   * tables](https://docs.aws.amazon.com/quicksight/latest/user/pivot-table.html) in the *Amazon
   * QuickSight User Guide* .
   */
  public fun pivotTableVisual(pivotTableVisual: IResolvable) {
    cdkBuilder.pivotTableVisual(pivotTableVisual)
  }

  /**
   * @param pivotTableVisual A pivot table.
   * For more information, see [Using pivot
   * tables](https://docs.aws.amazon.com/quicksight/latest/user/pivot-table.html) in the *Amazon
   * QuickSight User Guide* .
   */
  public fun pivotTableVisual(pivotTableVisual: CfnAnalysis.PivotTableVisualProperty) {
    cdkBuilder.pivotTableVisual(pivotTableVisual)
  }

  /**
   * @param radarChartVisual A radar chart visual.
   * For more information, see [Using radar
   * charts](https://docs.aws.amazon.com/quicksight/latest/user/radar-chart.html) in the *Amazon
   * QuickSight User Guide* .
   */
  public fun radarChartVisual(radarChartVisual: IResolvable) {
    cdkBuilder.radarChartVisual(radarChartVisual)
  }

  /**
   * @param radarChartVisual A radar chart visual.
   * For more information, see [Using radar
   * charts](https://docs.aws.amazon.com/quicksight/latest/user/radar-chart.html) in the *Amazon
   * QuickSight User Guide* .
   */
  public fun radarChartVisual(radarChartVisual: CfnAnalysis.RadarChartVisualProperty) {
    cdkBuilder.radarChartVisual(radarChartVisual)
  }

  /**
   * @param sankeyDiagramVisual A sankey diagram.
   * For more information, see [Using Sankey
   * diagrams](https://docs.aws.amazon.com/quicksight/latest/user/sankey-diagram.html) in the *Amazon
   * QuickSight User Guide* .
   */
  public fun sankeyDiagramVisual(sankeyDiagramVisual: IResolvable) {
    cdkBuilder.sankeyDiagramVisual(sankeyDiagramVisual)
  }

  /**
   * @param sankeyDiagramVisual A sankey diagram.
   * For more information, see [Using Sankey
   * diagrams](https://docs.aws.amazon.com/quicksight/latest/user/sankey-diagram.html) in the *Amazon
   * QuickSight User Guide* .
   */
  public fun sankeyDiagramVisual(sankeyDiagramVisual: CfnAnalysis.SankeyDiagramVisualProperty) {
    cdkBuilder.sankeyDiagramVisual(sankeyDiagramVisual)
  }

  /**
   * @param scatterPlotVisual A scatter plot.
   * For more information, see [Using scatter
   * plots](https://docs.aws.amazon.com/quicksight/latest/user/scatter-plot.html) in the *Amazon
   * QuickSight User Guide* .
   */
  public fun scatterPlotVisual(scatterPlotVisual: IResolvable) {
    cdkBuilder.scatterPlotVisual(scatterPlotVisual)
  }

  /**
   * @param scatterPlotVisual A scatter plot.
   * For more information, see [Using scatter
   * plots](https://docs.aws.amazon.com/quicksight/latest/user/scatter-plot.html) in the *Amazon
   * QuickSight User Guide* .
   */
  public fun scatterPlotVisual(scatterPlotVisual: CfnAnalysis.ScatterPlotVisualProperty) {
    cdkBuilder.scatterPlotVisual(scatterPlotVisual)
  }

  /**
   * @param tableVisual A table visual.
   * For more information, see [Using tables as
   * visuals](https://docs.aws.amazon.com/quicksight/latest/user/tabular.html) in the *Amazon
   * QuickSight User Guide* .
   */
  public fun tableVisual(tableVisual: IResolvable) {
    cdkBuilder.tableVisual(tableVisual)
  }

  /**
   * @param tableVisual A table visual.
   * For more information, see [Using tables as
   * visuals](https://docs.aws.amazon.com/quicksight/latest/user/tabular.html) in the *Amazon
   * QuickSight User Guide* .
   */
  public fun tableVisual(tableVisual: CfnAnalysis.TableVisualProperty) {
    cdkBuilder.tableVisual(tableVisual)
  }

  /**
   * @param treeMapVisual A tree map.
   * For more information, see [Using tree
   * maps](https://docs.aws.amazon.com/quicksight/latest/user/tree-map.html) in the *Amazon QuickSight
   * User Guide* .
   */
  public fun treeMapVisual(treeMapVisual: IResolvable) {
    cdkBuilder.treeMapVisual(treeMapVisual)
  }

  /**
   * @param treeMapVisual A tree map.
   * For more information, see [Using tree
   * maps](https://docs.aws.amazon.com/quicksight/latest/user/tree-map.html) in the *Amazon QuickSight
   * User Guide* .
   */
  public fun treeMapVisual(treeMapVisual: CfnAnalysis.TreeMapVisualProperty) {
    cdkBuilder.treeMapVisual(treeMapVisual)
  }

  /**
   * @param waterfallVisual A waterfall chart.
   * For more information, see [Using waterfall
   * charts](https://docs.aws.amazon.com/quicksight/latest/user/waterfall-chart.html) in the *Amazon
   * QuickSight User Guide* .
   */
  public fun waterfallVisual(waterfallVisual: IResolvable) {
    cdkBuilder.waterfallVisual(waterfallVisual)
  }

  /**
   * @param waterfallVisual A waterfall chart.
   * For more information, see [Using waterfall
   * charts](https://docs.aws.amazon.com/quicksight/latest/user/waterfall-chart.html) in the *Amazon
   * QuickSight User Guide* .
   */
  public fun waterfallVisual(waterfallVisual: CfnAnalysis.WaterfallVisualProperty) {
    cdkBuilder.waterfallVisual(waterfallVisual)
  }

  /**
   * @param wordCloudVisual A word cloud.
   * For more information, see [Using word
   * clouds](https://docs.aws.amazon.com/quicksight/latest/user/word-cloud.html) in the *Amazon
   * QuickSight User Guide* .
   */
  public fun wordCloudVisual(wordCloudVisual: IResolvable) {
    cdkBuilder.wordCloudVisual(wordCloudVisual)
  }

  /**
   * @param wordCloudVisual A word cloud.
   * For more information, see [Using word
   * clouds](https://docs.aws.amazon.com/quicksight/latest/user/word-cloud.html) in the *Amazon
   * QuickSight User Guide* .
   */
  public fun wordCloudVisual(wordCloudVisual: CfnAnalysis.WordCloudVisualProperty) {
    cdkBuilder.wordCloudVisual(wordCloudVisual)
  }

  public fun build(): CfnAnalysis.VisualProperty = cdkBuilder.build()
}
