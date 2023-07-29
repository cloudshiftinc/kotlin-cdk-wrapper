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
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.AllocateCidrRequest
import software.amazon.awscdk.services.ec2.RequestedSubnet

/**
 * Request for subnets Cidr to be allocated for a Vpc.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * AllocateCidrRequest allocateCidrRequest = AllocateCidrRequest.builder()
 * .requestedSubnets(List.of(RequestedSubnet.builder()
 * .availabilityZone("availabilityZone")
 * .configuration(SubnetConfiguration.builder()
 * .name("name")
 * .subnetType(SubnetType.PRIVATE_ISOLATED)
 * // the properties below are optional
 * .cidrMask(123)
 * .mapPublicIpOnLaunch(false)
 * .reserved(false)
 * .build())
 * .subnetConstructId("subnetConstructId")
 * .build()))
 * .vpcCidr("vpcCidr")
 * .build();
 * ```
 */
@CdkDslMarker
public class AllocateCidrRequestDsl {
    private val cdkBuilder: AllocateCidrRequest.Builder = AllocateCidrRequest.builder()

    private val _requestedSubnets: MutableList<RequestedSubnet> = mutableListOf()

    /** @param requestedSubnets The Subnets to be allocated. */
    public fun requestedSubnets(requestedSubnets: RequestedSubnetDsl.() -> Unit) {
        _requestedSubnets.add(RequestedSubnetDsl().apply(requestedSubnets).build())
    }

    /** @param requestedSubnets The Subnets to be allocated. */
    public fun requestedSubnets(requestedSubnets: Collection<RequestedSubnet>) {
        _requestedSubnets.addAll(requestedSubnets)
    }

    /** @param vpcCidr The IPv4 CIDR block for this Vpc. */
    public fun vpcCidr(vpcCidr: String) {
        cdkBuilder.vpcCidr(vpcCidr)
    }

    public fun build(): AllocateCidrRequest {
        if (_requestedSubnets.isNotEmpty()) cdkBuilder.requestedSubnets(_requestedSubnets)
        return cdkBuilder.build()
    }
}
