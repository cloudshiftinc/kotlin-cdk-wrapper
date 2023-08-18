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

package io.cloudshiftdev.awscdkdsl.services.ecs

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ecs.Device
import software.amazon.awscdk.services.ecs.DevicePermission

/**
 * A container instance host device.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * Device device = Device.builder()
 * .hostPath("hostPath")
 * // the properties below are optional
 * .containerPath("containerPath")
 * .permissions(List.of(DevicePermission.READ))
 * .build();
 * ```
 */
@CdkDslMarker
public class DeviceDsl {
    private val cdkBuilder: Device.Builder = Device.builder()

    private val _permissions: MutableList<DevicePermission> = mutableListOf()

    /** @param containerPath The path inside the container at which to expose the host device. */
    public fun containerPath(containerPath: String) {
        cdkBuilder.containerPath(containerPath)
    }

    /** @param hostPath The path for the device on the host container instance. */
    public fun hostPath(hostPath: String) {
        cdkBuilder.hostPath(hostPath)
    }

    /**
     * @param permissions The explicit permissions to provide to the container for the device. By
     *   default, the container has permissions for read, write, and mknod for the device.
     */
    public fun permissions(vararg permissions: DevicePermission) {
        _permissions.addAll(listOf(*permissions))
    }

    /**
     * @param permissions The explicit permissions to provide to the container for the device. By
     *   default, the container has permissions for read, write, and mknod for the device.
     */
    public fun permissions(permissions: Collection<DevicePermission>) {
        _permissions.addAll(permissions)
    }

    public fun build(): Device {
        if (_permissions.isNotEmpty()) cdkBuilder.permissions(_permissions)
        return cdkBuilder.build()
    }
}
