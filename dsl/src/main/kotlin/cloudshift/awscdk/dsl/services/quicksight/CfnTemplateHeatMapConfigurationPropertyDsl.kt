@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The configuration of a heat map.
 *
 * Example:
 *
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-heatmapconfiguration.html)
 */
@CdkDslMarker
public class CfnTemplateHeatMapConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.HeatMapConfigurationProperty.Builder =
        CfnTemplate.HeatMapConfigurationProperty.builder()

    /**
     * @param colorScale The color options (gradient color, point of divergence) in a heat map.
     */
    public fun colorScale(colorScale: IResolvable) {
        cdkBuilder.colorScale(colorScale)
    }

    /**
     * @param colorScale The color options (gradient color, point of divergence) in a heat map.
     */
    public fun colorScale(colorScale: CfnTemplate.ColorScaleProperty) {
        cdkBuilder.colorScale(colorScale)
    }

    /**
     * @param columnLabelOptions The label options of the column that is displayed in a heat map.
     */
    public fun columnLabelOptions(columnLabelOptions: IResolvable) {
        cdkBuilder.columnLabelOptions(columnLabelOptions)
    }

    /**
     * @param columnLabelOptions The label options of the column that is displayed in a heat map.
     */
    public fun columnLabelOptions(columnLabelOptions: CfnTemplate.ChartAxisLabelOptionsProperty) {
        cdkBuilder.columnLabelOptions(columnLabelOptions)
    }

    /**
     * @param dataLabels The options that determine if visual data labels are displayed.
     */
    public fun dataLabels(dataLabels: IResolvable) {
        cdkBuilder.dataLabels(dataLabels)
    }

    /**
     * @param dataLabels The options that determine if visual data labels are displayed.
     */
    public fun dataLabels(dataLabels: CfnTemplate.DataLabelOptionsProperty) {
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
    public fun fieldWells(fieldWells: CfnTemplate.HeatMapFieldWellsProperty) {
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
    public fun legend(legend: CfnTemplate.LegendOptionsProperty) {
        cdkBuilder.legend(legend)
    }

    /**
     * @param rowLabelOptions The label options of the row that is displayed in a `heat map` .
     */
    public fun rowLabelOptions(rowLabelOptions: IResolvable) {
        cdkBuilder.rowLabelOptions(rowLabelOptions)
    }

    /**
     * @param rowLabelOptions The label options of the row that is displayed in a `heat map` .
     */
    public fun rowLabelOptions(rowLabelOptions: CfnTemplate.ChartAxisLabelOptionsProperty) {
        cdkBuilder.rowLabelOptions(rowLabelOptions)
    }

    /**
     * @param sortConfiguration The sort configuration of a heat map.
     */
    public fun sortConfiguration(sortConfiguration: IResolvable) {
        cdkBuilder.sortConfiguration(sortConfiguration)
    }

    /**
     * @param sortConfiguration The sort configuration of a heat map.
     */
    public fun sortConfiguration(sortConfiguration: CfnTemplate.HeatMapSortConfigurationProperty) {
        cdkBuilder.sortConfiguration(sortConfiguration)
    }

    /**
     * @param tooltip The tooltip display setup of the visual.
     */
    public fun tooltip(tooltip: IResolvable) {
        cdkBuilder.tooltip(tooltip)
    }

    /**
     * @param tooltip The tooltip display setup of the visual.
     */
    public fun tooltip(tooltip: CfnTemplate.TooltipOptionsProperty) {
        cdkBuilder.tooltip(tooltip)
    }

    public fun build(): CfnTemplate.HeatMapConfigurationProperty = cdkBuilder.build()
}
