@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.efs.IFileSystem
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * A Volume that uses an AWS Elastic File System (EFS);
 *
 * this volume can grow and shrink as needed
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.batch.*;
 * import io.cloudshiftdev.awscdk.services.efs.*;
 * FileSystem fileSystem;
 * EfsVolume efsVolume = EfsVolume.Builder.create()
 * .containerPath("containerPath")
 * .fileSystem(fileSystem)
 * .name("name")
 * // the properties below are optional
 * .accessPointId("accessPointId")
 * .enableTransitEncryption(false)
 * .readonly(false)
 * .rootDirectory("rootDirectory")
 * .transitEncryptionPort(123)
 * .useJobRole(false)
 * .build();
 * ```
 */
public open class EfsVolume internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.batch.EfsVolume,
) : EcsVolume(cdkObject) {
  public constructor(options: EfsVolumeOptions) :
      this(software.amazon.awscdk.services.batch.EfsVolume(options.let(EfsVolumeOptions::unwrap))
  )

  public constructor(options: EfsVolumeOptions.Builder.() -> Unit) : this(EfsVolumeOptions(options)
  )

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
  public open fun accessPointId(): String? = unwrap(this).getAccessPointId()

  /**
   * Enables encryption for Amazon EFS data in transit between the Amazon ECS host and the Amazon
   * EFS server.
   *
   * Default: false
   *
   * [Documentation](https://docs.aws.amazon.com/efs/latest/ug/encryption-in-transit.html)
   */
  public open fun enableTransitEncryption(): Boolean? = unwrap(this).getEnableTransitEncryption()

  /**
   * The EFS File System that supports this volume.
   */
  public open fun fileSystem(): IFileSystem = unwrap(this).getFileSystem().let(IFileSystem::wrap)

  /**
   * The directory within the Amazon EFS file system to mount as the root directory inside the host.
   *
   * If this parameter is omitted, the root of the Amazon EFS volume is used instead.
   * Specifying `/` has the same effect as omitting this parameter.
   * The maximum length is 4,096 characters.
   *
   * Default: - root of the EFS File System
   */
  public open fun rootDirectory(): String? = unwrap(this).getRootDirectory()

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
  public open fun transitEncryptionPort(): Number? = unwrap(this).getTransitEncryptionPort()

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
  public open fun useJobRole(): Boolean? = unwrap(this).getUseJobRole()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.batch.EfsVolume].
   */
  @CdkDslMarker
  public interface Builder {
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
     * @param accessPointId The Amazon EFS access point ID to use. 
     */
    public fun accessPointId(accessPointId: String)

    /**
     * the path on the container where this volume is mounted.
     *
     * @param containerPath the path on the container where this volume is mounted. 
     */
    public fun containerPath(containerPath: String)

    /**
     * Enables encryption for Amazon EFS data in transit between the Amazon ECS host and the Amazon
     * EFS server.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/efs/latest/ug/encryption-in-transit.html)
     * @param enableTransitEncryption Enables encryption for Amazon EFS data in transit between the
     * Amazon ECS host and the Amazon EFS server. 
     */
    public fun enableTransitEncryption(enableTransitEncryption: Boolean)

    /**
     * The EFS File System that supports this volume.
     *
     * @param fileSystem The EFS File System that supports this volume. 
     */
    public fun fileSystem(fileSystem: IFileSystem)

    /**
     * the name of this volume.
     *
     * @param name the name of this volume. 
     */
    public fun name(name: String)

    /**
     * if set, the container will have readonly access to the volume.
     *
     * Default: false
     *
     * @param readonly if set, the container will have readonly access to the volume. 
     */
    public fun readonly(readonly: Boolean)

    /**
     * The directory within the Amazon EFS file system to mount as the root directory inside the
     * host.
     *
     * If this parameter is omitted, the root of the Amazon EFS volume is used instead.
     * Specifying `/` has the same effect as omitting this parameter.
     * The maximum length is 4,096 characters.
     *
     * Default: - root of the EFS File System
     *
     * @param rootDirectory The directory within the Amazon EFS file system to mount as the root
     * directory inside the host. 
     */
    public fun rootDirectory(rootDirectory: String)

    /**
     * The port to use when sending encrypted data between the Amazon ECS host and the Amazon EFS
     * server.
     *
     * The value must be between 0 and 65,535.
     *
     * Default: - chosen by the EFS Mount Helper
     *
     * [Documentation](https://docs.aws.amazon.com/efs/latest/ug/efs-mount-helper.html)
     * @param transitEncryptionPort The port to use when sending encrypted data between the Amazon
     * ECS host and the Amazon EFS server. 
     */
    public fun transitEncryptionPort(transitEncryptionPort: Number)

    /**
     * Whether or not to use the AWS Batch job IAM role defined in a job definition when mounting
     * the Amazon EFS file system.
     *
     * If specified, `enableTransitEncryption` must be `true`.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/batch/latest/userguide/efs-volumes.html#efs-volume-accesspoints)
     * @param useJobRole Whether or not to use the AWS Batch job IAM role defined in a job
     * definition when mounting the Amazon EFS file system. 
     */
    public fun useJobRole(useJobRole: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.EfsVolume.Builder =
        software.amazon.awscdk.services.batch.EfsVolume.Builder.create()

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
     * @param accessPointId The Amazon EFS access point ID to use. 
     */
    override fun accessPointId(accessPointId: String) {
      cdkBuilder.accessPointId(accessPointId)
    }

    /**
     * the path on the container where this volume is mounted.
     *
     * @param containerPath the path on the container where this volume is mounted. 
     */
    override fun containerPath(containerPath: String) {
      cdkBuilder.containerPath(containerPath)
    }

    /**
     * Enables encryption for Amazon EFS data in transit between the Amazon ECS host and the Amazon
     * EFS server.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/efs/latest/ug/encryption-in-transit.html)
     * @param enableTransitEncryption Enables encryption for Amazon EFS data in transit between the
     * Amazon ECS host and the Amazon EFS server. 
     */
    override fun enableTransitEncryption(enableTransitEncryption: Boolean) {
      cdkBuilder.enableTransitEncryption(enableTransitEncryption)
    }

    /**
     * The EFS File System that supports this volume.
     *
     * @param fileSystem The EFS File System that supports this volume. 
     */
    override fun fileSystem(fileSystem: IFileSystem) {
      cdkBuilder.fileSystem(fileSystem.let(IFileSystem::unwrap))
    }

    /**
     * the name of this volume.
     *
     * @param name the name of this volume. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * if set, the container will have readonly access to the volume.
     *
     * Default: false
     *
     * @param readonly if set, the container will have readonly access to the volume. 
     */
    override fun readonly(readonly: Boolean) {
      cdkBuilder.readonly(readonly)
    }

    /**
     * The directory within the Amazon EFS file system to mount as the root directory inside the
     * host.
     *
     * If this parameter is omitted, the root of the Amazon EFS volume is used instead.
     * Specifying `/` has the same effect as omitting this parameter.
     * The maximum length is 4,096 characters.
     *
     * Default: - root of the EFS File System
     *
     * @param rootDirectory The directory within the Amazon EFS file system to mount as the root
     * directory inside the host. 
     */
    override fun rootDirectory(rootDirectory: String) {
      cdkBuilder.rootDirectory(rootDirectory)
    }

    /**
     * The port to use when sending encrypted data between the Amazon ECS host and the Amazon EFS
     * server.
     *
     * The value must be between 0 and 65,535.
     *
     * Default: - chosen by the EFS Mount Helper
     *
     * [Documentation](https://docs.aws.amazon.com/efs/latest/ug/efs-mount-helper.html)
     * @param transitEncryptionPort The port to use when sending encrypted data between the Amazon
     * ECS host and the Amazon EFS server. 
     */
    override fun transitEncryptionPort(transitEncryptionPort: Number) {
      cdkBuilder.transitEncryptionPort(transitEncryptionPort)
    }

    /**
     * Whether or not to use the AWS Batch job IAM role defined in a job definition when mounting
     * the Amazon EFS file system.
     *
     * If specified, `enableTransitEncryption` must be `true`.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/batch/latest/userguide/efs-volumes.html#efs-volume-accesspoints)
     * @param useJobRole Whether or not to use the AWS Batch job IAM role defined in a job
     * definition when mounting the Amazon EFS file system. 
     */
    override fun useJobRole(useJobRole: Boolean) {
      cdkBuilder.useJobRole(useJobRole)
    }

    public fun build(): software.amazon.awscdk.services.batch.EfsVolume = cdkBuilder.build()
  }

  public companion object {
    public fun isEfsVolume(x: Any): Boolean =
        software.amazon.awscdk.services.batch.EfsVolume.isEfsVolume(x)

    public operator fun invoke(block: Builder.() -> Unit = {}): EfsVolume {
      val builderImpl = BuilderImpl()
      return EfsVolume(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.EfsVolume): EfsVolume =
        EfsVolume(cdkObject)

    internal fun unwrap(wrapped: EfsVolume): software.amazon.awscdk.services.batch.EfsVolume =
        wrapped.cdkObject
  }
}
