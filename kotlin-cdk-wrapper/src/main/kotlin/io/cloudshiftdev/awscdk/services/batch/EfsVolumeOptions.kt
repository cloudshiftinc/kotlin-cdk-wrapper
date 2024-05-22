@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.efs.IFileSystem
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Options for configuring an EfsVolume.
 *
 * Example:
 *
 * ```
 * IFileSystem myFileSystem;
 * Role myJobRole;
 * myFileSystem.grantRead(myJobRole);
 * EcsJobDefinition jobDefn = EcsJobDefinition.Builder.create(this, "JobDefn")
 * .container(EcsEc2ContainerDefinition.Builder.create(this, "containerDefn")
 * .image(ContainerImage.fromRegistry("public.ecr.aws/amazonlinux/amazonlinux:latest"))
 * .memory(Size.mebibytes(2048))
 * .cpu(256)
 * .volumes(List.of(EcsVolume.efs(EfsVolumeOptions.builder()
 * .name("myVolume")
 * .fileSystem(myFileSystem)
 * .containerPath("/Volumes/myVolume")
 * .useJobRole(true)
 * .build())))
 * .jobRole(myJobRole)
 * .build())
 * .build();
 * ```
 */
public interface EfsVolumeOptions : EcsVolumeOptions {
  /**
   * The Amazon EFS access point ID to use.
   *
   * If an access point is specified, `rootDirectory` must either be omitted or set to `/`
   * which enforces the path set on the EFS access point.
   * If an access point is used, `enableTransitEncryption` must be `true`.
   *
   * Default: - no accessPointId
   *
   * [Documentation](https://docs.aws.amazon.com/efs/latest/ug/efs-access-points.html)
   */
  public fun accessPointId(): String? = unwrap(this).getAccessPointId()

  /**
   * Enables encryption for Amazon EFS data in transit between the Amazon ECS host and the Amazon
   * EFS server.
   *
   * Default: false
   *
   * [Documentation](https://docs.aws.amazon.com/efs/latest/ug/encryption-in-transit.html)
   */
  public fun enableTransitEncryption(): Boolean? = unwrap(this).getEnableTransitEncryption()

  /**
   * The EFS File System that supports this volume.
   */
  public fun fileSystem(): IFileSystem

  /**
   * The directory within the Amazon EFS file system to mount as the root directory inside the host.
   *
   * If this parameter is omitted, the root of the Amazon EFS volume is used instead.
   * Specifying `/` has the same effect as omitting this parameter.
   * The maximum length is 4,096 characters.
   *
   * Default: - root of the EFS File System
   */
  public fun rootDirectory(): String? = unwrap(this).getRootDirectory()

  /**
   * The port to use when sending encrypted data between the Amazon ECS host and the Amazon EFS
   * server.
   *
   * The value must be between 0 and 65,535.
   *
   * Default: - chosen by the EFS Mount Helper
   *
   * [Documentation](https://docs.aws.amazon.com/efs/latest/ug/efs-mount-helper.html)
   */
  public fun transitEncryptionPort(): Number? = unwrap(this).getTransitEncryptionPort()

  /**
   * Whether or not to use the AWS Batch job IAM role defined in a job definition when mounting the
   * Amazon EFS file system.
   *
   * If specified, `enableTransitEncryption` must be `true`.
   *
   * Default: false
   *
   * [Documentation](https://docs.aws.amazon.com/batch/latest/userguide/efs-volumes.html#efs-volume-accesspoints)
   */
  public fun useJobRole(): Boolean? = unwrap(this).getUseJobRole()

  /**
   * A builder for [EfsVolumeOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accessPointId The Amazon EFS access point ID to use.
     * If an access point is specified, `rootDirectory` must either be omitted or set to `/`
     * which enforces the path set on the EFS access point.
     * If an access point is used, `enableTransitEncryption` must be `true`.
     */
    public fun accessPointId(accessPointId: String)

    /**
     * @param containerPath the path on the container where this volume is mounted. 
     */
    public fun containerPath(containerPath: String)

    /**
     * @param enableTransitEncryption Enables encryption for Amazon EFS data in transit between the
     * Amazon ECS host and the Amazon EFS server.
     */
    public fun enableTransitEncryption(enableTransitEncryption: Boolean)

    /**
     * @param fileSystem The EFS File System that supports this volume. 
     */
    public fun fileSystem(fileSystem: IFileSystem)

    /**
     * @param name the name of this volume. 
     */
    public fun name(name: String)

    /**
     * @param readonly if set, the container will have readonly access to the volume.
     */
    public fun readonly(readonly: Boolean)

    /**
     * @param rootDirectory The directory within the Amazon EFS file system to mount as the root
     * directory inside the host.
     * If this parameter is omitted, the root of the Amazon EFS volume is used instead.
     * Specifying `/` has the same effect as omitting this parameter.
     * The maximum length is 4,096 characters.
     */
    public fun rootDirectory(rootDirectory: String)

    /**
     * @param transitEncryptionPort The port to use when sending encrypted data between the Amazon
     * ECS host and the Amazon EFS server.
     * The value must be between 0 and 65,535.
     */
    public fun transitEncryptionPort(transitEncryptionPort: Number)

    /**
     * @param useJobRole Whether or not to use the AWS Batch job IAM role defined in a job
     * definition when mounting the Amazon EFS file system.
     * If specified, `enableTransitEncryption` must be `true`.
     */
    public fun useJobRole(useJobRole: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.EfsVolumeOptions.Builder =
        software.amazon.awscdk.services.batch.EfsVolumeOptions.builder()

    /**
     * @param accessPointId The Amazon EFS access point ID to use.
     * If an access point is specified, `rootDirectory` must either be omitted or set to `/`
     * which enforces the path set on the EFS access point.
     * If an access point is used, `enableTransitEncryption` must be `true`.
     */
    override fun accessPointId(accessPointId: String) {
      cdkBuilder.accessPointId(accessPointId)
    }

    /**
     * @param containerPath the path on the container where this volume is mounted. 
     */
    override fun containerPath(containerPath: String) {
      cdkBuilder.containerPath(containerPath)
    }

    /**
     * @param enableTransitEncryption Enables encryption for Amazon EFS data in transit between the
     * Amazon ECS host and the Amazon EFS server.
     */
    override fun enableTransitEncryption(enableTransitEncryption: Boolean) {
      cdkBuilder.enableTransitEncryption(enableTransitEncryption)
    }

    /**
     * @param fileSystem The EFS File System that supports this volume. 
     */
    override fun fileSystem(fileSystem: IFileSystem) {
      cdkBuilder.fileSystem(fileSystem.let(IFileSystem.Companion::unwrap))
    }

    /**
     * @param name the name of this volume. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param readonly if set, the container will have readonly access to the volume.
     */
    override fun readonly(readonly: Boolean) {
      cdkBuilder.readonly(readonly)
    }

    /**
     * @param rootDirectory The directory within the Amazon EFS file system to mount as the root
     * directory inside the host.
     * If this parameter is omitted, the root of the Amazon EFS volume is used instead.
     * Specifying `/` has the same effect as omitting this parameter.
     * The maximum length is 4,096 characters.
     */
    override fun rootDirectory(rootDirectory: String) {
      cdkBuilder.rootDirectory(rootDirectory)
    }

    /**
     * @param transitEncryptionPort The port to use when sending encrypted data between the Amazon
     * ECS host and the Amazon EFS server.
     * The value must be between 0 and 65,535.
     */
    override fun transitEncryptionPort(transitEncryptionPort: Number) {
      cdkBuilder.transitEncryptionPort(transitEncryptionPort)
    }

    /**
     * @param useJobRole Whether or not to use the AWS Batch job IAM role defined in a job
     * definition when mounting the Amazon EFS file system.
     * If specified, `enableTransitEncryption` must be `true`.
     */
    override fun useJobRole(useJobRole: Boolean) {
      cdkBuilder.useJobRole(useJobRole)
    }

    public fun build(): software.amazon.awscdk.services.batch.EfsVolumeOptions = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.batch.EfsVolumeOptions,
  ) : CdkObject(cdkObject), EfsVolumeOptions {
    /**
     * The Amazon EFS access point ID to use.
     *
     * If an access point is specified, `rootDirectory` must either be omitted or set to `/`
     * which enforces the path set on the EFS access point.
     * If an access point is used, `enableTransitEncryption` must be `true`.
     *
     * Default: - no accessPointId
     *
     * [Documentation](https://docs.aws.amazon.com/efs/latest/ug/efs-access-points.html)
     */
    override fun accessPointId(): String? = unwrap(this).getAccessPointId()

    /**
     * the path on the container where this volume is mounted.
     */
    override fun containerPath(): String = unwrap(this).getContainerPath()

    /**
     * Enables encryption for Amazon EFS data in transit between the Amazon ECS host and the Amazon
     * EFS server.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/efs/latest/ug/encryption-in-transit.html)
     */
    override fun enableTransitEncryption(): Boolean? = unwrap(this).getEnableTransitEncryption()

    /**
     * The EFS File System that supports this volume.
     */
    override fun fileSystem(): IFileSystem = unwrap(this).getFileSystem().let(IFileSystem::wrap)

    /**
     * the name of this volume.
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * if set, the container will have readonly access to the volume.
     *
     * Default: false
     */
    override fun readonly(): Boolean? = unwrap(this).getReadonly()

    /**
     * The directory within the Amazon EFS file system to mount as the root directory inside the
     * host.
     *
     * If this parameter is omitted, the root of the Amazon EFS volume is used instead.
     * Specifying `/` has the same effect as omitting this parameter.
     * The maximum length is 4,096 characters.
     *
     * Default: - root of the EFS File System
     */
    override fun rootDirectory(): String? = unwrap(this).getRootDirectory()

    /**
     * The port to use when sending encrypted data between the Amazon ECS host and the Amazon EFS
     * server.
     *
     * The value must be between 0 and 65,535.
     *
     * Default: - chosen by the EFS Mount Helper
     *
     * [Documentation](https://docs.aws.amazon.com/efs/latest/ug/efs-mount-helper.html)
     */
    override fun transitEncryptionPort(): Number? = unwrap(this).getTransitEncryptionPort()

    /**
     * Whether or not to use the AWS Batch job IAM role defined in a job definition when mounting
     * the Amazon EFS file system.
     *
     * If specified, `enableTransitEncryption` must be `true`.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/batch/latest/userguide/efs-volumes.html#efs-volume-accesspoints)
     */
    override fun useJobRole(): Boolean? = unwrap(this).getUseJobRole()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EfsVolumeOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.EfsVolumeOptions):
        EfsVolumeOptions = CdkObjectWrappers.wrap(cdkObject) as? EfsVolumeOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: EfsVolumeOptions):
        software.amazon.awscdk.services.batch.EfsVolumeOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.batch.EfsVolumeOptions
  }
}
