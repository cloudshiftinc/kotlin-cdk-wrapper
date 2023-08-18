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

package io.cloudshiftdev.awscdkdsl.services.appmesh

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.services.appmesh.IpPreference
import software.amazon.awscdk.services.appmesh.MeshServiceDiscovery

/**
 * Properties for Mesh Service Discovery.
 *
 * Example:
 * ```
 * Mesh mesh = Mesh.Builder.create(this, "AppMesh")
 * .meshName("myAwsMesh")
 * .serviceDiscovery(MeshServiceDiscovery.builder()
 * .ipPreference(IpPreference.IPV4_ONLY)
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class MeshServiceDiscoveryDsl {
    private val cdkBuilder: MeshServiceDiscovery.Builder = MeshServiceDiscovery.builder()

    /** @param ipPreference IP preference applied to all Virtual Nodes in the Mesh. */
    public fun ipPreference(ipPreference: IpPreference) {
        cdkBuilder.ipPreference(ipPreference)
    }

    public fun build(): MeshServiceDiscovery = cdkBuilder.build()
}
