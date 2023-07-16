@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.imagebuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe

@CdkDslMarker
public class CfnContainerRecipeEbsInstanceBlockDeviceSpecificationPropertyDsl {
  private val cdkBuilder: CfnContainerRecipe.EbsInstanceBlockDeviceSpecificationProperty.Builder =
      CfnContainerRecipe.EbsInstanceBlockDeviceSpecificationProperty.builder()

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

  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  public fun snapshotId(snapshotId: String) {
    cdkBuilder.snapshotId(snapshotId)
  }

  public fun throughput(throughput: Number) {
    cdkBuilder.throughput(throughput)
  }

  public fun volumeSize(volumeSize: Number) {
    cdkBuilder.volumeSize(volumeSize)
  }

  public fun volumeType(volumeType: String) {
    cdkBuilder.volumeType(volumeType)
  }

  public fun build(): CfnContainerRecipe.EbsInstanceBlockDeviceSpecificationProperty =
      cdkBuilder.build()
}
