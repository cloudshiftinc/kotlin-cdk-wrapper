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
import software.amazon.awscdk.services.appmesh.CfnVirtualService

/**
 * An object that represents a virtual node service provider.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * VirtualNodeServiceProviderProperty virtualNodeServiceProviderProperty =
 * VirtualNodeServiceProviderProperty.builder()
 * .virtualNodeName("virtualNodeName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualservice-virtualnodeserviceprovider.html)
 */
@CdkDslMarker
public class CfnVirtualServiceVirtualNodeServiceProviderPropertyDsl {
    private val cdkBuilder: CfnVirtualService.VirtualNodeServiceProviderProperty.Builder =
        CfnVirtualService.VirtualNodeServiceProviderProperty.builder()

    /** @param virtualNodeName The name of the virtual node that is acting as a service provider. */
    public fun virtualNodeName(virtualNodeName: String) {
        cdkBuilder.virtualNodeName(virtualNodeName)
    }

    public fun build(): CfnVirtualService.VirtualNodeServiceProviderProperty = cdkBuilder.build()
}
