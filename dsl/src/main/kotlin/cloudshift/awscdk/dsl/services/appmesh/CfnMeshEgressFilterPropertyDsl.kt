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
import software.amazon.awscdk.services.appmesh.CfnMesh
import kotlin.String

@CdkDslMarker
public class CfnMeshEgressFilterPropertyDsl {
    private val cdkBuilder: CfnMesh.EgressFilterProperty.Builder =
        CfnMesh.EgressFilterProperty.builder()

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnMesh.EgressFilterProperty = cdkBuilder.build()
}
