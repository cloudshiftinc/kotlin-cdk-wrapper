@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnVirtualGatewayVirtualGatewaySpecPropertyDsl {
    private val cdkBuilder: CfnVirtualGateway.VirtualGatewaySpecProperty.Builder =
        CfnVirtualGateway.VirtualGatewaySpecProperty.builder()

    private val _listeners: MutableList<Any> = mutableListOf()

    public fun backendDefaults(backendDefaults: IResolvable) {
        cdkBuilder.backendDefaults(backendDefaults)
    }

    public fun backendDefaults(backendDefaults: CfnVirtualGateway.VirtualGatewayBackendDefaultsProperty) {
        cdkBuilder.backendDefaults(backendDefaults)
    }

    public fun listeners(vararg listeners: Any) {
        _listeners.addAll(listOf(*listeners))
    }

    public fun listeners(listeners: Collection<Any>) {
        _listeners.addAll(listeners)
    }

    public fun listeners(listeners: IResolvable) {
        cdkBuilder.listeners(listeners)
    }

    public fun logging(logging: IResolvable) {
        cdkBuilder.logging(logging)
    }

    public fun logging(logging: CfnVirtualGateway.VirtualGatewayLoggingProperty) {
        cdkBuilder.logging(logging)
    }

    public fun build(): CfnVirtualGateway.VirtualGatewaySpecProperty {
        if (_listeners.isNotEmpty()) cdkBuilder.listeners(_listeners)
        return cdkBuilder.build()
    }
}
