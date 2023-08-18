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
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The series axis configuration of a line chart.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * Object dataDriven;
 * LineSeriesAxisDisplayOptionsProperty lineSeriesAxisDisplayOptionsProperty =
 * LineSeriesAxisDisplayOptionsProperty.builder()
 * .axisOptions(AxisDisplayOptionsProperty.builder()
 * .axisLineVisibility("axisLineVisibility")
 * .axisOffset("axisOffset")
 * .dataOptions(AxisDataOptionsProperty.builder()
 * .dateAxisOptions(DateAxisOptionsProperty.builder()
 * .missingDateVisibility("missingDateVisibility")
 * .build())
 * .numericAxisOptions(NumericAxisOptionsProperty.builder()
 * .range(AxisDisplayRangeProperty.builder()
 * .dataDriven(dataDriven)
 * .minMax(AxisDisplayMinMaxRangeProperty.builder()
 * .maximum(123)
 * .minimum(123)
 * .build())
 * .build())
 * .scale(AxisScaleProperty.builder()
 * .linear(AxisLinearScaleProperty.builder()
 * .stepCount(123)
 * .stepSize(123)
 * .build())
 * .logarithmic(AxisLogarithmicScaleProperty.builder()
 * .base(123)
 * .build())
 * .build())
 * .build())
 * .build())
 * .gridLineVisibility("gridLineVisibility")
 * .scrollbarOptions(ScrollBarOptionsProperty.builder()
 * .visibility("visibility")
 * .visibleRange(VisibleRangeOptionsProperty.builder()
 * .percentRange(PercentVisibleRangeProperty.builder()
 * .from(123)
 * .to(123)
 * .build())
 * .build())
 * .build())
 * .tickLabelOptions(AxisTickLabelOptionsProperty.builder()
 * .labelOptions(LabelOptionsProperty.builder()
 * .customLabel("customLabel")
 * .fontConfiguration(FontConfigurationProperty.builder()
 * .fontColor("fontColor")
 * .fontDecoration("fontDecoration")
 * .fontSize(FontSizeProperty.builder()
 * .relative("relative")
 * .build())
 * .fontStyle("fontStyle")
 * .fontWeight(FontWeightProperty.builder()
 * .name("name")
 * .build())
 * .build())
 * .visibility("visibility")
 * .build())
 * .rotationAngle(123)
 * .build())
 * .build())
 * .missingDataConfigurations(List.of(MissingDataConfigurationProperty.builder()
 * .treatmentOption("treatmentOption")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-lineseriesaxisdisplayoptions.html)
 */
@CdkDslMarker
public class CfnTemplateLineSeriesAxisDisplayOptionsPropertyDsl {
    private val cdkBuilder: CfnTemplate.LineSeriesAxisDisplayOptionsProperty.Builder =
        CfnTemplate.LineSeriesAxisDisplayOptionsProperty.builder()

    private val _missingDataConfigurations: MutableList<Any> = mutableListOf()

    /** @param axisOptions The options that determine the presentation of the line series axis. */
    public fun axisOptions(axisOptions: IResolvable) {
        cdkBuilder.axisOptions(axisOptions)
    }

    /** @param axisOptions The options that determine the presentation of the line series axis. */
    public fun axisOptions(axisOptions: CfnTemplate.AxisDisplayOptionsProperty) {
        cdkBuilder.axisOptions(axisOptions)
    }

    /**
     * @param missingDataConfigurations The configuration options that determine how missing data is
     *   treated during the rendering of a line chart.
     */
    public fun missingDataConfigurations(vararg missingDataConfigurations: Any) {
        _missingDataConfigurations.addAll(listOf(*missingDataConfigurations))
    }

    /**
     * @param missingDataConfigurations The configuration options that determine how missing data is
     *   treated during the rendering of a line chart.
     */
    public fun missingDataConfigurations(missingDataConfigurations: Collection<Any>) {
        _missingDataConfigurations.addAll(missingDataConfigurations)
    }

    /**
     * @param missingDataConfigurations The configuration options that determine how missing data is
     *   treated during the rendering of a line chart.
     */
    public fun missingDataConfigurations(missingDataConfigurations: IResolvable) {
        cdkBuilder.missingDataConfigurations(missingDataConfigurations)
    }

    public fun build(): CfnTemplate.LineSeriesAxisDisplayOptionsProperty {
        if (_missingDataConfigurations.isNotEmpty())
            cdkBuilder.missingDataConfigurations(_missingDataConfigurations)
        return cdkBuilder.build()
    }
}
