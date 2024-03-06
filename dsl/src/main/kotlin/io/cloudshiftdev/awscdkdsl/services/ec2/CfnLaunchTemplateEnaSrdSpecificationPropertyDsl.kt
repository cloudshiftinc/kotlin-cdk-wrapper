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
 * ENA Express uses AWS Scalable Reliable Datagram (SRD) technology to increase the maximum
 * bandwidth used per stream and minimize tail latency of network traffic between EC2 instances.
 *
 * With ENA Express, you can communicate between two EC2 instances in the same subnet within the
 * same account, or in different accounts. Both sending and receiving instances must have ENA
 * Express enabled.
 *
 * To improve the reliability of network packet delivery, ENA Express reorders network packets on
 * the receiving end by default. However, some UDP-based applications are designed to handle network
 * packets that are out of order to reduce the overhead for packet delivery at the network layer.
 * When ENA Express is enabled, you can specify whether UDP network traffic uses it.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * EnaSrdSpecificationProperty enaSrdSpecificationProperty = EnaSrdSpecificationProperty.builder()
 * .enaSrdEnabled(false)
 * .enaSrdUdpSpecification(EnaSrdUdpSpecificationProperty.builder()
 * .enaSrdUdpEnabled(false)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-enasrdspecification.html)
 */
@CdkDslMarker
public class CfnLaunchTemplateEnaSrdSpecificationPropertyDsl {
    private val cdkBuilder: CfnLaunchTemplate.EnaSrdSpecificationProperty.Builder =
        CfnLaunchTemplate.EnaSrdSpecificationProperty.builder()

    /** @param enaSrdEnabled Indicates whether ENA Express is enabled for the network interface. */
    public fun enaSrdEnabled(enaSrdEnabled: Boolean) {
        cdkBuilder.enaSrdEnabled(enaSrdEnabled)
    }

    /** @param enaSrdEnabled Indicates whether ENA Express is enabled for the network interface. */
    public fun enaSrdEnabled(enaSrdEnabled: IResolvable) {
        cdkBuilder.enaSrdEnabled(enaSrdEnabled)
    }

    /** @param enaSrdUdpSpecification Configures ENA Express for UDP network traffic. */
    public fun enaSrdUdpSpecification(enaSrdUdpSpecification: IResolvable) {
        cdkBuilder.enaSrdUdpSpecification(enaSrdUdpSpecification)
    }

    /** @param enaSrdUdpSpecification Configures ENA Express for UDP network traffic. */
    public fun enaSrdUdpSpecification(
        enaSrdUdpSpecification: CfnLaunchTemplate.EnaSrdUdpSpecificationProperty
    ) {
        cdkBuilder.enaSrdUdpSpecification(enaSrdUdpSpecification)
    }

    public fun build(): CfnLaunchTemplate.EnaSrdSpecificationProperty = cdkBuilder.build()
}
