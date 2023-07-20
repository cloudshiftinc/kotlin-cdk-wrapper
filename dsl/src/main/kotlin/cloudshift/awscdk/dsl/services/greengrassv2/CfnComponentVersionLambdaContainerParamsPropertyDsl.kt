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

package cloudshift.awscdk.dsl.services.greengrassv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrassv2.CfnComponentVersion
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnComponentVersionLambdaContainerParamsPropertyDsl {
    private val cdkBuilder: CfnComponentVersion.LambdaContainerParamsProperty.Builder =
        CfnComponentVersion.LambdaContainerParamsProperty.builder()

    private val _devices: MutableList<Any> = mutableListOf()

    private val _volumes: MutableList<Any> = mutableListOf()

    public fun devices(vararg devices: Any) {
        _devices.addAll(listOf(*devices))
    }

    public fun devices(devices: Collection<Any>) {
        _devices.addAll(devices)
    }

    public fun devices(devices: IResolvable) {
        cdkBuilder.devices(devices)
    }

    public fun memorySizeInKb(memorySizeInKb: Number) {
        cdkBuilder.memorySizeInKb(memorySizeInKb)
    }

    public fun mountRoSysfs(mountRoSysfs: Boolean) {
        cdkBuilder.mountRoSysfs(mountRoSysfs)
    }

    public fun mountRoSysfs(mountRoSysfs: IResolvable) {
        cdkBuilder.mountRoSysfs(mountRoSysfs)
    }

    public fun volumes(vararg volumes: Any) {
        _volumes.addAll(listOf(*volumes))
    }

    public fun volumes(volumes: Collection<Any>) {
        _volumes.addAll(volumes)
    }

    public fun volumes(volumes: IResolvable) {
        cdkBuilder.volumes(volumes)
    }

    public fun build(): CfnComponentVersion.LambdaContainerParamsProperty {
        if (_devices.isNotEmpty()) cdkBuilder.devices(_devices)
        if (_volumes.isNotEmpty()) cdkBuilder.volumes(_volumes)
        return cdkBuilder.build()
    }
}
