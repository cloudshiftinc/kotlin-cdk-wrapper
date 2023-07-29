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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The configuration of a `FunnelChartVisual` .
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-funnelchartconfiguration.html)
 */
@CdkDslMarker
public class CfnAnalysisFunnelChartConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.FunnelChartConfigurationProperty.Builder =
        CfnAnalysis.FunnelChartConfigurationProperty.builder()

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
        categoryLabelOptions: CfnAnalysis.ChartAxisLabelOptionsProperty
    ) {
        cdkBuilder.categoryLabelOptions(categoryLabelOptions)
    }

    /** @param dataLabelOptions The options that determine the presentation of the data labels. */
    public fun dataLabelOptions(dataLabelOptions: IResolvable) {
        cdkBuilder.dataLabelOptions(dataLabelOptions)
    }

    /** @param dataLabelOptions The options that determine the presentation of the data labels. */
    public fun dataLabelOptions(dataLabelOptions: CfnAnalysis.FunnelChartDataLabelOptionsProperty) {
        cdkBuilder.dataLabelOptions(dataLabelOptions)
    }

    /** @param fieldWells The field well configuration of a `FunnelChartVisual` . */
    public fun fieldWells(fieldWells: IResolvable) {
        cdkBuilder.fieldWells(fieldWells)
    }

    /** @param fieldWells The field well configuration of a `FunnelChartVisual` . */
    public fun fieldWells(fieldWells: CfnAnalysis.FunnelChartFieldWellsProperty) {
        cdkBuilder.fieldWells(fieldWells)
    }

    /** @param sortConfiguration The sort configuration of a `FunnelChartVisual` . */
    public fun sortConfiguration(sortConfiguration: IResolvable) {
        cdkBuilder.sortConfiguration(sortConfiguration)
    }

    /** @param sortConfiguration The sort configuration of a `FunnelChartVisual` . */
    public fun sortConfiguration(
        sortConfiguration: CfnAnalysis.FunnelChartSortConfigurationProperty
    ) {
        cdkBuilder.sortConfiguration(sortConfiguration)
    }

    /** @param tooltip The tooltip configuration of a `FunnelChartVisual` . */
    public fun tooltip(tooltip: IResolvable) {
        cdkBuilder.tooltip(tooltip)
    }

    /** @param tooltip The tooltip configuration of a `FunnelChartVisual` . */
    public fun tooltip(tooltip: CfnAnalysis.TooltipOptionsProperty) {
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
    public fun valueLabelOptions(valueLabelOptions: CfnAnalysis.ChartAxisLabelOptionsProperty) {
        cdkBuilder.valueLabelOptions(valueLabelOptions)
    }

    /** @param visualPalette The visual palette configuration of a `FunnelChartVisual` . */
    public fun visualPalette(visualPalette: IResolvable) {
        cdkBuilder.visualPalette(visualPalette)
    }

    /** @param visualPalette The visual palette configuration of a `FunnelChartVisual` . */
    public fun visualPalette(visualPalette: CfnAnalysis.VisualPaletteProperty) {
        cdkBuilder.visualPalette(visualPalette)
    }

    public fun build(): CfnAnalysis.FunnelChartConfigurationProperty = cdkBuilder.build()
}
