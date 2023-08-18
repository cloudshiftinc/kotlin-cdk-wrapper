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
import software.amazon.awscdk.services.appmesh.VirtualGatewayAttributes

/**
 * Unterface with properties necessary to import a reusable VirtualGateway.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * Mesh mesh;
 * VirtualGatewayAttributes virtualGatewayAttributes = VirtualGatewayAttributes.builder()
 * .mesh(mesh)
 * .virtualGatewayName("virtualGatewayName")
 * .build();
 * ```
 */
@CdkDslMarker
public class VirtualGatewayAttributesDsl {
    private val cdkBuilder: VirtualGatewayAttributes.Builder = VirtualGatewayAttributes.builder()

    /** @param mesh The Mesh that the VirtualGateway belongs to. */
    public fun mesh(mesh: IMesh) {
        cdkBuilder.mesh(mesh)
    }

    /** @param virtualGatewayName The name of the VirtualGateway. */
    public fun virtualGatewayName(virtualGatewayName: String) {
        cdkBuilder.virtualGatewayName(virtualGatewayName)
    }

    public fun build(): VirtualGatewayAttributes = cdkBuilder.build()
}
