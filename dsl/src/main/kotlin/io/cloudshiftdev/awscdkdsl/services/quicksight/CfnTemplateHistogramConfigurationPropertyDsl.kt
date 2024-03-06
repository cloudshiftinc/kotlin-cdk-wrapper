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
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The configuration for a `HistogramVisual` .
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-histogramconfiguration.html)
 */
@CdkDslMarker
public class CfnTemplateHistogramConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.HistogramConfigurationProperty.Builder =
        CfnTemplate.HistogramConfigurationProperty.builder()

    /** @param binOptions The options that determine the presentation of histogram bins. */
    public fun binOptions(binOptions: IResolvable) {
        cdkBuilder.binOptions(binOptions)
    }

    /** @param binOptions The options that determine the presentation of histogram bins. */
    public fun binOptions(binOptions: CfnTemplate.HistogramBinOptionsProperty) {
        cdkBuilder.binOptions(binOptions)
    }

    /** @param dataLabels The data label configuration of a histogram. */
    public fun dataLabels(dataLabels: IResolvable) {
        cdkBuilder.dataLabels(dataLabels)
    }

    /** @param dataLabels The data label configuration of a histogram. */
    public fun dataLabels(dataLabels: CfnTemplate.DataLabelOptionsProperty) {
        cdkBuilder.dataLabels(dataLabels)
    }

    /** @param fieldWells The field well configuration of a histogram. */
    public fun fieldWells(fieldWells: IResolvable) {
        cdkBuilder.fieldWells(fieldWells)
    }

    /** @param fieldWells The field well configuration of a histogram. */
    public fun fieldWells(fieldWells: CfnTemplate.HistogramFieldWellsProperty) {
        cdkBuilder.fieldWells(fieldWells)
    }

    /** @param tooltip The tooltip configuration of a histogram. */
    public fun tooltip(tooltip: IResolvable) {
        cdkBuilder.tooltip(tooltip)
    }

    /** @param tooltip The tooltip configuration of a histogram. */
    public fun tooltip(tooltip: CfnTemplate.TooltipOptionsProperty) {
        cdkBuilder.tooltip(tooltip)
    }

    /** @param visualPalette The visual palette configuration of a histogram. */
    public fun visualPalette(visualPalette: IResolvable) {
        cdkBuilder.visualPalette(visualPalette)
    }

    /** @param visualPalette The visual palette configuration of a histogram. */
    public fun visualPalette(visualPalette: CfnTemplate.VisualPaletteProperty) {
        cdkBuilder.visualPalette(visualPalette)
    }

    /** @param xAxisDisplayOptions The options that determine the presentation of the x-axis. */
    public fun xAxisDisplayOptions(xAxisDisplayOptions: IResolvable) {
        cdkBuilder.xAxisDisplayOptions(xAxisDisplayOptions)
    }

    /** @param xAxisDisplayOptions The options that determine the presentation of the x-axis. */
    public fun xAxisDisplayOptions(xAxisDisplayOptions: CfnTemplate.AxisDisplayOptionsProperty) {
        cdkBuilder.xAxisDisplayOptions(xAxisDisplayOptions)
    }

    /** @param xAxisLabelOptions The options that determine the presentation of the x-axis label. */
    public fun xAxisLabelOptions(xAxisLabelOptions: IResolvable) {
        cdkBuilder.xAxisLabelOptions(xAxisLabelOptions)
    }

    /** @param xAxisLabelOptions The options that determine the presentation of the x-axis label. */
    public fun xAxisLabelOptions(xAxisLabelOptions: CfnTemplate.ChartAxisLabelOptionsProperty) {
        cdkBuilder.xAxisLabelOptions(xAxisLabelOptions)
    }

    /** @param yAxisDisplayOptions The options that determine the presentation of the y-axis. */
    public fun yAxisDisplayOptions(yAxisDisplayOptions: IResolvable) {
        cdkBuilder.yAxisDisplayOptions(yAxisDisplayOptions)
    }

    /** @param yAxisDisplayOptions The options that determine the presentation of the y-axis. */
    public fun yAxisDisplayOptions(yAxisDisplayOptions: CfnTemplate.AxisDisplayOptionsProperty) {
        cdkBuilder.yAxisDisplayOptions(yAxisDisplayOptions)
    }

    public fun build(): CfnTemplate.HistogramConfigurationProperty = cdkBuilder.build()
}
