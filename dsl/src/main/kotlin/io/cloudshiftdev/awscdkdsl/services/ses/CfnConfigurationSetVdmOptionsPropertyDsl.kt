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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ses.CfnConfigurationSet

/**
 * The Virtual Deliverability Manager (VDM) options that apply to a configuration set.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.*;
 * VdmOptionsProperty vdmOptionsProperty = VdmOptionsProperty.builder()
 * .dashboardOptions(DashboardOptionsProperty.builder()
 * .engagementMetrics("engagementMetrics")
 * .build())
 * .guardianOptions(GuardianOptionsProperty.builder()
 * .optimizedSharedDelivery("optimizedSharedDelivery")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationset-vdmoptions.html)
 */
@CdkDslMarker
public class CfnConfigurationSetVdmOptionsPropertyDsl {
    private val cdkBuilder: CfnConfigurationSet.VdmOptionsProperty.Builder =
        CfnConfigurationSet.VdmOptionsProperty.builder()

    /**
     * @param dashboardOptions Settings for your VDM configuration as applicable to the Dashboard.
     */
    public fun dashboardOptions(dashboardOptions: IResolvable) {
        cdkBuilder.dashboardOptions(dashboardOptions)
    }

    /**
     * @param dashboardOptions Settings for your VDM configuration as applicable to the Dashboard.
     */
    public fun dashboardOptions(dashboardOptions: CfnConfigurationSet.DashboardOptionsProperty) {
        cdkBuilder.dashboardOptions(dashboardOptions)
    }

    /** @param guardianOptions Settings for your VDM configuration as applicable to the Guardian. */
    public fun guardianOptions(guardianOptions: IResolvable) {
        cdkBuilder.guardianOptions(guardianOptions)
    }

    /** @param guardianOptions Settings for your VDM configuration as applicable to the Guardian. */
    public fun guardianOptions(guardianOptions: CfnConfigurationSet.GuardianOptionsProperty) {
        cdkBuilder.guardianOptions(guardianOptions)
    }

    public fun build(): CfnConfigurationSet.VdmOptionsProperty = cdkBuilder.build()
}
