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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The label options for an axis on a chart.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ChartAxisLabelOptionsProperty chartAxisLabelOptionsProperty =
 * ChartAxisLabelOptionsProperty.builder()
 * .axisLabelOptions(List.of(AxisLabelOptionsProperty.builder()
 * .applyTo(AxisLabelReferenceOptionsProperty.builder()
 * .column(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .fieldId("fieldId")
 * .build())
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
 * .build()))
 * .sortIconVisibility("sortIconVisibility")
 * .visibility("visibility")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-chartaxislabeloptions.html)
 */
@CdkDslMarker
public class CfnAnalysisChartAxisLabelOptionsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.ChartAxisLabelOptionsProperty.Builder =
        CfnAnalysis.ChartAxisLabelOptionsProperty.builder()

    private val _axisLabelOptions: MutableList<Any> = mutableListOf()

    /** @param axisLabelOptions The label options for a chart axis. */
    public fun axisLabelOptions(vararg axisLabelOptions: Any) {
        _axisLabelOptions.addAll(listOf(*axisLabelOptions))
    }

    /** @param axisLabelOptions The label options for a chart axis. */
    public fun axisLabelOptions(axisLabelOptions: Collection<Any>) {
        _axisLabelOptions.addAll(axisLabelOptions)
    }

    /** @param axisLabelOptions The label options for a chart axis. */
    public fun axisLabelOptions(axisLabelOptions: IResolvable) {
        cdkBuilder.axisLabelOptions(axisLabelOptions)
    }

    /**
     * @param sortIconVisibility The visibility configuration of the sort icon on a chart's axis
     *   label.
     */
    public fun sortIconVisibility(sortIconVisibility: String) {
        cdkBuilder.sortIconVisibility(sortIconVisibility)
    }

    /**
     * @param visibility The visibility of an axis label on a chart. Choose one of the following
     *   options:.
     * * `VISIBLE` : Shows the axis.
     * * `HIDDEN` : Hides the axis.
     */
    public fun visibility(visibility: String) {
        cdkBuilder.visibility(visibility)
    }

    public fun build(): CfnAnalysis.ChartAxisLabelOptionsProperty {
        if (_axisLabelOptions.isNotEmpty()) cdkBuilder.axisLabelOptions(_axisLabelOptions)
        return cdkBuilder.build()
    }
}
