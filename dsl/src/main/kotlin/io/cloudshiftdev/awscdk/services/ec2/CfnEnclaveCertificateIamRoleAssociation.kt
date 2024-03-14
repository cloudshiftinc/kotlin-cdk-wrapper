package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnEnclaveCertificateIamRoleAssociation internal constructor(
  private val cdkObject:
      software.amazon.awscdk.services.ec2.CfnEnclaveCertificateIamRoleAssociation,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The name of the Amazon S3 bucket to which the certificate was uploaded.
   */
  public open fun attrCertificateS3BucketName(): String =
      unwrap(this).getAttrCertificateS3BucketName()

  /**
   * The Amazon S3 object key where the certificate, certificate chain, and encrypted private key
   * bundle are stored.
   *
   * The object key is formatted as follows: `role_arn` / `certificate_arn` .
   */
  public open fun attrCertificateS3ObjectKey(): String =
      unwrap(this).getAttrCertificateS3ObjectKey()

  /**
   * The ID of the AWS KMS key used to encrypt the private key of the certificate.
   */
  public open fun attrEncryptionKmsKeyId(): String = unwrap(this).getAttrEncryptionKmsKeyId()

  /**
   * The ARN of the ACM certificate with which to associate the IAM role.
   */
  public open fun certificateArn(): String = unwrap(this).getCertificateArn()

  /**
   * The ARN of the ACM certificate with which to associate the IAM role.
   */
  public open fun certificateArn(`value`: String) {
    unwrap(this).setCertificateArn(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The ARN of the IAM role to associate with the ACM certificate.
   */
  public open fun roleArn(): String = unwrap(this).getRoleArn()

  /**
   * The ARN of the IAM role to associate with the ACM certificate.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.ec2.CfnEnclaveCertificateIamRoleAssociation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ARN of the ACM certificate with which to associate the IAM role.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-enclavecertificateiamroleassociation.html#cfn-ec2-enclavecertificateiamroleassociation-certificatearn)
     * @param certificateArn The ARN of the ACM certificate with which to associate the IAM role. 
     */
    public fun certificateArn(certificateArn: String)

    /**
     * The ARN of the IAM role to associate with the ACM certificate.
     *
     * You can associate up to 16 IAM roles with an ACM certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-enclavecertificateiamroleassociation.html#cfn-ec2-enclavecertificateiamroleassociation-rolearn)
     * @param roleArn The ARN of the IAM role to associate with the ACM certificate. 
     */
    public fun roleArn(roleArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnEnclaveCertificateIamRoleAssociation.Builder =
        software.amazon.awscdk.services.ec2.CfnEnclaveCertificateIamRoleAssociation.Builder.create(scope,
        id)

    /**
     * The ARN of the ACM certificate with which to associate the IAM role.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-enclavecertificateiamroleassociation.html#cfn-ec2-enclavecertificateiamroleassociation-certificatearn)
     * @param certificateArn The ARN of the ACM certificate with which to associate the IAM role. 
     */
    override fun certificateArn(certificateArn: String) {
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
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnEnclaveCertificateIamRoleAssociation
        = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEnclaveCertificateIamRoleAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEnclaveCertificateIamRoleAssociation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnEnclaveCertificateIamRoleAssociation):
        CfnEnclaveCertificateIamRoleAssociation = CfnEnclaveCertificateIamRoleAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnEnclaveCertificateIamRoleAssociation):
        software.amazon.awscdk.services.ec2.CfnEnclaveCertificateIamRoleAssociation =
        wrapped.cdkObject
  }
}
