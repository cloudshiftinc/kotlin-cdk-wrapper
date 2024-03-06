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

package io.cloudshiftdev.awscdkdsl.services.apigateway

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.apigateway.VpcLinkProps
import software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer

/**
 * Properties for a VpcLink.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
 * Vpc vpc = new Vpc(this, "VPC");
 * NetworkLoadBalancer nlb = NetworkLoadBalancer.Builder.create(this, "NLB")
 * .vpc(vpc)
 * .build();
 * VpcLink link = VpcLink.Builder.create(this, "link")
 * .targets(List.of(nlb))
 * .build();
 * Integration integration = Integration.Builder.create()
 * .type(IntegrationType.HTTP_PROXY)
 * .integrationHttpMethod("ANY")
 * .options(IntegrationOptions.builder()
 * .connectionType(ConnectionType.VPC_LINK)
 * .vpcLink(link)
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class VpcLinkPropsDsl {
    private val cdkBuilder: VpcLinkProps.Builder = VpcLinkProps.builder()

    private val _targets: MutableList<INetworkLoadBalancer> = mutableListOf()

    /** @param description The description of the VPC link. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param targets The network load balancers of the VPC targeted by the VPC link. The network
     *   load balancers must be owned by the same AWS account of the API owner.
     */
    public fun targets(vararg targets: INetworkLoadBalancer) {
        _targets.addAll(listOf(*targets))
    }

    /**
     * @param targets The network load balancers of the VPC targeted by the VPC link. The network
     *   load balancers must be owned by the same AWS account of the API owner.
     */
    public fun targets(targets: Collection<INetworkLoadBalancer>) {
        _targets.addAll(targets)
    }

    /** @param vpcLinkName The name used to label and identify the VPC link. */
    public fun vpcLinkName(vpcLinkName: String) {
        cdkBuilder.vpcLinkName(vpcLinkName)
    }

    public fun build(): VpcLinkProps {
        if (_targets.isNotEmpty()) cdkBuilder.targets(_targets)
        return cdkBuilder.build()
    }
}
