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
import software.amazon.awscdk.services.appmesh.MeshFilterType
import software.amazon.awscdk.services.appmesh.MeshProps
import software.amazon.awscdk.services.appmesh.MeshServiceDiscovery
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class MeshPropsDsl {
    private val cdkBuilder: MeshProps.Builder = MeshProps.builder()

    public fun egressFilter(egressFilter: MeshFilterType) {
        cdkBuilder.egressFilter(egressFilter)
    }

    public fun meshName(meshName: String) {
        cdkBuilder.meshName(meshName)
    }

    public fun serviceDiscovery(block: MeshServiceDiscoveryDsl.() -> Unit = {}) {
        val builder = MeshServiceDiscoveryDsl()
        builder.apply(block)
        cdkBuilder.serviceDiscovery(builder.build())
    }

    public fun serviceDiscovery(serviceDiscovery: MeshServiceDiscovery) {
        cdkBuilder.serviceDiscovery(serviceDiscovery)
    }

    public fun build(): MeshProps = cdkBuilder.build()
}
