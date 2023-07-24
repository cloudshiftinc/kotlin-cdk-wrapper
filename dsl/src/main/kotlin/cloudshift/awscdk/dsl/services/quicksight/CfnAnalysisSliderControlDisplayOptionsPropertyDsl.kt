@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The display options of a control.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * SliderControlDisplayOptionsProperty sliderControlDisplayOptionsProperty =
 * SliderControlDisplayOptionsProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-slidercontroldisplayoptions.html)
 */
@CdkDslMarker
public class CfnAnalysisSliderControlDisplayOptionsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.SliderControlDisplayOptionsProperty.Builder =
        CfnAnalysis.SliderControlDisplayOptionsProperty.builder()

    /**
     * @param titleOptions The options to configure the title visibility, name, and font size.
     */
    public fun titleOptions(titleOptions: IResolvable) {
        cdkBuilder.titleOptions(titleOptions)
    }

    /**
     * @param titleOptions The options to configure the title visibility, name, and font size.
     */
    public fun titleOptions(titleOptions: CfnAnalysis.LabelOptionsProperty) {
        cdkBuilder.titleOptions(titleOptions)
    }

    public fun build(): CfnAnalysis.SliderControlDisplayOptionsProperty = cdkBuilder.build()
}
