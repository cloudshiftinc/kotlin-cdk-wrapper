@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ec2.NatGatewayProps
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class NatGatewayPropsDsl {
    private val cdkBuilder: NatGatewayProps.Builder = NatGatewayProps.builder()

    private val _eipAllocationIds: MutableList<String> = mutableListOf()

    public fun eipAllocationIds(vararg eipAllocationIds: String) {
        _eipAllocationIds.addAll(listOf(*eipAllocationIds))
    }

    public fun eipAllocationIds(eipAllocationIds: Collection<String>) {
        _eipAllocationIds.addAll(eipAllocationIds)
    }

    public fun build(): NatGatewayProps {
        if (_eipAllocationIds.isNotEmpty()) cdkBuilder.eipAllocationIds(_eipAllocationIds)
        return cdkBuilder.build()
    }
}
