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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualService

/**
 * An object that represents the specification of a virtual service.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * VirtualServiceSpecProperty virtualServiceSpecProperty = VirtualServiceSpecProperty.builder()
 * .provider(VirtualServiceProviderProperty.builder()
 * .virtualNode(VirtualNodeServiceProviderProperty.builder()
 * .virtualNodeName("virtualNodeName")
 * .build())
 * .virtualRouter(VirtualRouterServiceProviderProperty.builder()
 * .virtualRouterName("virtualRouterName")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualservice-virtualservicespec.html)
 */
@CdkDslMarker
public class CfnVirtualServiceVirtualServiceSpecPropertyDsl {
    private val cdkBuilder: CfnVirtualService.VirtualServiceSpecProperty.Builder =
        CfnVirtualService.VirtualServiceSpecProperty.builder()

    /**
     * @param provider The App Mesh object that is acting as the provider for a virtual service. You
     *   can specify a single virtual node or virtual router.
     */
    public fun provider(provider: IResolvable) {
        cdkBuilder.provider(provider)
    }

    /**
     * @param provider The App Mesh object that is acting as the provider for a virtual service. You
     *   can specify a single virtual node or virtual router.
     */
    public fun provider(provider: CfnVirtualService.VirtualServiceProviderProperty) {
        cdkBuilder.provider(provider)
    }

    public fun build(): CfnVirtualService.VirtualServiceSpecProperty = cdkBuilder.build()
}
