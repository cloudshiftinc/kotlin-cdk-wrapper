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

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.batch.CfnJobDefinition
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnJobDefinitionDevicePropertyDsl {
    private val cdkBuilder: CfnJobDefinition.DeviceProperty.Builder =
        CfnJobDefinition.DeviceProperty.builder()

    private val _permissions: MutableList<String> = mutableListOf()

    public fun containerPath(containerPath: String) {
        cdkBuilder.containerPath(containerPath)
    }

    public fun hostPath(hostPath: String) {
        cdkBuilder.hostPath(hostPath)
    }

    public fun permissions(vararg permissions: String) {
        _permissions.addAll(listOf(*permissions))
    }

    public fun permissions(permissions: Collection<String>) {
        _permissions.addAll(permissions)
    }

    public fun build(): CfnJobDefinition.DeviceProperty {
        if (_permissions.isNotEmpty()) cdkBuilder.permissions(_permissions)
        return cdkBuilder.build()
    }
}
