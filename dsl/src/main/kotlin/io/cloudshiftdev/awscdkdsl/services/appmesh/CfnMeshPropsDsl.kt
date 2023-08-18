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

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnMesh
import software.amazon.awscdk.services.appmesh.CfnMeshProps

/**
 * Properties for defining a `CfnMesh`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * CfnMeshProps cfnMeshProps = CfnMeshProps.builder()
 * .meshName("meshName")
 * .spec(MeshSpecProperty.builder()
 * .egressFilter(EgressFilterProperty.builder()
 * .type("type")
 * .build())
 * .serviceDiscovery(MeshServiceDiscoveryProperty.builder()
 * .ipPreference("ipPreference")
 * .build())
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-mesh.html)
 */
@CdkDslMarker
public class CfnMeshPropsDsl {
    private val cdkBuilder: CfnMeshProps.Builder = CfnMeshProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param meshName The name to use for the service mesh. */
    public fun meshName(meshName: String) {
        cdkBuilder.meshName(meshName)
    }

    /** @param spec The service mesh specification to apply. */
    public fun spec(spec: IResolvable) {
        cdkBuilder.spec(spec)
    }

    /** @param spec The service mesh specification to apply. */
    public fun spec(spec: CfnMesh.MeshSpecProperty) {
        cdkBuilder.spec(spec)
    }

    /**
     * @param tags Optional metadata that you can apply to the service mesh to assist with
     *   categorization and organization. Each tag consists of a key and an optional value, both of
     *   which you define. Tag keys can have a maximum character length of 128 characters, and tag
     *   values can have a maximum length of 256 characters.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags Optional metadata that you can apply to the service mesh to assist with
     *   categorization and organization. Each tag consists of a key and an optional value, both of
     *   which you define. Tag keys can have a maximum character length of 128 characters, and tag
     *   values can have a maximum length of 256 characters.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnMeshProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
