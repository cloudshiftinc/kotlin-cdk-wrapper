@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.rds.CfnDBSecurityGroupIngress
import software.constructs.Construct

/**
 * The `AWS::RDS::DBSecurityGroupIngress` resource enables ingress to a DB security group using one
 * of two forms of authorization.
 *
 * First, you can add EC2 or VPC security groups to the DB security group if the application using
 * the database is running on EC2 or VPC instances. Second, IP ranges are available if the application
 * accessing your database is running on the Internet.
 *
 * This type supports updates. For more information about updating stacks, see [AWS CloudFormation
 * Stacks
 * Updates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks.html)
 * .
 *
 * For details about the settings for DB security group ingress, see
 * [AuthorizeDBSecurityGroupIngress](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_AuthorizeDBSecurityGroupIngress.html)
 * .
 *
 *
 * EC2-Classic was retired on August 15, 2022. If you haven't migrated from EC2-Classic to a VPC, we
 * recommend that you migrate as soon as possible. For more information, see [Migrate from EC2-Classic
 * to a VPC](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-migrate.html) in the *Amazon EC2
 * User Guide* , the blog [EC2-Classic Networking is Retiring – Here’s How to
 * Prepare](https://docs.aws.amazon.com/aws/ec2-classic-is-retiring-heres-how-to-prepare/) , and
 * [Moving a DB instance not in a VPC into a
 * VPC](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.Non-VPC2VPC.html) in the
 * *Amazon RDS User Guide* .
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rds.*;
 * CfnDBSecurityGroupIngress cfnDBSecurityGroupIngress =
 * CfnDBSecurityGroupIngress.Builder.create(this, "MyCfnDBSecurityGroupIngress")
 * .dbSecurityGroupName("dbSecurityGroupName")
 * // the properties below are optional
 * .cidrip("cidrip")
 * .ec2SecurityGroupId("ec2SecurityGroupId")
 * .ec2SecurityGroupName("ec2SecurityGroupName")
 * .ec2SecurityGroupOwnerId("ec2SecurityGroupOwnerId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbsecuritygroupingress.html)
 */
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
