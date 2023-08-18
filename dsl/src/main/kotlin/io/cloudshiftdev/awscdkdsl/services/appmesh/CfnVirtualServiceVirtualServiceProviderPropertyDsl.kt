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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualService

/**
 * An object that represents the provider for a virtual service.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * VirtualServiceProviderProperty virtualServiceProviderProperty =
 * VirtualServiceProviderProperty.builder()
 * .virtualNode(VirtualNodeServiceProviderProperty.builder()
 * .virtualNodeName("virtualNodeName")
 * .build())
 * .virtualRouter(VirtualRouterServiceProviderProperty.builder()
 * .virtualRouterName("virtualRouterName")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualservice-virtualserviceprovider.html)
 */
@CdkDslMarker
public class CfnVirtualServiceVirtualServiceProviderPropertyDsl {
    private val cdkBuilder: CfnVirtualService.VirtualServiceProviderProperty.Builder =
        CfnVirtualService.VirtualServiceProviderProperty.builder()

    /** @param virtualNode The virtual node associated with a virtual service. */
    public fun virtualNode(virtualNode: IResolvable) {
        cdkBuilder.virtualNode(virtualNode)
    }

    /** @param virtualNode The virtual node associated with a virtual service. */
    public fun virtualNode(virtualNode: CfnVirtualService.VirtualNodeServiceProviderProperty) {
        cdkBuilder.virtualNode(virtualNode)
    }

    /** @param virtualRouter The virtual router associated with a virtual service. */
    public fun virtualRouter(virtualRouter: IResolvable) {
        cdkBuilder.virtualRouter(virtualRouter)
    }

    /** @param virtualRouter The virtual router associated with a virtual service. */
    public fun virtualRouter(
        virtualRouter: CfnVirtualService.VirtualRouterServiceProviderProperty
    ) {
        cdkBuilder.virtualRouter(virtualRouter)
    }

    public fun build(): CfnVirtualService.VirtualServiceProviderProperty = cdkBuilder.build()
}
