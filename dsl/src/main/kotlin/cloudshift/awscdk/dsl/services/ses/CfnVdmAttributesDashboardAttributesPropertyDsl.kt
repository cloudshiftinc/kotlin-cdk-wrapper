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

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.CfnVdmAttributes

/**
 * Settings for your VDM configuration as applicable to the Dashboard.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.*;
 * DashboardAttributesProperty dashboardAttributesProperty = DashboardAttributesProperty.builder()
 * .engagementMetrics("engagementMetrics")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-vdmattributes-dashboardattributes.html)
 */
@CdkDslMarker
public class CfnVdmAttributesDashboardAttributesPropertyDsl {
    private val cdkBuilder: CfnVdmAttributes.DashboardAttributesProperty.Builder =
        CfnVdmAttributes.DashboardAttributesProperty.builder()

    /**
     * @param engagementMetrics Specifies the status of your VDM engagement metrics collection. Can
     *   be one of the following:.
     * * `ENABLED` – Amazon SES enables engagement metrics for your account.
     * * `DISABLED` – Amazon SES disables engagement metrics for your account.
     */
    public fun engagementMetrics(engagementMetrics: String) {
        cdkBuilder.engagementMetrics(engagementMetrics)
    }

    public fun build(): CfnVdmAttributes.DashboardAttributesProperty = cdkBuilder.build()
}
