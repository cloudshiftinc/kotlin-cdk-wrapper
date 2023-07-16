@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnVolume
import software.constructs.Construct

@CdkDslMarker
public class CfnVolumeDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnVolume.Builder = CfnVolume.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun autoEnableIo(autoEnableIo: Boolean) {
    cdkBuilder.autoEnableIo(autoEnableIo)
  }

  public fun autoEnableIo(autoEnableIo: IResolvable) {
    cdkBuilder.autoEnableIo(autoEnableIo)
  }

  public fun availabilityZone(availabilityZone: String) {
    cdkBuilder.availabilityZone(availabilityZone)
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

  public fun multiAttachEnabled(multiAttachEnabled: Boolean) {
    cdkBuilder.multiAttachEnabled(multiAttachEnabled)
  }

  public fun multiAttachEnabled(multiAttachEnabled: IResolvable) {
    cdkBuilder.multiAttachEnabled(multiAttachEnabled)
  }

  public fun outpostArn(outpostArn: String) {
    cdkBuilder.outpostArn(outpostArn)
  }

  public fun size(size: Number) {
    cdkBuilder.size(size)
  }

  public fun snapshotId(snapshotId: String) {
    cdkBuilder.snapshotId(snapshotId)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun throughput(throughput: Number) {
    cdkBuilder.throughput(throughput)
  }

  public fun volumeType(volumeType: String) {
    cdkBuilder.volumeType(volumeType)
  }

  public fun build(): CfnVolume {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
