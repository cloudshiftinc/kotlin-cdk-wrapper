@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnEnclaveCertificateIamRoleAssociationProps

@CdkDslMarker
public class CfnEnclaveCertificateIamRoleAssociationPropsDsl {
  private val cdkBuilder: CfnEnclaveCertificateIamRoleAssociationProps.Builder =
      CfnEnclaveCertificateIamRoleAssociationProps.builder()

  /**
   * @param certificateArn The ARN of the ACM certificate with which to associate the IAM role. 
   */
  public fun certificateArn(certificateArn: String) {
    cdkBuilder.certificateArn(certificateArn)
  }

  /**
   * @param roleArn The ARN of the IAM role to associate with the ACM certificate. 
   * You can associate up to 16 IAM roles with an ACM certificate.
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun build(): CfnEnclaveCertificateIamRoleAssociationProps = cdkBuilder.build()
}
