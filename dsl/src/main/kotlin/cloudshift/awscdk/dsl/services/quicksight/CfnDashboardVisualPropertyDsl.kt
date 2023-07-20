@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardVisualPropertyDsl {
  private val cdkBuilder: CfnDashboard.VisualProperty.Builder =
      CfnDashboard.VisualProperty.builder()

  public fun barChartVisual(barChartVisual: IResolvable) {
    cdkBuilder.barChartVisual(barChartVisual)
  }

  public fun barChartVisual(barChartVisual: CfnDashboard.BarChartVisualProperty) {
    cdkBuilder.barChartVisual(barChartVisual)
  }

  public fun boxPlotVisual(boxPlotVisual: IResolvable) {
    cdkBuilder.boxPlotVisual(boxPlotVisual)
  }

  public fun boxPlotVisual(boxPlotVisual: CfnDashboard.BoxPlotVisualProperty) {
    cdkBuilder.boxPlotVisual(boxPlotVisual)
  }

  public fun comboChartVisual(comboChartVisual: IResolvable) {
    cdkBuilder.comboChartVisual(comboChartVisual)
  }

  public fun comboChartVisual(comboChartVisual: CfnDashboard.ComboChartVisualProperty) {
    cdkBuilder.comboChartVisual(comboChartVisual)
  }

  public fun customContentVisual(customContentVisual: IResolvable) {
    cdkBuilder.customContentVisual(customContentVisual)
  }

  public fun customContentVisual(customContentVisual: CfnDashboard.CustomContentVisualProperty) {
    cdkBuilder.customContentVisual(customContentVisual)
  }

  public fun emptyVisual(emptyVisual: IResolvable) {
    cdkBuilder.emptyVisual(emptyVisual)
  }

  public fun emptyVisual(emptyVisual: CfnDashboard.EmptyVisualProperty) {
    cdkBuilder.emptyVisual(emptyVisual)
  }

  public fun filledMapVisual(filledMapVisual: IResolvable) {
    cdkBuilder.filledMapVisual(filledMapVisual)
  }

  public fun filledMapVisual(filledMapVisual: CfnDashboard.FilledMapVisualProperty) {
    cdkBuilder.filledMapVisual(filledMapVisual)
  }

  public fun funnelChartVisual(funnelChartVisual: IResolvable) {
    cdkBuilder.funnelChartVisual(funnelChartVisual)
  }

  public fun funnelChartVisual(funnelChartVisual: CfnDashboard.FunnelChartVisualProperty) {
    cdkBuilder.funnelChartVisual(funnelChartVisual)
  }

  public fun gaugeChartVisual(gaugeChartVisual: IResolvable) {
    cdkBuilder.gaugeChartVisual(gaugeChartVisual)
  }

  public fun gaugeChartVisual(gaugeChartVisual: CfnDashboard.GaugeChartVisualProperty) {
    cdkBuilder.gaugeChartVisual(gaugeChartVisual)
  }

  public fun geospatialMapVisual(geospatialMapVisual: IResolvable) {
    cdkBuilder.geospatialMapVisual(geospatialMapVisual)
  }

  public fun geospatialMapVisual(geospatialMapVisual: CfnDashboard.GeospatialMapVisualProperty) {
    cdkBuilder.geospatialMapVisual(geospatialMapVisual)
  }

  public fun heatMapVisual(heatMapVisual: IResolvable) {
    cdkBuilder.heatMapVisual(heatMapVisual)
  }

  public fun heatMapVisual(heatMapVisual: CfnDashboard.HeatMapVisualProperty) {
    cdkBuilder.heatMapVisual(heatMapVisual)
  }

  public fun histogramVisual(histogramVisual: IResolvable) {
    cdkBuilder.histogramVisual(histogramVisual)
  }

  public fun histogramVisual(histogramVisual: CfnDashboard.HistogramVisualProperty) {
    cdkBuilder.histogramVisual(histogramVisual)
  }

  public fun insightVisual(insightVisual: IResolvable) {
    cdkBuilder.insightVisual(insightVisual)
  }

  public fun insightVisual(insightVisual: CfnDashboard.InsightVisualProperty) {
    cdkBuilder.insightVisual(insightVisual)
  }

  public fun kpiVisual(kpiVisual: IResolvable) {
    cdkBuilder.kpiVisual(kpiVisual)
  }

  public fun kpiVisual(kpiVisual: CfnDashboard.KPIVisualProperty) {
    cdkBuilder.kpiVisual(kpiVisual)
  }

  public fun lineChartVisual(lineChartVisual: IResolvable) {
    cdkBuilder.lineChartVisual(lineChartVisual)
  }

  public fun lineChartVisual(lineChartVisual: CfnDashboard.LineChartVisualProperty) {
    cdkBuilder.lineChartVisual(lineChartVisual)
  }

  public fun pieChartVisual(pieChartVisual: IResolvable) {
    cdkBuilder.pieChartVisual(pieChartVisual)
  }

  public fun pieChartVisual(pieChartVisual: CfnDashboard.PieChartVisualProperty) {
    cdkBuilder.pieChartVisual(pieChartVisual)
  }

  public fun pivotTableVisual(pivotTableVisual: IResolvable) {
    cdkBuilder.pivotTableVisual(pivotTableVisual)
  }

  public fun pivotTableVisual(pivotTableVisual: CfnDashboard.PivotTableVisualProperty) {
    cdkBuilder.pivotTableVisual(pivotTableVisual)
  }

  public fun radarChartVisual(radarChartVisual: IResolvable) {
    cdkBuilder.radarChartVisual(radarChartVisual)
  }

  public fun radarChartVisual(radarChartVisual: CfnDashboard.RadarChartVisualProperty) {
    cdkBuilder.radarChartVisual(radarChartVisual)
  }

  public fun sankeyDiagramVisual(sankeyDiagramVisual: IResolvable) {
    cdkBuilder.sankeyDiagramVisual(sankeyDiagramVisual)
  }

  public fun sankeyDiagramVisual(sankeyDiagramVisual: CfnDashboard.SankeyDiagramVisualProperty) {
    cdkBuilder.sankeyDiagramVisual(sankeyDiagramVisual)
  }

  public fun scatterPlotVisual(scatterPlotVisual: IResolvable) {
    cdkBuilder.scatterPlotVisual(scatterPlotVisual)
  }

  public fun scatterPlotVisual(scatterPlotVisual: CfnDashboard.ScatterPlotVisualProperty) {
    cdkBuilder.scatterPlotVisual(scatterPlotVisual)
  }

  public fun tableVisual(tableVisual: IResolvable) {
    cdkBuilder.tableVisual(tableVisual)
  }

  public fun tableVisual(tableVisual: CfnDashboard.TableVisualProperty) {
    cdkBuilder.tableVisual(tableVisual)
  }

  public fun treeMapVisual(treeMapVisual: IResolvable) {
    cdkBuilder.treeMapVisual(treeMapVisual)
  }

  public fun treeMapVisual(treeMapVisual: CfnDashboard.TreeMapVisualProperty) {
    cdkBuilder.treeMapVisual(treeMapVisual)
  }

  public fun waterfallVisual(waterfallVisual: IResolvable) {
    cdkBuilder.waterfallVisual(waterfallVisual)
  }

  public fun waterfallVisual(waterfallVisual: CfnDashboard.WaterfallVisualProperty) {
    cdkBuilder.waterfallVisual(waterfallVisual)
  }

  public fun wordCloudVisual(wordCloudVisual: IResolvable) {
    cdkBuilder.wordCloudVisual(wordCloudVisual)
  }

  public fun wordCloudVisual(wordCloudVisual: CfnDashboard.WordCloudVisualProperty) {
    cdkBuilder.wordCloudVisual(wordCloudVisual)
  }

  public fun build(): CfnDashboard.VisualProperty = cdkBuilder.build()
}
