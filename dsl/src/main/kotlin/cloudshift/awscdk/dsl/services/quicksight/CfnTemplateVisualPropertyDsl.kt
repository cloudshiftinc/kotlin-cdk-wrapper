@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateVisualPropertyDsl {
    private val cdkBuilder: CfnTemplate.VisualProperty.Builder = CfnTemplate.VisualProperty.builder()

    public fun barChartVisual(barChartVisual: IResolvable) {
        cdkBuilder.barChartVisual(barChartVisual)
    }

    public fun barChartVisual(barChartVisual: CfnTemplate.BarChartVisualProperty) {
        cdkBuilder.barChartVisual(barChartVisual)
    }

    public fun boxPlotVisual(boxPlotVisual: IResolvable) {
        cdkBuilder.boxPlotVisual(boxPlotVisual)
    }

    public fun boxPlotVisual(boxPlotVisual: CfnTemplate.BoxPlotVisualProperty) {
        cdkBuilder.boxPlotVisual(boxPlotVisual)
    }

    public fun comboChartVisual(comboChartVisual: IResolvable) {
        cdkBuilder.comboChartVisual(comboChartVisual)
    }

    public fun comboChartVisual(comboChartVisual: CfnTemplate.ComboChartVisualProperty) {
        cdkBuilder.comboChartVisual(comboChartVisual)
    }

    public fun customContentVisual(customContentVisual: IResolvable) {
        cdkBuilder.customContentVisual(customContentVisual)
    }

    public fun customContentVisual(customContentVisual: CfnTemplate.CustomContentVisualProperty) {
        cdkBuilder.customContentVisual(customContentVisual)
    }

    public fun emptyVisual(emptyVisual: IResolvable) {
        cdkBuilder.emptyVisual(emptyVisual)
    }

    public fun emptyVisual(emptyVisual: CfnTemplate.EmptyVisualProperty) {
        cdkBuilder.emptyVisual(emptyVisual)
    }

    public fun filledMapVisual(filledMapVisual: IResolvable) {
        cdkBuilder.filledMapVisual(filledMapVisual)
    }

    public fun filledMapVisual(filledMapVisual: CfnTemplate.FilledMapVisualProperty) {
        cdkBuilder.filledMapVisual(filledMapVisual)
    }

    public fun funnelChartVisual(funnelChartVisual: IResolvable) {
        cdkBuilder.funnelChartVisual(funnelChartVisual)
    }

    public fun funnelChartVisual(funnelChartVisual: CfnTemplate.FunnelChartVisualProperty) {
        cdkBuilder.funnelChartVisual(funnelChartVisual)
    }

    public fun gaugeChartVisual(gaugeChartVisual: IResolvable) {
        cdkBuilder.gaugeChartVisual(gaugeChartVisual)
    }

    public fun gaugeChartVisual(gaugeChartVisual: CfnTemplate.GaugeChartVisualProperty) {
        cdkBuilder.gaugeChartVisual(gaugeChartVisual)
    }

    public fun geospatialMapVisual(geospatialMapVisual: IResolvable) {
        cdkBuilder.geospatialMapVisual(geospatialMapVisual)
    }

    public fun geospatialMapVisual(geospatialMapVisual: CfnTemplate.GeospatialMapVisualProperty) {
        cdkBuilder.geospatialMapVisual(geospatialMapVisual)
    }

    public fun heatMapVisual(heatMapVisual: IResolvable) {
        cdkBuilder.heatMapVisual(heatMapVisual)
    }

    public fun heatMapVisual(heatMapVisual: CfnTemplate.HeatMapVisualProperty) {
        cdkBuilder.heatMapVisual(heatMapVisual)
    }

    public fun histogramVisual(histogramVisual: IResolvable) {
        cdkBuilder.histogramVisual(histogramVisual)
    }

    public fun histogramVisual(histogramVisual: CfnTemplate.HistogramVisualProperty) {
        cdkBuilder.histogramVisual(histogramVisual)
    }

    public fun insightVisual(insightVisual: IResolvable) {
        cdkBuilder.insightVisual(insightVisual)
    }

    public fun insightVisual(insightVisual: CfnTemplate.InsightVisualProperty) {
        cdkBuilder.insightVisual(insightVisual)
    }

    public fun kpiVisual(kpiVisual: IResolvable) {
        cdkBuilder.kpiVisual(kpiVisual)
    }

    public fun kpiVisual(kpiVisual: CfnTemplate.KPIVisualProperty) {
        cdkBuilder.kpiVisual(kpiVisual)
    }

    public fun lineChartVisual(lineChartVisual: IResolvable) {
        cdkBuilder.lineChartVisual(lineChartVisual)
    }

    public fun lineChartVisual(lineChartVisual: CfnTemplate.LineChartVisualProperty) {
        cdkBuilder.lineChartVisual(lineChartVisual)
    }

    public fun pieChartVisual(pieChartVisual: IResolvable) {
        cdkBuilder.pieChartVisual(pieChartVisual)
    }

    public fun pieChartVisual(pieChartVisual: CfnTemplate.PieChartVisualProperty) {
        cdkBuilder.pieChartVisual(pieChartVisual)
    }

    public fun pivotTableVisual(pivotTableVisual: IResolvable) {
        cdkBuilder.pivotTableVisual(pivotTableVisual)
    }

    public fun pivotTableVisual(pivotTableVisual: CfnTemplate.PivotTableVisualProperty) {
        cdkBuilder.pivotTableVisual(pivotTableVisual)
    }

    public fun radarChartVisual(radarChartVisual: IResolvable) {
        cdkBuilder.radarChartVisual(radarChartVisual)
    }

    public fun radarChartVisual(radarChartVisual: CfnTemplate.RadarChartVisualProperty) {
        cdkBuilder.radarChartVisual(radarChartVisual)
    }

    public fun sankeyDiagramVisual(sankeyDiagramVisual: IResolvable) {
        cdkBuilder.sankeyDiagramVisual(sankeyDiagramVisual)
    }

    public fun sankeyDiagramVisual(sankeyDiagramVisual: CfnTemplate.SankeyDiagramVisualProperty) {
        cdkBuilder.sankeyDiagramVisual(sankeyDiagramVisual)
    }

    public fun scatterPlotVisual(scatterPlotVisual: IResolvable) {
        cdkBuilder.scatterPlotVisual(scatterPlotVisual)
    }

    public fun scatterPlotVisual(scatterPlotVisual: CfnTemplate.ScatterPlotVisualProperty) {
        cdkBuilder.scatterPlotVisual(scatterPlotVisual)
    }

    public fun tableVisual(tableVisual: IResolvable) {
        cdkBuilder.tableVisual(tableVisual)
    }

    public fun tableVisual(tableVisual: CfnTemplate.TableVisualProperty) {
        cdkBuilder.tableVisual(tableVisual)
    }

    public fun treeMapVisual(treeMapVisual: IResolvable) {
        cdkBuilder.treeMapVisual(treeMapVisual)
    }

    public fun treeMapVisual(treeMapVisual: CfnTemplate.TreeMapVisualProperty) {
        cdkBuilder.treeMapVisual(treeMapVisual)
    }

    public fun waterfallVisual(waterfallVisual: IResolvable) {
        cdkBuilder.waterfallVisual(waterfallVisual)
    }

    public fun waterfallVisual(waterfallVisual: CfnTemplate.WaterfallVisualProperty) {
        cdkBuilder.waterfallVisual(waterfallVisual)
    }

    public fun wordCloudVisual(wordCloudVisual: IResolvable) {
        cdkBuilder.wordCloudVisual(wordCloudVisual)
    }

    public fun wordCloudVisual(wordCloudVisual: CfnTemplate.WordCloudVisualProperty) {
        cdkBuilder.wordCloudVisual(wordCloudVisual)
    }

    public fun build(): CfnTemplate.VisualProperty = cdkBuilder.build()
}
