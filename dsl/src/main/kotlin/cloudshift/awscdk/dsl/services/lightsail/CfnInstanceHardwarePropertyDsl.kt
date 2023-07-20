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

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lightsail.CfnInstance
import kotlin.Any
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnInstanceHardwarePropertyDsl {
    private val cdkBuilder: CfnInstance.HardwareProperty.Builder =
        CfnInstance.HardwareProperty.builder()

    private val _disks: MutableList<Any> = mutableListOf()

    public fun cpuCount(cpuCount: Number) {
        cdkBuilder.cpuCount(cpuCount)
    }

    public fun disks(vararg disks: Any) {
        _disks.addAll(listOf(*disks))
    }

    public fun disks(disks: Collection<Any>) {
        _disks.addAll(disks)
    }

    public fun disks(disks: IResolvable) {
        cdkBuilder.disks(disks)
    }

    public fun ramSizeInGb(ramSizeInGb: Number) {
        cdkBuilder.ramSizeInGb(ramSizeInGb)
    }

    public fun build(): CfnInstance.HardwareProperty {
        if (_disks.isNotEmpty()) cdkBuilder.disks(_disks)
        return cdkBuilder.build()
    }
}
