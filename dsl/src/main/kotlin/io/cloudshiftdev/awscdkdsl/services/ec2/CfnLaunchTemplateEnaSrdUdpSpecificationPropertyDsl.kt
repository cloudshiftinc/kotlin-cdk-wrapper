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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

/**
 * ENA Express is compatible with both TCP and UDP transport protocols.
 *
 * When it's enabled, TCP traffic automatically uses it. However, some UDP-based applications are
 * designed to handle network packets that are out of order, without a need for retransmission, such
 * as live video broadcasting or other near-real-time applications. For UDP traffic, you can specify
 * whether to use ENA Express, based on your application environment needs.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * EnaSrdUdpSpecificationProperty enaSrdUdpSpecificationProperty =
 * EnaSrdUdpSpecificationProperty.builder()
 * .enaSrdUdpEnabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-enasrdudpspecification.html)
 */
@CdkDslMarker
public class CfnLaunchTemplateEnaSrdUdpSpecificationPropertyDsl {
    private val cdkBuilder: CfnLaunchTemplate.EnaSrdUdpSpecificationProperty.Builder =
        CfnLaunchTemplate.EnaSrdUdpSpecificationProperty.builder()

    /**
     * @param enaSrdUdpEnabled Indicates whether UDP traffic to and from the instance uses ENA
     *   Express. To specify this setting, you must first enable ENA Express.
     */
    public fun enaSrdUdpEnabled(enaSrdUdpEnabled: Boolean) {
        cdkBuilder.enaSrdUdpEnabled(enaSrdUdpEnabled)
    }

    /**
     * @param enaSrdUdpEnabled Indicates whether UDP traffic to and from the instance uses ENA
     *   Express. To specify this setting, you must first enable ENA Express.
     */
    public fun enaSrdUdpEnabled(enaSrdUdpEnabled: IResolvable) {
        cdkBuilder.enaSrdUdpEnabled(enaSrdUdpEnabled)
    }

    public fun build(): CfnLaunchTemplate.EnaSrdUdpSpecificationProperty = cdkBuilder.build()
}
