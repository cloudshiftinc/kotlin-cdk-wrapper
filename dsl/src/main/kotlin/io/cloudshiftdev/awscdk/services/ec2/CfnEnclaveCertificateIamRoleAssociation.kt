package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnEnclaveCertificateIamRoleAssociation internal constructor(
  private val cdkObject:
      software.amazon.awscdk.services.ec2.CfnEnclaveCertificateIamRoleAssociation,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrCertificateS3BucketName(): String =
      unwrap(this).getAttrCertificateS3BucketName()

  public open fun attrCertificateS3ObjectKey(): String =
      unwrap(this).getAttrCertificateS3ObjectKey()

  public open fun attrEncryptionKmsKeyId(): String = unwrap(this).getAttrEncryptionKmsKeyId()

  public open fun certificateArn(): String = unwrap(this).getCertificateArn()

  public open fun certificateArn(`value`: String) {
    unwrap(this).setCertificateArn(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun roleArn(): String = unwrap(this).getRoleArn()

  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  public interface Builder {
    public fun certificateArn(certificateArn: String)

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

    override fun certificateArn(certificateArn: String) {
      cdkBuilder.certificateArn(certificateArn)
    }

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
