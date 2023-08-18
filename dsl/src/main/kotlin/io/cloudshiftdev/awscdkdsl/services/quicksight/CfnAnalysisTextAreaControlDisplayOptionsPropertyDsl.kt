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
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The display options of a control.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * TextAreaControlDisplayOptionsProperty textAreaControlDisplayOptionsProperty =
 * TextAreaControlDisplayOptionsProperty.builder()
 * .placeholderOptions(TextControlPlaceholderOptionsProperty.builder()
 * .visibility("visibility")
 * .build())
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-textareacontroldisplayoptions.html)
 */
@CdkDslMarker
public class CfnAnalysisTextAreaControlDisplayOptionsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.TextAreaControlDisplayOptionsProperty.Builder =
        CfnAnalysis.TextAreaControlDisplayOptionsProperty.builder()

    /**
     * @param placeholderOptions The configuration of the placeholder options in a text area
     *   control.
     */
    public fun placeholderOptions(placeholderOptions: IResolvable) {
        cdkBuilder.placeholderOptions(placeholderOptions)
    }

    /**
     * @param placeholderOptions The configuration of the placeholder options in a text area
     *   control.
     */
    public fun placeholderOptions(
        placeholderOptions: CfnAnalysis.TextControlPlaceholderOptionsProperty
    ) {
        cdkBuilder.placeholderOptions(placeholderOptions)
    }

    /** @param titleOptions The options to configure the title visibility, name, and font size. */
    public fun titleOptions(titleOptions: IResolvable) {
        cdkBuilder.titleOptions(titleOptions)
    }

    /** @param titleOptions The options to configure the title visibility, name, and font size. */
    public fun titleOptions(titleOptions: CfnAnalysis.LabelOptionsProperty) {
        cdkBuilder.titleOptions(titleOptions)
    }

    public fun build(): CfnAnalysis.TextAreaControlDisplayOptionsProperty = cdkBuilder.build()
}
