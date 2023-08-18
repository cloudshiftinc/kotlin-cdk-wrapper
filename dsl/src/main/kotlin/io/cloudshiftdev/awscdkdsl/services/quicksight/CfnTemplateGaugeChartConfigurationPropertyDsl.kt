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
 * The configuration of a `GaugeChartVisual` .
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-gaugechartconfiguration.html)
 */
@CdkDslMarker
public class CfnTemplateGaugeChartConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.GaugeChartConfigurationProperty.Builder =
        CfnTemplate.GaugeChartConfigurationProperty.builder()

    /** @param dataLabels The data label configuration of a `GaugeChartVisual` . */
    public fun dataLabels(dataLabels: IResolvable) {
        cdkBuilder.dataLabels(dataLabels)
    }

    /** @param dataLabels The data label configuration of a `GaugeChartVisual` . */
    public fun dataLabels(dataLabels: CfnTemplate.DataLabelOptionsProperty) {
        cdkBuilder.dataLabels(dataLabels)
    }

    /** @param fieldWells The field well configuration of a `GaugeChartVisual` . */
    public fun fieldWells(fieldWells: IResolvable) {
        cdkBuilder.fieldWells(fieldWells)
    }

    /** @param fieldWells The field well configuration of a `GaugeChartVisual` . */
    public fun fieldWells(fieldWells: CfnTemplate.GaugeChartFieldWellsProperty) {
        cdkBuilder.fieldWells(fieldWells)
    }

    /**
     * @param gaugeChartOptions The options that determine the presentation of the
     *   `GaugeChartVisual` .
     */
    public fun gaugeChartOptions(gaugeChartOptions: IResolvable) {
        cdkBuilder.gaugeChartOptions(gaugeChartOptions)
    }

    /**
     * @param gaugeChartOptions The options that determine the presentation of the
     *   `GaugeChartVisual` .
     */
    public fun gaugeChartOptions(gaugeChartOptions: CfnTemplate.GaugeChartOptionsProperty) {
        cdkBuilder.gaugeChartOptions(gaugeChartOptions)
    }

    /** @param tooltipOptions The tooltip configuration of a `GaugeChartVisual` . */
    public fun tooltipOptions(tooltipOptions: IResolvable) {
        cdkBuilder.tooltipOptions(tooltipOptions)
    }

    /** @param tooltipOptions The tooltip configuration of a `GaugeChartVisual` . */
    public fun tooltipOptions(tooltipOptions: CfnTemplate.TooltipOptionsProperty) {
        cdkBuilder.tooltipOptions(tooltipOptions)
    }

    /** @param visualPalette The visual palette configuration of a `GaugeChartVisual` . */
    public fun visualPalette(visualPalette: IResolvable) {
        cdkBuilder.visualPalette(visualPalette)
    }

    /** @param visualPalette The visual palette configuration of a `GaugeChartVisual` . */
    public fun visualPalette(visualPalette: CfnTemplate.VisualPaletteProperty) {
        cdkBuilder.visualPalette(visualPalette)
    }

    public fun build(): CfnTemplate.GaugeChartConfigurationProperty = cdkBuilder.build()
}
