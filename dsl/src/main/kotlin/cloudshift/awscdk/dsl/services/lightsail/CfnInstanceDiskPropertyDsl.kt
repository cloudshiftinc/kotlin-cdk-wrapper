@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lightsail.CfnInstance

/**
 * `Disk` is a property of the
 * [Hardware](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-hardware.html)
 * property. It describes a disk attached to an instance.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lightsail.*;
 * DiskProperty diskProperty = DiskProperty.builder()
 * .diskName("diskName")
 * .path("path")
 * // the properties below are optional
 * .attachedTo("attachedTo")
 * .attachmentState("attachmentState")
 * .iops(123)
 * .isSystemDisk(false)
 * .sizeInGb("sizeInGb")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-disk.html)
 */
@CdkDslMarker
public class CfnInstanceDiskPropertyDsl {
  private val cdkBuilder: CfnInstance.DiskProperty.Builder = CfnInstance.DiskProperty.builder()

  /**
   * @param attachedTo The resources to which the disk is attached.
   */
  public fun attachedTo(attachedTo: String) {
    cdkBuilder.attachedTo(attachedTo)
  }

  /**
   * @param attachmentState (Deprecated) The attachment state of the disk.
   *
   * In releases prior to November 14, 2017, this parameter returned `attached` for system disks in
   * the API response. It is now deprecated, but still included in the response. Use `isAttached`
   * instead.
   */
  public fun attachmentState(attachmentState: String) {
    cdkBuilder.attachmentState(attachmentState)
  }

  /**
   * @param diskName The unique name of the disk. 
   */
  public fun diskName(diskName: String) {
    cdkBuilder.diskName(diskName)
  }

  /**
   * @param iops The input/output operations per second (IOPS) of the disk.
   */
  public fun iops(iops: Number) {
    cdkBuilder.iops(iops)
  }

  /**
   * @param isSystemDisk A Boolean value indicating whether this disk is a system disk (has an
   * operating system loaded on it).
   */
  public fun isSystemDisk(isSystemDisk: Boolean) {
    cdkBuilder.isSystemDisk(isSystemDisk)
  }

  /**
   * @param isSystemDisk A Boolean value indicating whether this disk is a system disk (has an
   * operating system loaded on it).
   */
  public fun isSystemDisk(isSystemDisk: IResolvable) {
    cdkBuilder.isSystemDisk(isSystemDisk)
  }

  /**
   * @param path The disk path. 
   */
  public fun path(path: String) {
    cdkBuilder.path(path)
  }

  /**
   * @param sizeInGb The size of the disk in GB.
   */
  public fun sizeInGb(sizeInGb: String) {
    cdkBuilder.sizeInGb(sizeInGb)
  }

  public fun build(): CfnInstance.DiskProperty = cdkBuilder.build()
}
