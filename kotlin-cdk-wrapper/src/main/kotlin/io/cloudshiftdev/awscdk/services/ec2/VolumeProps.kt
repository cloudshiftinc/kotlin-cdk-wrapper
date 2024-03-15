@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface VolumeProps {
  public fun autoEnableIo(): Boolean? = unwrap(this).getAutoEnableIo()

  public fun availabilityZone(): String

  public fun enableMultiAttach(): Boolean? = unwrap(this).getEnableMultiAttach()

  public fun encrypted(): Boolean? = unwrap(this).getEncrypted()

  public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  public fun iops(): Number? = unwrap(this).getIops()

  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  public fun size(): Size? = unwrap(this).getSize()?.let(Size::wrap)

  public fun snapshotId(): String? = unwrap(this).getSnapshotId()

  public fun throughput(): Number? = unwrap(this).getThroughput()

  public fun volumeName(): String? = unwrap(this).getVolumeName()

  public fun volumeType(): EbsDeviceVolumeType? =
      unwrap(this).getVolumeType()?.let(EbsDeviceVolumeType::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun autoEnableIo(autoEnableIo: Boolean)

    public fun availabilityZone(availabilityZone: String)

    public fun enableMultiAttach(enableMultiAttach: Boolean)

    public fun encrypted(encrypted: Boolean)

    public fun encryptionKey(encryptionKey: IKey)

    public fun iops(iops: Number)

    public fun removalPolicy(removalPolicy: RemovalPolicy)

    public fun size(size: Size)

    public fun snapshotId(snapshotId: String)

    public fun throughput(throughput: Number)

    public fun volumeName(volumeName: String)

    public fun volumeType(volumeType: EbsDeviceVolumeType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.VolumeProps.Builder =
        software.amazon.awscdk.services.ec2.VolumeProps.builder()

    override fun autoEnableIo(autoEnableIo: Boolean) {
      cdkBuilder.autoEnableIo(autoEnableIo)
    }

    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    override fun enableMultiAttach(enableMultiAttach: Boolean) {
      cdkBuilder.enableMultiAttach(enableMultiAttach)
    }

    override fun encrypted(encrypted: Boolean) {
      cdkBuilder.encrypted(encrypted)
    }

    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey::unwrap))
    }

    override fun iops(iops: Number) {
      cdkBuilder.iops(iops)
    }

    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    override fun size(size: Size) {
      cdkBuilder.size(size.let(Size::unwrap))
    }

    override fun snapshotId(snapshotId: String) {
      cdkBuilder.snapshotId(snapshotId)
    }

    override fun throughput(throughput: Number) {
      cdkBuilder.throughput(throughput)
    }

    override fun volumeName(volumeName: String) {
      cdkBuilder.volumeName(volumeName)
    }

    override fun volumeType(volumeType: EbsDeviceVolumeType) {
      cdkBuilder.volumeType(volumeType.let(EbsDeviceVolumeType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.VolumeProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.VolumeProps,
  ) : CdkObject(cdkObject), VolumeProps {
    override fun autoEnableIo(): Boolean? = unwrap(this).getAutoEnableIo()

    override fun availabilityZone(): String = unwrap(this).getAvailabilityZone()

    override fun enableMultiAttach(): Boolean? = unwrap(this).getEnableMultiAttach()

    override fun encrypted(): Boolean? = unwrap(this).getEncrypted()

    override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    override fun iops(): Number? = unwrap(this).getIops()

    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

    override fun size(): Size? = unwrap(this).getSize()?.let(Size::wrap)

    override fun snapshotId(): String? = unwrap(this).getSnapshotId()

    override fun throughput(): Number? = unwrap(this).getThroughput()

    override fun volumeName(): String? = unwrap(this).getVolumeName()

    override fun volumeType(): EbsDeviceVolumeType? =
        unwrap(this).getVolumeType()?.let(EbsDeviceVolumeType::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VolumeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.VolumeProps): VolumeProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: VolumeProps): software.amazon.awscdk.services.ec2.VolumeProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.VolumeProps
  }
}
