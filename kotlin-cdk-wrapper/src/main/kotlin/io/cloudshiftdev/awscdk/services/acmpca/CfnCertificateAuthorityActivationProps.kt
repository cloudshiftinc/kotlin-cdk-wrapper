@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.acmpca

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnCertificateAuthorityActivation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.acmpca.*;
 * CfnCertificateAuthorityActivationProps cfnCertificateAuthorityActivationProps =
 * CfnCertificateAuthorityActivationProps.builder()
 * .certificate("certificate")
 * .certificateAuthorityArn("certificateAuthorityArn")
 * // the properties below are optional
 * .certificateChain("certificateChain")
 * .status("status")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthorityactivation.html)
 */
public interface CfnCertificateAuthorityActivationProps {
  /**
   * The Base64 PEM-encoded certificate authority certificate.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthorityactivation.html#cfn-acmpca-certificateauthorityactivation-certificate)
   */
  public fun certificate(): String

  /**
   * The Amazon Resource Name (ARN) of your private CA.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthorityactivation.html#cfn-acmpca-certificateauthorityactivation-certificateauthorityarn)
   */
  public fun certificateAuthorityArn(): String

  /**
   * The Base64 PEM-encoded certificate chain that chains up to the root CA certificate that you
   * used to sign your private CA certificate.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthorityactivation.html#cfn-acmpca-certificateauthorityactivation-certificatechain)
   */
  public fun certificateChain(): String? = unwrap(this).getCertificateChain()

  /**
   * Status of your private CA.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthorityactivation.html#cfn-acmpca-certificateauthorityactivation-status)
   */
  public fun status(): String? = unwrap(this).getStatus()

  /**
   * A builder for [CfnCertificateAuthorityActivationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param certificate The Base64 PEM-encoded certificate authority certificate. 
     */
    public fun certificate(certificate: String)

    /**
     * @param certificateAuthorityArn The Amazon Resource Name (ARN) of your private CA. 
     */
    public fun certificateAuthorityArn(certificateAuthorityArn: String)

    /**
     * @param certificateChain The Base64 PEM-encoded certificate chain that chains up to the root
     * CA certificate that you used to sign your private CA certificate.
     */
    public fun certificateChain(certificateChain: String)

    /**
     * @param status Status of your private CA.
     */
    public fun status(status: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityActivationProps.Builder =
        software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityActivationProps.builder()

    /**
     * @param certificate The Base64 PEM-encoded certificate authority certificate. 
     */
    override fun certificate(certificate: String) {
      cdkBuilder.certificate(certificate)
    }

    /**
     * @param certificateAuthorityArn The Amazon Resource Name (ARN) of your private CA. 
     */
    override fun certificateAuthorityArn(certificateAuthorityArn: String) {
      cdkBuilder.certificateAuthorityArn(certificateAuthorityArn)
    }

    /**
     * @param certificateChain The Base64 PEM-encoded certificate chain that chains up to the root
     * CA certificate that you used to sign your private CA certificate.
     */
    override fun certificateChain(certificateChain: String) {
      cdkBuilder.certificateChain(certificateChain)
    }

    /**
     * @param status Status of your private CA.
     */
    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    public fun build():
        software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityActivationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityActivationProps,
  ) : CdkObject(cdkObject),
      CfnCertificateAuthorityActivationProps {
    /**
     * The Base64 PEM-encoded certificate authority certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthorityactivation.html#cfn-acmpca-certificateauthorityactivation-certificate)
     */
    override fun certificate(): String = unwrap(this).getCertificate()

    /**
     * The Amazon Resource Name (ARN) of your private CA.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthorityactivation.html#cfn-acmpca-certificateauthorityactivation-certificateauthorityarn)
     */
    override fun certificateAuthorityArn(): String = unwrap(this).getCertificateAuthorityArn()

    /**
     * The Base64 PEM-encoded certificate chain that chains up to the root CA certificate that you
     * used to sign your private CA certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthorityactivation.html#cfn-acmpca-certificateauthorityactivation-certificatechain)
     */
    override fun certificateChain(): String? = unwrap(this).getCertificateChain()

    /**
     * Status of your private CA.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificateauthorityactivation.html#cfn-acmpca-certificateauthorityactivation-status)
     */
    override fun status(): String? = unwrap(this).getStatus()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnCertificateAuthorityActivationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityActivationProps):
        CfnCertificateAuthorityActivationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnCertificateAuthorityActivationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCertificateAuthorityActivationProps):
        software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityActivationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.acmpca.CfnCertificateAuthorityActivationProps
  }
}
