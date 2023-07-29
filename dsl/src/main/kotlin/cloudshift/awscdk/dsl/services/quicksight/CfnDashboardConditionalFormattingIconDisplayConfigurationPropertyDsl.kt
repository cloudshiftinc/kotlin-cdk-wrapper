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
import software.amazon.awscdk.services.quicksight.CfnDashboard

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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-conditionalformattingicondisplayconfiguration.html)
 */
@CdkDslMarker
public class CfnDashboardConditionalFormattingIconDisplayConfigurationPropertyDsl {
    private val cdkBuilder:
        CfnDashboard.ConditionalFormattingIconDisplayConfigurationProperty.Builder =
        CfnDashboard.ConditionalFormattingIconDisplayConfigurationProperty.builder()

    /** @param iconDisplayOption Determines the icon display configuration. */
    public fun iconDisplayOption(iconDisplayOption: String) {
        cdkBuilder.iconDisplayOption(iconDisplayOption)
    }

    public fun build(): CfnDashboard.ConditionalFormattingIconDisplayConfigurationProperty =
        cdkBuilder.build()
}
