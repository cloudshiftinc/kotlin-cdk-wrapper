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

package io.cloudshiftdev.awscdkdsl.services.lightsail

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lightsail.CfnInstance

/**
 * `Hardware` is a property of the
 * [AWS::Lightsail::Instance](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instance.html)
 * resource. It describes the hardware properties for the instance, such as the vCPU count, attached
 * disks, and amount of RAM.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lightsail.*;
 * HardwareProperty hardwareProperty = HardwareProperty.builder()
 * .cpuCount(123)
 * .disks(List.of(DiskProperty.builder()
 * .diskName("diskName")
 * .path("path")
 * // the properties below are optional
 * .attachedTo("attachedTo")
 * .attachmentState("attachmentState")
 * .iops(123)
 * .isSystemDisk(false)
 * .sizeInGb("sizeInGb")
 * .build()))
 * .ramSizeInGb(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-hardware.html)
 */
@CdkDslMarker
public class CfnInstanceHardwarePropertyDsl {
    private val cdkBuilder: CfnInstance.HardwareProperty.Builder =
        CfnInstance.HardwareProperty.builder()

    private val _disks: MutableList<Any> = mutableListOf()

    /**
     * @param cpuCount The number of vCPUs the instance has.
     *
     * The `CpuCount` property is read-only and should not be specified in a create instance or
     * update instance request.
     */
    public fun cpuCount(cpuCount: Number) {
        cdkBuilder.cpuCount(cpuCount)
    }

    /**
     * @param disks The disks attached to the instance. The instance restarts when performing an
     *   attach disk or detach disk request. This resets the public IP address of your instance if a
     *   static IP isn't attached to it.
     */
    public fun disks(vararg disks: Any) {
        _disks.addAll(listOf(*disks))
    }

    /**
     * @param disks The disks attached to the instance. The instance restarts when performing an
     *   attach disk or detach disk request. This resets the public IP address of your instance if a
     *   static IP isn't attached to it.
     */
    public fun disks(disks: Collection<Any>) {
        _disks.addAll(disks)
    }

    /**
     * @param disks The disks attached to the instance. The instance restarts when performing an
     *   attach disk or detach disk request. This resets the public IP address of your instance if a
     *   static IP isn't attached to it.
     */
    public fun disks(disks: IResolvable) {
        cdkBuilder.disks(disks)
    }

    /**
     * @param ramSizeInGb The amount of RAM in GB on the instance (for example, `1.0` ).
     *
     * The `RamSizeInGb` property is read-only and should not be specified in a create instance or
     * update instance request.
     */
    public fun ramSizeInGb(ramSizeInGb: Number) {
        cdkBuilder.ramSizeInGb(ramSizeInGb)
    }

    public fun build(): CfnInstance.HardwareProperty {
        if (_disks.isNotEmpty()) cdkBuilder.disks(_disks)
        return cdkBuilder.build()
    }
}
