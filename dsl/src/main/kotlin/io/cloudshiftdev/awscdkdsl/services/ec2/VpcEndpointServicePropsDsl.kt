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
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.IVpcEndpointServiceLoadBalancer
import software.amazon.awscdk.services.ec2.VpcEndpointServiceProps
import software.amazon.awscdk.services.iam.ArnPrincipal

/**
 * Construction properties for a VpcEndpointService.
 *
 * Example:
 * ```
 * NetworkLoadBalancer networkLoadBalancer1;
 * NetworkLoadBalancer networkLoadBalancer2;
 * VpcEndpointService.Builder.create(this, "EndpointService")
 * .vpcEndpointServiceLoadBalancers(List.of(networkLoadBalancer1, networkLoadBalancer2))
 * .acceptanceRequired(true)
 * .allowedPrincipals(List.of(new ArnPrincipal("arn:aws:iam::123456789012:root")))
 * .contributorInsights(true)
 * .build();
 * ```
 */
@CdkDslMarker
public class VpcEndpointServicePropsDsl {
    private val cdkBuilder: VpcEndpointServiceProps.Builder = VpcEndpointServiceProps.builder()

    private val _allowedPrincipals: MutableList<ArnPrincipal> = mutableListOf()

    private val _vpcEndpointServiceLoadBalancers: MutableList<IVpcEndpointServiceLoadBalancer> =
        mutableListOf()

    /**
     * @param acceptanceRequired Whether requests from service consumers to connect to the service
     *   through an endpoint must be accepted.
     */
    public fun acceptanceRequired(acceptanceRequired: Boolean) {
        cdkBuilder.acceptanceRequired(acceptanceRequired)
    }

    /**
     * @param allowedPrincipals IAM users, IAM roles, or AWS accounts to allow inbound connections
     *   from. These principals can connect to your service using VPC endpoints. Takes a list of one
     *   or more ArnPrincipal.
     */
    public fun allowedPrincipals(vararg allowedPrincipals: ArnPrincipal) {
        _allowedPrincipals.addAll(listOf(*allowedPrincipals))
    }

    /**
     * @param allowedPrincipals IAM users, IAM roles, or AWS accounts to allow inbound connections
     *   from. These principals can connect to your service using VPC endpoints. Takes a list of one
     *   or more ArnPrincipal.
     */
    public fun allowedPrincipals(allowedPrincipals: Collection<ArnPrincipal>) {
        _allowedPrincipals.addAll(allowedPrincipals)
    }

    /**
     * @param contributorInsights Indicates whether to enable the built-in Contributor Insights
     *   rules provided by AWS PrivateLink.
     */
    public fun contributorInsights(contributorInsights: Boolean) {
        cdkBuilder.contributorInsights(contributorInsights)
    }

    /**
     * @param vpcEndpointServiceLoadBalancers One or more load balancers to host the VPC Endpoint
     *   Service.
     */
    public fun vpcEndpointServiceLoadBalancers(
        vararg vpcEndpointServiceLoadBalancers: IVpcEndpointServiceLoadBalancer
    ) {
        _vpcEndpointServiceLoadBalancers.addAll(listOf(*vpcEndpointServiceLoadBalancers))
    }

    /**
     * @param vpcEndpointServiceLoadBalancers One or more load balancers to host the VPC Endpoint
     *   Service.
     */
    public fun vpcEndpointServiceLoadBalancers(
        vpcEndpointServiceLoadBalancers: Collection<IVpcEndpointServiceLoadBalancer>
    ) {
        _vpcEndpointServiceLoadBalancers.addAll(vpcEndpointServiceLoadBalancers)
    }

    public fun build(): VpcEndpointServiceProps {
        if (_allowedPrincipals.isNotEmpty()) cdkBuilder.allowedPrincipals(_allowedPrincipals)
        if (_vpcEndpointServiceLoadBalancers.isNotEmpty())
            cdkBuilder.vpcEndpointServiceLoadBalancers(_vpcEndpointServiceLoadBalancers)
        return cdkBuilder.build()
    }
}
