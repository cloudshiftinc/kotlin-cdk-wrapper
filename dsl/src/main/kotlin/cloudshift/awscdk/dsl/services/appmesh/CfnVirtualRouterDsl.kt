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
import software.amazon.awscdk.services.appmesh.CfnVirtualRouter
import software.constructs.Construct

/**
 * Creates a virtual router within a service mesh.
 *
 * Specify a `listener` for any inbound traffic that your virtual router receives. Create a virtual
 * router for each protocol and port that you need to route. Virtual routers handle traffic for one
 * or more virtual services within your mesh. After you create your virtual router, create and
 * associate routes for your virtual router that direct incoming requests to different virtual
 * nodes.
 *
 * For more information about virtual routers, see
 * [Virtual routers](https://docs.aws.amazon.com/app-mesh/latest/userguide/virtual_routers.html) .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * CfnVirtualRouter cfnVirtualRouter = CfnVirtualRouter.Builder.create(this, "MyCfnVirtualRouter")
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
public class CfnVirtualRouterDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnVirtualRouter.Builder = CfnVirtualRouter.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The name of the service mesh to create the virtual router in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualrouter.html#cfn-appmesh-virtualrouter-meshname)
     *
     * @param meshName The name of the service mesh to create the virtual router in.
     */
    public fun meshName(meshName: String) {
        cdkBuilder.meshName(meshName)
    }

    /**
     * The AWS IAM account ID of the service mesh owner.
     *
     * If the account ID is not your own, then the account that you specify must share the mesh with
     * your account before you can create the resource in the service mesh. For more information
     * about mesh sharing, see
     * [Working with shared meshes](https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualrouter.html#cfn-appmesh-virtualrouter-meshowner)
     *
     * @param meshOwner The AWS IAM account ID of the service mesh owner.
     */
    public fun meshOwner(meshOwner: String) {
        cdkBuilder.meshOwner(meshOwner)
    }

    /**
     * The virtual router specification to apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualrouter.html#cfn-appmesh-virtualrouter-spec)
     *
     * @param spec The virtual router specification to apply.
     */
    public fun spec(spec: IResolvable) {
        cdkBuilder.spec(spec)
    }

    /**
     * The virtual router specification to apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualrouter.html#cfn-appmesh-virtualrouter-spec)
     *
     * @param spec The virtual router specification to apply.
     */
    public fun spec(spec: CfnVirtualRouter.VirtualRouterSpecProperty) {
        cdkBuilder.spec(spec)
    }

    /**
     * Optional metadata that you can apply to the virtual router to assist with categorization and
     * organization.
     *
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualrouter.html#cfn-appmesh-virtualrouter-tags)
     *
     * @param tags Optional metadata that you can apply to the virtual router to assist with
     *   categorization and organization.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * Optional metadata that you can apply to the virtual router to assist with categorization and
     * organization.
     *
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualrouter.html#cfn-appmesh-virtualrouter-tags)
     *
     * @param tags Optional metadata that you can apply to the virtual router to assist with
     *   categorization and organization.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The name to use for the virtual router.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualrouter.html#cfn-appmesh-virtualrouter-virtualroutername)
     *
     * @param virtualRouterName The name to use for the virtual router.
     */
    public fun virtualRouterName(virtualRouterName: String) {
        cdkBuilder.virtualRouterName(virtualRouterName)
    }

    public fun build(): CfnVirtualRouter {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
