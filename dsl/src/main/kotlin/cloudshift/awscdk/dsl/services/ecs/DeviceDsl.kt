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
import software.amazon.awscdk.services.ecs.Device
import software.amazon.awscdk.services.ecs.DevicePermission
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class DeviceDsl {
    private val cdkBuilder: Device.Builder = Device.builder()

    private val _permissions: MutableList<DevicePermission> = mutableListOf()

    public fun containerPath(containerPath: String) {
        cdkBuilder.containerPath(containerPath)
    }

    public fun hostPath(hostPath: String) {
        cdkBuilder.hostPath(hostPath)
    }

    public fun permissions(vararg permissions: DevicePermission) {
        _permissions.addAll(listOf(*permissions))
    }

    public fun permissions(permissions: Collection<DevicePermission>) {
        _permissions.addAll(permissions)
    }

    public fun build(): Device {
        if (_permissions.isNotEmpty()) cdkBuilder.permissions(_permissions)
        return cdkBuilder.build()
    }
}
