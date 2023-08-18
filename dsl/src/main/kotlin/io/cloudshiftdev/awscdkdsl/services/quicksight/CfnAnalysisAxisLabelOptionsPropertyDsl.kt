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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The label options for a chart axis.
 *
 * You must specify the field that the label is targeted to.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * AxisLabelOptionsProperty axisLabelOptionsProperty = AxisLabelOptionsProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-axislabeloptions.html)
 */
@CdkDslMarker
public class CfnAnalysisAxisLabelOptionsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.AxisLabelOptionsProperty.Builder =
        CfnAnalysis.AxisLabelOptionsProperty.builder()

    /** @param applyTo The options that indicate which field the label belongs to. */
    public fun applyTo(applyTo: IResolvable) {
        cdkBuilder.applyTo(applyTo)
    }

    /** @param applyTo The options that indicate which field the label belongs to. */
    public fun applyTo(applyTo: CfnAnalysis.AxisLabelReferenceOptionsProperty) {
        cdkBuilder.applyTo(applyTo)
    }

    /** @param customLabel The text for the axis label. */
    public fun customLabel(customLabel: String) {
        cdkBuilder.customLabel(customLabel)
    }

    /** @param fontConfiguration The font configuration of the axis label. */
    public fun fontConfiguration(fontConfiguration: IResolvable) {
        cdkBuilder.fontConfiguration(fontConfiguration)
    }

    /** @param fontConfiguration The font configuration of the axis label. */
    public fun fontConfiguration(fontConfiguration: CfnAnalysis.FontConfigurationProperty) {
        cdkBuilder.fontConfiguration(fontConfiguration)
    }

    public fun build(): CfnAnalysis.AxisLabelOptionsProperty = cdkBuilder.build()
}
