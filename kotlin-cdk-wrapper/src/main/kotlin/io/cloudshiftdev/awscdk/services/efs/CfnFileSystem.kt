@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.efs

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
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
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::EFS::FileSystem` resource creates a new, empty file system in Amazon Elastic File
 * System ( Amazon EFS ).
 *
 * You must create a mount target (
 * [AWS::EFS::MountTarget](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-mounttarget.html)
 * ) to mount your EFS file system on an Amazon EC2 or other AWS cloud compute resource.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.efs.*;
 * Object fileSystemPolicy;
 * CfnFileSystem cfnFileSystem = CfnFileSystem.Builder.create(this, "MyCfnFileSystem")
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
public open class CfnFileSystem(
  cdkObject: software.amazon.awscdk.services.efs.CfnFileSystem,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.efs.CfnFileSystem(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnFileSystemProps,
  ) :
      this(software.amazon.awscdk.services.efs.CfnFileSystem(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnFileSystemProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnFileSystemProps.Builder.() -> Unit,
  ) : this(scope, id, CfnFileSystemProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the EFS file system.
   *
   * Example:
   * `arn:aws:elasticfilesystem:us-west-2:1111333322228888:file-system/fs-0123456789abcdef8`
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The ID of the EFS file system.
   *
   * For example: `fs-abcdef0123456789a`
   */
  public open fun attrFileSystemId(): String = unwrap(this).getAttrFileSystemId()

  /**
   * For One Zone file systems, specify the AWS Availability Zone in which to create the file
   * system.
   */
  public open fun availabilityZoneName(): String? = unwrap(this).getAvailabilityZoneName()

  /**
   * For One Zone file systems, specify the AWS Availability Zone in which to create the file
   * system.
   */
  public open fun availabilityZoneName(`value`: String) {
    unwrap(this).setAvailabilityZoneName(`value`)
  }

  /**
   * Use the `BackupPolicy` to turn automatic backups on or off for the file system.
   */
  public open fun backupPolicy(): Any? = unwrap(this).getBackupPolicy()

  /**
   * Use the `BackupPolicy` to turn automatic backups on or off for the file system.
   */
  public open fun backupPolicy(`value`: IResolvable) {
    unwrap(this).setBackupPolicy(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Use the `BackupPolicy` to turn automatic backups on or off for the file system.
   */
  public open fun backupPolicy(`value`: BackupPolicyProperty) {
    unwrap(this).setBackupPolicy(`value`.let(BackupPolicyProperty.Companion::unwrap))
  }

  /**
   * Use the `BackupPolicy` to turn automatic backups on or off for the file system.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3d2c3dd1ca9e563238d455e0ec9754a469a9e690d82358c513e778dd2a23082d")
  public open fun backupPolicy(`value`: BackupPolicyProperty.Builder.() -> Unit): Unit =
      backupPolicy(BackupPolicyProperty(`value`))

  /**
   * (Optional) A boolean that specifies whether or not to bypass the `FileSystemPolicy` lockout
   * safety check.
   */
  public open fun bypassPolicyLockoutSafetyCheck(): Any? =
      unwrap(this).getBypassPolicyLockoutSafetyCheck()

  /**
   * (Optional) A boolean that specifies whether or not to bypass the `FileSystemPolicy` lockout
   * safety check.
   */
  public open fun bypassPolicyLockoutSafetyCheck(`value`: Boolean) {
    unwrap(this).setBypassPolicyLockoutSafetyCheck(`value`)
  }

  /**
   * (Optional) A boolean that specifies whether or not to bypass the `FileSystemPolicy` lockout
   * safety check.
   */
  public open fun bypassPolicyLockoutSafetyCheck(`value`: IResolvable) {
    unwrap(this).setBypassPolicyLockoutSafetyCheck(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A Boolean value that, if true, creates an encrypted file system.
   */
  public open fun encrypted(): Any? = unwrap(this).getEncrypted()

  /**
   * A Boolean value that, if true, creates an encrypted file system.
   */
  public open fun encrypted(`value`: Boolean) {
    unwrap(this).setEncrypted(`value`)
  }

  /**
   * A Boolean value that, if true, creates an encrypted file system.
   */
  public open fun encrypted(`value`: IResolvable) {
    unwrap(this).setEncrypted(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The `FileSystemPolicy` for the EFS file system.
   */
  public open fun fileSystemPolicy(): Any? = unwrap(this).getFileSystemPolicy()

  /**
   * The `FileSystemPolicy` for the EFS file system.
   */
  public open fun fileSystemPolicy(`value`: Any) {
    unwrap(this).setFileSystemPolicy(`value`)
  }

  /**
   * Describes the protection on the file system.
   */
  public open fun fileSystemProtection(): Any? = unwrap(this).getFileSystemProtection()

  /**
   * Describes the protection on the file system.
   */
  public open fun fileSystemProtection(`value`: IResolvable) {
    unwrap(this).setFileSystemProtection(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Describes the protection on the file system.
   */
  public open fun fileSystemProtection(`value`: FileSystemProtectionProperty) {
    unwrap(this).setFileSystemProtection(`value`.let(FileSystemProtectionProperty.Companion::unwrap))
  }

  /**
   * Describes the protection on the file system.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9bba4271920499492bfb5cc6086044de81a9a6455147b2f555d3636c0e86eab2")
  public open fun fileSystemProtection(`value`: FileSystemProtectionProperty.Builder.() -> Unit):
      Unit = fileSystemProtection(FileSystemProtectionProperty(`value`))

  /**
   * Use to create one or more tags associated with the file system.
   */
  public open fun fileSystemTagsRaw(): List<ElasticFileSystemTagProperty> =
      unwrap(this).getFileSystemTagsRaw()?.map(ElasticFileSystemTagProperty::wrap) ?: emptyList()

  /**
   * Use to create one or more tags associated with the file system.
   */
  public open fun fileSystemTagsRaw(`value`: List<ElasticFileSystemTagProperty>) {
    unwrap(this).setFileSystemTagsRaw(`value`.map(ElasticFileSystemTagProperty.Companion::unwrap))
  }

  /**
   * Use to create one or more tags associated with the file system.
   */
  public open fun fileSystemTagsRaw(vararg `value`: ElasticFileSystemTagProperty): Unit =
      fileSystemTagsRaw(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The ID of the AWS KMS key to be used to protect the encrypted file system.
   */
  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * The ID of the AWS KMS key to be used to protect the encrypted file system.
   */
  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  /**
   * An array of `LifecyclePolicy` objects that define the file system's `LifecycleConfiguration`
   * object.
   */
  public open fun lifecyclePolicies(): Any? = unwrap(this).getLifecyclePolicies()

  /**
   * An array of `LifecyclePolicy` objects that define the file system's `LifecycleConfiguration`
   * object.
   */
  public open fun lifecyclePolicies(`value`: IResolvable) {
    unwrap(this).setLifecyclePolicies(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * An array of `LifecyclePolicy` objects that define the file system's `LifecycleConfiguration`
   * object.
   */
  public open fun lifecyclePolicies(`value`: List<Any>) {
    unwrap(this).setLifecyclePolicies(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * An array of `LifecyclePolicy` objects that define the file system's `LifecycleConfiguration`
   * object.
   */
  public open fun lifecyclePolicies(vararg `value`: Any): Unit = lifecyclePolicies(`value`.toList())

  /**
   * The performance mode of the file system.
   */
  public open fun performanceMode(): String? = unwrap(this).getPerformanceMode()

  /**
   * The performance mode of the file system.
   */
  public open fun performanceMode(`value`: String) {
    unwrap(this).setPerformanceMode(`value`)
  }

  /**
   * The throughput, measured in mebibytes per second (MiBps), that you want to provision for a file
   * system that you're creating.
   */
  public open fun provisionedThroughputInMibps(): Number? =
      unwrap(this).getProvisionedThroughputInMibps()

  /**
   * The throughput, measured in mebibytes per second (MiBps), that you want to provision for a file
   * system that you're creating.
   */
  public open fun provisionedThroughputInMibps(`value`: Number) {
    unwrap(this).setProvisionedThroughputInMibps(`value`)
  }

  /**
   * Describes the replication configuration for a specific file system.
   */
  public open fun replicationConfiguration(): Any? = unwrap(this).getReplicationConfiguration()

  /**
   * Describes the replication configuration for a specific file system.
   */
  public open fun replicationConfiguration(`value`: IResolvable) {
    unwrap(this).setReplicationConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Describes the replication configuration for a specific file system.
   */
  public open fun replicationConfiguration(`value`: ReplicationConfigurationProperty) {
    unwrap(this).setReplicationConfiguration(`value`.let(ReplicationConfigurationProperty.Companion::unwrap))
  }

  /**
   * Describes the replication configuration for a specific file system.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4fcd7a8bd99b774e253bb097b989d8b37cbf5b89e9825d10288a1c7dee0bdb6d")
  public open
      fun replicationConfiguration(`value`: ReplicationConfigurationProperty.Builder.() -> Unit):
      Unit = replicationConfiguration(ReplicationConfigurationProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Specifies the throughput mode for the file system.
   */
  public open fun throughputMode(): String? = unwrap(this).getThroughputMode()

  /**
   * Specifies the throughput mode for the file system.
   */
  public open fun throughputMode(`value`: String) {
    unwrap(this).setThroughputMode(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.efs.CfnFileSystem].
   */
  @CdkDslMarker
  public interface Builder {
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
     * @param availabilityZoneName For One Zone file systems, specify the AWS Availability Zone in
     * which to create the file system. 
     */
    public fun availabilityZoneName(availabilityZoneName: String)

    /**
     * Use the `BackupPolicy` to turn automatic backups on or off for the file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-backuppolicy)
     * @param backupPolicy Use the `BackupPolicy` to turn automatic backups on or off for the file
     * system. 
     */
    public fun backupPolicy(backupPolicy: IResolvable)

    /**
     * Use the `BackupPolicy` to turn automatic backups on or off for the file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-backuppolicy)
     * @param backupPolicy Use the `BackupPolicy` to turn automatic backups on or off for the file
     * system. 
     */
    public fun backupPolicy(backupPolicy: BackupPolicyProperty)

    /**
     * Use the `BackupPolicy` to turn automatic backups on or off for the file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-backuppolicy)
     * @param backupPolicy Use the `BackupPolicy` to turn automatic backups on or off for the file
     * system. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("75c2068fea33f46f0b81ec9b3167482f1b33d2850483e2128410e2ec3c6e5797")
    public fun backupPolicy(backupPolicy: BackupPolicyProperty.Builder.() -> Unit)

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
     * @param bypassPolicyLockoutSafetyCheck (Optional) A boolean that specifies whether or not to
     * bypass the `FileSystemPolicy` lockout safety check. 
     */
    public fun bypassPolicyLockoutSafetyCheck(bypassPolicyLockoutSafetyCheck: Boolean)

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
     * @param bypassPolicyLockoutSafetyCheck (Optional) A boolean that specifies whether or not to
     * bypass the `FileSystemPolicy` lockout safety check. 
     */
    public fun bypassPolicyLockoutSafetyCheck(bypassPolicyLockoutSafetyCheck: IResolvable)

    /**
     * A Boolean value that, if true, creates an encrypted file system.
     *
     * When creating an encrypted file system, you have the option of specifying a KmsKeyId for an
     * existing AWS KMS key . If you don't specify a KMS key , then the default KMS key for Amazon EFS
     * , `/aws/elasticfilesystem` , is used to protect the encrypted file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-encrypted)
     * @param encrypted A Boolean value that, if true, creates an encrypted file system. 
     */
    public fun encrypted(encrypted: Boolean)

    /**
     * A Boolean value that, if true, creates an encrypted file system.
     *
     * When creating an encrypted file system, you have the option of specifying a KmsKeyId for an
     * existing AWS KMS key . If you don't specify a KMS key , then the default KMS key for Amazon EFS
     * , `/aws/elasticfilesystem` , is used to protect the encrypted file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-encrypted)
     * @param encrypted A Boolean value that, if true, creates an encrypted file system. 
     */
    public fun encrypted(encrypted: IResolvable)

    /**
     * The `FileSystemPolicy` for the EFS file system.
     *
     * A file system policy is an IAM resource policy used to control NFS access to an EFS file
     * system. For more information, see [Using IAM to control NFS access to Amazon
     * EFS](https://docs.aws.amazon.com/efs/latest/ug/iam-access-control-nfs-efs.html) in the *Amazon
     * EFS User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-filesystempolicy)
     * @param fileSystemPolicy The `FileSystemPolicy` for the EFS file system. 
     */
    public fun fileSystemPolicy(fileSystemPolicy: Any)

    /**
     * Describes the protection on the file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-filesystemprotection)
     * @param fileSystemProtection Describes the protection on the file system. 
     */
    public fun fileSystemProtection(fileSystemProtection: IResolvable)

    /**
     * Describes the protection on the file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-filesystemprotection)
     * @param fileSystemProtection Describes the protection on the file system. 
     */
    public fun fileSystemProtection(fileSystemProtection: FileSystemProtectionProperty)

    /**
     * Describes the protection on the file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-filesystemprotection)
     * @param fileSystemProtection Describes the protection on the file system. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fe219d089f6ecb2b40f3cf37e0616ea4fb81907fb8a89fd945425744d7e1c922")
    public
        fun fileSystemProtection(fileSystemProtection: FileSystemProtectionProperty.Builder.() -> Unit)

    /**
     * Use to create one or more tags associated with the file system.
     *
     * Each tag is a user-defined key-value pair. Name your file system on creation by including a
     * `"Key":"Name","Value":"{value}"` key-value pair. Each key must be unique. For more information,
     * see [Tagging AWS resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in
     * the *AWS General Reference Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-filesystemtags)
     * @param fileSystemTags Use to create one or more tags associated with the file system. 
     */
    public fun fileSystemTags(fileSystemTags: List<ElasticFileSystemTagProperty>)

    /**
     * Use to create one or more tags associated with the file system.
     *
     * Each tag is a user-defined key-value pair. Name your file system on creation by including a
     * `"Key":"Name","Value":"{value}"` key-value pair. Each key must be unique. For more information,
     * see [Tagging AWS resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in
     * the *AWS General Reference Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-filesystemtags)
     * @param fileSystemTags Use to create one or more tags associated with the file system. 
     */
    public fun fileSystemTags(vararg fileSystemTags: ElasticFileSystemTagProperty)

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
     * @param kmsKeyId The ID of the AWS KMS key to be used to protect the encrypted file system. 
     */
    public fun kmsKeyId(kmsKeyId: String)

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
     * @param lifecyclePolicies An array of `LifecyclePolicy` objects that define the file system's
     * `LifecycleConfiguration` object. 
     */
    public fun lifecyclePolicies(lifecyclePolicies: IResolvable)

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
     * @param lifecyclePolicies An array of `LifecyclePolicy` objects that define the file system's
     * `LifecycleConfiguration` object. 
     */
    public fun lifecyclePolicies(lifecyclePolicies: List<Any>)

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
     * @param lifecyclePolicies An array of `LifecyclePolicy` objects that define the file system's
     * `LifecycleConfiguration` object. 
     */
    public fun lifecyclePolicies(vararg lifecyclePolicies: Any)

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
     * @param performanceMode The performance mode of the file system. 
     */
    public fun performanceMode(performanceMode: String)

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
     * @param provisionedThroughputInMibps The throughput, measured in mebibytes per second (MiBps),
     * that you want to provision for a file system that you're creating. 
     */
    public fun provisionedThroughputInMibps(provisionedThroughputInMibps: Number)

    /**
     * Describes the replication configuration for a specific file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-replicationconfiguration)
     * @param replicationConfiguration Describes the replication configuration for a specific file
     * system. 
     */
    public fun replicationConfiguration(replicationConfiguration: IResolvable)

    /**
     * Describes the replication configuration for a specific file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-replicationconfiguration)
     * @param replicationConfiguration Describes the replication configuration for a specific file
     * system. 
     */
    public fun replicationConfiguration(replicationConfiguration: ReplicationConfigurationProperty)

    /**
     * Describes the replication configuration for a specific file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-replicationconfiguration)
     * @param replicationConfiguration Describes the replication configuration for a specific file
     * system. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a98676449aff2b6dc6f8e4f8d8b593e443b3e6102fe0793e2d7f90a4427d8cd8")
    public
        fun replicationConfiguration(replicationConfiguration: ReplicationConfigurationProperty.Builder.() -> Unit)

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
     * @param throughputMode Specifies the throughput mode for the file system. 
     */
    public fun throughputMode(throughputMode: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.efs.CfnFileSystem.Builder =
        software.amazon.awscdk.services.efs.CfnFileSystem.Builder.create(scope, id)

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
     * @param availabilityZoneName For One Zone file systems, specify the AWS Availability Zone in
     * which to create the file system. 
     */
    override fun availabilityZoneName(availabilityZoneName: String) {
      cdkBuilder.availabilityZoneName(availabilityZoneName)
    }

    /**
     * Use the `BackupPolicy` to turn automatic backups on or off for the file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-backuppolicy)
     * @param backupPolicy Use the `BackupPolicy` to turn automatic backups on or off for the file
     * system. 
     */
    override fun backupPolicy(backupPolicy: IResolvable) {
      cdkBuilder.backupPolicy(backupPolicy.let(IResolvable.Companion::unwrap))
    }

    /**
     * Use the `BackupPolicy` to turn automatic backups on or off for the file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-backuppolicy)
     * @param backupPolicy Use the `BackupPolicy` to turn automatic backups on or off for the file
     * system. 
     */
    override fun backupPolicy(backupPolicy: BackupPolicyProperty) {
      cdkBuilder.backupPolicy(backupPolicy.let(BackupPolicyProperty.Companion::unwrap))
    }

    /**
     * Use the `BackupPolicy` to turn automatic backups on or off for the file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-backuppolicy)
     * @param backupPolicy Use the `BackupPolicy` to turn automatic backups on or off for the file
     * system. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("75c2068fea33f46f0b81ec9b3167482f1b33d2850483e2128410e2ec3c6e5797")
    override fun backupPolicy(backupPolicy: BackupPolicyProperty.Builder.() -> Unit): Unit =
        backupPolicy(BackupPolicyProperty(backupPolicy))

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
     * @param bypassPolicyLockoutSafetyCheck (Optional) A boolean that specifies whether or not to
     * bypass the `FileSystemPolicy` lockout safety check. 
     */
    override fun bypassPolicyLockoutSafetyCheck(bypassPolicyLockoutSafetyCheck: Boolean) {
      cdkBuilder.bypassPolicyLockoutSafetyCheck(bypassPolicyLockoutSafetyCheck)
    }

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
     * @param bypassPolicyLockoutSafetyCheck (Optional) A boolean that specifies whether or not to
     * bypass the `FileSystemPolicy` lockout safety check. 
     */
    override fun bypassPolicyLockoutSafetyCheck(bypassPolicyLockoutSafetyCheck: IResolvable) {
      cdkBuilder.bypassPolicyLockoutSafetyCheck(bypassPolicyLockoutSafetyCheck.let(IResolvable.Companion::unwrap))
    }

    /**
     * A Boolean value that, if true, creates an encrypted file system.
     *
     * When creating an encrypted file system, you have the option of specifying a KmsKeyId for an
     * existing AWS KMS key . If you don't specify a KMS key , then the default KMS key for Amazon EFS
     * , `/aws/elasticfilesystem` , is used to protect the encrypted file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-encrypted)
     * @param encrypted A Boolean value that, if true, creates an encrypted file system. 
     */
    override fun encrypted(encrypted: Boolean) {
      cdkBuilder.encrypted(encrypted)
    }

    /**
     * A Boolean value that, if true, creates an encrypted file system.
     *
     * When creating an encrypted file system, you have the option of specifying a KmsKeyId for an
     * existing AWS KMS key . If you don't specify a KMS key , then the default KMS key for Amazon EFS
     * , `/aws/elasticfilesystem` , is used to protect the encrypted file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-encrypted)
     * @param encrypted A Boolean value that, if true, creates an encrypted file system. 
     */
    override fun encrypted(encrypted: IResolvable) {
      cdkBuilder.encrypted(encrypted.let(IResolvable.Companion::unwrap))
    }

    /**
     * The `FileSystemPolicy` for the EFS file system.
     *
     * A file system policy is an IAM resource policy used to control NFS access to an EFS file
     * system. For more information, see [Using IAM to control NFS access to Amazon
     * EFS](https://docs.aws.amazon.com/efs/latest/ug/iam-access-control-nfs-efs.html) in the *Amazon
     * EFS User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-filesystempolicy)
     * @param fileSystemPolicy The `FileSystemPolicy` for the EFS file system. 
     */
    override fun fileSystemPolicy(fileSystemPolicy: Any) {
      cdkBuilder.fileSystemPolicy(fileSystemPolicy)
    }

    /**
     * Describes the protection on the file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-filesystemprotection)
     * @param fileSystemProtection Describes the protection on the file system. 
     */
    override fun fileSystemProtection(fileSystemProtection: IResolvable) {
      cdkBuilder.fileSystemProtection(fileSystemProtection.let(IResolvable.Companion::unwrap))
    }

    /**
     * Describes the protection on the file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-filesystemprotection)
     * @param fileSystemProtection Describes the protection on the file system. 
     */
    override fun fileSystemProtection(fileSystemProtection: FileSystemProtectionProperty) {
      cdkBuilder.fileSystemProtection(fileSystemProtection.let(FileSystemProtectionProperty.Companion::unwrap))
    }

    /**
     * Describes the protection on the file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-filesystemprotection)
     * @param fileSystemProtection Describes the protection on the file system. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fe219d089f6ecb2b40f3cf37e0616ea4fb81907fb8a89fd945425744d7e1c922")
    override
        fun fileSystemProtection(fileSystemProtection: FileSystemProtectionProperty.Builder.() -> Unit):
        Unit = fileSystemProtection(FileSystemProtectionProperty(fileSystemProtection))

    /**
     * Use to create one or more tags associated with the file system.
     *
     * Each tag is a user-defined key-value pair. Name your file system on creation by including a
     * `"Key":"Name","Value":"{value}"` key-value pair. Each key must be unique. For more information,
     * see [Tagging AWS resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in
     * the *AWS General Reference Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-filesystemtags)
     * @param fileSystemTags Use to create one or more tags associated with the file system. 
     */
    override fun fileSystemTags(fileSystemTags: List<ElasticFileSystemTagProperty>) {
      cdkBuilder.fileSystemTags(fileSystemTags.map(ElasticFileSystemTagProperty.Companion::unwrap))
    }

    /**
     * Use to create one or more tags associated with the file system.
     *
     * Each tag is a user-defined key-value pair. Name your file system on creation by including a
     * `"Key":"Name","Value":"{value}"` key-value pair. Each key must be unique. For more information,
     * see [Tagging AWS resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in
     * the *AWS General Reference Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-filesystemtags)
     * @param fileSystemTags Use to create one or more tags associated with the file system. 
     */
    override fun fileSystemTags(vararg fileSystemTags: ElasticFileSystemTagProperty): Unit =
        fileSystemTags(fileSystemTags.toList())

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
     * @param kmsKeyId The ID of the AWS KMS key to be used to protect the encrypted file system. 
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

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
     * @param lifecyclePolicies An array of `LifecyclePolicy` objects that define the file system's
     * `LifecycleConfiguration` object. 
     */
    override fun lifecyclePolicies(lifecyclePolicies: IResolvable) {
      cdkBuilder.lifecyclePolicies(lifecyclePolicies.let(IResolvable.Companion::unwrap))
    }

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
     * @param lifecyclePolicies An array of `LifecyclePolicy` objects that define the file system's
     * `LifecycleConfiguration` object. 
     */
    override fun lifecyclePolicies(lifecyclePolicies: List<Any>) {
      cdkBuilder.lifecyclePolicies(lifecyclePolicies.map{CdkObjectWrappers.unwrap(it)})
    }

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
     * @param lifecyclePolicies An array of `LifecyclePolicy` objects that define the file system's
     * `LifecycleConfiguration` object. 
     */
    override fun lifecyclePolicies(vararg lifecyclePolicies: Any): Unit =
        lifecyclePolicies(lifecyclePolicies.toList())

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
     * @param performanceMode The performance mode of the file system. 
     */
    override fun performanceMode(performanceMode: String) {
      cdkBuilder.performanceMode(performanceMode)
    }

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
     * @param provisionedThroughputInMibps The throughput, measured in mebibytes per second (MiBps),
     * that you want to provision for a file system that you're creating. 
     */
    override fun provisionedThroughputInMibps(provisionedThroughputInMibps: Number) {
      cdkBuilder.provisionedThroughputInMibps(provisionedThroughputInMibps)
    }

    /**
     * Describes the replication configuration for a specific file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-replicationconfiguration)
     * @param replicationConfiguration Describes the replication configuration for a specific file
     * system. 
     */
    override fun replicationConfiguration(replicationConfiguration: IResolvable) {
      cdkBuilder.replicationConfiguration(replicationConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * Describes the replication configuration for a specific file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-replicationconfiguration)
     * @param replicationConfiguration Describes the replication configuration for a specific file
     * system. 
     */
    override
        fun replicationConfiguration(replicationConfiguration: ReplicationConfigurationProperty) {
      cdkBuilder.replicationConfiguration(replicationConfiguration.let(ReplicationConfigurationProperty.Companion::unwrap))
    }

    /**
     * Describes the replication configuration for a specific file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-efs-filesystem.html#cfn-efs-filesystem-replicationconfiguration)
     * @param replicationConfiguration Describes the replication configuration for a specific file
     * system. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a98676449aff2b6dc6f8e4f8d8b593e443b3e6102fe0793e2d7f90a4427d8cd8")
    override
        fun replicationConfiguration(replicationConfiguration: ReplicationConfigurationProperty.Builder.() -> Unit):
        Unit = replicationConfiguration(ReplicationConfigurationProperty(replicationConfiguration))

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
     * @param throughputMode Specifies the throughput mode for the file system. 
     */
    override fun throughputMode(throughputMode: String) {
      cdkBuilder.throughputMode(throughputMode)
    }

    public fun build(): software.amazon.awscdk.services.efs.CfnFileSystem = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.efs.CfnFileSystem.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFileSystem {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFileSystem(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.efs.CfnFileSystem): CfnFileSystem =
        CfnFileSystem(cdkObject)

    internal fun unwrap(wrapped: CfnFileSystem): software.amazon.awscdk.services.efs.CfnFileSystem =
        wrapped.cdkObject as software.amazon.awscdk.services.efs.CfnFileSystem
  }

  /**
   * The backup policy turns automatic backups for the file system on or off.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.efs.*;
   * BackupPolicyProperty backupPolicyProperty = BackupPolicyProperty.builder()
   * .status("status")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-filesystem-backuppolicy.html)
   */
  public interface BackupPolicyProperty {
    /**
     * Set the backup policy status for the file system.
     *
     * * *`ENABLED`* - Turns automatic backups on for the file system.
     * * *`DISABLED`* - Turns automatic backups off for the file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-filesystem-backuppolicy.html#cfn-efs-filesystem-backuppolicy-status)
     */
    public fun status(): String

    /**
     * A builder for [BackupPolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param status Set the backup policy status for the file system. 
       * * *`ENABLED`* - Turns automatic backups on for the file system.
       * * *`DISABLED`* - Turns automatic backups off for the file system.
       */
      public fun status(status: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.efs.CfnFileSystem.BackupPolicyProperty.Builder =
          software.amazon.awscdk.services.efs.CfnFileSystem.BackupPolicyProperty.builder()

      /**
       * @param status Set the backup policy status for the file system. 
       * * *`ENABLED`* - Turns automatic backups on for the file system.
       * * *`DISABLED`* - Turns automatic backups off for the file system.
       */
      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public fun build(): software.amazon.awscdk.services.efs.CfnFileSystem.BackupPolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.efs.CfnFileSystem.BackupPolicyProperty,
    ) : CdkObject(cdkObject), BackupPolicyProperty {
      /**
       * Set the backup policy status for the file system.
       *
       * * *`ENABLED`* - Turns automatic backups on for the file system.
       * * *`DISABLED`* - Turns automatic backups off for the file system.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-filesystem-backuppolicy.html#cfn-efs-filesystem-backuppolicy-status)
       */
      override fun status(): String = unwrap(this).getStatus()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BackupPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.efs.CfnFileSystem.BackupPolicyProperty):
          BackupPolicyProperty = CdkObjectWrappers.wrap(cdkObject) as? BackupPolicyProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: BackupPolicyProperty):
          software.amazon.awscdk.services.efs.CfnFileSystem.BackupPolicyProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.efs.CfnFileSystem.BackupPolicyProperty
    }
  }

  /**
   * A tag is a key-value pair attached to a file system.
   *
   * Allowed characters in the `Key` and `Value` properties are letters, white space, and numbers
   * that can be represented in UTF-8, and the following characters: `+ - = . _ : /`
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.efs.*;
   * ElasticFileSystemTagProperty elasticFileSystemTagProperty =
   * ElasticFileSystemTagProperty.builder()
   * .key("key")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-filesystem-elasticfilesystemtag.html)
   */
  public interface ElasticFileSystemTagProperty {
    /**
     * The tag key (String).
     *
     * The key can't start with `aws:` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-filesystem-elasticfilesystemtag.html#cfn-efs-filesystem-elasticfilesystemtag-key)
     */
    public fun key(): String

    /**
     * The value of the tag key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-filesystem-elasticfilesystemtag.html#cfn-efs-filesystem-elasticfilesystemtag-value)
     */
    public fun `value`(): String

    /**
     * A builder for [ElasticFileSystemTagProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The tag key (String). 
       * The key can't start with `aws:` .
       */
      public fun key(key: String)

      /**
       * @param value The value of the tag key. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.efs.CfnFileSystem.ElasticFileSystemTagProperty.Builder =
          software.amazon.awscdk.services.efs.CfnFileSystem.ElasticFileSystemTagProperty.builder()

      /**
       * @param key The tag key (String). 
       * The key can't start with `aws:` .
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The value of the tag key. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.efs.CfnFileSystem.ElasticFileSystemTagProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.efs.CfnFileSystem.ElasticFileSystemTagProperty,
    ) : CdkObject(cdkObject), ElasticFileSystemTagProperty {
      /**
       * The tag key (String).
       *
       * The key can't start with `aws:` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-filesystem-elasticfilesystemtag.html#cfn-efs-filesystem-elasticfilesystemtag-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The value of the tag key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-filesystem-elasticfilesystemtag.html#cfn-efs-filesystem-elasticfilesystemtag-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ElasticFileSystemTagProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.efs.CfnFileSystem.ElasticFileSystemTagProperty):
          ElasticFileSystemTagProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ElasticFileSystemTagProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ElasticFileSystemTagProperty):
          software.amazon.awscdk.services.efs.CfnFileSystem.ElasticFileSystemTagProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.efs.CfnFileSystem.ElasticFileSystemTagProperty
    }
  }

  /**
   * Describes the protection on the file system.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.efs.*;
   * FileSystemProtectionProperty fileSystemProtectionProperty =
   * FileSystemProtectionProperty.builder()
   * .replicationOverwriteProtection("replicationOverwriteProtection")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-filesystem-filesystemprotection.html)
   */
  public interface FileSystemProtectionProperty {
    /**
     * The status of the file system's replication overwrite protection.
     *
     * * `ENABLED` – The file system cannot be used as the destination file system in a replication
     * configuration. The file system is writeable. Replication overwrite protection is `ENABLED` by
     * default.
     * * `DISABLED` – The file system can be used as the destination file system in a replication
     * configuration. The file system is read-only and can only be modified by EFS replication.
     * * `REPLICATING` – The file system is being used as the destination file system in a
     * replication configuration. The file system is read-only and is only modified only by EFS
     * replication.
     *
     * If the replication configuration is deleted, the file system's replication overwrite
     * protection is re-enabled, the file system becomes writeable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-filesystem-filesystemprotection.html#cfn-efs-filesystem-filesystemprotection-replicationoverwriteprotection)
     */
    public fun replicationOverwriteProtection(): String? =
        unwrap(this).getReplicationOverwriteProtection()

    /**
     * A builder for [FileSystemProtectionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param replicationOverwriteProtection The status of the file system's replication overwrite
       * protection.
       * * `ENABLED` – The file system cannot be used as the destination file system in a
       * replication configuration. The file system is writeable. Replication overwrite protection is
       * `ENABLED` by default.
       * * `DISABLED` – The file system can be used as the destination file system in a replication
       * configuration. The file system is read-only and can only be modified by EFS replication.
       * * `REPLICATING` – The file system is being used as the destination file system in a
       * replication configuration. The file system is read-only and is only modified only by EFS
       * replication.
       *
       * If the replication configuration is deleted, the file system's replication overwrite
       * protection is re-enabled, the file system becomes writeable.
       */
      public fun replicationOverwriteProtection(replicationOverwriteProtection: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.efs.CfnFileSystem.FileSystemProtectionProperty.Builder =
          software.amazon.awscdk.services.efs.CfnFileSystem.FileSystemProtectionProperty.builder()

      /**
       * @param replicationOverwriteProtection The status of the file system's replication overwrite
       * protection.
       * * `ENABLED` – The file system cannot be used as the destination file system in a
       * replication configuration. The file system is writeable. Replication overwrite protection is
       * `ENABLED` by default.
       * * `DISABLED` – The file system can be used as the destination file system in a replication
       * configuration. The file system is read-only and can only be modified by EFS replication.
       * * `REPLICATING` – The file system is being used as the destination file system in a
       * replication configuration. The file system is read-only and is only modified only by EFS
       * replication.
       *
       * If the replication configuration is deleted, the file system's replication overwrite
       * protection is re-enabled, the file system becomes writeable.
       */
      override fun replicationOverwriteProtection(replicationOverwriteProtection: String) {
        cdkBuilder.replicationOverwriteProtection(replicationOverwriteProtection)
      }

      public fun build():
          software.amazon.awscdk.services.efs.CfnFileSystem.FileSystemProtectionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.efs.CfnFileSystem.FileSystemProtectionProperty,
    ) : CdkObject(cdkObject), FileSystemProtectionProperty {
      /**
       * The status of the file system's replication overwrite protection.
       *
       * * `ENABLED` – The file system cannot be used as the destination file system in a
       * replication configuration. The file system is writeable. Replication overwrite protection is
       * `ENABLED` by default.
       * * `DISABLED` – The file system can be used as the destination file system in a replication
       * configuration. The file system is read-only and can only be modified by EFS replication.
       * * `REPLICATING` – The file system is being used as the destination file system in a
       * replication configuration. The file system is read-only and is only modified only by EFS
       * replication.
       *
       * If the replication configuration is deleted, the file system's replication overwrite
       * protection is re-enabled, the file system becomes writeable.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-filesystem-filesystemprotection.html#cfn-efs-filesystem-filesystemprotection-replicationoverwriteprotection)
       */
      override fun replicationOverwriteProtection(): String? =
          unwrap(this).getReplicationOverwriteProtection()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FileSystemProtectionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.efs.CfnFileSystem.FileSystemProtectionProperty):
          FileSystemProtectionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          FileSystemProtectionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: FileSystemProtectionProperty):
          software.amazon.awscdk.services.efs.CfnFileSystem.FileSystemProtectionProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.efs.CfnFileSystem.FileSystemProtectionProperty
    }
  }

  /**
   * Describes a policy used by Lifecycle management that specifies when to transition files into
   * and out of the EFS storage classes.
   *
   * For more information, see [Managing file system
   * storage](https://docs.aws.amazon.com/efs/latest/ug/lifecycle-management-efs.html) .
   *
   *
   * * Each `LifecyclePolicy` object can have only a single transition. This means that in a request
   * body, `LifecyclePolicies` must be structured as an array of `LifecyclePolicy` objects, one object
   * for each transition, `TransitionToIA` , `TransitionToArchive` , `TransitionToPrimaryStorageClass`
   * .
   * * See the AWS::EFS::FileSystem examples for the correct `LifecyclePolicy` structure. Do not use
   * the syntax shown on this page.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.efs.*;
   * LifecyclePolicyProperty lifecyclePolicyProperty = LifecyclePolicyProperty.builder()
   * .transitionToArchive("transitionToArchive")
   * .transitionToIa("transitionToIa")
   * .transitionToPrimaryStorageClass("transitionToPrimaryStorageClass")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-filesystem-lifecyclepolicy.html)
   */
  public interface LifecyclePolicyProperty {
    /**
     * The number of days after files were last accessed in primary storage (the Standard storage
     * class) at which to move them to Archive storage.
     *
     * Metadata operations such as listing the contents of a directory don't count as file access
     * events.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-filesystem-lifecyclepolicy.html#cfn-efs-filesystem-lifecyclepolicy-transitiontoarchive)
     */
    public fun transitionToArchive(): String? = unwrap(this).getTransitionToArchive()

    /**
     * The number of days after files were last accessed in primary storage (the Standard storage
     * class) at which to move them to Infrequent Access (IA) storage.
     *
     * Metadata operations such as listing the contents of a directory don't count as file access
     * events.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-filesystem-lifecyclepolicy.html#cfn-efs-filesystem-lifecyclepolicy-transitiontoia)
     */
    public fun transitionToIa(): String? = unwrap(this).getTransitionToIa()

    /**
     * Whether to move files back to primary (Standard) storage after they are accessed in IA or
     * Archive storage.
     *
     * Metadata operations such as listing the contents of a directory don't count as file access
     * events.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-filesystem-lifecyclepolicy.html#cfn-efs-filesystem-lifecyclepolicy-transitiontoprimarystorageclass)
     */
    public fun transitionToPrimaryStorageClass(): String? =
        unwrap(this).getTransitionToPrimaryStorageClass()

    /**
     * A builder for [LifecyclePolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param transitionToArchive The number of days after files were last accessed in primary
       * storage (the Standard storage class) at which to move them to Archive storage.
       * Metadata operations such as listing the contents of a directory don't count as file access
       * events.
       */
      public fun transitionToArchive(transitionToArchive: String)

      /**
       * @param transitionToIa The number of days after files were last accessed in primary storage
       * (the Standard storage class) at which to move them to Infrequent Access (IA) storage.
       * Metadata operations such as listing the contents of a directory don't count as file access
       * events.
       */
      public fun transitionToIa(transitionToIa: String)

      /**
       * @param transitionToPrimaryStorageClass Whether to move files back to primary (Standard)
       * storage after they are accessed in IA or Archive storage.
       * Metadata operations such as listing the contents of a directory don't count as file access
       * events.
       */
      public fun transitionToPrimaryStorageClass(transitionToPrimaryStorageClass: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.efs.CfnFileSystem.LifecyclePolicyProperty.Builder =
          software.amazon.awscdk.services.efs.CfnFileSystem.LifecyclePolicyProperty.builder()

      /**
       * @param transitionToArchive The number of days after files were last accessed in primary
       * storage (the Standard storage class) at which to move them to Archive storage.
       * Metadata operations such as listing the contents of a directory don't count as file access
       * events.
       */
      override fun transitionToArchive(transitionToArchive: String) {
        cdkBuilder.transitionToArchive(transitionToArchive)
      }

      /**
       * @param transitionToIa The number of days after files were last accessed in primary storage
       * (the Standard storage class) at which to move them to Infrequent Access (IA) storage.
       * Metadata operations such as listing the contents of a directory don't count as file access
       * events.
       */
      override fun transitionToIa(transitionToIa: String) {
        cdkBuilder.transitionToIa(transitionToIa)
      }

      /**
       * @param transitionToPrimaryStorageClass Whether to move files back to primary (Standard)
       * storage after they are accessed in IA or Archive storage.
       * Metadata operations such as listing the contents of a directory don't count as file access
       * events.
       */
      override fun transitionToPrimaryStorageClass(transitionToPrimaryStorageClass: String) {
        cdkBuilder.transitionToPrimaryStorageClass(transitionToPrimaryStorageClass)
      }

      public fun build(): software.amazon.awscdk.services.efs.CfnFileSystem.LifecyclePolicyProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.efs.CfnFileSystem.LifecyclePolicyProperty,
    ) : CdkObject(cdkObject), LifecyclePolicyProperty {
      /**
       * The number of days after files were last accessed in primary storage (the Standard storage
       * class) at which to move them to Archive storage.
       *
       * Metadata operations such as listing the contents of a directory don't count as file access
       * events.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-filesystem-lifecyclepolicy.html#cfn-efs-filesystem-lifecyclepolicy-transitiontoarchive)
       */
      override fun transitionToArchive(): String? = unwrap(this).getTransitionToArchive()

      /**
       * The number of days after files were last accessed in primary storage (the Standard storage
       * class) at which to move them to Infrequent Access (IA) storage.
       *
       * Metadata operations such as listing the contents of a directory don't count as file access
       * events.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-filesystem-lifecyclepolicy.html#cfn-efs-filesystem-lifecyclepolicy-transitiontoia)
       */
      override fun transitionToIa(): String? = unwrap(this).getTransitionToIa()

      /**
       * Whether to move files back to primary (Standard) storage after they are accessed in IA or
       * Archive storage.
       *
       * Metadata operations such as listing the contents of a directory don't count as file access
       * events.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-filesystem-lifecyclepolicy.html#cfn-efs-filesystem-lifecyclepolicy-transitiontoprimarystorageclass)
       */
      override fun transitionToPrimaryStorageClass(): String? =
          unwrap(this).getTransitionToPrimaryStorageClass()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LifecyclePolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.efs.CfnFileSystem.LifecyclePolicyProperty):
          LifecyclePolicyProperty = CdkObjectWrappers.wrap(cdkObject) as? LifecyclePolicyProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: LifecyclePolicyProperty):
          software.amazon.awscdk.services.efs.CfnFileSystem.LifecyclePolicyProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.efs.CfnFileSystem.LifecyclePolicyProperty
    }
  }

  /**
   * Describes the replication configuration for a specific file system.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.efs.*;
   * ReplicationConfigurationProperty replicationConfigurationProperty =
   * ReplicationConfigurationProperty.builder()
   * .destinations(List.of(ReplicationDestinationProperty.builder()
   * .availabilityZoneName("availabilityZoneName")
   * .fileSystemId("fileSystemId")
   * .kmsKeyId("kmsKeyId")
   * .region("region")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-filesystem-replicationconfiguration.html)
   */
  public interface ReplicationConfigurationProperty {
    /**
     * An array of destination objects.
     *
     * Only one destination object is supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-filesystem-replicationconfiguration.html#cfn-efs-filesystem-replicationconfiguration-destinations)
     */
    public fun destinations(): Any? = unwrap(this).getDestinations()

    /**
     * A builder for [ReplicationConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param destinations An array of destination objects.
       * Only one destination object is supported.
       */
      public fun destinations(destinations: IResolvable)

      /**
       * @param destinations An array of destination objects.
       * Only one destination object is supported.
       */
      public fun destinations(destinations: List<Any>)

      /**
       * @param destinations An array of destination objects.
       * Only one destination object is supported.
       */
      public fun destinations(vararg destinations: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.efs.CfnFileSystem.ReplicationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.efs.CfnFileSystem.ReplicationConfigurationProperty.builder()

      /**
       * @param destinations An array of destination objects.
       * Only one destination object is supported.
       */
      override fun destinations(destinations: IResolvable) {
        cdkBuilder.destinations(destinations.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param destinations An array of destination objects.
       * Only one destination object is supported.
       */
      override fun destinations(destinations: List<Any>) {
        cdkBuilder.destinations(destinations.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param destinations An array of destination objects.
       * Only one destination object is supported.
       */
      override fun destinations(vararg destinations: Any): Unit =
          destinations(destinations.toList())

      public fun build():
          software.amazon.awscdk.services.efs.CfnFileSystem.ReplicationConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.efs.CfnFileSystem.ReplicationConfigurationProperty,
    ) : CdkObject(cdkObject), ReplicationConfigurationProperty {
      /**
       * An array of destination objects.
       *
       * Only one destination object is supported.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-filesystem-replicationconfiguration.html#cfn-efs-filesystem-replicationconfiguration-destinations)
       */
      override fun destinations(): Any? = unwrap(this).getDestinations()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ReplicationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.efs.CfnFileSystem.ReplicationConfigurationProperty):
          ReplicationConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ReplicationConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReplicationConfigurationProperty):
          software.amazon.awscdk.services.efs.CfnFileSystem.ReplicationConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.efs.CfnFileSystem.ReplicationConfigurationProperty
    }
  }

  /**
   * Describes the destination file system in the replication configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.efs.*;
   * ReplicationDestinationProperty replicationDestinationProperty =
   * ReplicationDestinationProperty.builder()
   * .availabilityZoneName("availabilityZoneName")
   * .fileSystemId("fileSystemId")
   * .kmsKeyId("kmsKeyId")
   * .region("region")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-filesystem-replicationdestination.html)
   */
  public interface ReplicationDestinationProperty {
    /**
     * For One Zone file systems, the replication configuration must specify the Availability Zone
     * in which the destination file system is located.
     *
     * Use the format `us-east-1a` to specify the Availability Zone. For more information about One
     * Zone file systems, see [EFS file system
     * types](https://docs.aws.amazon.com/efs/latest/ug/storage-classes.html) in the *Amazon EFS User
     * Guide* .
     *
     *
     * One Zone file system type is not available in all Availability Zones in AWS Regions where
     * Amazon EFS is available.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-filesystem-replicationdestination.html#cfn-efs-filesystem-replicationdestination-availabilityzonename)
     */
    public fun availabilityZoneName(): String? = unwrap(this).getAvailabilityZoneName()

    /**
     * The ID of the destination Amazon EFS file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-filesystem-replicationdestination.html#cfn-efs-filesystem-replicationdestination-filesystemid)
     */
    public fun fileSystemId(): String? = unwrap(this).getFileSystemId()

    /**
     * The ID of an AWS KMS key used to protect the encrypted file system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-filesystem-replicationdestination.html#cfn-efs-filesystem-replicationdestination-kmskeyid)
     */
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * The AWS Region in which the destination file system is located.
     *
     *
     * For One Zone file systems, the replication configuration must specify the AWS Region in which
     * the destination file system is located.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-filesystem-replicationdestination.html#cfn-efs-filesystem-replicationdestination-region)
     */
    public fun region(): String? = unwrap(this).getRegion()

    /**
     * A builder for [ReplicationDestinationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param availabilityZoneName For One Zone file systems, the replication configuration must
       * specify the Availability Zone in which the destination file system is located.
       * Use the format `us-east-1a` to specify the Availability Zone. For more information about
       * One Zone file systems, see [EFS file system
       * types](https://docs.aws.amazon.com/efs/latest/ug/storage-classes.html) in the *Amazon EFS User
       * Guide* .
       *
       *
       * One Zone file system type is not available in all Availability Zones in AWS Regions where
       * Amazon EFS is available.
       */
      public fun availabilityZoneName(availabilityZoneName: String)

      /**
       * @param fileSystemId The ID of the destination Amazon EFS file system.
       */
      public fun fileSystemId(fileSystemId: String)

      /**
       * @param kmsKeyId The ID of an AWS KMS key used to protect the encrypted file system.
       */
      public fun kmsKeyId(kmsKeyId: String)

      /**
       * @param region The AWS Region in which the destination file system is located.
       *
       * For One Zone file systems, the replication configuration must specify the AWS Region in
       * which the destination file system is located.
       */
      public fun region(region: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.efs.CfnFileSystem.ReplicationDestinationProperty.Builder =
          software.amazon.awscdk.services.efs.CfnFileSystem.ReplicationDestinationProperty.builder()

      /**
       * @param availabilityZoneName For One Zone file systems, the replication configuration must
       * specify the Availability Zone in which the destination file system is located.
       * Use the format `us-east-1a` to specify the Availability Zone. For more information about
       * One Zone file systems, see [EFS file system
       * types](https://docs.aws.amazon.com/efs/latest/ug/storage-classes.html) in the *Amazon EFS User
       * Guide* .
       *
       *
       * One Zone file system type is not available in all Availability Zones in AWS Regions where
       * Amazon EFS is available.
       */
      override fun availabilityZoneName(availabilityZoneName: String) {
        cdkBuilder.availabilityZoneName(availabilityZoneName)
      }

      /**
       * @param fileSystemId The ID of the destination Amazon EFS file system.
       */
      override fun fileSystemId(fileSystemId: String) {
        cdkBuilder.fileSystemId(fileSystemId)
      }

      /**
       * @param kmsKeyId The ID of an AWS KMS key used to protect the encrypted file system.
       */
      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      /**
       * @param region The AWS Region in which the destination file system is located.
       *
       * For One Zone file systems, the replication configuration must specify the AWS Region in
       * which the destination file system is located.
       */
      override fun region(region: String) {
        cdkBuilder.region(region)
      }

      public fun build():
          software.amazon.awscdk.services.efs.CfnFileSystem.ReplicationDestinationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.efs.CfnFileSystem.ReplicationDestinationProperty,
    ) : CdkObject(cdkObject), ReplicationDestinationProperty {
      /**
       * For One Zone file systems, the replication configuration must specify the Availability Zone
       * in which the destination file system is located.
       *
       * Use the format `us-east-1a` to specify the Availability Zone. For more information about
       * One Zone file systems, see [EFS file system
       * types](https://docs.aws.amazon.com/efs/latest/ug/storage-classes.html) in the *Amazon EFS User
       * Guide* .
       *
       *
       * One Zone file system type is not available in all Availability Zones in AWS Regions where
       * Amazon EFS is available.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-filesystem-replicationdestination.html#cfn-efs-filesystem-replicationdestination-availabilityzonename)
       */
      override fun availabilityZoneName(): String? = unwrap(this).getAvailabilityZoneName()

      /**
       * The ID of the destination Amazon EFS file system.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-filesystem-replicationdestination.html#cfn-efs-filesystem-replicationdestination-filesystemid)
       */
      override fun fileSystemId(): String? = unwrap(this).getFileSystemId()

      /**
       * The ID of an AWS KMS key used to protect the encrypted file system.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-filesystem-replicationdestination.html#cfn-efs-filesystem-replicationdestination-kmskeyid)
       */
      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

      /**
       * The AWS Region in which the destination file system is located.
       *
       *
       * For One Zone file systems, the replication configuration must specify the AWS Region in
       * which the destination file system is located.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-filesystem-replicationdestination.html#cfn-efs-filesystem-replicationdestination-region)
       */
      override fun region(): String? = unwrap(this).getRegion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ReplicationDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.efs.CfnFileSystem.ReplicationDestinationProperty):
          ReplicationDestinationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ReplicationDestinationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReplicationDestinationProperty):
          software.amazon.awscdk.services.efs.CfnFileSystem.ReplicationDestinationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.efs.CfnFileSystem.ReplicationDestinationProperty
    }
  }
}
