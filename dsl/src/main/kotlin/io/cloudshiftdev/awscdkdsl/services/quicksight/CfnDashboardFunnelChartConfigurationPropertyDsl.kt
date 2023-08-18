@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The configuration of a `FunnelChartVisual` .
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-funnelchartconfiguration.html)
 */
@CdkDslMarker
public class CfnDashboardFunnelChartConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.FunnelChartConfigurationProperty.Builder =
        CfnDashboard.FunnelChartConfigurationProperty.builder()

    /**
     * @param categoryLabelOptions The label options of the categories that are displayed in a
     *   `FunnelChartVisual` .
     */
    public fun categoryLabelOptions(categoryLabelOptions: IResolvable) {
        cdkBuilder.categoryLabelOptions(categoryLabelOptions)
    }

    /**
     * @param categoryLabelOptions The label options of the categories that are displayed in a
     *   `FunnelChartVisual` .
     */
    public fun categoryLabelOptions(
        categoryLabelOptions: CfnDashboard.ChartAxisLabelOptionsProperty
    ) {
        cdkBuilder.categoryLabelOptions(categoryLabelOptions)
    }

    /** @param dataLabelOptions The options that determine the presentation of the data labels. */
    public fun dataLabelOptions(dataLabelOptions: IResolvable) {
        cdkBuilder.dataLabelOptions(dataLabelOptions)
    }

    /** @param dataLabelOptions The options that determine the presentation of the data labels. */
    public fun dataLabelOptions(
        dataLabelOptions: CfnDashboard.FunnelChartDataLabelOptionsProperty
    ) {
        cdkBuilder.dataLabelOptions(dataLabelOptions)
    }

    /** @param fieldWells The field well configuration of a `FunnelChartVisual` . */
    public fun fieldWells(fieldWells: IResolvable) {
        cdkBuilder.fieldWells(fieldWells)
    }

    /** @param fieldWells The field well configuration of a `FunnelChartVisual` . */
    public fun fieldWells(fieldWells: CfnDashboard.FunnelChartFieldWellsProperty) {
        cdkBuilder.fieldWells(fieldWells)
    }

    /** @param sortConfiguration The sort configuration of a `FunnelChartVisual` . */
    public fun sortConfiguration(sortConfiguration: IResolvable) {
        cdkBuilder.sortConfiguration(sortConfiguration)
    }

    /** @param sortConfiguration The sort configuration of a `FunnelChartVisual` . */
    public fun sortConfiguration(
        sortConfiguration: CfnDashboard.FunnelChartSortConfigurationProperty
    ) {
        cdkBuilder.sortConfiguration(sortConfiguration)
    }

    /** @param tooltip The tooltip configuration of a `FunnelChartVisual` . */
    public fun tooltip(tooltip: IResolvable) {
        cdkBuilder.tooltip(tooltip)
    }

    /** @param tooltip The tooltip configuration of a `FunnelChartVisual` . */
    public fun tooltip(tooltip: CfnDashboard.TooltipOptionsProperty) {
        cdkBuilder.tooltip(tooltip)
    }

    /**
     * @param valueLabelOptions The label options for the values that are displayed in a
     *   `FunnelChartVisual` .
     */
    public fun valueLabelOptions(valueLabelOptions: IResolvable) {
        cdkBuilder.valueLabelOptions(valueLabelOptions)
    }

    /**
     * @param valueLabelOptions The label options for the values that are displayed in a
     *   `FunnelChartVisual` .
     */
    public fun valueLabelOptions(valueLabelOptions: CfnDashboard.ChartAxisLabelOptionsProperty) {
        cdkBuilder.valueLabelOptions(valueLabelOptions)
    }

    /** @param visualPalette The visual palette configuration of a `FunnelChartVisual` . */
    public fun visualPalette(visualPalette: IResolvable) {
        cdkBuilder.visualPalette(visualPalette)
    }

    /** @param visualPalette The visual palette configuration of a `FunnelChartVisual` . */
    public fun visualPalette(visualPalette: CfnDashboard.VisualPaletteProperty) {
        cdkBuilder.visualPalette(visualPalette)
    }

    public fun build(): CfnDashboard.FunnelChartConfigurationProperty = cdkBuilder.build()
}
