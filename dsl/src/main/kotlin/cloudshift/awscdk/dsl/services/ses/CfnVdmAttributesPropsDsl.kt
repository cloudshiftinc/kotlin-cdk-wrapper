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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ses.CfnVdmAttributes
import software.amazon.awscdk.services.ses.CfnVdmAttributesProps

/**
 * Properties for defining a `CfnVdmAttributes`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.*;
 * CfnVdmAttributesProps cfnVdmAttributesProps = CfnVdmAttributesProps.builder()
 * .dashboardAttributes(DashboardAttributesProperty.builder()
 * .engagementMetrics("engagementMetrics")
 * .build())
 * .guardianAttributes(GuardianAttributesProperty.builder()
 * .optimizedSharedDelivery("optimizedSharedDelivery")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-vdmattributes.html)
 */
@CdkDslMarker
public class CfnVdmAttributesPropsDsl {
    private val cdkBuilder: CfnVdmAttributesProps.Builder = CfnVdmAttributesProps.builder()

    /**
     * @param dashboardAttributes Specifies additional settings for your VDM configuration as
     *   applicable to the Dashboard.
     */
    public fun dashboardAttributes(dashboardAttributes: IResolvable) {
        cdkBuilder.dashboardAttributes(dashboardAttributes)
    }

    /**
     * @param dashboardAttributes Specifies additional settings for your VDM configuration as
     *   applicable to the Dashboard.
     */
    public fun dashboardAttributes(
        dashboardAttributes: CfnVdmAttributes.DashboardAttributesProperty
    ) {
        cdkBuilder.dashboardAttributes(dashboardAttributes)
    }

    /**
     * @param guardianAttributes Specifies additional settings for your VDM configuration as
     *   applicable to the Guardian.
     */
    public fun guardianAttributes(guardianAttributes: IResolvable) {
        cdkBuilder.guardianAttributes(guardianAttributes)
    }

    /**
     * @param guardianAttributes Specifies additional settings for your VDM configuration as
     *   applicable to the Guardian.
     */
    public fun guardianAttributes(guardianAttributes: CfnVdmAttributes.GuardianAttributesProperty) {
        cdkBuilder.guardianAttributes(guardianAttributes)
    }

    public fun build(): CfnVdmAttributesProps = cdkBuilder.build()
}
