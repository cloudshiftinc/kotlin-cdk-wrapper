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
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualService
import software.amazon.awscdk.services.appmesh.CfnVirtualServiceProps

/**
 * Properties for defining a `CfnVirtualService`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * CfnVirtualServiceProps cfnVirtualServiceProps = CfnVirtualServiceProps.builder()
 * .meshName("meshName")
 * .spec(VirtualServiceSpecProperty.builder()
 * .provider(VirtualServiceProviderProperty.builder()
 * .virtualNode(VirtualNodeServiceProviderProperty.builder()
 * .virtualNodeName("virtualNodeName")
 * .build())
 * .virtualRouter(VirtualRouterServiceProviderProperty.builder()
 * .virtualRouterName("virtualRouterName")
 * .build())
 * .build())
 * .build())
 * .virtualServiceName("virtualServiceName")
 * // the properties below are optional
 * .meshOwner("meshOwner")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualservice.html)
 */
@CdkDslMarker
public class CfnVirtualServicePropsDsl {
    private val cdkBuilder: CfnVirtualServiceProps.Builder = CfnVirtualServiceProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param meshName The name of the service mesh to create the virtual service in. */
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

    /** @param spec The virtual service specification to apply. */
    public fun spec(spec: IResolvable) {
        cdkBuilder.spec(spec)
    }

    /** @param spec The virtual service specification to apply. */
    public fun spec(spec: CfnVirtualService.VirtualServiceSpecProperty) {
        cdkBuilder.spec(spec)
    }

    /**
     * @param tags Optional metadata that you can apply to the virtual service to assist with
     *   categorization and organization. Each tag consists of a key and an optional value, both of
     *   which you define. Tag keys can have a maximum character length of 128 characters, and tag
     *   values can have a maximum length of 256 characters.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags Optional metadata that you can apply to the virtual service to assist with
     *   categorization and organization. Each tag consists of a key and an optional value, both of
     *   which you define. Tag keys can have a maximum character length of 128 characters, and tag
     *   values can have a maximum length of 256 characters.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /** @param virtualServiceName The name to use for the virtual service. */
    public fun virtualServiceName(virtualServiceName: String) {
        cdkBuilder.virtualServiceName(virtualServiceName)
    }

    public fun build(): CfnVirtualServiceProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
