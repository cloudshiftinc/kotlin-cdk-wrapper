@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.efs

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.AddToResourcePolicyResult
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.PolicyDocument
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.constructs.IDependable
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The Elastic File System implementation of IFileSystem.
 *
 * It creates a new, empty file system in Amazon Elastic File System (Amazon EFS).
 * It also creates mount target (AWS::EFS::MountTarget) implicitly to mount the
 * EFS file system on an Amazon Elastic Compute Cloud (Amazon EC2) instance or another resource.
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
 *
 * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html)
 */
public open class FileSystem internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.efs.FileSystem,
) : Resource(cdkObject), IFileSystem {
  /**
   * create access point from this filesystem.
   *
   * @param id 
   * @param accessPointOptions
   */
  public open fun addAccessPoint(id: String): AccessPoint =
      unwrap(this).addAccessPoint(id).let(AccessPoint::wrap)

  /**
   * create access point from this filesystem.
   *
   * @param id 
   * @param accessPointOptions
   */
  public open fun addAccessPoint(id: String, accessPointOptions: AccessPointOptions): AccessPoint =
      unwrap(this).addAccessPoint(id,
      accessPointOptions.let(AccessPointOptions::unwrap)).let(AccessPoint::wrap)

  /**
   * create access point from this filesystem.
   *
   * @param id 
   * @param accessPointOptions
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8bd637c6b4ee0728b3d7d7d8ea3fa8a9a24fef6ffbbcae760784373516e05bff")
  public open fun addAccessPoint(id: String,
      accessPointOptions: AccessPointOptions.Builder.() -> Unit): AccessPoint = addAccessPoint(id,
      AccessPointOptions(accessPointOptions))

  /**
   * Adds a statement to the resource policy associated with this file system.
   *
   * A resource policy will be automatically created upon the first call to `addToResourcePolicy`.
   *
   * Note that this does not work with imported file systems.
   *
   * @param statement The policy statement to add. 
   */
  public override fun addToResourcePolicy(statement: PolicyStatement): AddToResourcePolicyResult =
      unwrap(this).addToResourcePolicy(statement.let(PolicyStatement::unwrap)).let(AddToResourcePolicyResult::wrap)

  /**
   * Adds a statement to the resource policy associated with this file system.
   *
   * A resource policy will be automatically created upon the first call to `addToResourcePolicy`.
   *
   * Note that this does not work with imported file systems.
   *
   * @param statement The policy statement to add. 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b93f8258425594b02debe63f0c120f198512d8431f5ae67b7fb7780e34fcbae2")
  public override fun addToResourcePolicy(statement: PolicyStatement.Builder.() -> Unit):
      AddToResourcePolicyResult = addToResourcePolicy(PolicyStatement(statement))

  /**
   * The security groups/rules used to allow network connections to the file system.
   */
  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  /**
   * The ARN of the file system.
   */
  public override fun fileSystemArn(): String = unwrap(this).getFileSystemArn()

  /**
   * The ID of the file system, assigned by Amazon EFS.
   */
  public override fun fileSystemId(): String = unwrap(this).getFileSystemId()

  /**
   * Grant the actions defined in actions to the given grantee on this File System resource.
   *
   * @param grantee Principal to grant right to. 
   * @param actions The actions to grant. 
   */
  public override fun grant(grantee: IGrantable, vararg actions: String): Grant =
      unwrap(this).grant(grantee.let(IGrantable::unwrap), *actions).let(Grant::wrap)

  /**
   * Grant read permissions for this file system to an IAM principal.
   *
   * @param grantee The principal to grant read to. 
   */
  public override fun grantRead(grantee: IGrantable): Grant =
      unwrap(this).grantRead(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * Grant read and write permissions for this file system to an IAM principal.
   *
   * @param grantee The principal to grant read and write to. 
   */
  public override fun grantReadWrite(grantee: IGrantable): Grant =
      unwrap(this).grantReadWrite(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * As root user, grant read and write permissions for this file system to an IAM principal.
   *
   * @param grantee The principal to grant root access to. 
   */
  public override fun grantRootAccess(grantee: IGrantable): Grant =
      unwrap(this).grantRootAccess(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * Dependable that can be depended upon to ensure the mount targets of the filesystem are ready.
   */
  public override fun mountTargetsAvailable(): IDependable =
      unwrap(this).getMountTargetsAvailable().let(IDependable::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.efs.FileSystem].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Allow access from anonymous client that doesn't use IAM authentication.
     *
     * Default: false when using `grantRead`, `grantWrite`, `grantRootAccess`
     * or set `@aws-cdk/aws-efs:denyAnonymousAccess` feature flag, otherwise true
     *
     * @param allowAnonymousAccess Allow access from anonymous client that doesn't use IAM
     * authentication. 
     */
    public fun allowAnonymousAccess(allowAnonymousAccess: Boolean)

    /**
     * Whether to enable automatic backups for the file system.
     *
     * Default: false
     *
     * @param enableAutomaticBackups Whether to enable automatic backups for the file system. 
     */
    public fun enableAutomaticBackups(enableAutomaticBackups: Boolean)

    /**
     * Defines if the data at rest in the file system is encrypted or not.
     *
     * Default: - If your application has the '@aws-cdk/aws-efs:defaultEncryptionAtRest' feature
     * flag set, the default is true, otherwise, the default is false.
     *
     * @param encrypted Defines if the data at rest in the file system is encrypted or not. 
     */
    public fun encrypted(encrypted: Boolean)

    /**
     * The file system's name.
     *
     * Default: - CDK generated name
     *
     * @param fileSystemName The file system's name. 
     */
    public fun fileSystemName(fileSystemName: String)

    /**
     * File system policy is an IAM resource policy used to control NFS access to an EFS file
     * system.
     *
     * Default: none
     *
     * @param fileSystemPolicy File system policy is an IAM resource policy used to control NFS
     * access to an EFS file system. 
     */
    public fun fileSystemPolicy(fileSystemPolicy: PolicyDocument)

    /**
     * File system policy is an IAM resource policy used to control NFS access to an EFS file
     * system.
     *
     * Default: none
     *
     * @param fileSystemPolicy File system policy is an IAM resource policy used to control NFS
     * access to an EFS file system. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("936124fbdf6b3c84db4a15b4d30374f0293d7e22961a7ba4b09fb74e5493c288")
    public fun fileSystemPolicy(fileSystemPolicy: PolicyDocument.Builder.() -> Unit)

    /**
     * The KMS key used for encryption.
     *
     * This is required to encrypt the data at rest if
     *
     * Default: - if 'encrypted' is true, the default key for EFS (/aws/elasticfilesystem) is used
     *
     * @param kmsKey The KMS key used for encryption. 
     */
    public fun kmsKey(kmsKey: IKey)

    /**
     * A policy used by EFS lifecycle management to transition files to the Infrequent Access (IA)
     * storage class.
     *
     * Default: - None. EFS will not transition files to the IA storage class.
     *
     * @param lifecyclePolicy A policy used by EFS lifecycle management to transition files to the
     * Infrequent Access (IA) storage class. 
     */
    public fun lifecyclePolicy(lifecyclePolicy: LifecyclePolicy)

    /**
     * Whether this is a One Zone file system.
     *
     * If enabled, `performanceMode` must be set to `GENERAL_PURPOSE` and `vpcSubnets` cannot be
     * set.
     *
     * Default: false
     *
     * @param oneZone Whether this is a One Zone file system. 
     */
    public fun oneZone(oneZone: Boolean)

    /**
     * A policy used by EFS lifecycle management to transition files from Infrequent Access (IA)
     * storage class to primary storage class.
     *
     * Default: - None. EFS will not transition files from IA storage to primary storage.
     *
     * @param outOfInfrequentAccessPolicy A policy used by EFS lifecycle management to transition
     * files from Infrequent Access (IA) storage class to primary storage class. 
     */
    public fun outOfInfrequentAccessPolicy(outOfInfrequentAccessPolicy: OutOfInfrequentAccessPolicy)

    /**
     * The performance mode that the file system will operate under.
     *
     * An Amazon EFS file system's performance mode can't be changed after the file system has been
     * created.
     * Updating this property will replace the file system.
     *
     * Default: PerformanceMode.GENERAL_PURPOSE
     *
     * @param performanceMode The performance mode that the file system will operate under. 
     */
    public fun performanceMode(performanceMode: PerformanceMode)

    /**
     * Provisioned throughput for the file system.
     *
     * This is a required property if the throughput mode is set to PROVISIONED.
     * Must be at least 1MiB/s.
     *
     * Default: - none, errors out
     *
     * @param provisionedThroughputPerSecond Provisioned throughput for the file system. 
     */
    public fun provisionedThroughputPerSecond(provisionedThroughputPerSecond: Size)

    /**
     * The removal policy to apply to the file system.
     *
     * Default: RemovalPolicy.RETAIN
     *
     * @param removalPolicy The removal policy to apply to the file system. 
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)

    /**
     * Whether to enable the filesystem's replication overwrite protection or not.
     *
     * Set false if you want to create a read-only filesystem for use as a replication destination.
     *
     * Default: ReplicationOverwriteProtection.ENABLED
     *
     * [Documentation](https://docs.aws.amazon.com/efs/latest/ug/replication-use-cases.html#replicate-existing-destination)
     * @param replicationOverwriteProtection Whether to enable the filesystem's replication
     * overwrite protection or not. 
     */
    public
        fun replicationOverwriteProtection(replicationOverwriteProtection: ReplicationOverwriteProtection)

    /**
     * Security Group to assign to this file system.
     *
     * Default: - creates new security group which allows all outbound traffic
     *
     * @param securityGroup Security Group to assign to this file system. 
     */
    public fun securityGroup(securityGroup: ISecurityGroup)

    /**
     * Enum to mention the throughput mode of the file system.
     *
     * Default: ThroughputMode.BURSTING
     *
     * @param throughputMode Enum to mention the throughput mode of the file system. 
     */
    public fun throughputMode(throughputMode: ThroughputMode)

    /**
     * The number of days after files were last accessed in primary storage (the Standard storage
     * class) at which to move them to Archive storage.
     *
     * Metadata operations such as listing the contents of a directory don't count as file access
     * events.
     *
     * Default: - None. EFS will not transition files to Archive storage class.
     *
     * @param transitionToArchivePolicy The number of days after files were last accessed in primary
     * storage (the Standard storage class) at which to move them to Archive storage. 
     */
    public fun transitionToArchivePolicy(transitionToArchivePolicy: LifecyclePolicy)

    /**
     * VPC to launch the file system in.
     *
     * @param vpc VPC to launch the file system in. 
     */
    public fun vpc(vpc: IVpc)

    /**
     * Which subnets to place the mount target in the VPC.
     *
     * Default: - the Vpc default strategy if not specified
     *
     * @param vpcSubnets Which subnets to place the mount target in the VPC. 
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    /**
     * Which subnets to place the mount target in the VPC.
     *
     * Default: - the Vpc default strategy if not specified
     *
     * @param vpcSubnets Which subnets to place the mount target in the VPC. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e822441263bb51dd2dcccf879bb057ca24273424f0b9396fbc659cb3cf008239")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.efs.FileSystem.Builder =
        software.amazon.awscdk.services.efs.FileSystem.Builder.create(scope, id)

    /**
     * Allow access from anonymous client that doesn't use IAM authentication.
     *
     * Default: false when using `grantRead`, `grantWrite`, `grantRootAccess`
     * or set `@aws-cdk/aws-efs:denyAnonymousAccess` feature flag, otherwise true
     *
     * @param allowAnonymousAccess Allow access from anonymous client that doesn't use IAM
     * authentication. 
     */
    override fun allowAnonymousAccess(allowAnonymousAccess: Boolean) {
      cdkBuilder.allowAnonymousAccess(allowAnonymousAccess)
    }

    /**
     * Whether to enable automatic backups for the file system.
     *
     * Default: false
     *
     * @param enableAutomaticBackups Whether to enable automatic backups for the file system. 
     */
    override fun enableAutomaticBackups(enableAutomaticBackups: Boolean) {
      cdkBuilder.enableAutomaticBackups(enableAutomaticBackups)
    }

    /**
     * Defines if the data at rest in the file system is encrypted or not.
     *
     * Default: - If your application has the '@aws-cdk/aws-efs:defaultEncryptionAtRest' feature
     * flag set, the default is true, otherwise, the default is false.
     *
     * @param encrypted Defines if the data at rest in the file system is encrypted or not. 
     */
    override fun encrypted(encrypted: Boolean) {
      cdkBuilder.encrypted(encrypted)
    }

    /**
     * The file system's name.
     *
     * Default: - CDK generated name
     *
     * @param fileSystemName The file system's name. 
     */
    override fun fileSystemName(fileSystemName: String) {
      cdkBuilder.fileSystemName(fileSystemName)
    }

    /**
     * File system policy is an IAM resource policy used to control NFS access to an EFS file
     * system.
     *
     * Default: none
     *
     * @param fileSystemPolicy File system policy is an IAM resource policy used to control NFS
     * access to an EFS file system. 
     */
    override fun fileSystemPolicy(fileSystemPolicy: PolicyDocument) {
      cdkBuilder.fileSystemPolicy(fileSystemPolicy.let(PolicyDocument::unwrap))
    }

    /**
     * File system policy is an IAM resource policy used to control NFS access to an EFS file
     * system.
     *
     * Default: none
     *
     * @param fileSystemPolicy File system policy is an IAM resource policy used to control NFS
     * access to an EFS file system. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("936124fbdf6b3c84db4a15b4d30374f0293d7e22961a7ba4b09fb74e5493c288")
    override fun fileSystemPolicy(fileSystemPolicy: PolicyDocument.Builder.() -> Unit): Unit =
        fileSystemPolicy(PolicyDocument(fileSystemPolicy))

    /**
     * The KMS key used for encryption.
     *
     * This is required to encrypt the data at rest if
     *
     * Default: - if 'encrypted' is true, the default key for EFS (/aws/elasticfilesystem) is used
     *
     * @param kmsKey The KMS key used for encryption. 
     */
    override fun kmsKey(kmsKey: IKey) {
      cdkBuilder.kmsKey(kmsKey.let(IKey::unwrap))
    }

    /**
     * A policy used by EFS lifecycle management to transition files to the Infrequent Access (IA)
     * storage class.
     *
     * Default: - None. EFS will not transition files to the IA storage class.
     *
     * @param lifecyclePolicy A policy used by EFS lifecycle management to transition files to the
     * Infrequent Access (IA) storage class. 
     */
    override fun lifecyclePolicy(lifecyclePolicy: LifecyclePolicy) {
      cdkBuilder.lifecyclePolicy(lifecyclePolicy.let(LifecyclePolicy::unwrap))
    }

    /**
     * Whether this is a One Zone file system.
     *
     * If enabled, `performanceMode` must be set to `GENERAL_PURPOSE` and `vpcSubnets` cannot be
     * set.
     *
     * Default: false
     *
     * @param oneZone Whether this is a One Zone file system. 
     */
    override fun oneZone(oneZone: Boolean) {
      cdkBuilder.oneZone(oneZone)
    }

    /**
     * A policy used by EFS lifecycle management to transition files from Infrequent Access (IA)
     * storage class to primary storage class.
     *
     * Default: - None. EFS will not transition files from IA storage to primary storage.
     *
     * @param outOfInfrequentAccessPolicy A policy used by EFS lifecycle management to transition
     * files from Infrequent Access (IA) storage class to primary storage class. 
     */
    override
        fun outOfInfrequentAccessPolicy(outOfInfrequentAccessPolicy: OutOfInfrequentAccessPolicy) {
      cdkBuilder.outOfInfrequentAccessPolicy(outOfInfrequentAccessPolicy.let(OutOfInfrequentAccessPolicy::unwrap))
    }

    /**
     * The performance mode that the file system will operate under.
     *
     * An Amazon EFS file system's performance mode can't be changed after the file system has been
     * created.
     * Updating this property will replace the file system.
     *
     * Default: PerformanceMode.GENERAL_PURPOSE
     *
     * @param performanceMode The performance mode that the file system will operate under. 
     */
    override fun performanceMode(performanceMode: PerformanceMode) {
      cdkBuilder.performanceMode(performanceMode.let(PerformanceMode::unwrap))
    }

    /**
     * Provisioned throughput for the file system.
     *
     * This is a required property if the throughput mode is set to PROVISIONED.
     * Must be at least 1MiB/s.
     *
     * Default: - none, errors out
     *
     * @param provisionedThroughputPerSecond Provisioned throughput for the file system. 
     */
    override fun provisionedThroughputPerSecond(provisionedThroughputPerSecond: Size) {
      cdkBuilder.provisionedThroughputPerSecond(provisionedThroughputPerSecond.let(Size::unwrap))
    }

    /**
     * The removal policy to apply to the file system.
     *
     * Default: RemovalPolicy.RETAIN
     *
     * @param removalPolicy The removal policy to apply to the file system. 
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    /**
     * Whether to enable the filesystem's replication overwrite protection or not.
     *
     * Set false if you want to create a read-only filesystem for use as a replication destination.
     *
     * Default: ReplicationOverwriteProtection.ENABLED
     *
     * [Documentation](https://docs.aws.amazon.com/efs/latest/ug/replication-use-cases.html#replicate-existing-destination)
     * @param replicationOverwriteProtection Whether to enable the filesystem's replication
     * overwrite protection or not. 
     */
    override
        fun replicationOverwriteProtection(replicationOverwriteProtection: ReplicationOverwriteProtection) {
      cdkBuilder.replicationOverwriteProtection(replicationOverwriteProtection.let(ReplicationOverwriteProtection::unwrap))
    }

    /**
     * Security Group to assign to this file system.
     *
     * Default: - creates new security group which allows all outbound traffic
     *
     * @param securityGroup Security Group to assign to this file system. 
     */
    override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup::unwrap))
    }

    /**
     * Enum to mention the throughput mode of the file system.
     *
     * Default: ThroughputMode.BURSTING
     *
     * @param throughputMode Enum to mention the throughput mode of the file system. 
     */
    override fun throughputMode(throughputMode: ThroughputMode) {
      cdkBuilder.throughputMode(throughputMode.let(ThroughputMode::unwrap))
    }

    /**
     * The number of days after files were last accessed in primary storage (the Standard storage
     * class) at which to move them to Archive storage.
     *
     * Metadata operations such as listing the contents of a directory don't count as file access
     * events.
     *
     * Default: - None. EFS will not transition files to Archive storage class.
     *
     * @param transitionToArchivePolicy The number of days after files were last accessed in primary
     * storage (the Standard storage class) at which to move them to Archive storage. 
     */
    override fun transitionToArchivePolicy(transitionToArchivePolicy: LifecyclePolicy) {
      cdkBuilder.transitionToArchivePolicy(transitionToArchivePolicy.let(LifecyclePolicy::unwrap))
    }

    /**
     * VPC to launch the file system in.
     *
     * @param vpc VPC to launch the file system in. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    /**
     * Which subnets to place the mount target in the VPC.
     *
     * Default: - the Vpc default strategy if not specified
     *
     * @param vpcSubnets Which subnets to place the mount target in the VPC. 
     */
    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    /**
     * Which subnets to place the mount target in the VPC.
     *
     * Default: - the Vpc default strategy if not specified
     *
     * @param vpcSubnets Which subnets to place the mount target in the VPC. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e822441263bb51dd2dcccf879bb057ca24273424f0b9396fbc659cb3cf008239")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.efs.FileSystem = cdkBuilder.build()
  }

  public companion object {
    public val DEFAULT_PORT: Number = software.amazon.awscdk.services.efs.FileSystem.DEFAULT_PORT

    public fun fromFileSystemAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: FileSystemAttributes,
    ): IFileSystem =
        software.amazon.awscdk.services.efs.FileSystem.fromFileSystemAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(FileSystemAttributes::unwrap)).let(IFileSystem::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("67c7f8559a1a02511e0302ffd8ca4a5cf064c784eb6e462c6fc3b5500a867d2b")
    public fun fromFileSystemAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: FileSystemAttributes.Builder.() -> Unit,
    ): IFileSystem = fromFileSystemAttributes(scope, id, FileSystemAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): FileSystem {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return FileSystem(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.efs.FileSystem): FileSystem =
        FileSystem(cdkObject)

    internal fun unwrap(wrapped: FileSystem): software.amazon.awscdk.services.efs.FileSystem =
        wrapped.cdkObject
  }
}
