@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.Size
import software.amazon.awscdk.services.ec2.EbsDeviceVolumeType
import software.amazon.awscdk.services.ec2.Volume
import software.amazon.awscdk.services.kms.IKey
import software.constructs.Construct

@CdkDslMarker
public class VolumeDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: Volume.Builder = Volume.Builder.create(scope, id)

  public fun autoEnableIo(autoEnableIo: Boolean) {
    cdkBuilder.autoEnableIo(autoEnableIo)
  }

  public fun availabilityZone(availabilityZone: String) {
    cdkBuilder.availabilityZone(availabilityZone)
  }

  public fun enableMultiAttach(enableMultiAttach: Boolean) {
    cdkBuilder.enableMultiAttach(enableMultiAttach)
  }

  public fun encrypted(encrypted: Boolean) {
    cdkBuilder.encrypted(encrypted)
  }

  public fun encryptionKey(encryptionKey: IKey) {
    cdkBuilder.encryptionKey(encryptionKey)
  }

  public fun iops(iops: Number) {
    cdkBuilder.iops(iops)
  }

  public fun removalPolicy(removalPolicy: RemovalPolicy) {
    cdkBuilder.removalPolicy(removalPolicy)
  }

  public fun size(size: Size) {
    cdkBuilder.size(size)
  }

  public fun snapshotId(snapshotId: String) {
    cdkBuilder.snapshotId(snapshotId)
  }

  public fun throughput(throughput: Number) {
    cdkBuilder.throughput(throughput)
  }

  public fun volumeName(volumeName: String) {
    cdkBuilder.volumeName(volumeName)
  }

  public fun volumeType(volumeType: EbsDeviceVolumeType) {
    cdkBuilder.volumeType(volumeType)
  }

  public fun build(): Volume = cdkBuilder.build()
}
