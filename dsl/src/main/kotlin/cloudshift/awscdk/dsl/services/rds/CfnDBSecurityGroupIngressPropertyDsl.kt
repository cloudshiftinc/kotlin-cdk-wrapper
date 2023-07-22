@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.rds.CfnDBSecurityGroup

@CdkDslMarker
public class CfnDBSecurityGroupIngressPropertyDsl {
  private val cdkBuilder: CfnDBSecurityGroup.IngressProperty.Builder =
      CfnDBSecurityGroup.IngressProperty.builder()

  /**
   * @param cidrip The IP range to authorize.
   */
  public fun cidrip(cidrip: String) {
    cdkBuilder.cidrip(cidrip)
  }

  /**
   * @param ec2SecurityGroupId Id of the EC2 security group to authorize.
   * For VPC DB security groups, `EC2SecurityGroupId` must be provided. Otherwise,
   * `EC2SecurityGroupOwnerId` and either `EC2SecurityGroupName` or `EC2SecurityGroupId` must be
   * provided.
   */
  public fun ec2SecurityGroupId(ec2SecurityGroupId: String) {
    cdkBuilder.ec2SecurityGroupId(ec2SecurityGroupId)
  }

  /**
   * @param ec2SecurityGroupName Name of the EC2 security group to authorize.
   * For VPC DB security groups, `EC2SecurityGroupId` must be provided. Otherwise,
   * `EC2SecurityGroupOwnerId` and either `EC2SecurityGroupName` or `EC2SecurityGroupId` must be
   * provided.
   */
  public fun ec2SecurityGroupName(ec2SecurityGroupName: String) {
    cdkBuilder.ec2SecurityGroupName(ec2SecurityGroupName)
  }

  /**
   * @param ec2SecurityGroupOwnerId AWS account number of the owner of the EC2 security group
   * specified in the `EC2SecurityGroupName` parameter.
   * The AWS access key ID isn't an acceptable value. For VPC DB security groups,
   * `EC2SecurityGroupId` must be provided. Otherwise, `EC2SecurityGroupOwnerId` and either
   * `EC2SecurityGroupName` or `EC2SecurityGroupId` must be provided.
   */
  public fun ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId: String) {
    cdkBuilder.ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId)
  }

  public fun build(): CfnDBSecurityGroup.IngressProperty = cdkBuilder.build()
}
