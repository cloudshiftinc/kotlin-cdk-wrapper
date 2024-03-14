package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface CfnEnclaveCertificateIamRoleAssociationProps {
  /**
   * The ARN of the ACM certificate with which to associate the IAM role.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-enclavecertificateiamroleassociation.html#cfn-ec2-enclavecertificateiamroleassociation-certificatearn)
   */
  public fun certificateArn(): String

  /**
   * The ARN of the IAM role to associate with the ACM certificate.
   *
   * You can associate up to 16 IAM roles with an ACM certificate.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-enclavecertificateiamroleassociation.html#cfn-ec2-enclavecertificateiamroleassociation-rolearn)
   */
  public fun roleArn(): String

  /**
   * A builder for [CfnEnclaveCertificateIamRoleAssociationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param certificateArn The ARN of the ACM certificate with which to associate the IAM role. 
     */
    public fun certificateArn(certificateArn: String)

    /**
     * @param roleArn The ARN of the IAM role to associate with the ACM certificate. 
     * You can associate up to 16 IAM roles with an ACM certificate.
     */
    public fun roleArn(roleArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnEnclaveCertificateIamRoleAssociationProps.Builder =
        software.amazon.awscdk.services.ec2.CfnEnclaveCertificateIamRoleAssociationProps.builder()

    /**
     * @param certificateArn The ARN of the ACM certificate with which to associate the IAM role. 
     */
    override fun certificateArn(certificateArn: String) {
      cdkBuilder.certificateArn(certificateArn)
    }

    /**
     * @param roleArn The ARN of the IAM role to associate with the ACM certificate. 
     * You can associate up to 16 IAM roles with an ACM certificate.
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    public fun build():
        software.amazon.awscdk.services.ec2.CfnEnclaveCertificateIamRoleAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.ec2.CfnEnclaveCertificateIamRoleAssociationProps,
  ) : CdkObject(cdkObject), CfnEnclaveCertificateIamRoleAssociationProps {
    /**
     * The ARN of the ACM certificate with which to associate the IAM role.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-enclavecertificateiamroleassociation.html#cfn-ec2-enclavecertificateiamroleassociation-certificatearn)
     */
    override fun certificateArn(): String = unwrap(this).getCertificateArn()

    /**
     * The ARN of the IAM role to associate with the ACM certificate.
     *
     * You can associate up to 16 IAM roles with an ACM certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-enclavecertificateiamroleassociation.html#cfn-ec2-enclavecertificateiamroleassociation-rolearn)
     */
    override fun roleArn(): String = unwrap(this).getRoleArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnEnclaveCertificateIamRoleAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnEnclaveCertificateIamRoleAssociationProps):
        CfnEnclaveCertificateIamRoleAssociationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEnclaveCertificateIamRoleAssociationProps):
        software.amazon.awscdk.services.ec2.CfnEnclaveCertificateIamRoleAssociationProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnEnclaveCertificateIamRoleAssociationProps
  }
}
