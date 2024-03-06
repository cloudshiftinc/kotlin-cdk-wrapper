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
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ec2.CreateIpv6CidrBlocksRequest

/**
 * Request for IPv6 CIDR block to be split up.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CreateIpv6CidrBlocksRequest createIpv6CidrBlocksRequest = CreateIpv6CidrBlocksRequest.builder()
 * .ipv6SelectedCidr("ipv6SelectedCidr")
 * .subnetCount(123)
 * // the properties below are optional
 * .sizeMask("sizeMask")
 * .build();
 * ```
 */
@CdkDslMarker
public class CreateIpv6CidrBlocksRequestDsl {
    private val cdkBuilder: CreateIpv6CidrBlocksRequest.Builder =
        CreateIpv6CidrBlocksRequest.builder()

    /** @param ipv6SelectedCidr The IPv6 CIDR block string representation. */
    public fun ipv6SelectedCidr(ipv6SelectedCidr: String) {
        cdkBuilder.ipv6SelectedCidr(ipv6SelectedCidr)
    }

    /** @param sizeMask Size of the covered bits in the CIDR. */
    public fun sizeMask(sizeMask: String) {
        cdkBuilder.sizeMask(sizeMask)
    }

    /** @param subnetCount The number of subnets to assign CIDRs to. */
    public fun subnetCount(subnetCount: Number) {
        cdkBuilder.subnetCount(subnetCount)
    }

    public fun build(): CreateIpv6CidrBlocksRequest = cdkBuilder.build()
}
