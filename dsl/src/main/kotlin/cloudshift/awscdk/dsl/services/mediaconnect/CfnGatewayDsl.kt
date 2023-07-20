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

package cloudshift.awscdk.dsl.services.mediaconnect

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediaconnect.CfnGateway
import software.constructs.Construct
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnGatewayDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnGateway.Builder = CfnGateway.Builder.create(scope, id)

    private val _egressCidrBlocks: MutableList<String> = mutableListOf()

    private val _networks: MutableList<Any> = mutableListOf()

    public fun egressCidrBlocks(vararg egressCidrBlocks: String) {
        _egressCidrBlocks.addAll(listOf(*egressCidrBlocks))
    }

    public fun egressCidrBlocks(egressCidrBlocks: Collection<String>) {
        _egressCidrBlocks.addAll(egressCidrBlocks)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun networks(vararg networks: Any) {
        _networks.addAll(listOf(*networks))
    }

    public fun networks(networks: Collection<Any>) {
        _networks.addAll(networks)
    }

    public fun networks(networks: IResolvable) {
        cdkBuilder.networks(networks)
    }

    public fun build(): CfnGateway {
        if (_egressCidrBlocks.isNotEmpty()) cdkBuilder.egressCidrBlocks(_egressCidrBlocks)
        if (_networks.isNotEmpty()) cdkBuilder.networks(_networks)
        return cdkBuilder.build()
    }
}
