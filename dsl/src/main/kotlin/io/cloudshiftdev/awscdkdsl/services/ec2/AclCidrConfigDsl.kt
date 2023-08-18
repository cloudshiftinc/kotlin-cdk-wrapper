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
import software.amazon.awscdk.services.ec2.AclCidrConfig

/**
 * Acl Configuration for CIDR.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * AclCidrConfig aclCidrConfig = AclCidrConfig.builder()
 * .cidrBlock("cidrBlock")
 * .ipv6CidrBlock("ipv6CidrBlock")
 * .build();
 * ```
 */
@CdkDslMarker
public class AclCidrConfigDsl {
    private val cdkBuilder: AclCidrConfig.Builder = AclCidrConfig.builder()

    /** @param cidrBlock Ipv4 CIDR. */
    public fun cidrBlock(cidrBlock: String) {
        cdkBuilder.cidrBlock(cidrBlock)
    }

    /** @param ipv6CidrBlock Ipv6 CIDR. */
    public fun ipv6CidrBlock(ipv6CidrBlock: String) {
        cdkBuilder.ipv6CidrBlock(ipv6CidrBlock)
    }

    public fun build(): AclCidrConfig = cdkBuilder.build()
}
