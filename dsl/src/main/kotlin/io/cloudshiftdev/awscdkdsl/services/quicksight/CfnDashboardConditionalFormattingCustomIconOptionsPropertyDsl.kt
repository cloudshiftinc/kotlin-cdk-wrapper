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
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * Custom icon options for an icon set.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ConditionalFormattingCustomIconOptionsProperty conditionalFormattingCustomIconOptionsProperty =
 * ConditionalFormattingCustomIconOptionsProperty.builder()
 * .icon("icon")
 * .unicodeIcon("unicodeIcon")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-conditionalformattingcustomiconoptions.html)
 */
@CdkDslMarker
public class CfnDashboardConditionalFormattingCustomIconOptionsPropertyDsl {
    private val cdkBuilder: CfnDashboard.ConditionalFormattingCustomIconOptionsProperty.Builder =
        CfnDashboard.ConditionalFormattingCustomIconOptionsProperty.builder()

    /** @param icon Determines the type of icon. */
    public fun icon(icon: String) {
        cdkBuilder.icon(icon)
    }

    /** @param unicodeIcon Determines the Unicode icon type. */
    public fun unicodeIcon(unicodeIcon: String) {
        cdkBuilder.unicodeIcon(unicodeIcon)
    }

    public fun build(): CfnDashboard.ConditionalFormattingCustomIconOptionsProperty =
        cdkBuilder.build()
}
