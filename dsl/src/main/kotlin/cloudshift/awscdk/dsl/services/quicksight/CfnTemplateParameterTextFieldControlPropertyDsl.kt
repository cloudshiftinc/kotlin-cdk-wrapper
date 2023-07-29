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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * A control to display a text box that is used to enter a single entry.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ParameterTextFieldControlProperty parameterTextFieldControlProperty =
 * ParameterTextFieldControlProperty.builder()
 * .parameterControlId("parameterControlId")
 * .sourceParameterName("sourceParameterName")
 * .title("title")
 * // the properties below are optional
 * .displayOptions(TextFieldControlDisplayOptionsProperty.builder()
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
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-parametertextfieldcontrol.html)
 */
@CdkDslMarker
public class CfnTemplateParameterTextFieldControlPropertyDsl {
    private val cdkBuilder: CfnTemplate.ParameterTextFieldControlProperty.Builder =
        CfnTemplate.ParameterTextFieldControlProperty.builder()

    /** @param displayOptions The display options of a control. */
    public fun displayOptions(displayOptions: IResolvable) {
        cdkBuilder.displayOptions(displayOptions)
    }

    /** @param displayOptions The display options of a control. */
    public fun displayOptions(displayOptions: CfnTemplate.TextFieldControlDisplayOptionsProperty) {
        cdkBuilder.displayOptions(displayOptions)
    }

    /** @param parameterControlId The ID of the `ParameterTextFieldControl` . */
    public fun parameterControlId(parameterControlId: String) {
        cdkBuilder.parameterControlId(parameterControlId)
    }

    /** @param sourceParameterName The source parameter name of the `ParameterTextFieldControl` . */
    public fun sourceParameterName(sourceParameterName: String) {
        cdkBuilder.sourceParameterName(sourceParameterName)
    }

    /** @param title The title of the `ParameterTextFieldControl` . */
    public fun title(title: String) {
        cdkBuilder.title(title)
    }

    public fun build(): CfnTemplate.ParameterTextFieldControlProperty = cdkBuilder.build()
}
