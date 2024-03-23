@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.efs

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.PolicyDocument
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties of EFS FileSystem.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * Role role = Role.Builder.create(this, "ClientRole")
 * .assumedBy(new AnyPrincipal())
 * .build();
 * FileSystem fileSystem = FileSystem.Builder.create(this, "MyEfsFileSystem")
 * .vpc(new Vpc(this, "VPC"))
 * .allowAnonymousAccess(true)
 * .build();
 * fileSystem.grantRead(role);
 * ```
 */
public interface FileSystemProps {
  /**
   * Allow access from anonymous client that doesn't use IAM authentication.
   *
   * Default: false when using `grantRead`, `grantWrite`, `grantRootAccess`
   * or set `@aws-cdk/aws-efs:denyAnonymousAccess` feature flag, otherwise true
   */
  public fun allowAnonymousAccess(): Boolean? = unwrap(this).getAllowAnonymousAccess()

  /**
   * Whether to enable automatic backups for the file system.
   *
   * Default: false
   */
  public fun enableAutomaticBackups(): Boolean? = unwrap(this).getEnableAutomaticBackups()

  /**
   * Defines if the data at rest in the file system is encrypted or not.
   *
   * Default: - If your application has the '@aws-cdk/aws-efs:defaultEncryptionAtRest' feature flag
   * set, the default is true, otherwise, the default is false.
   */
  public fun encrypted(): Boolean? = unwrap(this).getEncrypted()

  /**
   * The file system's name.
   *
   * Default: - CDK generated name
   */
  public fun fileSystemName(): String? = unwrap(this).getFileSystemName()

  /**
   * File system policy is an IAM resource policy used to control NFS access to an EFS file system.
   *
   * Default: none
   */
  public fun fileSystemPolicy(): PolicyDocument? =
      unwrap(this).getFileSystemPolicy()?.let(PolicyDocument::wrap)

  /**
   * The KMS key used for encryption.
   *
   * This is required to encrypt the data at rest if
   *
   * Default: - if 'encrypted' is true, the default key for EFS (/aws/elasticfilesystem) is used
   */
  public fun kmsKey(): IKey? = unwrap(this).getKmsKey()?.let(IKey::wrap)

  /**
   * A policy used by EFS lifecycle management to transition files to the Infrequent Access (IA)
   * storage class.
   *
   * Default: - None. EFS will not transition files to the IA storage class.
   */
  public fun lifecyclePolicy(): LifecyclePolicy? =
      unwrap(this).getLifecyclePolicy()?.let(LifecyclePolicy::wrap)

  /**
   * Whether this is a One Zone file system.
   *
   * If enabled, `performanceMode` must be set to `GENERAL_PURPOSE` and `vpcSubnets` cannot be set.
   *
   * Default: false
   */
  public fun oneZone(): Boolean? = unwrap(this).getOneZone()

  /**
   * A policy used by EFS lifecycle management to transition files from Infrequent Access (IA)
   * storage class to primary storage class.
   *
   * Default: - None. EFS will not transition files from IA storage to primary storage.
   */
  public fun outOfInfrequentAccessPolicy(): OutOfInfrequentAccessPolicy? =
      unwrap(this).getOutOfInfrequentAccessPolicy()?.let(OutOfInfrequentAccessPolicy::wrap)

  /**
   * The performance mode that the file system will operate under.
   *
   * An Amazon EFS file system's performance mode can't be changed after the file system has been
   * created.
   * Updating this property will replace the file system.
   *
   * Default: PerformanceMode.GENERAL_PURPOSE
   */
  public fun performanceMode(): PerformanceMode? =
      unwrap(this).getPerformanceMode()?.let(PerformanceMode::wrap)

  /**
   * Provisioned throughput for the file system.
   *
   * This is a required property if the throughput mode is set to PROVISIONED.
   * Must be at least 1MiB/s.
   *
   * Default: - none, errors out
   */
  public fun provisionedThroughputPerSecond(): Size? =
      unwrap(this).getProvisionedThroughputPerSecond()?.let(Size::wrap)

  /**
   * The removal policy to apply to the file system.
   *
   * Default: RemovalPolicy.RETAIN
   */
  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  /**
   * Whether to enable the filesystem's replication overwrite protection or not.
   *
   * Set false if you want to create a read-only filesystem for use as a replication destination.
   *
   * Default: ReplicationOverwriteProtection.ENABLED
   *
   * [Documentation](https://docs.aws.amazon.com/efs/latest/ug/replication-use-cases.html#replicate-existing-destination)
   */
  public fun replicationOverwriteProtection(): ReplicationOverwriteProtection? =
      unwrap(this).getReplicationOverwriteProtection()?.let(ReplicationOverwriteProtection::wrap)

  /**
   * Security Group to assign to this file system.
   *
   * Default: - creates new security group which allows all outbound traffic
   */
  public fun securityGroup(): ISecurityGroup? =
      unwrap(this).getSecurityGroup()?.let(ISecurityGroup::wrap)

  /**
   * Enum to mention the throughput mode of the file system.
   *
   * Default: ThroughputMode.BURSTING
   */
  public fun throughputMode(): ThroughputMode? =
      unwrap(this).getThroughputMode()?.let(ThroughputMode::wrap)

  /**
   * The number of days after files were last accessed in primary storage (the Standard storage
   * class) at which to move them to Archive storage.
   *
   * Metadata operations such as listing the contents of a directory don't count as file access
   * events.
   *
   * Default: - None. EFS will not transition files to Archive storage class.
   */
  public fun transitionToArchivePolicy(): LifecyclePolicy? =
      unwrap(this).getTransitionToArchivePolicy()?.let(LifecyclePolicy::wrap)

  /**
   * VPC to launch the file system in.
   */
  public fun vpc(): IVpc

  /**
   * Which subnets to place the mount target in the VPC.
   *
   * Default: - the Vpc default strategy if not specified
   */
  public fun vpcSubnets(): SubnetSelection? =
      unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)

  /**
   * A builder for [FileSystemProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param allowAnonymousAccess Allow access from anonymous client that doesn't use IAM
     * authentication.
     */
    public fun allowAnonymousAccess(allowAnonymousAccess: Boolean)

    /**
     * @param enableAutomaticBackups Whether to enable automatic backups for the file system.
     */
    public fun enableAutomaticBackups(enableAutomaticBackups: Boolean)

    /**
     * @param encrypted Defines if the data at rest in the file system is encrypted or not.
     */
    public fun encrypted(encrypted: Boolean)

    /**
     * @param fileSystemName The file system's name.
     */
    public fun fileSystemName(fileSystemName: String)

    /**
     * @param fileSystemPolicy File system policy is an IAM resource policy used to control NFS
     * access to an EFS file system.
     */
    public fun fileSystemPolicy(fileSystemPolicy: PolicyDocument)

    /**
     * @param fileSystemPolicy File system policy is an IAM resource policy used to control NFS
     * access to an EFS file system.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("93976cc102e8900903625c6fda8700132299e5d1f682b11c2a26251c122eba23")
    public fun fileSystemPolicy(fileSystemPolicy: PolicyDocument.Builder.() -> Unit)

    /**
     * @param kmsKey The KMS key used for encryption.
     * This is required to encrypt the data at rest if
     */
    public fun kmsKey(kmsKey: IKey)

    /**
     * @param lifecyclePolicy A policy used by EFS lifecycle management to transition files to the
     * Infrequent Access (IA) storage class.
     */
    public fun lifecyclePolicy(lifecyclePolicy: LifecyclePolicy)

    /**
     * @param oneZone Whether this is a One Zone file system.
     * If enabled, `performanceMode` must be set to `GENERAL_PURPOSE` and `vpcSubnets` cannot be
     * set.
     */
    public fun oneZone(oneZone: Boolean)

    /**
     * @param outOfInfrequentAccessPolicy A policy used by EFS lifecycle management to transition
     * files from Infrequent Access (IA) storage class to primary storage class.
     */
    public fun outOfInfrequentAccessPolicy(outOfInfrequentAccessPolicy: OutOfInfrequentAccessPolicy)

    /**
     * @param performanceMode The performance mode that the file system will operate under.
     * An Amazon EFS file system's performance mode can't be changed after the file system has been
     * created.
     * Updating this property will replace the file system.
     */
    public fun performanceMode(performanceMode: PerformanceMode)

    /**
     * @param provisionedThroughputPerSecond Provisioned throughput for the file system.
     * This is a required property if the throughput mode is set to PROVISIONED.
     * Must be at least 1MiB/s.
     */
    public fun provisionedThroughputPerSecond(provisionedThroughputPerSecond: Size)

    /**
     * @param removalPolicy The removal policy to apply to the file system.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)

    /**
     * @param replicationOverwriteProtection Whether to enable the filesystem's replication
     * overwrite protection or not.
     * Set false if you want to create a read-only filesystem for use as a replication destination.
     */
    public
        fun replicationOverwriteProtection(replicationOverwriteProtection: ReplicationOverwriteProtection)

    /**
     * @param securityGroup Security Group to assign to this file system.
     */
    public fun securityGroup(securityGroup: ISecurityGroup)

    /**
     * @param throughputMode Enum to mention the throughput mode of the file system.
     */
    public fun throughputMode(throughputMode: ThroughputMode)

    /**
     * @param transitionToArchivePolicy The number of days after files were last accessed in primary
     * storage (the Standard storage class) at which to move them to Archive storage.
     * Metadata operations such as listing the contents of a directory don't count as file access
     * events.
     */
    public fun transitionToArchivePolicy(transitionToArchivePolicy: LifecyclePolicy)

    /**
     * @param vpc VPC to launch the file system in. 
     */
    public fun vpc(vpc: IVpc)

    /**
     * @param vpcSubnets Which subnets to place the mount target in the VPC.
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    /**
     * @param vpcSubnets Which subnets to place the mount target in the VPC.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d211c28077ad1f5c00b036bcfd8ffead14d31f158c6088ad691107dfc40c3765")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.efs.FileSystemProps.Builder =
        software.amazon.awscdk.services.efs.FileSystemProps.builder()

    /**
     * @param allowAnonymousAccess Allow access from anonymous client that doesn't use IAM
     * authentication.
     */
    override fun allowAnonymousAccess(allowAnonymousAccess: Boolean) {
      cdkBuilder.allowAnonymousAccess(allowAnonymousAccess)
    }

    /**
     * @param enableAutomaticBackups Whether to enable automatic backups for the file system.
     */
    override fun enableAutomaticBackups(enableAutomaticBackups: Boolean) {
      cdkBuilder.enableAutomaticBackups(enableAutomaticBackups)
    }

    /**
     * @param encrypted Defines if the data at rest in the file system is encrypted or not.
     */
    override fun encrypted(encrypted: Boolean) {
      cdkBuilder.encrypted(encrypted)
    }

    /**
     * @param fileSystemName The file system's name.
     */
    override fun fileSystemName(fileSystemName: String) {
      cdkBuilder.fileSystemName(fileSystemName)
    }

    /**
     * @param fileSystemPolicy File system policy is an IAM resource policy used to control NFS
     * access to an EFS file system.
     */
    override fun fileSystemPolicy(fileSystemPolicy: PolicyDocument) {
      cdkBuilder.fileSystemPolicy(fileSystemPolicy.let(PolicyDocument::unwrap))
    }

    /**
     * @param fileSystemPolicy File system policy is an IAM resource policy used to control NFS
     * access to an EFS file system.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("93976cc102e8900903625c6fda8700132299e5d1f682b11c2a26251c122eba23")
    override fun fileSystemPolicy(fileSystemPolicy: PolicyDocument.Builder.() -> Unit): Unit =
        fileSystemPolicy(PolicyDocument(fileSystemPolicy))

    /**
     * @param kmsKey The KMS key used for encryption.
     * This is required to encrypt the data at rest if
     */
    override fun kmsKey(kmsKey: IKey) {
      cdkBuilder.kmsKey(kmsKey.let(IKey::unwrap))
    }

    /**
     * @param lifecyclePolicy A policy used by EFS lifecycle management to transition files to the
     * Infrequent Access (IA) storage class.
     */
    override fun lifecyclePolicy(lifecyclePolicy: LifecyclePolicy) {
      cdkBuilder.lifecyclePolicy(lifecyclePolicy.let(LifecyclePolicy::unwrap))
    }

    /**
     * @param oneZone Whether this is a One Zone file system.
     * If enabled, `performanceMode` must be set to `GENERAL_PURPOSE` and `vpcSubnets` cannot be
     * set.
     */
    override fun oneZone(oneZone: Boolean) {
      cdkBuilder.oneZone(oneZone)
    }

    /**
     * @param outOfInfrequentAccessPolicy A policy used by EFS lifecycle management to transition
     * files from Infrequent Access (IA) storage class to primary storage class.
     */
    override
        fun outOfInfrequentAccessPolicy(outOfInfrequentAccessPolicy: OutOfInfrequentAccessPolicy) {
      cdkBuilder.outOfInfrequentAccessPolicy(outOfInfrequentAccessPolicy.let(OutOfInfrequentAccessPolicy::unwrap))
    }

    /**
     * @param performanceMode The performance mode that the file system will operate under.
     * An Amazon EFS file system's performance mode can't be changed after the file system has been
     * created.
     * Updating this property will replace the file system.
     */
    override fun performanceMode(performanceMode: PerformanceMode) {
      cdkBuilder.performanceMode(performanceMode.let(PerformanceMode::unwrap))
    }

    /**
     * @param provisionedThroughputPerSecond Provisioned throughput for the file system.
     * This is a required property if the throughput mode is set to PROVISIONED.
     * Must be at least 1MiB/s.
     */
    override fun provisionedThroughputPerSecond(provisionedThroughputPerSecond: Size) {
      cdkBuilder.provisionedThroughputPerSecond(provisionedThroughputPerSecond.let(Size::unwrap))
    }

    /**
     * @param removalPolicy The removal policy to apply to the file system.
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    /**
     * @param replicationOverwriteProtection Whether to enable the filesystem's replication
     * overwrite protection or not.
     * Set false if you want to create a read-only filesystem for use as a replication destination.
     */
    override
        fun replicationOverwriteProtection(replicationOverwriteProtection: ReplicationOverwriteProtection) {
      cdkBuilder.replicationOverwriteProtection(replicationOverwriteProtection.let(ReplicationOverwriteProtection::unwrap))
    }

    /**
     * @param securityGroup Security Group to assign to this file system.
     */
    override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup::unwrap))
    }

    /**
     * @param throughputMode Enum to mention the throughput mode of the file system.
     */
    override fun throughputMode(throughputMode: ThroughputMode) {
      cdkBuilder.throughputMode(throughputMode.let(ThroughputMode::unwrap))
    }

    /**
     * @param transitionToArchivePolicy The number of days after files were last accessed in primary
     * storage (the Standard storage class) at which to move them to Archive storage.
     * Metadata operations such as listing the contents of a directory don't count as file access
     * events.
     */
    override fun transitionToArchivePolicy(transitionToArchivePolicy: LifecyclePolicy) {
      cdkBuilder.transitionToArchivePolicy(transitionToArchivePolicy.let(LifecyclePolicy::unwrap))
    }

    /**
     * @param vpc VPC to launch the file system in. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    /**
     * @param vpcSubnets Which subnets to place the mount target in the VPC.
     */
    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    /**
     * @param vpcSubnets Which subnets to place the mount target in the VPC.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d211c28077ad1f5c00b036bcfd8ffead14d31f158c6088ad691107dfc40c3765")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.efs.FileSystemProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.efs.FileSystemProps,
  ) : CdkObject(cdkObject), FileSystemProps {
    /**
     * Allow access from anonymous client that doesn't use IAM authentication.
     *
     * Default: false when using `grantRead`, `grantWrite`, `grantRootAccess`
     * or set `@aws-cdk/aws-efs:denyAnonymousAccess` feature flag, otherwise true
     */
    override fun allowAnonymousAccess(): Boolean? = unwrap(this).getAllowAnonymousAccess()

    /**
     * Whether to enable automatic backups for the file system.
     *
     * Default: false
     */
    override fun enableAutomaticBackups(): Boolean? = unwrap(this).getEnableAutomaticBackups()

    /**
     * Defines if the data at rest in the file system is encrypted or not.
     *
     * Default: - If your application has the '@aws-cdk/aws-efs:defaultEncryptionAtRest' feature
     * flag set, the default is true, otherwise, the default is false.
     */
    override fun encrypted(): Boolean? = unwrap(this).getEncrypted()

    /**
     * The file system's name.
     *
     * Default: - CDK generated name
     */
    override fun fileSystemName(): String? = unwrap(this).getFileSystemName()

    /**
     * File system policy is an IAM resource policy used to control NFS access to an EFS file
     * system.
     *
     * Default: none
     */
    override fun fileSystemPolicy(): PolicyDocument? =
        unwrap(this).getFileSystemPolicy()?.let(PolicyDocument::wrap)

    /**
     * The KMS key used for encryption.
     *
     * This is required to encrypt the data at rest if
     *
     * Default: - if 'encrypted' is true, the default key for EFS (/aws/elasticfilesystem) is used
     */
    override fun kmsKey(): IKey? = unwrap(this).getKmsKey()?.let(IKey::wrap)

    /**
     * A policy used by EFS lifecycle management to transition files to the Infrequent Access (IA)
     * storage class.
     *
     * Default: - None. EFS will not transition files to the IA storage class.
     */
    override fun lifecyclePolicy(): LifecyclePolicy? =
        unwrap(this).getLifecyclePolicy()?.let(LifecyclePolicy::wrap)

    /**
     * Whether this is a One Zone file system.
     *
     * If enabled, `performanceMode` must be set to `GENERAL_PURPOSE` and `vpcSubnets` cannot be
     * set.
     *
     * Default: false
     */
    override fun oneZone(): Boolean? = unwrap(this).getOneZone()

    /**
     * A policy used by EFS lifecycle management to transition files from Infrequent Access (IA)
     * storage class to primary storage class.
     *
     * Default: - None. EFS will not transition files from IA storage to primary storage.
     */
    override fun outOfInfrequentAccessPolicy(): OutOfInfrequentAccessPolicy? =
        unwrap(this).getOutOfInfrequentAccessPolicy()?.let(OutOfInfrequentAccessPolicy::wrap)

    /**
     * The performance mode that the file system will operate under.
     *
     * An Amazon EFS file system's performance mode can't be changed after the file system has been
     * created.
     * Updating this property will replace the file system.
     *
     * Default: PerformanceMode.GENERAL_PURPOSE
     */
    override fun performanceMode(): PerformanceMode? =
        unwrap(this).getPerformanceMode()?.let(PerformanceMode::wrap)

    /**
     * Provisioned throughput for the file system.
     *
     * This is a required property if the throughput mode is set to PROVISIONED.
     * Must be at least 1MiB/s.
     *
     * Default: - none, errors out
     */
    override fun provisionedThroughputPerSecond(): Size? =
        unwrap(this).getProvisionedThroughputPerSecond()?.let(Size::wrap)

    /**
     * The removal policy to apply to the file system.
     *
     * Default: RemovalPolicy.RETAIN
     */
    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

    /**
     * Whether to enable the filesystem's replication overwrite protection or not.
     *
     * Set false if you want to create a read-only filesystem for use as a replication destination.
     *
     * Default: ReplicationOverwriteProtection.ENABLED
     *
     * [Documentation](https://docs.aws.amazon.com/efs/latest/ug/replication-use-cases.html#replicate-existing-destination)
     */
    override fun replicationOverwriteProtection(): ReplicationOverwriteProtection? =
        unwrap(this).getReplicationOverwriteProtection()?.let(ReplicationOverwriteProtection::wrap)

    /**
     * Security Group to assign to this file system.
     *
     * Default: - creates new security group which allows all outbound traffic
     */
    override fun securityGroup(): ISecurityGroup? =
        unwrap(this).getSecurityGroup()?.let(ISecurityGroup::wrap)

    /**
     * Enum to mention the throughput mode of the file system.
     *
     * Default: ThroughputMode.BURSTING
     */
    override fun throughputMode(): ThroughputMode? =
        unwrap(this).getThroughputMode()?.let(ThroughputMode::wrap)

    /**
     * The number of days after files were last accessed in primary storage (the Standard storage
     * class) at which to move them to Archive storage.
     *
     * Metadata operations such as listing the contents of a directory don't count as file access
     * events.
     *
     * Default: - None. EFS will not transition files to Archive storage class.
     */
    override fun transitionToArchivePolicy(): LifecyclePolicy? =
        unwrap(this).getTransitionToArchivePolicy()?.let(LifecyclePolicy::wrap)

    /**
     * VPC to launch the file system in.
     */
    override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)

    /**
     * Which subnets to place the mount target in the VPC.
     *
     * Default: - the Vpc default strategy if not specified
     */
    override fun vpcSubnets(): SubnetSelection? =
        unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FileSystemProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.efs.FileSystemProps):
        FileSystemProps = CdkObjectWrappers.wrap(cdkObject) as? FileSystemProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: FileSystemProps):
        software.amazon.awscdk.services.efs.FileSystemProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.efs.FileSystemProps
  }
}
