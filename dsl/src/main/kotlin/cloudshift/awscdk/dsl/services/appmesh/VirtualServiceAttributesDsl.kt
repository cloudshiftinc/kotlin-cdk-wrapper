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

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appmesh.IMesh
import software.amazon.awscdk.services.appmesh.VirtualServiceAttributes

/**
 * Interface with properties ncecessary to import a reusable VirtualService.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * Mesh mesh;
 * VirtualServiceAttributes virtualServiceAttributes = VirtualServiceAttributes.builder()
 * .mesh(mesh)
 * .virtualServiceName("virtualServiceName")
 * .build();
 * ```
 */
@CdkDslMarker
public class VirtualServiceAttributesDsl {
    private val cdkBuilder: VirtualServiceAttributes.Builder = VirtualServiceAttributes.builder()

    /** @param mesh The Mesh which the VirtualService belongs to. */
    public fun mesh(mesh: IMesh) {
        cdkBuilder.mesh(mesh)
    }

    /**
     * @param virtualServiceName The name of the VirtualService, it is recommended this follows the
     *   fully-qualified domain name format.
     */
    public fun virtualServiceName(virtualServiceName: String) {
        cdkBuilder.virtualServiceName(virtualServiceName)
    }

    public fun build(): VirtualServiceAttributes = cdkBuilder.build()
}
