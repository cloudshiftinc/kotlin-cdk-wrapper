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
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

/**
 * The `Device` property specifies an object representing a container instance host device.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * DeviceProperty deviceProperty = DeviceProperty.builder()
 * .containerPath("containerPath")
 * .hostPath("hostPath")
 * .permissions(List.of("permissions"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-device.html)
 */
@CdkDslMarker
public class CfnTaskDefinitionDevicePropertyDsl {
    private val cdkBuilder: CfnTaskDefinition.DeviceProperty.Builder =
        CfnTaskDefinition.DeviceProperty.builder()

    private val _permissions: MutableList<String> = mutableListOf()

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
     *   default, the container has permissions for `read` , `write` , and `mknod` for the device.
     */
    public fun permissions(vararg permissions: String) {
        _permissions.addAll(listOf(*permissions))
    }

    /**
     * @param permissions The explicit permissions to provide to the container for the device. By
     *   default, the container has permissions for `read` , `write` , and `mknod` for the device.
     */
    public fun permissions(permissions: Collection<String>) {
        _permissions.addAll(permissions)
    }

    public fun build(): CfnTaskDefinition.DeviceProperty {
        if (_permissions.isNotEmpty()) cdkBuilder.permissions(_permissions)
        return cdkBuilder.build()
    }
}
