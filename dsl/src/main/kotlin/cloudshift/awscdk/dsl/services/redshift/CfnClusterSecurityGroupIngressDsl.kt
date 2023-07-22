@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.redshift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngress
import software.constructs.Construct

@CdkDslMarker
public class CfnClusterSecurityGroupIngressDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnClusterSecurityGroupIngress.Builder =
      CfnClusterSecurityGroupIngress.Builder.create(scope, id)

  /**
   * The IP range to be added the Amazon Redshift security group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html#cfn-redshift-clustersecuritygroupingress-cidrip)
   * @param cidrip The IP range to be added the Amazon Redshift security group. 
   */
  public fun cidrip(cidrip: String) {
    cdkBuilder.cidrip(cidrip)
  }

  /**
   * The name of the security group to which the ingress rule is added.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html#cfn-redshift-clustersecuritygroupingress-clustersecuritygroupname)
   * @param clusterSecurityGroupName The name of the security group to which the ingress rule is
   * added. 
   */
  public fun clusterSecurityGroupName(clusterSecurityGroupName: String) {
    cdkBuilder.clusterSecurityGroupName(clusterSecurityGroupName)
  }

  /**
   * The EC2 security group to be added the Amazon Redshift security group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html#cfn-redshift-clustersecuritygroupingress-ec2securitygroupname)
   * @param ec2SecurityGroupName The EC2 security group to be added the Amazon Redshift security
   * group. 
   */
  public fun ec2SecurityGroupName(ec2SecurityGroupName: String) {
    cdkBuilder.ec2SecurityGroupName(ec2SecurityGroupName)
  }

  /**
   * The AWS account number of the owner of the security group specified by the
   * *EC2SecurityGroupName* parameter.
   *
   * The AWS Access Key ID is not an acceptable value.
   *
   * Example: `111122223333`
   *
   * Conditional. If you specify the `EC2SecurityGroupName` property, you must specify this
   * property.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html#cfn-redshift-clustersecuritygroupingress-ec2securitygroupownerid)
   * @param ec2SecurityGroupOwnerId The AWS account number of the owner of the security group
   * specified by the *EC2SecurityGroupName* parameter. 
   */
  public fun ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId: String) {
    cdkBuilder.ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId)
  }

  public fun build(): CfnClusterSecurityGroupIngress = cdkBuilder.build()
}
