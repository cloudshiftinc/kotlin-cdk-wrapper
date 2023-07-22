@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lightsail.CfnInstance

@CdkDslMarker
public class CfnInstanceHardwarePropertyDsl {
  private val cdkBuilder: CfnInstance.HardwareProperty.Builder =
      CfnInstance.HardwareProperty.builder()

  private val _disks: MutableList<Any> = mutableListOf()

  /**
   * @param cpuCount The number of vCPUs the instance has.
   *
   * The `CpuCount` property is read-only and should not be specified in a create instance or update
   * instance request.
   */
  public fun cpuCount(cpuCount: Number) {
    cdkBuilder.cpuCount(cpuCount)
  }

  /**
   * @param disks The disks attached to the instance.
   * The instance restarts when performing an attach disk or detach disk request. This resets the
   * public IP address of your instance if a static IP isn't attached to it.
   */
  public fun disks(vararg disks: Any) {
    _disks.addAll(listOf(*disks))
  }

  /**
   * @param disks The disks attached to the instance.
   * The instance restarts when performing an attach disk or detach disk request. This resets the
   * public IP address of your instance if a static IP isn't attached to it.
   */
  public fun disks(disks: Collection<Any>) {
    _disks.addAll(disks)
  }

  /**
   * @param disks The disks attached to the instance.
   * The instance restarts when performing an attach disk or detach disk request. This resets the
   * public IP address of your instance if a static IP isn't attached to it.
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
    if(_disks.isNotEmpty()) cdkBuilder.disks(_disks)
    return cdkBuilder.build()
  }
}
