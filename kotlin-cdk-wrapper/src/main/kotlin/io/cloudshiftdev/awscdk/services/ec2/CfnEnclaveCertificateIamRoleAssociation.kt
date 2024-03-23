@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

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
 * import io.cloudshiftdev.awscdk.services.ec2.*;
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
public open class CfnEnclaveCertificateIamRoleAssociation(
  cdkObject: software.amazon.awscdk.services.ec2.CfnEnclaveCertificateIamRoleAssociation,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEnclaveCertificateIamRoleAssociationProps,
  ) :
      this(software.amazon.awscdk.services.ec2.CfnEnclaveCertificateIamRoleAssociation(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnEnclaveCertificateIamRoleAssociationProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEnclaveCertificateIamRoleAssociationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnEnclaveCertificateIamRoleAssociationProps(props)
  )

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
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnEnclaveCertificateIamRoleAssociation.CFN_RESOURCE_TYPE_NAME

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
        wrapped.cdkObject as
        software.amazon.awscdk.services.ec2.CfnEnclaveCertificateIamRoleAssociation
  }
}
