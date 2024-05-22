@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.docdbelastic

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnCluster`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.docdbelastic.*;
 * CfnClusterProps cfnClusterProps = CfnClusterProps.builder()
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
public interface CfnClusterProps {
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
   */
  public fun adminUserName(): String

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
   */
  public fun adminUserPassword(): String? = unwrap(this).getAdminUserPassword()

  /**
   * The authentication type used to determine where to fetch the password used for accessing the
   * elastic cluster.
   *
   * Valid types are `PLAIN_TEXT` or `SECRET_ARN` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html#cfn-docdbelastic-cluster-authtype)
   */
  public fun authType(): String

  /**
   * The number of days for which automatic snapshots are retained.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html#cfn-docdbelastic-cluster-backupretentionperiod)
   */
  public fun backupRetentionPeriod(): Number? = unwrap(this).getBackupRetentionPeriod()

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
   */
  public fun clusterName(): String

  /**
   * The KMS key identifier to use to encrypt the new elastic cluster.
   *
   * The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are
   * creating a cluster using the same Amazon account that owns this KMS encryption key, you can use
   * the KMS key alias instead of the ARN as the KMS encryption key.
   *
   * If an encryption key is not specified, Amazon DocumentDB uses the default encryption key that
   * KMS creates for your account. Your account has a different default encryption key for each Amazon
   * Region.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html#cfn-docdbelastic-cluster-kmskeyid)
   */
  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * The daily time range during which automated backups are created if automated backups are
   * enabled, as determined by `backupRetentionPeriod` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html#cfn-docdbelastic-cluster-preferredbackupwindow)
   */
  public fun preferredBackupWindow(): String? = unwrap(this).getPreferredBackupWindow()

  /**
   * The weekly time range during which system maintenance can occur, in Universal Coordinated Time
   * (UTC).
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
   */
  public fun preferredMaintenanceWindow(): String? = unwrap(this).getPreferredMaintenanceWindow()

  /**
   * The number of vCPUs assigned to each elastic cluster shard.
   *
   * Maximum is 64. Allowed values are 2, 4, 8, 16, 32, 64.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html#cfn-docdbelastic-cluster-shardcapacity)
   */
  public fun shardCapacity(): Number

  /**
   * The number of shards assigned to the elastic cluster.
   *
   * Maximum is 32.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html#cfn-docdbelastic-cluster-shardcount)
   */
  public fun shardCount(): Number

  /**
   * The number of replica instances applying to all shards in the cluster.
   *
   * A `shardInstanceCount` value of 1 means there is one writer instance, and any additional
   * instances are replicas that can be used for reads and to improve availability.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html#cfn-docdbelastic-cluster-shardinstancecount)
   */
  public fun shardInstanceCount(): Number? = unwrap(this).getShardInstanceCount()

  /**
   * The Amazon EC2 subnet IDs for the new elastic cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html#cfn-docdbelastic-cluster-subnetids)
   */
  public fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

  /**
   * The tags to be assigned to the new elastic cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html#cfn-docdbelastic-cluster-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A list of EC2 VPC security groups to associate with the new elastic cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html#cfn-docdbelastic-cluster-vpcsecuritygroupids)
   */
  public fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds() ?:
      emptyList()

  /**
   * A builder for [CfnClusterProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param adminUserName The name of the Amazon DocumentDB elastic clusters administrator. 
     * *Constraints* :
     *
     * * Must be from 1 to 63 letters or numbers.
     * * The first character must be a letter.
     * * Cannot be a reserved word.
     */
    public fun adminUserName(adminUserName: String)

    /**
     * @param adminUserPassword The password for the Elastic DocumentDB cluster administrator and
     * can contain any printable ASCII characters.
     * *Constraints* :
     *
     * * Must contain from 8 to 100 characters.
     * * Cannot contain a forward slash (/), double quote ("), or the "at" symbol (&#64;).
     * * A valid `AdminUserName` entry is also required.
     */
    public fun adminUserPassword(adminUserPassword: String)

    /**
     * @param authType The authentication type used to determine where to fetch the password used
     * for accessing the elastic cluster. 
     * Valid types are `PLAIN_TEXT` or `SECRET_ARN` .
     */
    public fun authType(authType: String)

    /**
     * @param backupRetentionPeriod The number of days for which automatic snapshots are retained.
     */
    public fun backupRetentionPeriod(backupRetentionPeriod: Number)

    /**
     * @param clusterName The name of the new elastic cluster. This parameter is stored as a
     * lowercase string. 
     * *Constraints* :
     *
     * * Must contain from 1 to 63 letters, numbers, or hyphens.
     * * The first character must be a letter.
     * * Cannot end with a hyphen or contain two consecutive hyphens.
     *
     * *Example* : `my-cluster`
     */
    public fun clusterName(clusterName: String)

    /**
     * @param kmsKeyId The KMS key identifier to use to encrypt the new elastic cluster.
     * The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you
     * are creating a cluster using the same Amazon account that owns this KMS encryption key, you can
     * use the KMS key alias instead of the ARN as the KMS encryption key.
     *
     * If an encryption key is not specified, Amazon DocumentDB uses the default encryption key that
     * KMS creates for your account. Your account has a different default encryption key for each
     * Amazon Region.
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * @param preferredBackupWindow The daily time range during which automated backups are created
     * if automated backups are enabled, as determined by `backupRetentionPeriod` .
     */
    public fun preferredBackupWindow(preferredBackupWindow: String)

    /**
     * @param preferredMaintenanceWindow The weekly time range during which system maintenance can
     * occur, in Universal Coordinated Time (UTC).
     * *Format* : `ddd:hh24:mi-ddd:hh24:mi`
     *
     * *Default* : a 30-minute window selected at random from an 8-hour block of time for each AWS
     * Region , occurring on a random day of the week.
     *
     * *Valid days* : Mon, Tue, Wed, Thu, Fri, Sat, Sun
     *
     * *Constraints* : Minimum 30-minute window.
     */
    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

    /**
     * @param shardCapacity The number of vCPUs assigned to each elastic cluster shard. 
     * Maximum is 64. Allowed values are 2, 4, 8, 16, 32, 64.
     */
    public fun shardCapacity(shardCapacity: Number)

    /**
     * @param shardCount The number of shards assigned to the elastic cluster. 
     * Maximum is 32.
     */
    public fun shardCount(shardCount: Number)

    /**
     * @param shardInstanceCount The number of replica instances applying to all shards in the
     * cluster.
     * A `shardInstanceCount` value of 1 means there is one writer instance, and any additional
     * instances are replicas that can be used for reads and to improve availability.
     */
    public fun shardInstanceCount(shardInstanceCount: Number)

    /**
     * @param subnetIds The Amazon EC2 subnet IDs for the new elastic cluster.
     */
    public fun subnetIds(subnetIds: List<String>)

    /**
     * @param subnetIds The Amazon EC2 subnet IDs for the new elastic cluster.
     */
    public fun subnetIds(vararg subnetIds: String)

    /**
     * @param tags The tags to be assigned to the new elastic cluster.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags to be assigned to the new elastic cluster.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param vpcSecurityGroupIds A list of EC2 VPC security groups to associate with the new
     * elastic cluster.
     */
    public fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>)

    /**
     * @param vpcSecurityGroupIds A list of EC2 VPC security groups to associate with the new
     * elastic cluster.
     */
    public fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.docdbelastic.CfnClusterProps.Builder =
        software.amazon.awscdk.services.docdbelastic.CfnClusterProps.builder()

    /**
     * @param adminUserName The name of the Amazon DocumentDB elastic clusters administrator. 
     * *Constraints* :
     *
     * * Must be from 1 to 63 letters or numbers.
     * * The first character must be a letter.
     * * Cannot be a reserved word.
     */
    override fun adminUserName(adminUserName: String) {
      cdkBuilder.adminUserName(adminUserName)
    }

    /**
     * @param adminUserPassword The password for the Elastic DocumentDB cluster administrator and
     * can contain any printable ASCII characters.
     * *Constraints* :
     *
     * * Must contain from 8 to 100 characters.
     * * Cannot contain a forward slash (/), double quote ("), or the "at" symbol (&#64;).
     * * A valid `AdminUserName` entry is also required.
     */
    override fun adminUserPassword(adminUserPassword: String) {
      cdkBuilder.adminUserPassword(adminUserPassword)
    }

    /**
     * @param authType The authentication type used to determine where to fetch the password used
     * for accessing the elastic cluster. 
     * Valid types are `PLAIN_TEXT` or `SECRET_ARN` .
     */
    override fun authType(authType: String) {
      cdkBuilder.authType(authType)
    }

    /**
     * @param backupRetentionPeriod The number of days for which automatic snapshots are retained.
     */
    override fun backupRetentionPeriod(backupRetentionPeriod: Number) {
      cdkBuilder.backupRetentionPeriod(backupRetentionPeriod)
    }

    /**
     * @param clusterName The name of the new elastic cluster. This parameter is stored as a
     * lowercase string. 
     * *Constraints* :
     *
     * * Must contain from 1 to 63 letters, numbers, or hyphens.
     * * The first character must be a letter.
     * * Cannot end with a hyphen or contain two consecutive hyphens.
     *
     * *Example* : `my-cluster`
     */
    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    /**
     * @param kmsKeyId The KMS key identifier to use to encrypt the new elastic cluster.
     * The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you
     * are creating a cluster using the same Amazon account that owns this KMS encryption key, you can
     * use the KMS key alias instead of the ARN as the KMS encryption key.
     *
     * If an encryption key is not specified, Amazon DocumentDB uses the default encryption key that
     * KMS creates for your account. Your account has a different default encryption key for each
     * Amazon Region.
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param preferredBackupWindow The daily time range during which automated backups are created
     * if automated backups are enabled, as determined by `backupRetentionPeriod` .
     */
    override fun preferredBackupWindow(preferredBackupWindow: String) {
      cdkBuilder.preferredBackupWindow(preferredBackupWindow)
    }

    /**
     * @param preferredMaintenanceWindow The weekly time range during which system maintenance can
     * occur, in Universal Coordinated Time (UTC).
     * *Format* : `ddd:hh24:mi-ddd:hh24:mi`
     *
     * *Default* : a 30-minute window selected at random from an 8-hour block of time for each AWS
     * Region , occurring on a random day of the week.
     *
     * *Valid days* : Mon, Tue, Wed, Thu, Fri, Sat, Sun
     *
     * *Constraints* : Minimum 30-minute window.
     */
    override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    /**
     * @param shardCapacity The number of vCPUs assigned to each elastic cluster shard. 
     * Maximum is 64. Allowed values are 2, 4, 8, 16, 32, 64.
     */
    override fun shardCapacity(shardCapacity: Number) {
      cdkBuilder.shardCapacity(shardCapacity)
    }

    /**
     * @param shardCount The number of shards assigned to the elastic cluster. 
     * Maximum is 32.
     */
    override fun shardCount(shardCount: Number) {
      cdkBuilder.shardCount(shardCount)
    }

    /**
     * @param shardInstanceCount The number of replica instances applying to all shards in the
     * cluster.
     * A `shardInstanceCount` value of 1 means there is one writer instance, and any additional
     * instances are replicas that can be used for reads and to improve availability.
     */
    override fun shardInstanceCount(shardInstanceCount: Number) {
      cdkBuilder.shardInstanceCount(shardInstanceCount)
    }

    /**
     * @param subnetIds The Amazon EC2 subnet IDs for the new elastic cluster.
     */
    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    /**
     * @param subnetIds The Amazon EC2 subnet IDs for the new elastic cluster.
     */
    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    /**
     * @param tags The tags to be assigned to the new elastic cluster.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags to be assigned to the new elastic cluster.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param vpcSecurityGroupIds A list of EC2 VPC security groups to associate with the new
     * elastic cluster.
     */
    override fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>) {
      cdkBuilder.vpcSecurityGroupIds(vpcSecurityGroupIds)
    }

    /**
     * @param vpcSecurityGroupIds A list of EC2 VPC security groups to associate with the new
     * elastic cluster.
     */
    override fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String): Unit =
        vpcSecurityGroupIds(vpcSecurityGroupIds.toList())

    public fun build(): software.amazon.awscdk.services.docdbelastic.CfnClusterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.docdbelastic.CfnClusterProps,
  ) : CdkObject(cdkObject), CfnClusterProps {
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
     */
    override fun adminUserName(): String = unwrap(this).getAdminUserName()

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
     */
    override fun adminUserPassword(): String? = unwrap(this).getAdminUserPassword()

    /**
     * The authentication type used to determine where to fetch the password used for accessing the
     * elastic cluster.
     *
     * Valid types are `PLAIN_TEXT` or `SECRET_ARN` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html#cfn-docdbelastic-cluster-authtype)
     */
    override fun authType(): String = unwrap(this).getAuthType()

    /**
     * The number of days for which automatic snapshots are retained.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html#cfn-docdbelastic-cluster-backupretentionperiod)
     */
    override fun backupRetentionPeriod(): Number? = unwrap(this).getBackupRetentionPeriod()

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
     */
    override fun clusterName(): String = unwrap(this).getClusterName()

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
     */
    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * The daily time range during which automated backups are created if automated backups are
     * enabled, as determined by `backupRetentionPeriod` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html#cfn-docdbelastic-cluster-preferredbackupwindow)
     */
    override fun preferredBackupWindow(): String? = unwrap(this).getPreferredBackupWindow()

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
     */
    override fun preferredMaintenanceWindow(): String? =
        unwrap(this).getPreferredMaintenanceWindow()

    /**
     * The number of vCPUs assigned to each elastic cluster shard.
     *
     * Maximum is 64. Allowed values are 2, 4, 8, 16, 32, 64.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html#cfn-docdbelastic-cluster-shardcapacity)
     */
    override fun shardCapacity(): Number = unwrap(this).getShardCapacity()

    /**
     * The number of shards assigned to the elastic cluster.
     *
     * Maximum is 32.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html#cfn-docdbelastic-cluster-shardcount)
     */
    override fun shardCount(): Number = unwrap(this).getShardCount()

    /**
     * The number of replica instances applying to all shards in the cluster.
     *
     * A `shardInstanceCount` value of 1 means there is one writer instance, and any additional
     * instances are replicas that can be used for reads and to improve availability.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html#cfn-docdbelastic-cluster-shardinstancecount)
     */
    override fun shardInstanceCount(): Number? = unwrap(this).getShardInstanceCount()

    /**
     * The Amazon EC2 subnet IDs for the new elastic cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html#cfn-docdbelastic-cluster-subnetids)
     */
    override fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

    /**
     * The tags to be assigned to the new elastic cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html#cfn-docdbelastic-cluster-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * A list of EC2 VPC security groups to associate with the new elastic cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html#cfn-docdbelastic-cluster-vpcsecuritygroupids)
     */
    override fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds() ?:
        emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnClusterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.docdbelastic.CfnClusterProps):
        CfnClusterProps = CdkObjectWrappers.wrap(cdkObject) as? CfnClusterProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnClusterProps):
        software.amazon.awscdk.services.docdbelastic.CfnClusterProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.docdbelastic.CfnClusterProps
  }
}
