@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.docdbelastic

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.docdbelastic.CfnCluster
import software.constructs.Construct

/**
 * Creates a new Amazon DocumentDB elastic cluster and returns its cluster structure.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.docdbelastic.*;
 * CfnCluster cfnCluster = CfnCluster.Builder.create(this, "MyCfnCluster")
 * .adminUserName("adminUserName")
 * .authType("authType")
 * .clusterName("clusterName")
 * .shardCapacity(123)
 * .shardCount(123)
 * // the properties below are optional
 * .adminUserPassword("adminUserPassword")
 * .kmsKeyId("kmsKeyId")
 * .preferredMaintenanceWindow("preferredMaintenanceWindow")
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
@CdkDslMarker
public class CfnClusterDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnCluster.Builder = CfnCluster.Builder.create(scope, id)

  private val _subnetIds: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  private val _vpcSecurityGroupIds: MutableList<String> = mutableListOf()

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
  public fun adminUserName(adminUserName: String) {
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
   * @param adminUserPassword The password for the Elastic DocumentDB cluster administrator and can
   * contain any printable ASCII characters. 
   */
  public fun adminUserPassword(adminUserPassword: String) {
    cdkBuilder.adminUserPassword(adminUserPassword)
  }

  /**
   * The authentication type used to determine where to fetch the password used for accessing the
   * elastic cluster.
   *
   * Valid types are `PLAIN_TEXT` or `SECRET_ARN` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html#cfn-docdbelastic-cluster-authtype)
   * @param authType The authentication type used to determine where to fetch the password used for
   * accessing the elastic cluster. 
   */
  public fun authType(authType: String) {
    cdkBuilder.authType(authType)
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
   * @param clusterName The name of the new elastic cluster. This parameter is stored as a lowercase
   * string. 
   */
  public fun clusterName(clusterName: String) {
    cdkBuilder.clusterName(clusterName)
  }

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
   * @param kmsKeyId The KMS key identifier to use to encrypt the new elastic cluster. 
   */
  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

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
   * @param preferredMaintenanceWindow The weekly time range during which system maintenance can
   * occur, in Universal Coordinated Time (UTC). 
   */
  public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
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
  public fun shardCapacity(shardCapacity: Number) {
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
  public fun shardCount(shardCount: Number) {
    cdkBuilder.shardCount(shardCount)
  }

  /**
   * The Amazon EC2 subnet IDs for the new elastic cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html#cfn-docdbelastic-cluster-subnetids)
   * @param subnetIds The Amazon EC2 subnet IDs for the new elastic cluster. 
   */
  public fun subnetIds(vararg subnetIds: String) {
    _subnetIds.addAll(listOf(*subnetIds))
  }

  /**
   * The Amazon EC2 subnet IDs for the new elastic cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html#cfn-docdbelastic-cluster-subnetids)
   * @param subnetIds The Amazon EC2 subnet IDs for the new elastic cluster. 
   */
  public fun subnetIds(subnetIds: Collection<String>) {
    _subnetIds.addAll(subnetIds)
  }

  /**
   * The tags to be assigned to the new elastic cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html#cfn-docdbelastic-cluster-tags)
   * @param tags The tags to be assigned to the new elastic cluster. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * The tags to be assigned to the new elastic cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html#cfn-docdbelastic-cluster-tags)
   * @param tags The tags to be assigned to the new elastic cluster. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * A list of EC2 VPC security groups to associate with the new elastic cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html#cfn-docdbelastic-cluster-vpcsecuritygroupids)
   * @param vpcSecurityGroupIds A list of EC2 VPC security groups to associate with the new elastic
   * cluster. 
   */
  public fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String) {
    _vpcSecurityGroupIds.addAll(listOf(*vpcSecurityGroupIds))
  }

  /**
   * A list of EC2 VPC security groups to associate with the new elastic cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdbelastic-cluster.html#cfn-docdbelastic-cluster-vpcsecuritygroupids)
   * @param vpcSecurityGroupIds A list of EC2 VPC security groups to associate with the new elastic
   * cluster. 
   */
  public fun vpcSecurityGroupIds(vpcSecurityGroupIds: Collection<String>) {
    _vpcSecurityGroupIds.addAll(vpcSecurityGroupIds)
  }

  public fun build(): CfnCluster {
    if(_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    if(_vpcSecurityGroupIds.isNotEmpty()) cdkBuilder.vpcSecurityGroupIds(_vpcSecurityGroupIds)
    return cdkBuilder.build()
  }
}
