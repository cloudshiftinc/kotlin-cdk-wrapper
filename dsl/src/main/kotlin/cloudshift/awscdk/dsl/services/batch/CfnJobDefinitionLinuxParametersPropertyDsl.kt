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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.batch.CfnJobDefinition
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnJobDefinitionLinuxParametersPropertyDsl {
    private val cdkBuilder: CfnJobDefinition.LinuxParametersProperty.Builder =
        CfnJobDefinition.LinuxParametersProperty.builder()

    private val _devices: MutableList<Any> = mutableListOf()

    private val _tmpfs: MutableList<Any> = mutableListOf()

    public fun devices(vararg devices: Any) {
        _devices.addAll(listOf(*devices))
    }

    public fun devices(devices: Collection<Any>) {
        _devices.addAll(devices)
    }

    public fun devices(devices: IResolvable) {
        cdkBuilder.devices(devices)
    }

    public fun initProcessEnabled(initProcessEnabled: Boolean) {
        cdkBuilder.initProcessEnabled(initProcessEnabled)
    }

    public fun initProcessEnabled(initProcessEnabled: IResolvable) {
        cdkBuilder.initProcessEnabled(initProcessEnabled)
    }

    public fun maxSwap(maxSwap: Number) {
        cdkBuilder.maxSwap(maxSwap)
    }

    public fun sharedMemorySize(sharedMemorySize: Number) {
        cdkBuilder.sharedMemorySize(sharedMemorySize)
    }

    public fun swappiness(swappiness: Number) {
        cdkBuilder.swappiness(swappiness)
    }

    public fun tmpfs(vararg tmpfs: Any) {
        _tmpfs.addAll(listOf(*tmpfs))
    }

    public fun tmpfs(tmpfs: Collection<Any>) {
        _tmpfs.addAll(tmpfs)
    }

    public fun tmpfs(tmpfs: IResolvable) {
        cdkBuilder.tmpfs(tmpfs)
    }

    public fun build(): CfnJobDefinition.LinuxParametersProperty {
        if (_devices.isNotEmpty()) cdkBuilder.devices(_devices)
        if (_tmpfs.isNotEmpty()) cdkBuilder.tmpfs(_tmpfs)
        return cdkBuilder.build()
    }
}
