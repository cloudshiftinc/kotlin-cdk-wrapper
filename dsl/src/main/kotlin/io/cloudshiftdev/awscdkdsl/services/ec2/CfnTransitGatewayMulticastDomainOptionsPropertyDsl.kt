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
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomain

/**
 * The options for the transit gateway multicast domain.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * OptionsProperty optionsProperty = OptionsProperty.builder()
 * .autoAcceptSharedAssociations("autoAcceptSharedAssociations")
 * .igmpv2Support("igmpv2Support")
 * .staticSourcesSupport("staticSourcesSupport")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-transitgatewaymulticastdomain-options.html)
 */
@CdkDslMarker
public class CfnTransitGatewayMulticastDomainOptionsPropertyDsl {
    private val cdkBuilder: CfnTransitGatewayMulticastDomain.OptionsProperty.Builder =
        CfnTransitGatewayMulticastDomain.OptionsProperty.builder()

    /**
     * @param autoAcceptSharedAssociations Indicates whether to automatically accept cross-account
     *   subnet associations that are associated with the transit gateway multicast domain.
     */
    public fun autoAcceptSharedAssociations(autoAcceptSharedAssociations: String) {
        cdkBuilder.autoAcceptSharedAssociations(autoAcceptSharedAssociations)
    }

    /**
     * @param igmpv2Support Specify whether to enable Internet Group Management Protocol (IGMP)
     *   version 2 for the transit gateway multicast domain.
     */
    public fun igmpv2Support(igmpv2Support: String) {
        cdkBuilder.igmpv2Support(igmpv2Support)
    }

    /**
     * @param staticSourcesSupport Specify whether to enable support for statically configuring
     *   multicast group sources for a domain.
     */
    public fun staticSourcesSupport(staticSourcesSupport: String) {
        cdkBuilder.staticSourcesSupport(staticSourcesSupport)
    }

    public fun build(): CfnTransitGatewayMulticastDomain.OptionsProperty = cdkBuilder.build()
}
