@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnEnclaveCertificateIamRoleAssociation
import software.constructs.Construct

/**
 * Associates an AWS Identity and Access Management (IAM) role with an AWS Certificate Manager (ACM)
 * certificate.
 *
 * This enables the certificate to be used by the ACM for Nitro Enclaves application inside an
 * enclave. For more information, see [AWS Certificate Manager for Nitro
 * Enclaves](https://docs.aws.amazon.com/enclaves/latest/user/nitro-enclave-refapp.html) in the *AWS
 * Nitro Enclaves User Guide* .
 *
 * When the IAM role is associated with the ACM certificate, the certificate, certificate chain, and
 * encrypted private key are placed in an Amazon S3 location that only the associated IAM role can
 * access. The private key of the certificate is encrypted with an AWS managed key that has an attached
 * attestation-based key policy.
 *
 * To enable the IAM role to access the Amazon S3 object, you must grant it permission to call
 * `s3:GetObject` on the Amazon S3 bucket returned by the command. To enable the IAM role to access the
 * KMS key, you must grant it permission to call `kms:Decrypt` on the KMS key returned by the command.
 * For more information, see [Grant the role permission to access the certificate and encryption
 * key](https://docs.aws.amazon.com/enclaves/latest/user/nitro-enclave-refapp.html#add-policy) in the
 * *AWS Nitro Enclaves User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnEnclaveCertificateIamRoleAssociation cfnEnclaveCertificateIamRoleAssociation =
 * CfnEnclaveCertificateIamRoleAssociation.Builder.create(this,
 * "MyCfnEnclaveCertificateIamRoleAssociation")
 * .certificateArn("certificateArn")
 * .roleArn("roleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-enclavecertificateiamroleassociation.html)
 */
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
