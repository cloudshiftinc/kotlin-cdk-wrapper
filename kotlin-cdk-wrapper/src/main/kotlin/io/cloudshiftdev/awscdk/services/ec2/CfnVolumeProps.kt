@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnVolumeProps {
  public fun autoEnableIo(): Any? = unwrap(this).getAutoEnableIo()

  public fun availabilityZone(): String

  public fun encrypted(): Any? = unwrap(this).getEncrypted()

  public fun iops(): Number? = unwrap(this).getIops()

  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public fun multiAttachEnabled(): Any? = unwrap(this).getMultiAttachEnabled()

  public fun outpostArn(): String? = unwrap(this).getOutpostArn()

  public fun size(): Number? = unwrap(this).getSize()

  public fun snapshotId(): String? = unwrap(this).getSnapshotId()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun throughput(): Number? = unwrap(this).getThroughput()

  public fun volumeType(): String? = unwrap(this).getVolumeType()

  @CdkDslMarker
  public interface Builder {
    public fun autoEnableIo(autoEnableIo: Boolean)

    public fun autoEnableIo(autoEnableIo: IResolvable)

    public fun availabilityZone(availabilityZone: String)

    public fun encrypted(encrypted: Boolean)

    public fun encrypted(encrypted: IResolvable)

    public fun iops(iops: Number)

    public fun kmsKeyId(kmsKeyId: String)

    public fun multiAttachEnabled(multiAttachEnabled: Boolean)

    public fun multiAttachEnabled(multiAttachEnabled: IResolvable)

    public fun outpostArn(outpostArn: String)

    public fun size(size: Number)

    public fun snapshotId(snapshotId: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun throughput(throughput: Number)

    public fun volumeType(volumeType: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnVolumeProps.Builder =
        software.amazon.awscdk.services.ec2.CfnVolumeProps.builder()

    override fun autoEnableIo(autoEnableIo: Boolean) {
      cdkBuilder.autoEnableIo(autoEnableIo)
    }

    override fun autoEnableIo(autoEnableIo: IResolvable) {
      cdkBuilder.autoEnableIo(autoEnableIo.let(IResolvable::unwrap))
    }

    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    override fun encrypted(encrypted: Boolean) {
      cdkBuilder.encrypted(encrypted)
    }

    override fun encrypted(encrypted: IResolvable) {
      cdkBuilder.encrypted(encrypted.let(IResolvable::unwrap))
    }

    override fun iops(iops: Number) {
      cdkBuilder.iops(iops)
    }

    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    override fun multiAttachEnabled(multiAttachEnabled: Boolean) {
      cdkBuilder.multiAttachEnabled(multiAttachEnabled)
    }

    override fun multiAttachEnabled(multiAttachEnabled: IResolvable) {
      cdkBuilder.multiAttachEnabled(multiAttachEnabled.let(IResolvable::unwrap))
    }

    override fun outpostArn(outpostArn: String) {
      cdkBuilder.outpostArn(outpostArn)
    }

    override fun size(size: Number) {
      cdkBuilder.size(size)
    }

    override fun snapshotId(snapshotId: String) {
      cdkBuilder.snapshotId(snapshotId)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun throughput(throughput: Number) {
      cdkBuilder.throughput(throughput)
    }

    override fun volumeType(volumeType: String) {
      cdkBuilder.volumeType(volumeType)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVolumeProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnVolumeProps,
  ) : CdkObject(cdkObject), CfnVolumeProps {
    override fun autoEnableIo(): Any? = unwrap(this).getAutoEnableIo()

    override fun availabilityZone(): String = unwrap(this).getAvailabilityZone()

    override fun encrypted(): Any? = unwrap(this).getEncrypted()

    override fun iops(): Number? = unwrap(this).getIops()

    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    override fun multiAttachEnabled(): Any? = unwrap(this).getMultiAttachEnabled()

    override fun outpostArn(): String? = unwrap(this).getOutpostArn()

    override fun size(): Number? = unwrap(this).getSize()

    override fun snapshotId(): String? = unwrap(this).getSnapshotId()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun throughput(): Number? = unwrap(this).getThroughput()

    override fun volumeType(): String? = unwrap(this).getVolumeType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVolumeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVolumeProps): CfnVolumeProps
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVolumeProps): software.amazon.awscdk.services.ec2.CfnVolumeProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnVolumeProps
  }
}
