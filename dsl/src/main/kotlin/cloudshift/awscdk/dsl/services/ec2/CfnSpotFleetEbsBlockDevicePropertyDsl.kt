@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnSpotFleet

@CdkDslMarker
public class CfnSpotFleetEbsBlockDevicePropertyDsl {
  private val cdkBuilder: CfnSpotFleet.EbsBlockDeviceProperty.Builder =
      CfnSpotFleet.EbsBlockDeviceProperty.builder()

  public fun deleteOnTermination(deleteOnTermination: Boolean) {
    cdkBuilder.deleteOnTermination(deleteOnTermination)
  }

  public fun deleteOnTermination(deleteOnTermination: IResolvable) {
    cdkBuilder.deleteOnTermination(deleteOnTermination)
  }

  public fun encrypted(encrypted: Boolean) {
    cdkBuilder.encrypted(encrypted)
  }

  public fun encrypted(encrypted: IResolvable) {
    cdkBuilder.encrypted(encrypted)
  }

  public fun iops(iops: Number) {
    cdkBuilder.iops(iops)
  }

  public fun snapshotId(snapshotId: String) {
    cdkBuilder.snapshotId(snapshotId)
  }

  public fun volumeSize(volumeSize: Number) {
    cdkBuilder.volumeSize(volumeSize)
  }

  public fun volumeType(volumeType: String) {
    cdkBuilder.volumeType(volumeType)
  }

  public fun build(): CfnSpotFleet.EbsBlockDeviceProperty = cdkBuilder.build()
}
