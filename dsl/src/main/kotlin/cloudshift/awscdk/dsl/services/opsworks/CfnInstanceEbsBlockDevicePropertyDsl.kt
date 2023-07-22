@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opsworks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.opsworks.CfnInstance

/**
 * Describes an Amazon EBS volume.
 *
 * This data type maps directly to the Amazon EC2
 * [EbsBlockDevice](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_EbsBlockDevice.html)
 * data type.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.opsworks.*;
 * EbsBlockDeviceProperty ebsBlockDeviceProperty = EbsBlockDeviceProperty.builder()
 * .deleteOnTermination(false)
 * .iops(123)
 * .snapshotId("snapshotId")
 * .volumeSize(123)
 * .volumeType("volumeType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-instance-ebsblockdevice.html)
 */
@CdkDslMarker
public class CfnInstanceEbsBlockDevicePropertyDsl {
  private val cdkBuilder: CfnInstance.EbsBlockDeviceProperty.Builder =
      CfnInstance.EbsBlockDeviceProperty.builder()

  /**
   * @param deleteOnTermination Whether the volume is deleted on instance termination.
   */
  public fun deleteOnTermination(deleteOnTermination: Boolean) {
    cdkBuilder.deleteOnTermination(deleteOnTermination)
  }

  /**
   * @param deleteOnTermination Whether the volume is deleted on instance termination.
   */
  public fun deleteOnTermination(deleteOnTermination: IResolvable) {
    cdkBuilder.deleteOnTermination(deleteOnTermination)
  }

  /**
   * @param iops The number of I/O operations per second (IOPS) that the volume supports.
   * For more information, see
   * [EbsBlockDevice](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_EbsBlockDevice.html) .
   */
  public fun iops(iops: Number) {
    cdkBuilder.iops(iops)
  }

  /**
   * @param snapshotId The snapshot ID.
   */
  public fun snapshotId(snapshotId: String) {
    cdkBuilder.snapshotId(snapshotId)
  }

  /**
   * @param volumeSize The volume size, in GiB.
   * For more information, see
   * [EbsBlockDevice](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_EbsBlockDevice.html) .
   */
  public fun volumeSize(volumeSize: Number) {
    cdkBuilder.volumeSize(volumeSize)
  }

  /**
   * @param volumeType The volume type.
   * `gp2` for General Purpose (SSD) volumes, `io1` for Provisioned IOPS (SSD) volumes, `st1` for
   * Throughput Optimized hard disk drives (HDD), `sc1` for Cold HDD,and `standard` for Magnetic
   * volumes.
   *
   * If you specify the `io1` volume type, you must also specify a value for the `Iops` attribute.
   * The maximum ratio of provisioned IOPS to requested volume size (in GiB) is 50:1. AWS uses the
   * default volume size (in GiB) specified in the AMI attributes to set IOPS to 50 x (volume size).
   */
  public fun volumeType(volumeType: String) {
    cdkBuilder.volumeType(volumeType)
  }

  public fun build(): CfnInstance.EbsBlockDeviceProperty = cdkBuilder.build()
}
