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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ses.CfnVdmAttributes
import software.constructs.Construct

/**
 * The Virtual Deliverability Manager (VDM) attributes that apply to your Amazon SES account.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.*;
 * CfnVdmAttributes cfnVdmAttributes = CfnVdmAttributes.Builder.create(this, "MyCfnVdmAttributes")
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
public class CfnVdmAttributesDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnVdmAttributes.Builder = CfnVdmAttributes.Builder.create(scope, id)

    /**
     * Specifies additional settings for your VDM configuration as applicable to the Dashboard.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-vdmattributes.html#cfn-ses-vdmattributes-dashboardattributes)
     *
     * @param dashboardAttributes Specifies additional settings for your VDM configuration as
     *   applicable to the Dashboard.
     */
    public fun dashboardAttributes(dashboardAttributes: IResolvable) {
        cdkBuilder.dashboardAttributes(dashboardAttributes)
    }

    /**
     * Specifies additional settings for your VDM configuration as applicable to the Dashboard.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-vdmattributes.html#cfn-ses-vdmattributes-dashboardattributes)
     *
     * @param dashboardAttributes Specifies additional settings for your VDM configuration as
     *   applicable to the Dashboard.
     */
    public fun dashboardAttributes(
        dashboardAttributes: CfnVdmAttributes.DashboardAttributesProperty
    ) {
        cdkBuilder.dashboardAttributes(dashboardAttributes)
    }

    /**
     * Specifies additional settings for your VDM configuration as applicable to the Guardian.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-vdmattributes.html#cfn-ses-vdmattributes-guardianattributes)
     *
     * @param guardianAttributes Specifies additional settings for your VDM configuration as
     *   applicable to the Guardian.
     */
    public fun guardianAttributes(guardianAttributes: IResolvable) {
        cdkBuilder.guardianAttributes(guardianAttributes)
    }

    /**
     * Specifies additional settings for your VDM configuration as applicable to the Guardian.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-vdmattributes.html#cfn-ses-vdmattributes-guardianattributes)
     *
     * @param guardianAttributes Specifies additional settings for your VDM configuration as
     *   applicable to the Guardian.
     */
    public fun guardianAttributes(guardianAttributes: CfnVdmAttributes.GuardianAttributesProperty) {
        cdkBuilder.guardianAttributes(guardianAttributes)
    }

    public fun build(): CfnVdmAttributes = cdkBuilder.build()
}
