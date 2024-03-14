package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.services.ec2.EbsDeviceVolumeType
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface ServiceManagedEBSVolumeConfiguration {
  public fun encrypted(): Boolean? = unwrap(this).getEncrypted()

  public fun fileSystemType(): FileSystemType? =
      unwrap(this).getFileSystemType()?.let(FileSystemType::wrap)

  public fun iops(): Number? = unwrap(this).getIops()

  public fun kmsKeyId(): IKey? = unwrap(this).getKmsKeyId()?.let(IKey::wrap)

  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  public fun size(): Size? = unwrap(this).getSize()?.let(Size::wrap)

  public fun snapShotId(): String? = unwrap(this).getSnapShotId()

  public fun tagSpecifications(): List<EBSTagSpecification> =
      unwrap(this).getTagSpecifications()?.map(EBSTagSpecification::wrap) ?: emptyList()

  public fun throughput(): Number? = unwrap(this).getThroughput()

  public fun volumeType(): EbsDeviceVolumeType? =
      unwrap(this).getVolumeType()?.let(EbsDeviceVolumeType::wrap)

  public interface Builder {
    public fun encrypted(encrypted: Boolean) {
    }

    public fun fileSystemType(fileSystemType: FileSystemType) {
    }

    public fun iops(iops: Number) {
    }

    public fun kmsKeyId(kmsKeyId: IKey) {
    }

    public fun role(role: IRole) {
    }

    public fun size(size: Size) {
    }

    public fun snapShotId(snapShotId: String) {
    }

    public fun tagSpecifications(tagSpecifications: List<EBSTagSpecification>) {
    }

    public fun throughput(throughput: Number) {
    }

    public fun volumeType(volumeType: EbsDeviceVolumeType) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.ServiceManagedEBSVolumeConfiguration.Builder =
        software.amazon.awscdk.services.ecs.ServiceManagedEBSVolumeConfiguration.builder()

    public override fun encrypted(encrypted: Boolean) {
      cdkBuilder.encrypted(encrypted)
    }

    public override fun fileSystemType(fileSystemType: FileSystemType) {
      cdkBuilder.fileSystemType(fileSystemType.let(FileSystemType::unwrap))
    }

    public override fun iops(iops: Number) {
      cdkBuilder.iops(iops)
    }

    public override fun kmsKeyId(kmsKeyId: IKey) {
      cdkBuilder.kmsKeyId(kmsKeyId.let(IKey::unwrap))
    }

    public override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    public override fun size(size: Size) {
      cdkBuilder.size(size.let(Size::unwrap))
    }

    public override fun snapShotId(snapShotId: String) {
      cdkBuilder.snapShotId(snapShotId)
    }

    public override fun tagSpecifications(tagSpecifications: List<EBSTagSpecification>) {
      cdkBuilder.tagSpecifications(tagSpecifications.map(EBSTagSpecification::unwrap))
    }

    public override fun throughput(throughput: Number) {
      cdkBuilder.throughput(throughput)
    }

    public override fun volumeType(volumeType: EbsDeviceVolumeType) {
      cdkBuilder.volumeType(volumeType.let(EbsDeviceVolumeType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.ServiceManagedEBSVolumeConfiguration =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.ecs.ServiceManagedEBSVolumeConfiguration,
  ) : ServiceManagedEBSVolumeConfiguration {
    public override fun encrypted(): Boolean? = unwrap(this).getEncrypted()

    public override fun fileSystemType(): FileSystemType? =
        unwrap(this).getFileSystemType()?.let(FileSystemType::wrap)

    public override fun iops(): Number? = unwrap(this).getIops()

    public override fun kmsKeyId(): IKey? = unwrap(this).getKmsKeyId()?.let(IKey::wrap)

    public override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    public override fun size(): Size? = unwrap(this).getSize()?.let(Size::wrap)

    public override fun snapShotId(): String? = unwrap(this).getSnapShotId()

    public override fun tagSpecifications(): List<EBSTagSpecification> =
        unwrap(this).getTagSpecifications()?.map(EBSTagSpecification::wrap) ?: emptyList()

    public override fun throughput(): Number? = unwrap(this).getThroughput()

    public override fun volumeType(): EbsDeviceVolumeType? =
        unwrap(this).getVolumeType()?.let(EbsDeviceVolumeType::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}):
        ServiceManagedEBSVolumeConfiguration {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.ServiceManagedEBSVolumeConfiguration):
        ServiceManagedEBSVolumeConfiguration = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ServiceManagedEBSVolumeConfiguration):
        software.amazon.awscdk.services.ecs.ServiceManagedEBSVolumeConfiguration = (wrapped as
        Wrapper).cdkObject
  }
}
