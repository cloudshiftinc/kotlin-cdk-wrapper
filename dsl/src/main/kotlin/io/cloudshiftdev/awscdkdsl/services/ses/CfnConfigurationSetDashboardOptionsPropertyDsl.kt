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

package io.cloudshiftdev.awscdkdsl.services.ses

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.CfnConfigurationSet

/**
 * Settings for your VDM configuration as applicable to the Dashboard.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.*;
 * DashboardOptionsProperty dashboardOptionsProperty = DashboardOptionsProperty.builder()
 * .engagementMetrics("engagementMetrics")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationset-dashboardoptions.html)
 */
@CdkDslMarker
public class CfnConfigurationSetDashboardOptionsPropertyDsl {
    private val cdkBuilder: CfnConfigurationSet.DashboardOptionsProperty.Builder =
        CfnConfigurationSet.DashboardOptionsProperty.builder()

    /**
     * @param engagementMetrics Specifies the status of your VDM engagement metrics collection. Can
     *   be one of the following:.
     * * `ENABLED` – Amazon SES enables engagement metrics for the configuration set.
     * * `DISABLED` – Amazon SES disables engagement metrics for the configuration set.
     */
    public fun engagementMetrics(engagementMetrics: String) {
        cdkBuilder.engagementMetrics(engagementMetrics)
    }

    public fun build(): CfnConfigurationSet.DashboardOptionsProperty = cdkBuilder.build()
}
