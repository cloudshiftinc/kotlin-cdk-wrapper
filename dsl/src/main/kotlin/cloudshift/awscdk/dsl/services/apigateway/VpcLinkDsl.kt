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

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.apigateway.VpcLink
import software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer
import software.constructs.Construct
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class VpcLinkDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: VpcLink.Builder = VpcLink.Builder.create(scope, id)

    private val _targets: MutableList<INetworkLoadBalancer> = mutableListOf()

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun targets(vararg targets: INetworkLoadBalancer) {
        _targets.addAll(listOf(*targets))
    }

    public fun targets(targets: Collection<INetworkLoadBalancer>) {
        _targets.addAll(targets)
    }

    public fun vpcLinkName(vpcLinkName: String) {
        cdkBuilder.vpcLinkName(vpcLinkName)
    }

    public fun build(): VpcLink {
        if (_targets.isNotEmpty()) cdkBuilder.targets(_targets)
        return cdkBuilder.build()
    }
}
