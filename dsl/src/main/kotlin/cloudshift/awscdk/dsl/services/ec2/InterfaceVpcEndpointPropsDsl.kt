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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.IInterfaceVpcEndpointService
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.InterfaceVpcEndpointProps
import software.amazon.awscdk.services.ec2.SubnetSelection

/**
 * Construction properties for an InterfaceVpcEndpoint.
 *
 * Example:
 * ```
 * Vpc vpc;
 * InterfaceVpcEndpoint.Builder.create(this, "VPC Endpoint")
 * .vpc(vpc)
 * .service(new
 * InterfaceVpcEndpointService("com.amazonaws.vpce.us-east-1.vpce-svc-uuddlrlrbastrtsvc", 443))
 * // Choose which availability zones to place the VPC endpoint in, based on
 * // available AZs
 * .subnets(SubnetSelection.builder()
 * .availabilityZones(List.of("us-east-1a", "us-east-1c"))
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class InterfaceVpcEndpointPropsDsl {
    private val cdkBuilder: InterfaceVpcEndpointProps.Builder = InterfaceVpcEndpointProps.builder()

    private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

    /**
     * @param lookupSupportedAzs Limit to only those availability zones where the endpoint service
     *   can be created. Setting this to 'true' requires a lookup to be performed at synthesis time.
     *   Account and region must be set on the containing stack for this to work.
     */
    public fun lookupSupportedAzs(lookupSupportedAzs: Boolean) {
        cdkBuilder.lookupSupportedAzs(lookupSupportedAzs)
    }

    /**
     * @param open Whether to automatically allow VPC traffic to the endpoint. If enabled, all
     *   traffic to the endpoint from within the VPC will be automatically allowed. This is done
     *   based on the VPC's CIDR range.
     */
    public fun `open`(`open`: Boolean) {
        cdkBuilder.`open`(`open`)
    }

    /**
     * @param privateDnsEnabled Whether to associate a private hosted zone with the specified VPC.
     *   This allows you to make requests to the service using its default DNS hostname.
     */
    public fun privateDnsEnabled(privateDnsEnabled: Boolean) {
        cdkBuilder.privateDnsEnabled(privateDnsEnabled)
    }

    /** @param securityGroups The security groups to associate with this interface VPC endpoint. */
    public fun securityGroups(vararg securityGroups: ISecurityGroup) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    /** @param securityGroups The security groups to associate with this interface VPC endpoint. */
    public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
        _securityGroups.addAll(securityGroups)
    }

    /** @param service The service to use for this interface VPC endpoint. */
    public fun service(service: IInterfaceVpcEndpointService) {
        cdkBuilder.service(service)
    }

    /**
     * @param subnets The subnets in which to create an endpoint network interface. At most one per
     *   availability zone.
     */
    public fun subnets(subnets: SubnetSelectionDsl.() -> Unit = {}) {
        val builder = SubnetSelectionDsl()
        builder.apply(subnets)
        cdkBuilder.subnets(builder.build())
    }

    /**
     * @param subnets The subnets in which to create an endpoint network interface. At most one per
     *   availability zone.
     */
    public fun subnets(subnets: SubnetSelection) {
        cdkBuilder.subnets(subnets)
    }

    /** @param vpc The VPC network in which the interface endpoint will be used. */
    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    public fun build(): InterfaceVpcEndpointProps {
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        return cdkBuilder.build()
    }
}
