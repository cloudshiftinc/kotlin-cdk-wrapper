@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.efs

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnFileSystem`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.efs.*;
 * Object fileSystemPolicy;
 * CfnFileSystemProps cfnFileSystemProps = CfnFileSystemProps.builder()
 * .availabilityZoneName("availabilityZoneName")
 * .backupPolicy(BackupPolicyProperty.builder()
 * .status("status")
 * .build())
 * .bypassPolicyLockoutSafetyCheck(false)
 * .encrypted(false)
 * .fileSystemPolicy(fileSystemPolicy)
 * .fileSystemProtection(FileSystemProtectionProperty.builder()
 * .replicationOverwriteProtection("replicationOverwriteProtection")
 * .build())
 * .fileSystemTags(List.of(ElasticFileSystemTagProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .kmsKeyId("kmsKeyId")
 * .lifecyclePolicies(List.of(LifecyclePolicyProperty.builder()
 * .transitionToArchive("transitionToArchive")
 * .transitionToIa("transitionToIa")
 * .transitionToPrimaryStorageClass("transitionToPrimaryStorageClass")
 * .build()))
 * .performanceMode("performanceMode")
 * .provisionedThroughputInMibps(123)
 * .replicationConfiguration(ReplicationConfigurationProperty.builder()
 * .destinations(List.of(ReplicationDestinationProperty.builder()
 * .availabilityZoneName("availabilityZoneName")
 * .fileSystemId("fileSystemId")
 * .kmsKeyId("kmsKeyId")
 * .region("region")
 * .build()))
 * .build())
 * .throughputMode("throughputMode")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html)
 */
public interface CfnFileSystemProps {
  /**
   * For One Zone file systems, specify the AWS Availability Zone in which to create the file
   * system.
   *
   * Use the format `us-east-1a` to specify the Availability Zone. For more information about One
   * Zone file systems, see [EFS file system
   * types](https://docs.aws.amazon.com/efs/latest/ug/availability-durability.html#file-system-type) in
   * the *Amazon EFS User Guide* .
   *
   *
   * One Zone file systems are not available in all Availability Zones in AWS Regions where Amazon
   * EFS is available.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-availabilityzonename)
   */
  public fun availabilityZoneName(): String? = unwrap(this).getAvailabilityZoneName()

  /**
   * Use the `BackupPolicy` to turn automatic backups on or off for the file system.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-backuppolicy)
   */
  public fun backupPolicy(): Any? = unwrap(this).getBackupPolicy()

  /**
   * (Optional) A boolean that specifies whether or not to bypass the `FileSystemPolicy` lockout
   * safety check.
   *
   * The lockout safety check determines whether the policy in the request will lock out, or
   * prevent, the IAM principal that is making the request from making future `PutFileSystemPolicy`
   * requests on this file system. Set `BypassPolicyLockoutSafetyCheck` to `True` only when you intend
   * to prevent the IAM principal that is making the request from making subsequent
   * `PutFileSystemPolicy` requests on this file system. The default value is `False` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-bypasspolicylockoutsafetycheck)
   */
  public fun bypassPolicyLockoutSafetyCheck(): Any? =
      unwrap(this).getBypassPolicyLockoutSafetyCheck()

  /**
   * A Boolean value that, if true, creates an encrypted file system.
   *
   * When creating an encrypted file system, you have the option of specifying a KmsKeyId for an
   * existing AWS KMS key . If you don't specify a KMS key , then the default KMS key for Amazon EFS ,
   * `/aws/elasticfilesystem` , is used to protect the encrypted file system.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-encrypted)
   */
  public fun encrypted(): Any? = unwrap(this).getEncrypted()

  /**
   * The `FileSystemPolicy` for the EFS file system.
   *
   * A file system policy is an IAM resource policy used to control NFS access to an EFS file
   * system. For more information, see [Using IAM to control NFS access to Amazon
   * EFS](https://docs.aws.amazon.com/efs/latest/ug/iam-access-control-nfs-efs.html) in the *Amazon EFS
   * User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-filesystempolicy)
   */
  public fun fileSystemPolicy(): Any? = unwrap(this).getFileSystemPolicy()

  /**
   * Describes the protection on the file system.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-filesystemprotection)
   */
  public fun fileSystemProtection(): Any? = unwrap(this).getFileSystemProtection()

  /**
   * Use to create one or more tags associated with the file system.
   *
   * Each tag is a user-defined key-value pair. Name your file system on creation by including a
   * `"Key":"Name","Value":"{value}"` key-value pair. Each key must be unique. For more information,
   * see [Tagging AWS resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the
   * *AWS General Reference Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-filesystemtags)
   */
  public fun fileSystemTags(): List<CfnFileSystem.ElasticFileSystemTagProperty> =
      unwrap(this).getFileSystemTags()?.map(CfnFileSystem.ElasticFileSystemTagProperty::wrap) ?:
      emptyList()

  /**
   * The ID of the AWS KMS key to be used to protect the encrypted file system.
   *
   * This parameter is only required if you want to use a nondefault KMS key . If this parameter is
   * not specified, the default KMS key for Amazon EFS is used. This ID can be in one of the following
   * formats:
   *
   * * Key ID - A unique identifier of the key, for example `1234abcd-12ab-34cd-56ef-1234567890ab` .
   * * ARN - An Amazon Resource Name (ARN) for the key, for example
   * `arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab` .
   * * Key alias - A previously created display name for a key, for example `alias/projectKey1` .
   * * Key alias ARN - An ARN for a key alias, for example
   * `arn:aws:kms:us-west-2:444455556666:alias/projectKey1` .
   *
   * If `KmsKeyId` is specified, the `Encrypted` parameter must be set to true.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-kmskeyid)
   */
  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * An array of `LifecyclePolicy` objects that define the file system's `LifecycleConfiguration`
   * object.
   *
   * A `LifecycleConfiguration` object informs Lifecycle management of the following:
   *
   * * When to move files in the file system from primary storage to IA storage.
   * * When to move files in the file system from primary storage or IA storage to Archive storage.
   * * When to move files that are in IA or Archive storage to primary storage.
   *
   *
   * Amazon EFS requires that each `LifecyclePolicy` object have only a single transition. This
   * means that in a request body, `LifecyclePolicies` needs to be structured as an array of
   * `LifecyclePolicy` objects, one object for each transition, `TransitionToIA` ,
   * `TransitionToArchive` `TransitionToPrimaryStorageClass` . See the example requests in the
   * following section for more information.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-lifecyclepolicies)
   */
  public fun lifecyclePolicies(): Any? = unwrap(this).getLifecyclePolicies()

  /**
   * The performance mode of the file system.
   *
   * We recommend `generalPurpose` performance mode for all file systems. File systems using the
   * `maxIO` performance mode can scale to higher levels of aggregate throughput and operations per
   * second with a tradeoff of slightly higher latencies for most file operations. The performance mode
   * can't be changed after the file system has been created. The `maxIO` mode is not supported on One
   * Zone file systems.
   *
   *
   * Due to the higher per-operation latencies with Max I/O, we recommend using General Purpose
   * performance mode for all file systems.
   *
   *
   * Default is `generalPurpose` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-performancemode)
   */
  public fun performanceMode(): String? = unwrap(this).getPerformanceMode()

  /**
   * The throughput, measured in mebibytes per second (MiBps), that you want to provision for a file
   * system that you're creating.
   *
   * Required if `ThroughputMode` is set to `provisioned` . Valid values are 1-3414 MiBps, with the
   * upper limit depending on Region. To increase this limit, contact AWS Support . For more
   * information, see [Amazon EFS quotas that you can
   * increase](https://docs.aws.amazon.com/efs/latest/ug/limits.html#soft-limits) in the *Amazon EFS
   * User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-provisionedthroughputinmibps)
   */
  public fun provisionedThroughputInMibps(): Number? =
      unwrap(this).getProvisionedThroughputInMibps()

  /**
   * Describes the replication configuration for a specific file system.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-replicationconfiguration)
   */
  public fun replicationConfiguration(): Any? = unwrap(this).getReplicationConfiguration()

  /**
   * Specifies the throughput mode for the file system.
   *
   * The mode can be `bursting` , `provisioned` , or `elastic` . If you set `ThroughputMode` to
   * `provisioned` , you must also set a value for `ProvisionedThroughputInMibps` . After you create
   * the file system, you can decrease your file system's Provisioned throughput or change between the
   * throughput modes, with certain time restrictions. For more information, see [Specifying throughput
   * with provisioned
   * mode](https://docs.aws.amazon.com/efs/latest/ug/performance.html#provisioned-throughput) in the
   * *Amazon EFS User Guide* .
   *
   * Default is `bursting` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-throughputmode)
   */
  public fun throughputMode(): String? = unwrap(this).getThroughputMode()

  /**
   * A builder for [CfnFileSystemProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param availabilityZoneName For One Zone file systems, specify the AWS Availability Zone in
     * which to create the file system.
     * Use the format `us-east-1a` to specify the Availability Zone. For more information about One
     * Zone file systems, see [EFS file system
     * types](https://docs.aws.amazon.com/efs/latest/ug/availability-durability.html#file-system-type)
     * in the *Amazon EFS User Guide* .
     *
     *
     * One Zone file systems are not available in all Availability Zones in AWS Regions where Amazon
     * EFS is available.
     */
    public fun availabilityZoneName(availabilityZoneName: String)

    /**
     * @param backupPolicy Use the `BackupPolicy` to turn automatic backups on or off for the file
     * system.
     */
    public fun backupPolicy(backupPolicy: IResolvable)

    /**
     * @param backupPolicy Use the `BackupPolicy` to turn automatic backups on or off for the file
     * system.
     */
    public fun backupPolicy(backupPolicy: CfnFileSystem.BackupPolicyProperty)

    /**
     * @param backupPolicy Use the `BackupPolicy` to turn automatic backups on or off for the file
     * system.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6efb74101984bc7eb369cde656c92cd0ac4415e831ab665ce514ee1f0f3e79d2")
    public fun backupPolicy(backupPolicy: CfnFileSystem.BackupPolicyProperty.Builder.() -> Unit)

    /**
     * @param bypassPolicyLockoutSafetyCheck (Optional) A boolean that specifies whether or not to
     * bypass the `FileSystemPolicy` lockout safety check.
     * The lockout safety check determines whether the policy in the request will lock out, or
     * prevent, the IAM principal that is making the request from making future `PutFileSystemPolicy`
     * requests on this file system. Set `BypassPolicyLockoutSafetyCheck` to `True` only when you
     * intend to prevent the IAM principal that is making the request from making subsequent
     * `PutFileSystemPolicy` requests on this file system. The default value is `False` .
     */
    public fun bypassPolicyLockoutSafetyCheck(bypassPolicyLockoutSafetyCheck: Boolean)

    /**
     * @param bypassPolicyLockoutSafetyCheck (Optional) A boolean that specifies whether or not to
     * bypass the `FileSystemPolicy` lockout safety check.
     * The lockout safety check determines whether the policy in the request will lock out, or
     * prevent, the IAM principal that is making the request from making future `PutFileSystemPolicy`
     * requests on this file system. Set `BypassPolicyLockoutSafetyCheck` to `True` only when you
     * intend to prevent the IAM principal that is making the request from making subsequent
     * `PutFileSystemPolicy` requests on this file system. The default value is `False` .
     */
    public fun bypassPolicyLockoutSafetyCheck(bypassPolicyLockoutSafetyCheck: IResolvable)

    /**
     * @param encrypted A Boolean value that, if true, creates an encrypted file system.
     * When creating an encrypted file system, you have the option of specifying a KmsKeyId for an
     * existing AWS KMS key . If you don't specify a KMS key , then the default KMS key for Amazon EFS
     * , `/aws/elasticfilesystem` , is used to protect the encrypted file system.
     */
    public fun encrypted(encrypted: Boolean)

    /**
     * @param encrypted A Boolean value that, if true, creates an encrypted file system.
     * When creating an encrypted file system, you have the option of specifying a KmsKeyId for an
     * existing AWS KMS key . If you don't specify a KMS key , then the default KMS key for Amazon EFS
     * , `/aws/elasticfilesystem` , is used to protect the encrypted file system.
     */
    public fun encrypted(encrypted: IResolvable)

    /**
     * @param fileSystemPolicy The `FileSystemPolicy` for the EFS file system.
     * A file system policy is an IAM resource policy used to control NFS access to an EFS file
     * system. For more information, see [Using IAM to control NFS access to Amazon
     * EFS](https://docs.aws.amazon.com/efs/latest/ug/iam-access-control-nfs-efs.html) in the *Amazon
     * EFS User Guide* .
     */
    public fun fileSystemPolicy(fileSystemPolicy: Any)

    /**
     * @param fileSystemProtection Describes the protection on the file system.
     */
    public fun fileSystemProtection(fileSystemProtection: IResolvable)

    /**
     * @param fileSystemProtection Describes the protection on the file system.
     */
    public
        fun fileSystemProtection(fileSystemProtection: CfnFileSystem.FileSystemProtectionProperty)

    /**
     * @param fileSystemProtection Describes the protection on the file system.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b7c66a690737a4fe60a2de527a6a5e00cff2ecf9460cfe76d24fc5a82f78e769")
    public
        fun fileSystemProtection(fileSystemProtection: CfnFileSystem.FileSystemProtectionProperty.Builder.() -> Unit)

    /**
     * @param fileSystemTags Use to create one or more tags associated with the file system.
     * Each tag is a user-defined key-value pair. Name your file system on creation by including a
     * `"Key":"Name","Value":"{value}"` key-value pair. Each key must be unique. For more information,
     * see [Tagging AWS resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in
     * the *AWS General Reference Guide* .
     */
    public fun fileSystemTags(fileSystemTags: List<CfnFileSystem.ElasticFileSystemTagProperty>)

    /**
     * @param fileSystemTags Use to create one or more tags associated with the file system.
     * Each tag is a user-defined key-value pair. Name your file system on creation by including a
     * `"Key":"Name","Value":"{value}"` key-value pair. Each key must be unique. For more information,
     * see [Tagging AWS resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in
     * the *AWS General Reference Guide* .
     */
    public fun fileSystemTags(vararg fileSystemTags: CfnFileSystem.ElasticFileSystemTagProperty)

    /**
     * @param kmsKeyId The ID of the AWS KMS key to be used to protect the encrypted file system.
     * This parameter is only required if you want to use a nondefault KMS key . If this parameter
     * is not specified, the default KMS key for Amazon EFS is used. This ID can be in one of the
     * following formats:
     *
     * * Key ID - A unique identifier of the key, for example `1234abcd-12ab-34cd-56ef-1234567890ab`
     * .
     * * ARN - An Amazon Resource Name (ARN) for the key, for example
     * `arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab` .
     * * Key alias - A previously created display name for a key, for example `alias/projectKey1` .
     * * Key alias ARN - An ARN for a key alias, for example
     * `arn:aws:kms:us-west-2:444455556666:alias/projectKey1` .
     *
     * If `KmsKeyId` is specified, the `Encrypted` parameter must be set to true.
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * @param lifecyclePolicies An array of `LifecyclePolicy` objects that define the file system's
     * `LifecycleConfiguration` object.
     * A `LifecycleConfiguration` object informs Lifecycle management of the following:
     *
     * * When to move files in the file system from primary storage to IA storage.
     * * When to move files in the file system from primary storage or IA storage to Archive
     * storage.
     * * When to move files that are in IA or Archive storage to primary storage.
     *
     *
     * Amazon EFS requires that each `LifecyclePolicy` object have only a single transition. This
     * means that in a request body, `LifecyclePolicies` needs to be structured as an array of
     * `LifecyclePolicy` objects, one object for each transition, `TransitionToIA` ,
     * `TransitionToArchive` `TransitionToPrimaryStorageClass` . See the example requests in the
     * following section for more information.
     */
    public fun lifecyclePolicies(lifecyclePolicies: IResolvable)

    /**
     * @param lifecyclePolicies An array of `LifecyclePolicy` objects that define the file system's
     * `LifecycleConfiguration` object.
     * A `LifecycleConfiguration` object informs Lifecycle management of the following:
     *
     * * When to move files in the file system from primary storage to IA storage.
     * * When to move files in the file system from primary storage or IA storage to Archive
     * storage.
     * * When to move files that are in IA or Archive storage to primary storage.
     *
     *
     * Amazon EFS requires that each `LifecyclePolicy` object have only a single transition. This
     * means that in a request body, `LifecyclePolicies` needs to be structured as an array of
     * `LifecyclePolicy` objects, one object for each transition, `TransitionToIA` ,
     * `TransitionToArchive` `TransitionToPrimaryStorageClass` . See the example requests in the
     * following section for more information.
     */
    public fun lifecyclePolicies(lifecyclePolicies: List<Any>)

    /**
     * @param lifecyclePolicies An array of `LifecyclePolicy` objects that define the file system's
     * `LifecycleConfiguration` object.
     * A `LifecycleConfiguration` object informs Lifecycle management of the following:
     *
     * * When to move files in the file system from primary storage to IA storage.
     * * When to move files in the file system from primary storage or IA storage to Archive
     * storage.
     * * When to move files that are in IA or Archive storage to primary storage.
     *
     *
     * Amazon EFS requires that each `LifecyclePolicy` object have only a single transition. This
     * means that in a request body, `LifecyclePolicies` needs to be structured as an array of
     * `LifecyclePolicy` objects, one object for each transition, `TransitionToIA` ,
     * `TransitionToArchive` `TransitionToPrimaryStorageClass` . See the example requests in the
     * following section for more information.
     */
    public fun lifecyclePolicies(vararg lifecyclePolicies: Any)

    /**
     * @param performanceMode The performance mode of the file system.
     * We recommend `generalPurpose` performance mode for all file systems. File systems using the
     * `maxIO` performance mode can scale to higher levels of aggregate throughput and operations per
     * second with a tradeoff of slightly higher latencies for most file operations. The performance
     * mode can't be changed after the file system has been created. The `maxIO` mode is not supported
     * on One Zone file systems.
     *
     *
     * Due to the higher per-operation latencies with Max I/O, we recommend using General Purpose
     * performance mode for all file systems.
     *
     *
     * Default is `generalPurpose` .
     */
    public fun performanceMode(performanceMode: String)

    /**
     * @param provisionedThroughputInMibps The throughput, measured in mebibytes per second (MiBps),
     * that you want to provision for a file system that you're creating.
     * Required if `ThroughputMode` is set to `provisioned` . Valid values are 1-3414 MiBps, with
     * the upper limit depending on Region. To increase this limit, contact AWS Support . For more
     * information, see [Amazon EFS quotas that you can
     * increase](https://docs.aws.amazon.com/efs/latest/ug/limits.html#soft-limits) in the *Amazon EFS
     * User Guide* .
     */
    public fun provisionedThroughputInMibps(provisionedThroughputInMibps: Number)

    /**
     * @param replicationConfiguration Describes the replication configuration for a specific file
     * system.
     */
    public fun replicationConfiguration(replicationConfiguration: IResolvable)

    /**
     * @param replicationConfiguration Describes the replication configuration for a specific file
     * system.
     */
    public
        fun replicationConfiguration(replicationConfiguration: CfnFileSystem.ReplicationConfigurationProperty)

    /**
     * @param replicationConfiguration Describes the replication configuration for a specific file
     * system.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("379c82bcd980fc741489ab1d49bd6dda92b721fe9c385ebf8ea4807985c1dce6")
    public
        fun replicationConfiguration(replicationConfiguration: CfnFileSystem.ReplicationConfigurationProperty.Builder.() -> Unit)

    /**
     * @param throughputMode Specifies the throughput mode for the file system.
     * The mode can be `bursting` , `provisioned` , or `elastic` . If you set `ThroughputMode` to
     * `provisioned` , you must also set a value for `ProvisionedThroughputInMibps` . After you create
     * the file system, you can decrease your file system's Provisioned throughput or change between
     * the throughput modes, with certain time restrictions. For more information, see [Specifying
     * throughput with provisioned
     * mode](https://docs.aws.amazon.com/efs/latest/ug/performance.html#provisioned-throughput) in the
     * *Amazon EFS User Guide* .
     *
     * Default is `bursting` .
     */
    public fun throughputMode(throughputMode: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.efs.CfnFileSystemProps.Builder =
        software.amazon.awscdk.services.efs.CfnFileSystemProps.builder()

    /**
     * @param availabilityZoneName For One Zone file systems, specify the AWS Availability Zone in
     * which to create the file system.
     * Use the format `us-east-1a` to specify the Availability Zone. For more information about One
     * Zone file systems, see [EFS file system
     * types](https://docs.aws.amazon.com/efs/latest/ug/availability-durability.html#file-system-type)
     * in the *Amazon EFS User Guide* .
     *
     *
     * One Zone file systems are not available in all Availability Zones in AWS Regions where Amazon
     * EFS is available.
     */
    override fun availabilityZoneName(availabilityZoneName: String) {
      cdkBuilder.availabilityZoneName(availabilityZoneName)
    }

    /**
     * @param backupPolicy Use the `BackupPolicy` to turn automatic backups on or off for the file
     * system.
     */
    override fun backupPolicy(backupPolicy: IResolvable) {
      cdkBuilder.backupPolicy(backupPolicy.let(IResolvable::unwrap))
    }

    /**
     * @param backupPolicy Use the `BackupPolicy` to turn automatic backups on or off for the file
     * system.
     */
    override fun backupPolicy(backupPolicy: CfnFileSystem.BackupPolicyProperty) {
      cdkBuilder.backupPolicy(backupPolicy.let(CfnFileSystem.BackupPolicyProperty::unwrap))
    }

    /**
     * @param backupPolicy Use the `BackupPolicy` to turn automatic backups on or off for the file
     * system.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6efb74101984bc7eb369cde656c92cd0ac4415e831ab665ce514ee1f0f3e79d2")
    override fun backupPolicy(backupPolicy: CfnFileSystem.BackupPolicyProperty.Builder.() -> Unit):
        Unit = backupPolicy(CfnFileSystem.BackupPolicyProperty(backupPolicy))

    /**
     * @param bypassPolicyLockoutSafetyCheck (Optional) A boolean that specifies whether or not to
     * bypass the `FileSystemPolicy` lockout safety check.
     * The lockout safety check determines whether the policy in the request will lock out, or
     * prevent, the IAM principal that is making the request from making future `PutFileSystemPolicy`
     * requests on this file system. Set `BypassPolicyLockoutSafetyCheck` to `True` only when you
     * intend to prevent the IAM principal that is making the request from making subsequent
     * `PutFileSystemPolicy` requests on this file system. The default value is `False` .
     */
    override fun bypassPolicyLockoutSafetyCheck(bypassPolicyLockoutSafetyCheck: Boolean) {
      cdkBuilder.bypassPolicyLockoutSafetyCheck(bypassPolicyLockoutSafetyCheck)
    }

    /**
     * @param bypassPolicyLockoutSafetyCheck (Optional) A boolean that specifies whether or not to
     * bypass the `FileSystemPolicy` lockout safety check.
     * The lockout safety check determines whether the policy in the request will lock out, or
     * prevent, the IAM principal that is making the request from making future `PutFileSystemPolicy`
     * requests on this file system. Set `BypassPolicyLockoutSafetyCheck` to `True` only when you
     * intend to prevent the IAM principal that is making the request from making subsequent
     * `PutFileSystemPolicy` requests on this file system. The default value is `False` .
     */
    override fun bypassPolicyLockoutSafetyCheck(bypassPolicyLockoutSafetyCheck: IResolvable) {
      cdkBuilder.bypassPolicyLockoutSafetyCheck(bypassPolicyLockoutSafetyCheck.let(IResolvable::unwrap))
    }

    /**
     * @param encrypted A Boolean value that, if true, creates an encrypted file system.
     * When creating an encrypted file system, you have the option of specifying a KmsKeyId for an
     * existing AWS KMS key . If you don't specify a KMS key , then the default KMS key for Amazon EFS
     * , `/aws/elasticfilesystem` , is used to protect the encrypted file system.
     */
    override fun encrypted(encrypted: Boolean) {
      cdkBuilder.encrypted(encrypted)
    }

    /**
     * @param encrypted A Boolean value that, if true, creates an encrypted file system.
     * When creating an encrypted file system, you have the option of specifying a KmsKeyId for an
     * existing AWS KMS key . If you don't specify a KMS key , then the default KMS key for Amazon EFS
     * , `/aws/elasticfilesystem` , is used to protect the encrypted file system.
     */
    override fun encrypted(encrypted: IResolvable) {
      cdkBuilder.encrypted(encrypted.let(IResolvable::unwrap))
    }

    /**
     * @param fileSystemPolicy The `FileSystemPolicy` for the EFS file system.
     * A file system policy is an IAM resource policy used to control NFS access to an EFS file
     * system. For more information, see [Using IAM to control NFS access to Amazon
     * EFS](https://docs.aws.amazon.com/efs/latest/ug/iam-access-control-nfs-efs.html) in the *Amazon
     * EFS User Guide* .
     */
    override fun fileSystemPolicy(fileSystemPolicy: Any) {
      cdkBuilder.fileSystemPolicy(fileSystemPolicy)
    }

    /**
     * @param fileSystemProtection Describes the protection on the file system.
     */
    override fun fileSystemProtection(fileSystemProtection: IResolvable) {
      cdkBuilder.fileSystemProtection(fileSystemProtection.let(IResolvable::unwrap))
    }

    /**
     * @param fileSystemProtection Describes the protection on the file system.
     */
    override
        fun fileSystemProtection(fileSystemProtection: CfnFileSystem.FileSystemProtectionProperty) {
      cdkBuilder.fileSystemProtection(fileSystemProtection.let(CfnFileSystem.FileSystemProtectionProperty::unwrap))
    }

    /**
     * @param fileSystemProtection Describes the protection on the file system.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b7c66a690737a4fe60a2de527a6a5e00cff2ecf9460cfe76d24fc5a82f78e769")
    override
        fun fileSystemProtection(fileSystemProtection: CfnFileSystem.FileSystemProtectionProperty.Builder.() -> Unit):
        Unit =
        fileSystemProtection(CfnFileSystem.FileSystemProtectionProperty(fileSystemProtection))

    /**
     * @param fileSystemTags Use to create one or more tags associated with the file system.
     * Each tag is a user-defined key-value pair. Name your file system on creation by including a
     * `"Key":"Name","Value":"{value}"` key-value pair. Each key must be unique. For more information,
     * see [Tagging AWS resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in
     * the *AWS General Reference Guide* .
     */
    override fun fileSystemTags(fileSystemTags: List<CfnFileSystem.ElasticFileSystemTagProperty>) {
      cdkBuilder.fileSystemTags(fileSystemTags.map(CfnFileSystem.ElasticFileSystemTagProperty::unwrap))
    }

    /**
     * @param fileSystemTags Use to create one or more tags associated with the file system.
     * Each tag is a user-defined key-value pair. Name your file system on creation by including a
     * `"Key":"Name","Value":"{value}"` key-value pair. Each key must be unique. For more information,
     * see [Tagging AWS resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in
     * the *AWS General Reference Guide* .
     */
    override fun fileSystemTags(vararg fileSystemTags: CfnFileSystem.ElasticFileSystemTagProperty):
        Unit = fileSystemTags(fileSystemTags.toList())

    /**
     * @param kmsKeyId The ID of the AWS KMS key to be used to protect the encrypted file system.
     * This parameter is only required if you want to use a nondefault KMS key . If this parameter
     * is not specified, the default KMS key for Amazon EFS is used. This ID can be in one of the
     * following formats:
     *
     * * Key ID - A unique identifier of the key, for example `1234abcd-12ab-34cd-56ef-1234567890ab`
     * .
     * * ARN - An Amazon Resource Name (ARN) for the key, for example
     * `arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab` .
     * * Key alias - A previously created display name for a key, for example `alias/projectKey1` .
     * * Key alias ARN - An ARN for a key alias, for example
     * `arn:aws:kms:us-west-2:444455556666:alias/projectKey1` .
     *
     * If `KmsKeyId` is specified, the `Encrypted` parameter must be set to true.
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param lifecyclePolicies An array of `LifecyclePolicy` objects that define the file system's
     * `LifecycleConfiguration` object.
     * A `LifecycleConfiguration` object informs Lifecycle management of the following:
     *
     * * When to move files in the file system from primary storage to IA storage.
     * * When to move files in the file system from primary storage or IA storage to Archive
     * storage.
     * * When to move files that are in IA or Archive storage to primary storage.
     *
     *
     * Amazon EFS requires that each `LifecyclePolicy` object have only a single transition. This
     * means that in a request body, `LifecyclePolicies` needs to be structured as an array of
     * `LifecyclePolicy` objects, one object for each transition, `TransitionToIA` ,
     * `TransitionToArchive` `TransitionToPrimaryStorageClass` . See the example requests in the
     * following section for more information.
     */
    override fun lifecyclePolicies(lifecyclePolicies: IResolvable) {
      cdkBuilder.lifecyclePolicies(lifecyclePolicies.let(IResolvable::unwrap))
    }

    /**
     * @param lifecyclePolicies An array of `LifecyclePolicy` objects that define the file system's
     * `LifecycleConfiguration` object.
     * A `LifecycleConfiguration` object informs Lifecycle management of the following:
     *
     * * When to move files in the file system from primary storage to IA storage.
     * * When to move files in the file system from primary storage or IA storage to Archive
     * storage.
     * * When to move files that are in IA or Archive storage to primary storage.
     *
     *
     * Amazon EFS requires that each `LifecyclePolicy` object have only a single transition. This
     * means that in a request body, `LifecyclePolicies` needs to be structured as an array of
     * `LifecyclePolicy` objects, one object for each transition, `TransitionToIA` ,
     * `TransitionToArchive` `TransitionToPrimaryStorageClass` . See the example requests in the
     * following section for more information.
     */
    override fun lifecyclePolicies(lifecyclePolicies: List<Any>) {
      cdkBuilder.lifecyclePolicies(lifecyclePolicies)
    }

    /**
     * @param lifecyclePolicies An array of `LifecyclePolicy` objects that define the file system's
     * `LifecycleConfiguration` object.
     * A `LifecycleConfiguration` object informs Lifecycle management of the following:
     *
     * * When to move files in the file system from primary storage to IA storage.
     * * When to move files in the file system from primary storage or IA storage to Archive
     * storage.
     * * When to move files that are in IA or Archive storage to primary storage.
     *
     *
     * Amazon EFS requires that each `LifecyclePolicy` object have only a single transition. This
     * means that in a request body, `LifecyclePolicies` needs to be structured as an array of
     * `LifecyclePolicy` objects, one object for each transition, `TransitionToIA` ,
     * `TransitionToArchive` `TransitionToPrimaryStorageClass` . See the example requests in the
     * following section for more information.
     */
    override fun lifecyclePolicies(vararg lifecyclePolicies: Any): Unit =
        lifecyclePolicies(lifecyclePolicies.toList())

    /**
     * @param performanceMode The performance mode of the file system.
     * We recommend `generalPurpose` performance mode for all file systems. File systems using the
     * `maxIO` performance mode can scale to higher levels of aggregate throughput and operations per
     * second with a tradeoff of slightly higher latencies for most file operations. The performance
     * mode can't be changed after the file system has been created. The `maxIO` mode is not supported
     * on One Zone file systems.
     *
     *
     * Due to the higher per-operation latencies with Max I/O, we recommend using General Purpose
     * performance mode for all file systems.
     *
     *
     * Default is `generalPurpose` .
     */
    override fun performanceMode(performanceMode: String) {
      cdkBuilder.performanceMode(performanceMode)
    }

    /**
     * @param provisionedThroughputInMibps The throughput, measured in mebibytes per second (MiBps),
     * that you want to provision for a file system that you're creating.
     * Required if `ThroughputMode` is set to `provisioned` . Valid values are 1-3414 MiBps, with
     * the upper limit depending on Region. To increase this limit, contact AWS Support . For more
     * information, see [Amazon EFS quotas that you can
     * increase](https://docs.aws.amazon.com/efs/latest/ug/limits.html#soft-limits) in the *Amazon EFS
     * User Guide* .
     */
    override fun provisionedThroughputInMibps(provisionedThroughputInMibps: Number) {
      cdkBuilder.provisionedThroughputInMibps(provisionedThroughputInMibps)
    }

    /**
     * @param replicationConfiguration Describes the replication configuration for a specific file
     * system.
     */
    override fun replicationConfiguration(replicationConfiguration: IResolvable) {
      cdkBuilder.replicationConfiguration(replicationConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param replicationConfiguration Describes the replication configuration for a specific file
     * system.
     */
    override
        fun replicationConfiguration(replicationConfiguration: CfnFileSystem.ReplicationConfigurationProperty) {
      cdkBuilder.replicationConfiguration(replicationConfiguration.let(CfnFileSystem.ReplicationConfigurationProperty::unwrap))
    }

    /**
     * @param replicationConfiguration Describes the replication configuration for a specific file
     * system.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("379c82bcd980fc741489ab1d49bd6dda92b721fe9c385ebf8ea4807985c1dce6")
    override
        fun replicationConfiguration(replicationConfiguration: CfnFileSystem.ReplicationConfigurationProperty.Builder.() -> Unit):
        Unit =
        replicationConfiguration(CfnFileSystem.ReplicationConfigurationProperty(replicationConfiguration))

    /**
     * @param throughputMode Specifies the throughput mode for the file system.
     * The mode can be `bursting` , `provisioned` , or `elastic` . If you set `ThroughputMode` to
     * `provisioned` , you must also set a value for `ProvisionedThroughputInMibps` . After you create
     * the file system, you can decrease your file system's Provisioned throughput or change between
     * the throughput modes, with certain time restrictions. For more information, see [Specifying
     * throughput with provisioned
     * mode](https://docs.aws.amazon.com/efs/latest/ug/performance.html#provisioned-throughput) in the
     * *Amazon EFS User Guide* .
     *
     * Default is `bursting` .
     */
    override fun throughputMode(throughputMode: String) {
      cdkBuilder.throughputMode(throughputMode)
    }

    public fun build(): software.amazon.awscdk.services.efs.CfnFileSystemProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.efs.CfnFileSystemProps,
  ) : CdkObject(cdkObject), CfnFileSystemProps {
    /**
     * For One Zone file systems, specify the AWS Availability Zone in which to create the file
     * system.
     *
     * Use the format `us-east-1a` to specify the Availability Zone. For more information about One
     * Zone file systems, see [EFS file system
     * types](https://docs.aws.amazon.com/efs/latest/ug/availability-durability.html#file-system-type)
     * in the *Amazon EFS User Guide* .
     *
     *
     * One Zone file systems are not available in all Availability Zones in AWS Regions where Amazon
     * EFS is available.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-availabilityzonename)
     */
    override fun availabilityZoneName(): String? = unwrap(this).getAvailabilityZoneName()

    /**
     * Use the `BackupPolicy` to turn automatic backups on or off for the file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-backuppolicy)
     */
    override fun backupPolicy(): Any? = unwrap(this).getBackupPolicy()

    /**
     * (Optional) A boolean that specifies whether or not to bypass the `FileSystemPolicy` lockout
     * safety check.
     *
     * The lockout safety check determines whether the policy in the request will lock out, or
     * prevent, the IAM principal that is making the request from making future `PutFileSystemPolicy`
     * requests on this file system. Set `BypassPolicyLockoutSafetyCheck` to `True` only when you
     * intend to prevent the IAM principal that is making the request from making subsequent
     * `PutFileSystemPolicy` requests on this file system. The default value is `False` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-bypasspolicylockoutsafetycheck)
     */
    override fun bypassPolicyLockoutSafetyCheck(): Any? =
        unwrap(this).getBypassPolicyLockoutSafetyCheck()

    /**
     * A Boolean value that, if true, creates an encrypted file system.
     *
     * When creating an encrypted file system, you have the option of specifying a KmsKeyId for an
     * existing AWS KMS key . If you don't specify a KMS key , then the default KMS key for Amazon EFS
     * , `/aws/elasticfilesystem` , is used to protect the encrypted file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-encrypted)
     */
    override fun encrypted(): Any? = unwrap(this).getEncrypted()

    /**
     * The `FileSystemPolicy` for the EFS file system.
     *
     * A file system policy is an IAM resource policy used to control NFS access to an EFS file
     * system. For more information, see [Using IAM to control NFS access to Amazon
     * EFS](https://docs.aws.amazon.com/efs/latest/ug/iam-access-control-nfs-efs.html) in the *Amazon
     * EFS User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-filesystempolicy)
     */
    override fun fileSystemPolicy(): Any? = unwrap(this).getFileSystemPolicy()

    /**
     * Describes the protection on the file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-filesystemprotection)
     */
    override fun fileSystemProtection(): Any? = unwrap(this).getFileSystemProtection()

    /**
     * Use to create one or more tags associated with the file system.
     *
     * Each tag is a user-defined key-value pair. Name your file system on creation by including a
     * `"Key":"Name","Value":"{value}"` key-value pair. Each key must be unique. For more information,
     * see [Tagging AWS resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in
     * the *AWS General Reference Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-filesystemtags)
     */
    override fun fileSystemTags(): List<CfnFileSystem.ElasticFileSystemTagProperty> =
        unwrap(this).getFileSystemTags()?.map(CfnFileSystem.ElasticFileSystemTagProperty::wrap) ?:
        emptyList()

    /**
     * The ID of the AWS KMS key to be used to protect the encrypted file system.
     *
     * This parameter is only required if you want to use a nondefault KMS key . If this parameter
     * is not specified, the default KMS key for Amazon EFS is used. This ID can be in one of the
     * following formats:
     *
     * * Key ID - A unique identifier of the key, for example `1234abcd-12ab-34cd-56ef-1234567890ab`
     * .
     * * ARN - An Amazon Resource Name (ARN) for the key, for example
     * `arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab` .
     * * Key alias - A previously created display name for a key, for example `alias/projectKey1` .
     * * Key alias ARN - An ARN for a key alias, for example
     * `arn:aws:kms:us-west-2:444455556666:alias/projectKey1` .
     *
     * If `KmsKeyId` is specified, the `Encrypted` parameter must be set to true.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-kmskeyid)
     */
    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * An array of `LifecyclePolicy` objects that define the file system's `LifecycleConfiguration`
     * object.
     *
     * A `LifecycleConfiguration` object informs Lifecycle management of the following:
     *
     * * When to move files in the file system from primary storage to IA storage.
     * * When to move files in the file system from primary storage or IA storage to Archive
     * storage.
     * * When to move files that are in IA or Archive storage to primary storage.
     *
     *
     * Amazon EFS requires that each `LifecyclePolicy` object have only a single transition. This
     * means that in a request body, `LifecyclePolicies` needs to be structured as an array of
     * `LifecyclePolicy` objects, one object for each transition, `TransitionToIA` ,
     * `TransitionToArchive` `TransitionToPrimaryStorageClass` . See the example requests in the
     * following section for more information.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-lifecyclepolicies)
     */
    override fun lifecyclePolicies(): Any? = unwrap(this).getLifecyclePolicies()

    /**
     * The performance mode of the file system.
     *
     * We recommend `generalPurpose` performance mode for all file systems. File systems using the
     * `maxIO` performance mode can scale to higher levels of aggregate throughput and operations per
     * second with a tradeoff of slightly higher latencies for most file operations. The performance
     * mode can't be changed after the file system has been created. The `maxIO` mode is not supported
     * on One Zone file systems.
     *
     *
     * Due to the higher per-operation latencies with Max I/O, we recommend using General Purpose
     * performance mode for all file systems.
     *
     *
     * Default is `generalPurpose` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-performancemode)
     */
    override fun performanceMode(): String? = unwrap(this).getPerformanceMode()

    /**
     * The throughput, measured in mebibytes per second (MiBps), that you want to provision for a
     * file system that you're creating.
     *
     * Required if `ThroughputMode` is set to `provisioned` . Valid values are 1-3414 MiBps, with
     * the upper limit depending on Region. To increase this limit, contact AWS Support . For more
     * information, see [Amazon EFS quotas that you can
     * increase](https://docs.aws.amazon.com/efs/latest/ug/limits.html#soft-limits) in the *Amazon EFS
     * User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-provisionedthroughputinmibps)
     */
    override fun provisionedThroughputInMibps(): Number? =
        unwrap(this).getProvisionedThroughputInMibps()

    /**
     * Describes the replication configuration for a specific file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-replicationconfiguration)
     */
    override fun replicationConfiguration(): Any? = unwrap(this).getReplicationConfiguration()

    /**
     * Specifies the throughput mode for the file system.
     *
     * The mode can be `bursting` , `provisioned` , or `elastic` . If you set `ThroughputMode` to
     * `provisioned` , you must also set a value for `ProvisionedThroughputInMibps` . After you create
     * the file system, you can decrease your file system's Provisioned throughput or change between
     * the throughput modes, with certain time restrictions. For more information, see [Specifying
     * throughput with provisioned
     * mode](https://docs.aws.amazon.com/efs/latest/ug/performance.html#provisioned-throughput) in the
     * *Amazon EFS User Guide* .
     *
     * Default is `bursting` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-throughputmode)
     */
    override fun throughputMode(): String? = unwrap(this).getThroughputMode()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFileSystemProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.efs.CfnFileSystemProps):
        CfnFileSystemProps = CdkObjectWrappers.wrap(cdkObject) as? CfnFileSystemProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFileSystemProps):
        software.amazon.awscdk.services.efs.CfnFileSystemProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.efs.CfnFileSystemProps
  }
}
