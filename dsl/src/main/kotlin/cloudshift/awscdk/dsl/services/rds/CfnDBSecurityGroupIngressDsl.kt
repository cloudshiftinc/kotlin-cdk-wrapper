@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.rds.CfnDBSecurityGroupIngress
import software.constructs.Construct

@CdkDslMarker
public class CfnDBSecurityGroupIngressDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnDBSecurityGroupIngress.Builder =
      CfnDBSecurityGroupIngress.Builder.create(scope, id)

  /**
   * The IP range to authorize.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroupingress.html#cfn-rds-dbsecuritygroupingress-cidrip)
   * @param cidrip The IP range to authorize. 
   */
  public fun cidrip(cidrip: String) {
    cdkBuilder.cidrip(cidrip)
  }

  /**
   * The name of the DB security group to add authorization to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroupingress.html#cfn-rds-dbsecuritygroupingress-dbsecuritygroupname)
   * @param dbSecurityGroupName The name of the DB security group to add authorization to. 
   */
  public fun dbSecurityGroupName(dbSecurityGroupName: String) {
    cdkBuilder.dbSecurityGroupName(dbSecurityGroupName)
  }

  /**
   * Id of the EC2 security group to authorize.
   *
   * For VPC DB security groups, `EC2SecurityGroupId` must be provided. Otherwise,
   * `EC2SecurityGroupOwnerId` and either `EC2SecurityGroupName` or `EC2SecurityGroupId` must be
   * provided.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroupingress.html#cfn-rds-dbsecuritygroupingress-ec2securitygroupid)
   * @param ec2SecurityGroupId Id of the EC2 security group to authorize. 
   */
  public fun ec2SecurityGroupId(ec2SecurityGroupId: String) {
    cdkBuilder.ec2SecurityGroupId(ec2SecurityGroupId)
  }

  /**
   * Name of the EC2 security group to authorize.
   *
   * For VPC DB security groups, `EC2SecurityGroupId` must be provided. Otherwise,
   * `EC2SecurityGroupOwnerId` and either `EC2SecurityGroupName` or `EC2SecurityGroupId` must be
   * provided.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroupingress.html#cfn-rds-dbsecuritygroupingress-ec2securitygroupname)
   * @param ec2SecurityGroupName Name of the EC2 security group to authorize. 
   */
  public fun ec2SecurityGroupName(ec2SecurityGroupName: String) {
    cdkBuilder.ec2SecurityGroupName(ec2SecurityGroupName)
  }

  /**
   * AWS account number of the owner of the EC2 security group specified in the
   * `EC2SecurityGroupName` parameter.
   *
   * The AWS access key ID isn't an acceptable value. For VPC DB security groups,
   * `EC2SecurityGroupId` must be provided. Otherwise, `EC2SecurityGroupOwnerId` and either
   * `EC2SecurityGroupName` or `EC2SecurityGroupId` must be provided.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroupingress.html#cfn-rds-dbsecuritygroupingress-ec2securitygroupownerid)
   * @param ec2SecurityGroupOwnerId AWS account number of the owner of the EC2 security group
   * specified in the `EC2SecurityGroupName` parameter. 
   */
  public fun ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId: String) {
    cdkBuilder.ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId)
  }

  public fun build(): CfnDBSecurityGroupIngress = cdkBuilder.build()
}
