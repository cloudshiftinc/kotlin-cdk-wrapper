package io.cloudshiftdev.awscdk.services.dms

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface CfnCertificateProps {
  /**
   * A customer-assigned name for the certificate.
   *
   * Identifiers must begin with a letter and must contain only ASCII letters, digits, and hyphens.
   * They can't end with a hyphen or contain two consecutive hyphens.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-certificate.html#cfn-dms-certificate-certificateidentifier)
   */
  public fun certificateIdentifier(): String? = unwrap(this).getCertificateIdentifier()

  /**
   * The contents of a `.pem` file, which contains an X.509 certificate.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-certificate.html#cfn-dms-certificate-certificatepem)
   */
  public fun certificatePem(): String? = unwrap(this).getCertificatePem()

  /**
   * The location of an imported Oracle Wallet certificate for use with SSL.
   *
   * An example is: `filebase64("${path.root}/rds-ca-2019-root.sso")`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-certificate.html#cfn-dms-certificate-certificatewallet)
   */
  public fun certificateWallet(): String? = unwrap(this).getCertificateWallet()

  /**
   * A builder for [CfnCertificateProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param certificateIdentifier A customer-assigned name for the certificate.
     * Identifiers must begin with a letter and must contain only ASCII letters, digits, and
     * hyphens. They can't end with a hyphen or contain two consecutive hyphens.
     */
    public fun certificateIdentifier(certificateIdentifier: String)

    /**
     * @param certificatePem The contents of a `.pem` file, which contains an X.509 certificate.
     */
    public fun certificatePem(certificatePem: String)

    /**
     * @param certificateWallet The location of an imported Oracle Wallet certificate for use with
     * SSL.
     * An example is: `filebase64("${path.root}/rds-ca-2019-root.sso")`
     */
    public fun certificateWallet(certificateWallet: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dms.CfnCertificateProps.Builder =
        software.amazon.awscdk.services.dms.CfnCertificateProps.builder()

    /**
     * @param certificateIdentifier A customer-assigned name for the certificate.
     * Identifiers must begin with a letter and must contain only ASCII letters, digits, and
     * hyphens. They can't end with a hyphen or contain two consecutive hyphens.
     */
    override fun certificateIdentifier(certificateIdentifier: String) {
      cdkBuilder.certificateIdentifier(certificateIdentifier)
    }

    /**
     * @param certificatePem The contents of a `.pem` file, which contains an X.509 certificate.
     */
    override fun certificatePem(certificatePem: String) {
      cdkBuilder.certificatePem(certificatePem)
    }

    /**
     * @param certificateWallet The location of an imported Oracle Wallet certificate for use with
     * SSL.
     * An example is: `filebase64("${path.root}/rds-ca-2019-root.sso")`
     */
    override fun certificateWallet(certificateWallet: String) {
      cdkBuilder.certificateWallet(certificateWallet)
    }

    public fun build(): software.amazon.awscdk.services.dms.CfnCertificateProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.dms.CfnCertificateProps,
  ) : CdkObject(cdkObject), CfnCertificateProps {
    /**
     * A customer-assigned name for the certificate.
     *
     * Identifiers must begin with a letter and must contain only ASCII letters, digits, and
     * hyphens. They can't end with a hyphen or contain two consecutive hyphens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-certificate.html#cfn-dms-certificate-certificateidentifier)
     */
    override fun certificateIdentifier(): String? = unwrap(this).getCertificateIdentifier()

    /**
     * The contents of a `.pem` file, which contains an X.509 certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-certificate.html#cfn-dms-certificate-certificatepem)
     */
    override fun certificatePem(): String? = unwrap(this).getCertificatePem()

    /**
     * The location of an imported Oracle Wallet certificate for use with SSL.
     *
     * An example is: `filebase64("${path.root}/rds-ca-2019-root.sso")`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-certificate.html#cfn-dms-certificate-certificatewallet)
     */
    override fun certificateWallet(): String? = unwrap(this).getCertificateWallet()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCertificateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnCertificateProps):
        CfnCertificateProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCertificateProps):
        software.amazon.awscdk.services.dms.CfnCertificateProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.dms.CfnCertificateProps
  }
}
