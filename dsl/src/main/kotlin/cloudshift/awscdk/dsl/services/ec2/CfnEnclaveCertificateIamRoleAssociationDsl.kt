@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnEnclaveCertificateIamRoleAssociation
import software.constructs.Construct

@CdkDslMarker
public class CfnEnclaveCertificateIamRoleAssociationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnEnclaveCertificateIamRoleAssociation.Builder =
      CfnEnclaveCertificateIamRoleAssociation.Builder.create(scope, id)

  /**
   * The ARN of the ACM certificate with which to associate the IAM role.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-enclavecertificateiamroleassociation.html#cfn-ec2-enclavecertificateiamroleassociation-certificatearn)
   * @param certificateArn The ARN of the ACM certificate with which to associate the IAM role. 
   */
  public fun certificateArn(certificateArn: String) {
    cdkBuilder.certificateArn(certificateArn)
  }

  /**
   * The ARN of the IAM role to associate with the ACM certificate.
   *
   * You can associate up to 16 IAM roles with an ACM certificate.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-enclavecertificateiamroleassociation.html#cfn-ec2-enclavecertificateiamroleassociation-rolearn)
   * @param roleArn The ARN of the IAM role to associate with the ACM certificate. 
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun build(): CfnEnclaveCertificateIamRoleAssociation = cdkBuilder.build()
}
