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

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ecs.LogDriver
import software.amazon.awscdk.services.ecs.ServiceConnectProps
import software.amazon.awscdk.services.ecs.ServiceConnectService
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class ServiceConnectPropsDsl {
    private val cdkBuilder: ServiceConnectProps.Builder = ServiceConnectProps.builder()

    private val _services: MutableList<ServiceConnectService> = mutableListOf()

    public fun logDriver(logDriver: LogDriver) {
        cdkBuilder.logDriver(logDriver)
    }

    public fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
    }

    public fun services(services: ServiceConnectServiceDsl.() -> Unit) {
        _services.add(ServiceConnectServiceDsl().apply(services).build())
    }

    public fun services(services: Collection<ServiceConnectService>) {
        _services.addAll(services)
    }

    public fun build(): ServiceConnectProps {
        if (_services.isNotEmpty()) cdkBuilder.services(_services)
        return cdkBuilder.build()
    }
}
