@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.docdbelastic

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a new Amazon DocumentDB elastic cluster and returns its cluster structure.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.docdbelastic.*;
 * CfnCluster cfnCluster = CfnCluster.Builder.create(this, "MyCfnCluster")
 * .adminUserName("adminUserName")
 * .authType("authType")
 * .clusterName("clusterName")
 * .shardCapacity(123)
 * .shardCount(123)
 * // the properties below are optional
 * .adminUserPassword("adminUserPassword")
 * .backupRetentionPeriod(123)
 * .kmsKeyId("kmsKeyId")
 * .preferredBackupWindow("preferredBackupWindow")
 * .preferredMaintenanceWindow("preferredMaintenanceWindow")
 * .shardInstanceCount(123)
 * .subnetIds(List.of("subnetIds"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .vpcSecurityGroupIds(List.of("vpcSecurityGroupIds"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html)
 */
public open class CfnCluster(
  cdkObject: software.amazon.awscdk.services.docdbelastic.CfnCluster,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnClusterProps,
  ) :
      this(software.amazon.awscdk.services.docdbelastic.CfnCluster(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnClusterProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnClusterProps.Builder.() -> Unit,
  ) : this(scope, id, CfnClusterProps(props)
  )

  /**
   * The name of the Amazon DocumentDB elastic clusters administrator.
   */
  public open fun adminUserName(): String = unwrap(this).getAdminUserName()

  /**
   * The name of the Amazon DocumentDB elastic clusters administrator.
   */
  public open fun adminUserName(`value`: String) {
    unwrap(this).setAdminUserName(`value`)
  }

  /**
   * The password for the Elastic DocumentDB cluster administrator and can contain any printable
   * ASCII characters.
   */
  public open fun adminUserPassword(): String? = unwrap(this).getAdminUserPassword()

  /**
   * The password for the Elastic DocumentDB cluster administrator and can contain any printable
   * ASCII characters.
   */
  public open fun adminUserPassword(`value`: String) {
    unwrap(this).setAdminUserPassword(`value`)
  }

  /**
   *
   */
  public open fun attrClusterArn(): String = unwrap(this).getAttrClusterArn()

  /**
   * The URL used to connect to the elastic cluster.
   */
  public open fun attrClusterEndpoint(): String = unwrap(this).getAttrClusterEndpoint()

  /**
   * The authentication type used to determine where to fetch the password used for accessing the
   * elastic cluster.
   */
  public open fun authType(): String = unwrap(this).getAuthType()

  /**
   * The authentication type used to determine where to fetch the password used for accessing the
   * elastic cluster.
   */
  public open fun authType(`value`: String) {
    unwrap(this).setAuthType(`value`)
  }

  /**
   * The number of days for which automatic snapshots are retained.
   */
  public open fun backupRetentionPeriod(): Number? = unwrap(this).getBackupRetentionPeriod()

  /**
   * The number of days for which automatic snapshots are retained.
   */
  public open fun backupRetentionPeriod(`value`: Number) {
    unwrap(this).setBackupRetentionPeriod(`value`)
  }

  /**
   * The name of the new elastic cluster.
   *
   * This parameter is stored as a lowercase string.
   */
  public open fun clusterName(): String = unwrap(this).getClusterName()

  /**
   * The name of the new elastic cluster.
   *
   * This parameter is stored as a lowercase string.
   */
  public open fun clusterName(`value`: String) {
    unwrap(this).setClusterName(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The KMS key identifier to use to encrypt the new elastic cluster.
   */
  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * The KMS key identifier to use to encrypt the new elastic cluster.
   */
  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  /**
   * The daily time range during which automated backups are created if automated backups are
   * enabled, as determined by `backupRetentionPeriod` .
   */
  public open fun preferredBackupWindow(): String? = unwrap(this).getPreferredBackupWindow()

  /**
   * The daily time range during which automated backups are created if automated backups are
   * enabled, as determined by `backupRetentionPeriod` .
   */
  public open fun preferredBackupWindow(`value`: String) {
    unwrap(this).setPreferredBackupWindow(`value`)
  }

  /**
   * The weekly time range during which system maintenance can occur, in Universal Coordinated Time
   * (UTC).
   */
  public open fun preferredMaintenanceWindow(): String? =
      unwrap(this).getPreferredMaintenanceWindow()

  /**
   * The weekly time range during which system maintenance can occur, in Universal Coordinated Time
   * (UTC).
   */
  public open fun preferredMaintenanceWindow(`value`: String) {
    unwrap(this).setPreferredMaintenanceWindow(`value`)
  }

  /**
   * The number of vCPUs assigned to each elastic cluster shard.
   */
  public open fun shardCapacity(): Number = unwrap(this).getShardCapacity()

  /**
   * The number of vCPUs assigned to each elastic cluster shard.
   */
  public open fun shardCapacity(`value`: Number) {
    unwrap(this).setShardCapacity(`value`)
  }

  /**
   * The number of shards assigned to the elastic cluster.
   */
  public open fun shardCount(): Number = unwrap(this).getShardCount()

  /**
   * The number of shards assigned to the elastic cluster.
   */
  public open fun shardCount(`value`: Number) {
    unwrap(this).setShardCount(`value`)
  }

  /**
   * The number of replica instances applying to all shards in the cluster.
   */
  public open fun shardInstanceCount(): Number? = unwrap(this).getShardInstanceCount()

  /**
   * The number of replica instances applying to all shards in the cluster.
   */
  public open fun shardInstanceCount(`value`: Number) {
    unwrap(this).setShardInstanceCount(`value`)
  }

  /**
   * The Amazon EC2 subnet IDs for the new elastic cluster.
   */
  public open fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

  /**
   * The Amazon EC2 subnet IDs for the new elastic cluster.
   */
  public open fun subnetIds(`value`: List<String>) {
    unwrap(this).setSubnetIds(`value`)
  }

  /**
   * The Amazon EC2 subnet IDs for the new elastic cluster.
   */
  public open fun subnetIds(vararg `value`: String): Unit = subnetIds(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags to be assigned to the new elastic cluster.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags to be assigned to the new elastic cluster.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags to be assigned to the new elastic cluster.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A list of EC2 VPC security groups to associate with the new elastic cluster.
   */
  public open fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds() ?:
      emptyList()

  /**
   * A list of EC2 VPC security groups to associate with the new elastic cluster.
   */
  public open fun vpcSecurityGroupIds(`value`: List<String>) {
    unwrap(this).setVpcSecurityGroupIds(`value`)
  }

  /**
   * A list of EC2 VPC security groups to associate with the new elastic cluster.
   */
  public open fun vpcSecurityGroupIds(vararg `value`: String): Unit =
      vpcSecurityGroupIds(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.docdbelastic.CfnCluster].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the Amazon DocumentDB elastic clusters administrator.
     *
     * *Constraints* :
     *
     * * Must be from 1 to 63 letters or numbers.
     * * The first character must be a letter.
     * * Cannot be a reserved word.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html#cfn-docdbelastic-cluster-adminusername)
     * @param adminUserName The name of the Amazon DocumentDB elastic clusters administrator. 
     */
    public fun adminUserName(adminUserName: String)

    /**
     * The password for the Elastic DocumentDB cluster administrator and can contain any printable
     * ASCII characters.
     *
     * *Constraints* :
     *
     * * Must contain from 8 to 100 characters.
     * * Cannot contain a forward slash (/), double quote ("), or the "at" symbol (&#64;).
     * * A valid `AdminUserName` entry is also required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html#cfn-docdbelastic-cluster-adminuserpassword)
     * @param adminUserPassword The password for the Elastic DocumentDB cluster administrator and
     * can contain any printable ASCII characters. 
     */
    public fun adminUserPassword(adminUserPassword: String)

    /**
     * The authentication type used to determine where to fetch the password used for accessing the
     * elastic cluster.
     *
     * Valid types are `PLAIN_TEXT` or `SECRET_ARN` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html#cfn-docdbelastic-cluster-authtype)
     * @param authType The authentication type used to determine where to fetch the password used
     * for accessing the elastic cluster. 
     */
    public fun authType(authType: String)

    /**
     * The number of days for which automatic snapshots are retained.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html#cfn-docdbelastic-cluster-backupretentionperiod)
     * @param backupRetentionPeriod The number of days for which automatic snapshots are retained. 
     */
    public fun backupRetentionPeriod(backupRetentionPeriod: Number)

    /**
     * The name of the new elastic cluster. This parameter is stored as a lowercase string.
     *
     * *Constraints* :
     *
     * * Must contain from 1 to 63 letters, numbers, or hyphens.
     * * The first character must be a letter.
     * * Cannot end with a hyphen or contain two consecutive hyphens.
     *
     * *Example* : `my-cluster`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html#cfn-docdbelastic-cluster-clustername)
     * @param clusterName The name of the new elastic cluster. This parameter is stored as a
     * lowercase string. 
     */
    public fun clusterName(clusterName: String)

    /**
     * The KMS key identifier to use to encrypt the new elastic cluster.
     *
     * The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you
     * are creating a cluster using the same Amazon account that owns this KMS encryption key, you can
     * use the KMS key alias instead of the ARN as the KMS encryption key.
     *
     * If an encryption key is not specified, Amazon DocumentDB uses the default encryption key that
     * KMS creates for your account. Your account has a different default encryption key for each
     * Amazon Region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html#cfn-docdbelastic-cluster-kmskeyid)
     * @param kmsKeyId The KMS key identifier to use to encrypt the new elastic cluster. 
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * The daily time range during which automated backups are created if automated backups are
     * enabled, as determined by `backupRetentionPeriod` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html#cfn-docdbelastic-cluster-preferredbackupwindow)
     * @param preferredBackupWindow The daily time range during which automated backups are created
     * if automated backups are enabled, as determined by `backupRetentionPeriod` . 
     */
    public fun preferredBackupWindow(preferredBackupWindow: String)

    /**
     * The weekly time range during which system maintenance can occur, in Universal Coordinated
     * Time (UTC).
     *
     * *Format* : `ddd:hh24:mi-ddd:hh24:mi`
     *
     * *Default* : a 30-minute window selected at random from an 8-hour block of time for each AWS
     * Region , occurring on a random day of the week.
     *
     * *Valid days* : Mon, Tue, Wed, Thu, Fri, Sat, Sun
     *
     * *Constraints* : Minimum 30-minute window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html#cfn-docdbelastic-cluster-preferredmaintenancewindow)
     * @param preferredMaintenanceWindow The weekly time range during which system maintenance can
     * occur, in Universal Coordinated Time (UTC). 
     */
    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

    /**
     * The number of vCPUs assigned to each elastic cluster shard.
     *
     * Maximum is 64. Allowed values are 2, 4, 8, 16, 32, 64.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html#cfn-docdbelastic-cluster-shardcapacity)
     * @param shardCapacity The number of vCPUs assigned to each elastic cluster shard. 
     */
    public fun shardCapacity(shardCapacity: Number)

    /**
     * The number of shards assigned to the elastic cluster.
     *
     * Maximum is 32.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html#cfn-docdbelastic-cluster-shardcount)
     * @param shardCount The number of shards assigned to the elastic cluster. 
     */
    public fun shardCount(shardCount: Number)

    /**
     * The number of replica instances applying to all shards in the cluster.
     *
     * A `shardInstanceCount` value of 1 means there is one writer instance, and any additional
     * instances are replicas that can be used for reads and to improve availability.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html#cfn-docdbelastic-cluster-shardinstancecount)
     * @param shardInstanceCount The number of replica instances applying to all shards in the
     * cluster. 
     */
    public fun shardInstanceCount(shardInstanceCount: Number)

    /**
     * The Amazon EC2 subnet IDs for the new elastic cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html#cfn-docdbelastic-cluster-subnetids)
     * @param subnetIds The Amazon EC2 subnet IDs for the new elastic cluster. 
     */
    public fun subnetIds(subnetIds: List<String>)

    /**
     * The Amazon EC2 subnet IDs for the new elastic cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html#cfn-docdbelastic-cluster-subnetids)
     * @param subnetIds The Amazon EC2 subnet IDs for the new elastic cluster. 
     */
    public fun subnetIds(vararg subnetIds: String)

    /**
     * The tags to be assigned to the new elastic cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html#cfn-docdbelastic-cluster-tags)
     * @param tags The tags to be assigned to the new elastic cluster. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags to be assigned to the new elastic cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html#cfn-docdbelastic-cluster-tags)
     * @param tags The tags to be assigned to the new elastic cluster. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * A list of EC2 VPC security groups to associate with the new elastic cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html#cfn-docdbelastic-cluster-vpcsecuritygroupids)
     * @param vpcSecurityGroupIds A list of EC2 VPC security groups to associate with the new
     * elastic cluster. 
     */
    public fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>)

    /**
     * A list of EC2 VPC security groups to associate with the new elastic cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html#cfn-docdbelastic-cluster-vpcsecuritygroupids)
     * @param vpcSecurityGroupIds A list of EC2 VPC security groups to associate with the new
     * elastic cluster. 
     */
    public fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.docdbelastic.CfnCluster.Builder =
        software.amazon.awscdk.services.docdbelastic.CfnCluster.Builder.create(scope, id)

    /**
     * The name of the Amazon DocumentDB elastic clusters administrator.
     *
     * *Constraints* :
     *
     * * Must be from 1 to 63 letters or numbers.
     * * The first character must be a letter.
     * * Cannot be a reserved word.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html#cfn-docdbelastic-cluster-adminusername)
     * @param adminUserName The name of the Amazon DocumentDB elastic clusters administrator. 
     */
    override fun adminUserName(adminUserName: String) {
      cdkBuilder.adminUserName(adminUserName)
    }

    /**
     * The password for the Elastic DocumentDB cluster administrator and can contain any printable
     * ASCII characters.
     *
     * *Constraints* :
     *
     * * Must contain from 8 to 100 characters.
     * * Cannot contain a forward slash (/), double quote ("), or the "at" symbol (&#64;).
     * * A valid `AdminUserName` entry is also required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html#cfn-docdbelastic-cluster-adminuserpassword)
     * @param adminUserPassword The password for the Elastic DocumentDB cluster administrator and
     * can contain any printable ASCII characters. 
     */
    override fun adminUserPassword(adminUserPassword: String) {
      cdkBuilder.adminUserPassword(adminUserPassword)
    }

    /**
     * The authentication type used to determine where to fetch the password used for accessing the
     * elastic cluster.
     *
     * Valid types are `PLAIN_TEXT` or `SECRET_ARN` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html#cfn-docdbelastic-cluster-authtype)
     * @param authType The authentication type used to determine where to fetch the password used
     * for accessing the elastic cluster. 
     */
    override fun authType(authType: String) {
      cdkBuilder.authType(authType)
    }

    /**
     * The number of days for which automatic snapshots are retained.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html#cfn-docdbelastic-cluster-backupretentionperiod)
     * @param backupRetentionPeriod The number of days for which automatic snapshots are retained. 
     */
    override fun backupRetentionPeriod(backupRetentionPeriod: Number) {
      cdkBuilder.backupRetentionPeriod(backupRetentionPeriod)
    }

    /**
     * The name of the new elastic cluster. This parameter is stored as a lowercase string.
     *
     * *Constraints* :
     *
     * * Must contain from 1 to 63 letters, numbers, or hyphens.
     * * The first character must be a letter.
     * * Cannot end with a hyphen or contain two consecutive hyphens.
     *
     * *Example* : `my-cluster`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html#cfn-docdbelastic-cluster-clustername)
     * @param clusterName The name of the new elastic cluster. This parameter is stored as a
     * lowercase string. 
     */
    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    /**
     * The KMS key identifier to use to encrypt the new elastic cluster.
     *
     * The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you
     * are creating a cluster using the same Amazon account that owns this KMS encryption key, you can
     * use the KMS key alias instead of the ARN as the KMS encryption key.
     *
     * If an encryption key is not specified, Amazon DocumentDB uses the default encryption key that
     * KMS creates for your account. Your account has a different default encryption key for each
     * Amazon Region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html#cfn-docdbelastic-cluster-kmskeyid)
     * @param kmsKeyId The KMS key identifier to use to encrypt the new elastic cluster. 
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * The daily time range during which automated backups are created if automated backups are
     * enabled, as determined by `backupRetentionPeriod` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html#cfn-docdbelastic-cluster-preferredbackupwindow)
     * @param preferredBackupWindow The daily time range during which automated backups are created
     * if automated backups are enabled, as determined by `backupRetentionPeriod` . 
     */
    override fun preferredBackupWindow(preferredBackupWindow: String) {
      cdkBuilder.preferredBackupWindow(preferredBackupWindow)
    }

    /**
     * The weekly time range during which system maintenance can occur, in Universal Coordinated
     * Time (UTC).
     *
     * *Format* : `ddd:hh24:mi-ddd:hh24:mi`
     *
     * *Default* : a 30-minute window selected at random from an 8-hour block of time for each AWS
     * Region , occurring on a random day of the week.
     *
     * *Valid days* : Mon, Tue, Wed, Thu, Fri, Sat, Sun
     *
     * *Constraints* : Minimum 30-minute window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html#cfn-docdbelastic-cluster-preferredmaintenancewindow)
     * @param preferredMaintenanceWindow The weekly time range during which system maintenance can
     * occur, in Universal Coordinated Time (UTC). 
     */
    override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    /**
     * The number of vCPUs assigned to each elastic cluster shard.
     *
     * Maximum is 64. Allowed values are 2, 4, 8, 16, 32, 64.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html#cfn-docdbelastic-cluster-shardcapacity)
     * @param shardCapacity The number of vCPUs assigned to each elastic cluster shard. 
     */
    override fun shardCapacity(shardCapacity: Number) {
      cdkBuilder.shardCapacity(shardCapacity)
    }

    /**
     * The number of shards assigned to the elastic cluster.
     *
     * Maximum is 32.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html#cfn-docdbelastic-cluster-shardcount)
     * @param shardCount The number of shards assigned to the elastic cluster. 
     */
    override fun shardCount(shardCount: Number) {
      cdkBuilder.shardCount(shardCount)
    }

    /**
     * The number of replica instances applying to all shards in the cluster.
     *
     * A `shardInstanceCount` value of 1 means there is one writer instance, and any additional
     * instances are replicas that can be used for reads and to improve availability.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html#cfn-docdbelastic-cluster-shardinstancecount)
     * @param shardInstanceCount The number of replica instances applying to all shards in the
     * cluster. 
     */
    override fun shardInstanceCount(shardInstanceCount: Number) {
      cdkBuilder.shardInstanceCount(shardInstanceCount)
    }

    /**
     * The Amazon EC2 subnet IDs for the new elastic cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html#cfn-docdbelastic-cluster-subnetids)
     * @param subnetIds The Amazon EC2 subnet IDs for the new elastic cluster. 
     */
    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    /**
     * The Amazon EC2 subnet IDs for the new elastic cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html#cfn-docdbelastic-cluster-subnetids)
     * @param subnetIds The Amazon EC2 subnet IDs for the new elastic cluster. 
     */
    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    /**
     * The tags to be assigned to the new elastic cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html#cfn-docdbelastic-cluster-tags)
     * @param tags The tags to be assigned to the new elastic cluster. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags to be assigned to the new elastic cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html#cfn-docdbelastic-cluster-tags)
     * @param tags The tags to be assigned to the new elastic cluster. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * A list of EC2 VPC security groups to associate with the new elastic cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html#cfn-docdbelastic-cluster-vpcsecuritygroupids)
     * @param vpcSecurityGroupIds A list of EC2 VPC security groups to associate with the new
     * elastic cluster. 
     */
    override fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>) {
      cdkBuilder.vpcSecurityGroupIds(vpcSecurityGroupIds)
    }

    /**
     * A list of EC2 VPC security groups to associate with the new elastic cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html#cfn-docdbelastic-cluster-vpcsecuritygroupids)
     * @param vpcSecurityGroupIds A list of EC2 VPC security groups to associate with the new
     * elastic cluster. 
     */
    override fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String): Unit =
        vpcSecurityGroupIds(vpcSecurityGroupIds.toList())

    public fun build(): software.amazon.awscdk.services.docdbelastic.CfnCluster = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.docdbelastic.CfnCluster.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCluster {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCluster(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.docdbelastic.CfnCluster):
        CfnCluster = CfnCluster(cdkObject)

    internal fun unwrap(wrapped: CfnCluster):
        software.amazon.awscdk.services.docdbelastic.CfnCluster = wrapped.cdkObject as
        software.amazon.awscdk.services.docdbelastic.CfnCluster
  }
}
