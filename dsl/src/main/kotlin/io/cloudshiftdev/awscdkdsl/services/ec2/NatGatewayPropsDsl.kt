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
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.NatGatewayProps

/**
 * Properties for a NAT gateway.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * NatGatewayProps natGatewayProps = NatGatewayProps.builder()
 * .eipAllocationIds(List.of("eipAllocationIds"))
 * .build();
 * ```
 */
@CdkDslMarker
public class NatGatewayPropsDsl {
    private val cdkBuilder: NatGatewayProps.Builder = NatGatewayProps.builder()

    private val _eipAllocationIds: MutableList<String> = mutableListOf()

    /** @param eipAllocationIds EIP allocation IDs for the NAT gateways. */
    public fun eipAllocationIds(vararg eipAllocationIds: String) {
        _eipAllocationIds.addAll(listOf(*eipAllocationIds))
    }

    /** @param eipAllocationIds EIP allocation IDs for the NAT gateways. */
    public fun eipAllocationIds(eipAllocationIds: Collection<String>) {
        _eipAllocationIds.addAll(eipAllocationIds)
    }

    public fun build(): NatGatewayProps {
        if (_eipAllocationIds.isNotEmpty()) cdkBuilder.eipAllocationIds(_eipAllocationIds)
        return cdkBuilder.build()
    }
}
