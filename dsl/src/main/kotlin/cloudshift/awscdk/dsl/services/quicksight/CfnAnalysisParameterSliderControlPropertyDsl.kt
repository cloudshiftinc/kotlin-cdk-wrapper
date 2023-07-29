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
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * A control to display a horizontal toggle bar.
 *
 * This is used to change a value by sliding the toggle.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ParameterSliderControlProperty parameterSliderControlProperty =
 * ParameterSliderControlProperty.builder()
 * .maximumValue(123)
 * .minimumValue(123)
 * .parameterControlId("parameterControlId")
 * .sourceParameterName("sourceParameterName")
 * .stepSize(123)
 * .title("title")
 * // the properties below are optional
 * .displayOptions(SliderControlDisplayOptionsProperty.builder()
 * .titleOptions(LabelOptionsProperty.builder()
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
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-parameterslidercontrol.html)
 */
@CdkDslMarker
public class CfnAnalysisParameterSliderControlPropertyDsl {
    private val cdkBuilder: CfnAnalysis.ParameterSliderControlProperty.Builder =
        CfnAnalysis.ParameterSliderControlProperty.builder()

    /** @param displayOptions The display options of a control. */
    public fun displayOptions(displayOptions: IResolvable) {
        cdkBuilder.displayOptions(displayOptions)
    }

    /** @param displayOptions The display options of a control. */
    public fun displayOptions(displayOptions: CfnAnalysis.SliderControlDisplayOptionsProperty) {
        cdkBuilder.displayOptions(displayOptions)
    }

    /** @param maximumValue The smaller value that is displayed at the left of the slider. */
    public fun maximumValue(maximumValue: Number) {
        cdkBuilder.maximumValue(maximumValue)
    }

    /** @param minimumValue The larger value that is displayed at the right of the slider. */
    public fun minimumValue(minimumValue: Number) {
        cdkBuilder.minimumValue(minimumValue)
    }

    /** @param parameterControlId The ID of the `ParameterSliderControl` . */
    public fun parameterControlId(parameterControlId: String) {
        cdkBuilder.parameterControlId(parameterControlId)
    }

    /** @param sourceParameterName The source parameter name of the `ParameterSliderControl` . */
    public fun sourceParameterName(sourceParameterName: String) {
        cdkBuilder.sourceParameterName(sourceParameterName)
    }

    /** @param stepSize The number of increments that the slider bar is divided into. */
    public fun stepSize(stepSize: Number) {
        cdkBuilder.stepSize(stepSize)
    }

    /** @param title The title of the `ParameterSliderControl` . */
    public fun title(title: String) {
        cdkBuilder.title(title)
    }

    public fun build(): CfnAnalysis.ParameterSliderControlProperty = cdkBuilder.build()
}
