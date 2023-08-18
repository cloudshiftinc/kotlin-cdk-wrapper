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
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * Determines the icon display configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ConditionalFormattingIconDisplayConfigurationProperty
 * conditionalFormattingIconDisplayConfigurationProperty =
 * ConditionalFormattingIconDisplayConfigurationProperty.builder()
 * .iconDisplayOption("iconDisplayOption")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-conditionalformattingicondisplayconfiguration.html)
 */
@CdkDslMarker
public class CfnTemplateConditionalFormattingIconDisplayConfigurationPropertyDsl {
    private val cdkBuilder:
        CfnTemplate.ConditionalFormattingIconDisplayConfigurationProperty.Builder =
        CfnTemplate.ConditionalFormattingIconDisplayConfigurationProperty.builder()

    /** @param iconDisplayOption Determines the icon display configuration. */
    public fun iconDisplayOption(iconDisplayOption: String) {
        cdkBuilder.iconDisplayOption(iconDisplayOption)
    }

    public fun build(): CfnTemplate.ConditionalFormattingIconDisplayConfigurationProperty =
        cdkBuilder.build()
}
