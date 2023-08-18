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
import software.amazon.awscdk.services.ec2.AclIcmp

/**
 * Properties to create Icmp.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * AclIcmp aclIcmp = AclIcmp.builder()
 * .code(123)
 * .type(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class AclIcmpDsl {
    private val cdkBuilder: AclIcmp.Builder = AclIcmp.builder()

    /**
     * @param code The Internet Control Message Protocol (ICMP) code. You can use -1 to specify all
     *   ICMP codes for the given ICMP type. Requirement is conditional: Required if you specify 1
     *   (ICMP) for the protocol parameter.
     */
    public fun code(code: Number) {
        cdkBuilder.code(code)
    }

    /**
     * @param type The Internet Control Message Protocol (ICMP) type. You can use -1 to specify all
     *   ICMP types. Conditional requirement: Required if you specify 1 (ICMP) for the
     *   CreateNetworkAclEntry protocol parameter.
     */
    public fun type(type: Number) {
        cdkBuilder.type(type)
    }

    public fun build(): AclIcmp = cdkBuilder.build()
}
