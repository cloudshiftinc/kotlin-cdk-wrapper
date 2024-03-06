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
import software.amazon.awscdk.services.ec2.AllocateVpcIpv6CidrRequest
import software.constructs.Construct

/**
 * Request for allocation of the VPC IPv6 CIDR.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * import software.constructs.*;
 * Construct construct;
 * AllocateVpcIpv6CidrRequest allocateVpcIpv6CidrRequest = AllocateVpcIpv6CidrRequest.builder()
 * .scope(construct)
 * .vpcId("vpcId")
 * .build();
 * ```
 */
@CdkDslMarker
public class AllocateVpcIpv6CidrRequestDsl {
    private val cdkBuilder: AllocateVpcIpv6CidrRequest.Builder =
        AllocateVpcIpv6CidrRequest.builder()

    /** @param scope The VPC construct to attach to. */
    public fun scope(scope: Construct) {
        cdkBuilder.scope(scope)
    }

    /** @param vpcId The id of the VPC. */
    public fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
    }

    public fun build(): AllocateVpcIpv6CidrRequest = cdkBuilder.build()
}
