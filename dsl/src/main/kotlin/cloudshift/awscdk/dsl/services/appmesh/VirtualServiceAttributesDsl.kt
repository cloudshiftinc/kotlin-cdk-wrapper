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
import software.amazon.awscdk.services.appmesh.IMesh
import software.amazon.awscdk.services.appmesh.VirtualServiceAttributes
import kotlin.String

@CdkDslMarker
public class VirtualServiceAttributesDsl {
    private val cdkBuilder: VirtualServiceAttributes.Builder = VirtualServiceAttributes.builder()

    public fun mesh(mesh: IMesh) {
        cdkBuilder.mesh(mesh)
    }

    public fun virtualServiceName(virtualServiceName: String) {
        cdkBuilder.virtualServiceName(virtualServiceName)
    }

    public fun build(): VirtualServiceAttributes = cdkBuilder.build()
}
