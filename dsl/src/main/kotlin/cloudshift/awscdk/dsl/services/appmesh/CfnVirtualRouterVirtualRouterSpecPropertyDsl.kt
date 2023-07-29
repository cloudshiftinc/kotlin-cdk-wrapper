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
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualRouter

/**
 * An object that represents the specification of a virtual router.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * VirtualRouterSpecProperty virtualRouterSpecProperty = VirtualRouterSpecProperty.builder()
 * .listeners(List.of(VirtualRouterListenerProperty.builder()
 * .portMapping(PortMappingProperty.builder()
 * .port(123)
 * .protocol("protocol")
 * .build())
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualrouter-virtualrouterspec.html)
 */
@CdkDslMarker
public class CfnVirtualRouterVirtualRouterSpecPropertyDsl {
    private val cdkBuilder: CfnVirtualRouter.VirtualRouterSpecProperty.Builder =
        CfnVirtualRouter.VirtualRouterSpecProperty.builder()

    private val _listeners: MutableList<Any> = mutableListOf()

    /**
     * @param listeners The listeners that the virtual router is expected to receive inbound traffic
     *   from.
     */
    public fun listeners(vararg listeners: Any) {
        _listeners.addAll(listOf(*listeners))
    }

    /**
     * @param listeners The listeners that the virtual router is expected to receive inbound traffic
     *   from.
     */
    public fun listeners(listeners: Collection<Any>) {
        _listeners.addAll(listeners)
    }

    /**
     * @param listeners The listeners that the virtual router is expected to receive inbound traffic
     *   from.
     */
    public fun listeners(listeners: IResolvable) {
        cdkBuilder.listeners(listeners)
    }

    public fun build(): CfnVirtualRouter.VirtualRouterSpecProperty {
        if (_listeners.isNotEmpty()) cdkBuilder.listeners(_listeners)
        return cdkBuilder.build()
    }
}
