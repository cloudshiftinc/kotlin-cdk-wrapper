package io.cloudshiftdev.awscdk.services.dms

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCertificate internal constructor(
  private val cdkObject: software.amazon.awscdk.services.dms.CfnCertificate,
) : CfnResource(cdkObject), IInspectable {
  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * A customer-assigned name for the certificate.
   */
  public open fun certificateIdentifier(): String? = unwrap(this).getCertificateIdentifier()

  /**
   * A customer-assigned name for the certificate.
   */
  public open fun certificateIdentifier(`value`: String) {
    unwrap(this).setCertificateIdentifier(`value`)
  }

  /**
   * The contents of a `.pem` file, which contains an X.509 certificate.
   */
  public open fun certificatePem(): String? = unwrap(this).getCertificatePem()

  /**
   * The contents of a `.pem` file, which contains an X.509 certificate.
   */
  public open fun certificatePem(`value`: String) {
    unwrap(this).setCertificatePem(`value`)
  }

  /**
   * The location of an imported Oracle Wallet certificate for use with SSL.
   */
  public open fun certificateWallet(): String? = unwrap(this).getCertificateWallet()

  /**
   * The location of an imported Oracle Wallet certificate for use with SSL.
   */
  public open fun certificateWallet(`value`: String) {
    unwrap(this).setCertificateWallet(`value`)
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
   * A fluent builder for [io.cloudshiftdev.awscdk.services.dms.CfnCertificate].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A customer-assigned name for the certificate.
     *
     * Identifiers must begin with a letter and must contain only ASCII letters, digits, and
     * hyphens. They can't end with a hyphen or contain two consecutive hyphens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-certificate.html#cfn-dms-certificate-certificateidentifier)
     * @param certificateIdentifier A customer-assigned name for the certificate. 
     */
    public fun certificateIdentifier(certificateIdentifier: String)

    /**
     * The contents of a `.pem` file, which contains an X.509 certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-certificate.html#cfn-dms-certificate-certificatepem)
     * @param certificatePem The contents of a `.pem` file, which contains an X.509 certificate. 
     */
    public fun certificatePem(certificatePem: String)

    /**
     * The location of an imported Oracle Wallet certificate for use with SSL.
     *
     * An example is: `filebase64("${path.root}/rds-ca-2019-root.sso")`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-certificate.html#cfn-dms-certificate-certificatewallet)
     * @param certificateWallet The location of an imported Oracle Wallet certificate for use with
     * SSL. 
     */
    public fun certificateWallet(certificateWallet: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dms.CfnCertificate.Builder =
        software.amazon.awscdk.services.dms.CfnCertificate.Builder.create(scope, id)

    /**
     * A customer-assigned name for the certificate.
     *
     * Identifiers must begin with a letter and must contain only ASCII letters, digits, and
     * hyphens. They can't end with a hyphen or contain two consecutive hyphens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-certificate.html#cfn-dms-certificate-certificateidentifier)
     * @param certificateIdentifier A customer-assigned name for the certificate. 
     */
    override fun certificateIdentifier(certificateIdentifier: String) {
      cdkBuilder.certificateIdentifier(certificateIdentifier)
    }

    /**
     * The contents of a `.pem` file, which contains an X.509 certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-certificate.html#cfn-dms-certificate-certificatepem)
     * @param certificatePem The contents of a `.pem` file, which contains an X.509 certificate. 
     */
    override fun certificatePem(certificatePem: String) {
      cdkBuilder.certificatePem(certificatePem)
    }

    /**
     * The location of an imported Oracle Wallet certificate for use with SSL.
     *
     * An example is: `filebase64("${path.root}/rds-ca-2019-root.sso")`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-certificate.html#cfn-dms-certificate-certificatewallet)
     * @param certificateWallet The location of an imported Oracle Wallet certificate for use with
     * SSL. 
     */
    override fun certificateWallet(certificateWallet: String) {
      cdkBuilder.certificateWallet(certificateWallet)
    }

    public fun build(): software.amazon.awscdk.services.dms.CfnCertificate = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCertificate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCertificate(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnCertificate): CfnCertificate
        = CfnCertificate(cdkObject)

    internal fun unwrap(wrapped: CfnCertificate): software.amazon.awscdk.services.dms.CfnCertificate
        = wrapped.cdkObject
  }
}
