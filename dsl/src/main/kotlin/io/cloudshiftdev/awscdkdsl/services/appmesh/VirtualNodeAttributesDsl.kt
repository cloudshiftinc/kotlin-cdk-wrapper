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
import kotlin.String
import software.amazon.awscdk.services.appmesh.IMesh
import software.amazon.awscdk.services.appmesh.VirtualNodeAttributes

/**
 * Interface with properties necessary to import a reusable VirtualNode.
 *
 * Example:
 * ```
 * String virtualNodeName = "my-virtual-node";
 * VirtualNode.fromVirtualNodeAttributes(this, "imported-virtual-node",
 * VirtualNodeAttributes.builder()
 * .mesh(Mesh.fromMeshName(this, "Mesh", "testMesh"))
 * .virtualNodeName(virtualNodeName)
 * .build());
 * ```
 */
@CdkDslMarker
public class VirtualNodeAttributesDsl {
    private val cdkBuilder: VirtualNodeAttributes.Builder = VirtualNodeAttributes.builder()

    /** @param mesh The Mesh that the VirtualNode belongs to. */
    public fun mesh(mesh: IMesh) {
        cdkBuilder.mesh(mesh)
    }

    /** @param virtualNodeName The name of the VirtualNode. */
    public fun virtualNodeName(virtualNodeName: String) {
        cdkBuilder.virtualNodeName(virtualNodeName)
    }

    public fun build(): VirtualNodeAttributes = cdkBuilder.build()
}
