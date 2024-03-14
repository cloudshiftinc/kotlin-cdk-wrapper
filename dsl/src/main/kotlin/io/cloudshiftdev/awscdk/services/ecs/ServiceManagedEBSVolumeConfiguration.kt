package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ec2.EbsDeviceVolumeType
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface ServiceManagedEBSVolumeConfiguration {
  /**
   * Indicates whether the volume should be encrypted.
   *
   * Default: - Default Amazon EBS encryption.
   */
  public fun encrypted(): Boolean? = unwrap(this).getEncrypted()

  /**
   * The Linux filesystem type for the volume.
   *
   * For volumes created from a snapshot, you must specify the same filesystem type that
   * the volume was using when the snapshot was created.
   * The available filesystem types are ext3, ext4, and xfs.
   *
   * Default: - FileSystemType.XFS
   */
  public fun fileSystemType(): FileSystemType? =
      unwrap(this).getFileSystemType()?.let(FileSystemType::wrap)

  /**
   * The number of I/O operations per second (IOPS).
   *
   * For gp3, io1, and io2 volumes, this represents the number of IOPS that are provisioned
   * for the volume. For gp2 volumes, this represents the baseline performance of the volume
   * and the rate at which the volume accumulates I/O credits for bursting.
   *
   * The following are the supported values for each volume type.
   *
   * * gp3: 3,000 - 16,000 IOPS
   * * io1: 100 - 64,000 IOPS
   * * io2: 100 - 256,000 IOPS
   *
   * This parameter is required for io1 and io2 volume types. The default for gp3 volumes is
   * 3,000 IOPS. This parameter is not supported for st1, sc1, or standard volume types.
   *
   * Default: - undefined
   */
  public fun iops(): Number? = unwrap(this).getIops()

  /**
   * AWS Key Management Service key to use for Amazon EBS encryption.
   *
   * Default: - When `encryption` is turned on and no `kmsKey` is specified,
   * the default AWS managed key for Amazon EBS volumes is used.
   */
  public fun kmsKeyId(): IKey? = unwrap(this).getKmsKeyId()?.let(IKey::wrap)

  /**
   * An IAM role that allows ECS to make calls to EBS APIs on your behalf.
   *
   * This role is required to create and manage the Amazon EBS volume.
   *
   * Default: - automatically generated role.
   */
  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  /**
   * The size of the volume in GiB.
   *
   * You must specify either `size` or `snapshotId`.
   * You can optionally specify a volume size greater than or equal to the snapshot size.
   *
   * The following are the supported volume size values for each volume type.
   *
   * * gp2 and gp3: 1-16,384
   * * io1 and io2: 4-16,384
   * * st1 and sc1: 125-16,384
   * * standard: 1-1,024
   *
   * Default: - The snapshot size is used for the volume size if you specify `snapshotId`,
   * otherwise this parameter is required.
   */
  public fun size(): Size? = unwrap(this).getSize()?.let(Size::wrap)

  /**
   * The snapshot that Amazon ECS uses to create the volume.
   *
   * You must specify either `size` or `snapshotId`.
   *
   * Default: - No snapshot.
   */
  public fun snapShotId(): String? = unwrap(this).getSnapShotId()

  /**
   * Specifies the tags to apply to the volume and whether to propagate those tags to the volume.
   *
   * Default: - No tags are specified.
   */
  public fun tagSpecifications(): List<EBSTagSpecification> =
      unwrap(this).getTagSpecifications()?.map(EBSTagSpecification::wrap) ?: emptyList()

  /**
   * The throughput to provision for a volume, in MiB/s, with a maximum of 1,000 MiB/s.
   *
   * This parameter is only supported for the gp3 volume type.
   *
   * Default: - No throughput.
   */
  public fun throughput(): Number? = unwrap(this).getThroughput()

  /**
   * The volume type.
   *
   * Default: - ec2.EbsDeviceVolumeType.GP2
   */
  public fun volumeType(): EbsDeviceVolumeType? =
      unwrap(this).getVolumeType()?.let(EbsDeviceVolumeType::wrap)

  /**
   * A builder for [ServiceManagedEBSVolumeConfiguration]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param encrypted Indicates whether the volume should be encrypted.
     */
    public fun encrypted(encrypted: Boolean)

    /**
     * @param fileSystemType The Linux filesystem type for the volume.
     * For volumes created from a snapshot, you must specify the same filesystem type that
     * the volume was using when the snapshot was created.
     * The available filesystem types are ext3, ext4, and xfs.
     */
    public fun fileSystemType(fileSystemType: FileSystemType)

    /**
     * @param iops The number of I/O operations per second (IOPS).
     * For gp3, io1, and io2 volumes, this represents the number of IOPS that are provisioned
     * for the volume. For gp2 volumes, this represents the baseline performance of the volume
     * and the rate at which the volume accumulates I/O credits for bursting.
     *
     * The following are the supported values for each volume type.
     *
     * * gp3: 3,000 - 16,000 IOPS
     * * io1: 100 - 64,000 IOPS
     * * io2: 100 - 256,000 IOPS
     *
     * This parameter is required for io1 and io2 volume types. The default for gp3 volumes is
     * 3,000 IOPS. This parameter is not supported for st1, sc1, or standard volume types.
     */
    public fun iops(iops: Number)

    /**
     * @param kmsKeyId AWS Key Management Service key to use for Amazon EBS encryption.
     */
    public fun kmsKeyId(kmsKeyId: IKey)

    /**
     * @param role An IAM role that allows ECS to make calls to EBS APIs on your behalf.
     * This role is required to create and manage the Amazon EBS volume.
     */
    public fun role(role: IRole)

    /**
     * @param size The size of the volume in GiB.
     * You must specify either `size` or `snapshotId`.
     * You can optionally specify a volume size greater than or equal to the snapshot size.
     *
     * The following are the supported volume size values for each volume type.
     *
     * * gp2 and gp3: 1-16,384
     * * io1 and io2: 4-16,384
     * * st1 and sc1: 125-16,384
     * * standard: 1-1,024
     */
    public fun size(size: Size)

    /**
     * @param snapShotId The snapshot that Amazon ECS uses to create the volume.
     * You must specify either `size` or `snapshotId`.
     */
    public fun snapShotId(snapShotId: String)

    /**
     * @param tagSpecifications Specifies the tags to apply to the volume and whether to propagate
     * those tags to the volume.
     */
    public fun tagSpecifications(tagSpecifications: List<EBSTagSpecification>)

    /**
     * @param tagSpecifications Specifies the tags to apply to the volume and whether to propagate
     * those tags to the volume.
     */
    public fun tagSpecifications(vararg tagSpecifications: EBSTagSpecification)

    /**
     * @param throughput The throughput to provision for a volume, in MiB/s, with a maximum of 1,000
     * MiB/s.
     * This parameter is only supported for the gp3 volume type.
     */
    public fun throughput(throughput: Number)

    /**
     * @param volumeType The volume type.
     */
    public fun volumeType(volumeType: EbsDeviceVolumeType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.ServiceManagedEBSVolumeConfiguration.Builder =
        software.amazon.awscdk.services.ecs.ServiceManagedEBSVolumeConfiguration.builder()

    /**
     * @param encrypted Indicates whether the volume should be encrypted.
     */
    override fun encrypted(encrypted: Boolean) {
      cdkBuilder.encrypted(encrypted)
    }

    /**
     * @param fileSystemType The Linux filesystem type for the volume.
     * For volumes created from a snapshot, you must specify the same filesystem type that
     * the volume was using when the snapshot was created.
     * The available filesystem types are ext3, ext4, and xfs.
     */
    override fun fileSystemType(fileSystemType: FileSystemType) {
      cdkBuilder.fileSystemType(fileSystemType.let(FileSystemType::unwrap))
    }

    /**
     * @param iops The number of I/O operations per second (IOPS).
     * For gp3, io1, and io2 volumes, this represents the number of IOPS that are provisioned
     * for the volume. For gp2 volumes, this represents the baseline performance of the volume
     * and the rate at which the volume accumulates I/O credits for bursting.
     *
     * The following are the supported values for each volume type.
     *
     * * gp3: 3,000 - 16,000 IOPS
     * * io1: 100 - 64,000 IOPS
     * * io2: 100 - 256,000 IOPS
     *
     * This parameter is required for io1 and io2 volume types. The default for gp3 volumes is
     * 3,000 IOPS. This parameter is not supported for st1, sc1, or standard volume types.
     */
    override fun iops(iops: Number) {
      cdkBuilder.iops(iops)
    }

    /**
     * @param kmsKeyId AWS Key Management Service key to use for Amazon EBS encryption.
     */
    override fun kmsKeyId(kmsKeyId: IKey) {
      cdkBuilder.kmsKeyId(kmsKeyId.let(IKey::unwrap))
    }

    /**
     * @param role An IAM role that allows ECS to make calls to EBS APIs on your behalf.
     * This role is required to create and manage the Amazon EBS volume.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    /**
     * @param size The size of the volume in GiB.
     * You must specify either `size` or `snapshotId`.
     * You can optionally specify a volume size greater than or equal to the snapshot size.
     *
     * The following are the supported volume size values for each volume type.
     *
     * * gp2 and gp3: 1-16,384
     * * io1 and io2: 4-16,384
     * * st1 and sc1: 125-16,384
     * * standard: 1-1,024
     */
    override fun size(size: Size) {
      cdkBuilder.size(size.let(Size::unwrap))
    }

    /**
     * @param snapShotId The snapshot that Amazon ECS uses to create the volume.
     * You must specify either `size` or `snapshotId`.
     */
    override fun snapShotId(snapShotId: String) {
      cdkBuilder.snapShotId(snapShotId)
    }

    /**
     * @param tagSpecifications Specifies the tags to apply to the volume and whether to propagate
     * those tags to the volume.
     */
    override fun tagSpecifications(tagSpecifications: List<EBSTagSpecification>) {
      cdkBuilder.tagSpecifications(tagSpecifications.map(EBSTagSpecification::unwrap))
    }

    /**
     * @param tagSpecifications Specifies the tags to apply to the volume and whether to propagate
     * those tags to the volume.
     */
    override fun tagSpecifications(vararg tagSpecifications: EBSTagSpecification): Unit =
        tagSpecifications(tagSpecifications.toList())

    /**
     * @param throughput The throughput to provision for a volume, in MiB/s, with a maximum of 1,000
     * MiB/s.
     * This parameter is only supported for the gp3 volume type.
     */
    override fun throughput(throughput: Number) {
      cdkBuilder.throughput(throughput)
    }

    /**
     * @param volumeType The volume type.
     */
    override fun volumeType(volumeType: EbsDeviceVolumeType) {
      cdkBuilder.volumeType(volumeType.let(EbsDeviceVolumeType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.ServiceManagedEBSVolumeConfiguration =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.ecs.ServiceManagedEBSVolumeConfiguration,
  ) : ServiceManagedEBSVolumeConfiguration {
    /**
     * Indicates whether the volume should be encrypted.
     *
     * Default: - Default Amazon EBS encryption.
     */
    override fun encrypted(): Boolean? = unwrap(this).getEncrypted()

    /**
     * The Linux filesystem type for the volume.
     *
     * For volumes created from a snapshot, you must specify the same filesystem type that
     * the volume was using when the snapshot was created.
     * The available filesystem types are ext3, ext4, and xfs.
     *
     * Default: - FileSystemType.XFS
     */
    override fun fileSystemType(): FileSystemType? =
        unwrap(this).getFileSystemType()?.let(FileSystemType::wrap)

    /**
     * The number of I/O operations per second (IOPS).
     *
     * For gp3, io1, and io2 volumes, this represents the number of IOPS that are provisioned
     * for the volume. For gp2 volumes, this represents the baseline performance of the volume
     * and the rate at which the volume accumulates I/O credits for bursting.
     *
     * The following are the supported values for each volume type.
     *
     * * gp3: 3,000 - 16,000 IOPS
     * * io1: 100 - 64,000 IOPS
     * * io2: 100 - 256,000 IOPS
     *
     * This parameter is required for io1 and io2 volume types. The default for gp3 volumes is
     * 3,000 IOPS. This parameter is not supported for st1, sc1, or standard volume types.
     *
     * Default: - undefined
     */
    override fun iops(): Number? = unwrap(this).getIops()

    /**
     * AWS Key Management Service key to use for Amazon EBS encryption.
     *
     * Default: - When `encryption` is turned on and no `kmsKey` is specified,
     * the default AWS managed key for Amazon EBS volumes is used.
     */
    override fun kmsKeyId(): IKey? = unwrap(this).getKmsKeyId()?.let(IKey::wrap)

    /**
     * An IAM role that allows ECS to make calls to EBS APIs on your behalf.
     *
     * This role is required to create and manage the Amazon EBS volume.
     *
     * Default: - automatically generated role.
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    /**
     * The size of the volume in GiB.
     *
     * You must specify either `size` or `snapshotId`.
     * You can optionally specify a volume size greater than or equal to the snapshot size.
     *
     * The following are the supported volume size values for each volume type.
     *
     * * gp2 and gp3: 1-16,384
     * * io1 and io2: 4-16,384
     * * st1 and sc1: 125-16,384
     * * standard: 1-1,024
     *
     * Default: - The snapshot size is used for the volume size if you specify `snapshotId`,
     * otherwise this parameter is required.
     */
    override fun size(): Size? = unwrap(this).getSize()?.let(Size::wrap)

    /**
     * The snapshot that Amazon ECS uses to create the volume.
     *
     * You must specify either `size` or `snapshotId`.
     *
     * Default: - No snapshot.
     */
    override fun snapShotId(): String? = unwrap(this).getSnapShotId()

    /**
     * Specifies the tags to apply to the volume and whether to propagate those tags to the volume.
     *
     * Default: - No tags are specified.
     */
    override fun tagSpecifications(): List<EBSTagSpecification> =
        unwrap(this).getTagSpecifications()?.map(EBSTagSpecification::wrap) ?: emptyList()

    /**
     * The throughput to provision for a volume, in MiB/s, with a maximum of 1,000 MiB/s.
     *
     * This parameter is only supported for the gp3 volume type.
     *
     * Default: - No throughput.
     */
    override fun throughput(): Number? = unwrap(this).getThroughput()

    /**
     * The volume type.
     *
     * Default: - ec2.EbsDeviceVolumeType.GP2
     */
    override fun volumeType(): EbsDeviceVolumeType? =
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
