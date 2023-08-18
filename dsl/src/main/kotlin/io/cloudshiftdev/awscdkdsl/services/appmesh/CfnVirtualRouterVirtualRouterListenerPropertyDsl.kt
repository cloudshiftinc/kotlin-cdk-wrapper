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
import software.amazon.awscdk.services.appmesh.CfnVirtualRouter

/**
 * An object that represents a virtual router listener.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * VirtualRouterListenerProperty virtualRouterListenerProperty =
 * VirtualRouterListenerProperty.builder()
 * .portMapping(PortMappingProperty.builder()
 * .port(123)
 * .protocol("protocol")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualrouter-virtualrouterlistener.html)
 */
@CdkDslMarker
public class CfnVirtualRouterVirtualRouterListenerPropertyDsl {
    private val cdkBuilder: CfnVirtualRouter.VirtualRouterListenerProperty.Builder =
        CfnVirtualRouter.VirtualRouterListenerProperty.builder()

    /** @param portMapping The port mapping information for the listener. */
    public fun portMapping(portMapping: IResolvable) {
        cdkBuilder.portMapping(portMapping)
    }

    /** @param portMapping The port mapping information for the listener. */
    public fun portMapping(portMapping: CfnVirtualRouter.PortMappingProperty) {
        cdkBuilder.portMapping(portMapping)
    }

    public fun build(): CfnVirtualRouter.VirtualRouterListenerProperty = cdkBuilder.build()
}
