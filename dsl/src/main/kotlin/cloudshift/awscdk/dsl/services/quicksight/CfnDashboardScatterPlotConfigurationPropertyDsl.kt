@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The configuration of a scatter plot.
 *
 * Example:
 *
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-scatterplotconfiguration.html)
 */
@CdkDslMarker
public class CfnDashboardScatterPlotConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.ScatterPlotConfigurationProperty.Builder =
        CfnDashboard.ScatterPlotConfigurationProperty.builder()

    /**
     * @param dataLabels The options that determine if visual data labels are displayed.
     */
    public fun dataLabels(dataLabels: IResolvable) {
        cdkBuilder.dataLabels(dataLabels)
    }

    /**
     * @param dataLabels The options that determine if visual data labels are displayed.
     */
    public fun dataLabels(dataLabels: CfnDashboard.DataLabelOptionsProperty) {
        cdkBuilder.dataLabels(dataLabels)
    }

    /**
     * @param fieldWells The field wells of the visual.
     */
    public fun fieldWells(fieldWells: IResolvable) {
        cdkBuilder.fieldWells(fieldWells)
    }

    /**
     * @param fieldWells The field wells of the visual.
     */
    public fun fieldWells(fieldWells: CfnDashboard.ScatterPlotFieldWellsProperty) {
        cdkBuilder.fieldWells(fieldWells)
    }

    /**
     * @param legend The legend display setup of the visual.
     */
    public fun legend(legend: IResolvable) {
        cdkBuilder.legend(legend)
    }

    /**
     * @param legend The legend display setup of the visual.
     */
    public fun legend(legend: CfnDashboard.LegendOptionsProperty) {
        cdkBuilder.legend(legend)
    }

    /**
     * @param tooltip The legend display setup of the visual.
     */
    public fun tooltip(tooltip: IResolvable) {
        cdkBuilder.tooltip(tooltip)
    }

    /**
     * @param tooltip The legend display setup of the visual.
     */
    public fun tooltip(tooltip: CfnDashboard.TooltipOptionsProperty) {
        cdkBuilder.tooltip(tooltip)
    }

    /**
     * @param visualPalette The palette (chart color) display setup of the visual.
     */
    public fun visualPalette(visualPalette: IResolvable) {
        cdkBuilder.visualPalette(visualPalette)
    }

    /**
     * @param visualPalette The palette (chart color) display setup of the visual.
     */
    public fun visualPalette(visualPalette: CfnDashboard.VisualPaletteProperty) {
        cdkBuilder.visualPalette(visualPalette)
    }

    /**
     * @param xAxisDisplayOptions The label display options (grid line, range, scale, and axis step)
     * of the scatter plot's x-axis.
     */
    public fun xAxisDisplayOptions(xAxisDisplayOptions: IResolvable) {
        cdkBuilder.xAxisDisplayOptions(xAxisDisplayOptions)
    }

    /**
     * @param xAxisDisplayOptions The label display options (grid line, range, scale, and axis step)
     * of the scatter plot's x-axis.
     */
    public fun xAxisDisplayOptions(xAxisDisplayOptions: CfnDashboard.AxisDisplayOptionsProperty) {
        cdkBuilder.xAxisDisplayOptions(xAxisDisplayOptions)
    }

    /**
     * @param xAxisLabelOptions The label options (label text, label visibility, and sort icon
     * visibility) of the scatter plot's x-axis.
     */
    public fun xAxisLabelOptions(xAxisLabelOptions: IResolvable) {
        cdkBuilder.xAxisLabelOptions(xAxisLabelOptions)
    }

    /**
     * @param xAxisLabelOptions The label options (label text, label visibility, and sort icon
     * visibility) of the scatter plot's x-axis.
     */
    public fun xAxisLabelOptions(xAxisLabelOptions: CfnDashboard.ChartAxisLabelOptionsProperty) {
        cdkBuilder.xAxisLabelOptions(xAxisLabelOptions)
    }

    /**
     * @param yAxisDisplayOptions The label display options (grid line, range, scale, and axis step)
     * of the scatter plot's y-axis.
     */
    public fun yAxisDisplayOptions(yAxisDisplayOptions: IResolvable) {
        cdkBuilder.yAxisDisplayOptions(yAxisDisplayOptions)
    }

    /**
     * @param yAxisDisplayOptions The label display options (grid line, range, scale, and axis step)
     * of the scatter plot's y-axis.
     */
    public fun yAxisDisplayOptions(yAxisDisplayOptions: CfnDashboard.AxisDisplayOptionsProperty) {
        cdkBuilder.yAxisDisplayOptions(yAxisDisplayOptions)
    }

    /**
     * @param yAxisLabelOptions The label options (label text, label visibility, and sort icon
     * visibility) of the scatter plot's y-axis.
     */
    public fun yAxisLabelOptions(yAxisLabelOptions: IResolvable) {
        cdkBuilder.yAxisLabelOptions(yAxisLabelOptions)
    }

    /**
     * @param yAxisLabelOptions The label options (label text, label visibility, and sort icon
     * visibility) of the scatter plot's y-axis.
     */
    public fun yAxisLabelOptions(yAxisLabelOptions: CfnDashboard.ChartAxisLabelOptionsProperty) {
        cdkBuilder.yAxisLabelOptions(yAxisLabelOptions)
    }

    public fun build(): CfnDashboard.ScatterPlotConfigurationProperty = cdkBuilder.build()
}
