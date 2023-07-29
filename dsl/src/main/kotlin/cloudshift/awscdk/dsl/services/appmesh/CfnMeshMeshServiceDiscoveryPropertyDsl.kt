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
import software.amazon.awscdk.services.appmesh.CfnMesh

/**
 * An object that represents the service discovery information for a service mesh.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * MeshServiceDiscoveryProperty meshServiceDiscoveryProperty =
 * MeshServiceDiscoveryProperty.builder()
 * .ipPreference("ipPreference")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-mesh-meshservicediscovery.html)
 */
@CdkDslMarker
public class CfnMeshMeshServiceDiscoveryPropertyDsl {
    private val cdkBuilder: CfnMesh.MeshServiceDiscoveryProperty.Builder =
        CfnMesh.MeshServiceDiscoveryProperty.builder()

    /** @param ipPreference The IP version to use to control traffic within the mesh. */
    public fun ipPreference(ipPreference: String) {
        cdkBuilder.ipPreference(ipPreference)
    }

    public fun build(): CfnMesh.MeshServiceDiscoveryProperty = cdkBuilder.build()
}
