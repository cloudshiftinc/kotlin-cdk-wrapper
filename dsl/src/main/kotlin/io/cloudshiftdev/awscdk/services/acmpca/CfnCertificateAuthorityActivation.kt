package io.cloudshiftdev.awscdk.services.acmpca

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCertificateAuthorityActivation internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityActivation,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The complete Base64 PEM-encoded certificate chain, including the certificate authority
   * certificate.
   */
  public open fun attrCompleteCertificateChain(): String =
      unwrap(this).getAttrCompleteCertificateChain()

  /**
   * The Base64 PEM-encoded certificate authority certificate.
   */
  public open fun certificate(): String = unwrap(this).getCertificate()

  /**
   * The Base64 PEM-encoded certificate authority certificate.
   */
  public open fun certificate(`value`: String) {
    unwrap(this).setCertificate(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of your private CA.
   */
  public open fun certificateAuthorityArn(): String = unwrap(this).getCertificateAuthorityArn()

  /**
   * The Amazon Resource Name (ARN) of your private CA.
   */
  public open fun certificateAuthorityArn(`value`: String) {
    unwrap(this).setCertificateAuthorityArn(`value`)
  }

  /**
   * The Base64 PEM-encoded certificate chain that chains up to the root CA certificate that you
   * used to sign your private CA certificate.
   */
  public open fun certificateChain(): String? = unwrap(this).getCertificateChain()

  /**
   * The Base64 PEM-encoded certificate chain that chains up to the root CA certificate that you
   * used to sign your private CA certificate.
   */
  public open fun certificateChain(`value`: String) {
    unwrap(this).setCertificateChain(`value`)
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
   * Status of your private CA.
   */
  public open fun status(): String? = unwrap(this).getStatus()

  /**
   * Status of your private CA.
   */
  public open fun status(`value`: String) {
    unwrap(this).setStatus(`value`)
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.acmpca.CfnCertificateAuthorityActivation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Base64 PEM-encoded certificate authority certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthorityactivation.html#cfn-acmpca-certificateauthorityactivation-certificate)
     * @param certificate The Base64 PEM-encoded certificate authority certificate. 
     */
    public fun certificate(certificate: String)

    /**
     * The Amazon Resource Name (ARN) of your private CA.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthorityactivation.html#cfn-acmpca-certificateauthorityactivation-certificateauthorityarn)
     * @param certificateAuthorityArn The Amazon Resource Name (ARN) of your private CA. 
     */
    public fun certificateAuthorityArn(certificateAuthorityArn: String)

    /**
     * The Base64 PEM-encoded certificate chain that chains up to the root CA certificate that you
     * used to sign your private CA certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthorityactivation.html#cfn-acmpca-certificateauthorityactivation-certificatechain)
     * @param certificateChain The Base64 PEM-encoded certificate chain that chains up to the root
     * CA certificate that you used to sign your private CA certificate. 
     */
    public fun certificateChain(certificateChain: String)

    /**
     * Status of your private CA.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthorityactivation.html#cfn-acmpca-certificateauthorityactivation-status)
     * @param status Status of your private CA. 
     */
    public fun status(status: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityActivation.Builder =
        software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityActivation.Builder.create(scope,
        id)

    /**
     * The Base64 PEM-encoded certificate authority certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthorityactivation.html#cfn-acmpca-certificateauthorityactivation-certificate)
     * @param certificate The Base64 PEM-encoded certificate authority certificate. 
     */
    override fun certificate(certificate: String) {
      cdkBuilder.certificate(certificate)
    }

    /**
     * The Amazon Resource Name (ARN) of your private CA.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthorityactivation.html#cfn-acmpca-certificateauthorityactivation-certificateauthorityarn)
     * @param certificateAuthorityArn The Amazon Resource Name (ARN) of your private CA. 
     */
    override fun certificateAuthorityArn(certificateAuthorityArn: String) {
      cdkBuilder.certificateAuthorityArn(certificateAuthorityArn)
    }

    /**
     * The Base64 PEM-encoded certificate chain that chains up to the root CA certificate that you
     * used to sign your private CA certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthorityactivation.html#cfn-acmpca-certificateauthorityactivation-certificatechain)
     * @param certificateChain The Base64 PEM-encoded certificate chain that chains up to the root
     * CA certificate that you used to sign your private CA certificate. 
     */
    override fun certificateChain(certificateChain: String) {
      cdkBuilder.certificateChain(certificateChain)
    }

    /**
     * Status of your private CA.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthorityactivation.html#cfn-acmpca-certificateauthorityactivation-status)
     * @param status Status of your private CA. 
     */
    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    public fun build(): software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityActivation =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCertificateAuthorityActivation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCertificateAuthorityActivation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityActivation):
        CfnCertificateAuthorityActivation = CfnCertificateAuthorityActivation(cdkObject)

    internal fun unwrap(wrapped: CfnCertificateAuthorityActivation):
        software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityActivation = wrapped.cdkObject
  }
}
