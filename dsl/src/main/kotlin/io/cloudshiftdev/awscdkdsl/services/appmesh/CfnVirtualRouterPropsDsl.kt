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
import software.amazon.awscdk.services.appmesh.CfnVirtualRouter
import software.amazon.awscdk.services.appmesh.CfnVirtualRouterProps

/**
 * Properties for defining a `CfnVirtualRouter`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * CfnVirtualRouterProps cfnVirtualRouterProps = CfnVirtualRouterProps.builder()
 * .meshName("meshName")
 * .spec(VirtualRouterSpecProperty.builder()
 * .listeners(List.of(VirtualRouterListenerProperty.builder()
 * .portMapping(PortMappingProperty.builder()
 * .port(123)
 * .protocol("protocol")
 * .build())
 * .build()))
 * .build())
 * // the properties below are optional
 * .meshOwner("meshOwner")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .virtualRouterName("virtualRouterName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualrouter.html)
 */
@CdkDslMarker
public class CfnVirtualRouterPropsDsl {
    private val cdkBuilder: CfnVirtualRouterProps.Builder = CfnVirtualRouterProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param meshName The name of the service mesh to create the virtual router in. */
    public fun meshName(meshName: String) {
        cdkBuilder.meshName(meshName)
    }

    /**
     * @param meshOwner The AWS IAM account ID of the service mesh owner. If the account ID is not
     *   your own, then the account that you specify must share the mesh with your account before
     *   you can create the resource in the service mesh. For more information about mesh sharing,
     *   see
     *   [Working with shared meshes](https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html)
     *   .
     */
    public fun meshOwner(meshOwner: String) {
        cdkBuilder.meshOwner(meshOwner)
    }

    /** @param spec The virtual router specification to apply. */
    public fun spec(spec: IResolvable) {
        cdkBuilder.spec(spec)
    }

    /** @param spec The virtual router specification to apply. */
    public fun spec(spec: CfnVirtualRouter.VirtualRouterSpecProperty) {
        cdkBuilder.spec(spec)
    }

    /**
     * @param tags Optional metadata that you can apply to the virtual router to assist with
     *   categorization and organization. Each tag consists of a key and an optional value, both of
     *   which you define. Tag keys can have a maximum character length of 128 characters, and tag
     *   values can have a maximum length of 256 characters.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags Optional metadata that you can apply to the virtual router to assist with
     *   categorization and organization. Each tag consists of a key and an optional value, both of
     *   which you define. Tag keys can have a maximum character length of 128 characters, and tag
     *   values can have a maximum length of 256 characters.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /** @param virtualRouterName The name to use for the virtual router. */
    public fun virtualRouterName(virtualRouterName: String) {
        cdkBuilder.virtualRouterName(virtualRouterName)
    }

    public fun build(): CfnVirtualRouterProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
