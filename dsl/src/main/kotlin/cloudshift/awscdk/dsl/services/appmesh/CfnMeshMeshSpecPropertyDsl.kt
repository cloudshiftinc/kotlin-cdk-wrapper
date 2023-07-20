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

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnMesh

@CdkDslMarker
public class CfnMeshMeshSpecPropertyDsl {
    private val cdkBuilder: CfnMesh.MeshSpecProperty.Builder = CfnMesh.MeshSpecProperty.builder()

    public fun egressFilter(egressFilter: IResolvable) {
        cdkBuilder.egressFilter(egressFilter)
    }

    public fun egressFilter(egressFilter: CfnMesh.EgressFilterProperty) {
        cdkBuilder.egressFilter(egressFilter)
    }

    public fun serviceDiscovery(serviceDiscovery: IResolvable) {
        cdkBuilder.serviceDiscovery(serviceDiscovery)
    }

    public fun serviceDiscovery(serviceDiscovery: CfnMesh.MeshServiceDiscoveryProperty) {
        cdkBuilder.serviceDiscovery(serviceDiscovery)
    }

    public fun build(): CfnMesh.MeshSpecProperty = cdkBuilder.build()
}
