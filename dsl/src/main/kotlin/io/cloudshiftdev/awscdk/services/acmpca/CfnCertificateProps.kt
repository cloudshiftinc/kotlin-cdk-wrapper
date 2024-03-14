package io.cloudshiftdev.awscdk.services.acmpca

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnCertificateProps {
  /**
   * Specifies X.509 certificate information to be included in the issued certificate. An
   * `APIPassthrough` or `APICSRPassthrough` template variant must be selected, or else this parameter
   * is ignored.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificate.html#cfn-acmpca-certificate-apipassthrough)
   */
  public fun apiPassthrough(): Any? = unwrap(this).getApiPassthrough()

  /**
   * The Amazon Resource Name (ARN) for the private CA issues the certificate.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificate.html#cfn-acmpca-certificate-certificateauthorityarn)
   */
  public fun certificateAuthorityArn(): String

  /**
   * The certificate signing request (CSR) for the certificate.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificate.html#cfn-acmpca-certificate-certificatesigningrequest)
   */
  public fun certificateSigningRequest(): String

  /**
   * The name of the algorithm that will be used to sign the certificate to be issued.
   *
   * This parameter should not be confused with the `SigningAlgorithm` parameter used to sign a CSR
   * in the `CreateCertificateAuthority` action.
   *
   *
   * The specified signing algorithm family (RSA or ECDSA) must match the algorithm family of the
   * CA's secret key.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificate.html#cfn-acmpca-certificate-signingalgorithm)
   */
  public fun signingAlgorithm(): String

  /**
   * Specifies a custom configuration template to use when issuing a certificate.
   *
   * If this parameter is not provided, AWS Private CA defaults to the `EndEntityCertificate/V1`
   * template. For more information about AWS Private CA templates, see [Using
   * Templates](https://docs.aws.amazon.com/privateca/latest/userguide/UsingTemplates.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificate.html#cfn-acmpca-certificate-templatearn)
   */
  public fun templateArn(): String? = unwrap(this).getTemplateArn()

  /**
   * The period of time during which the certificate will be valid.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificate.html#cfn-acmpca-certificate-validity)
   */
  public fun validity(): Any

  /**
   * Information describing the start of the validity period of the certificate.
   *
   * This parameter sets the “Not Before" date for the certificate.
   *
   * By default, when issuing a certificate, AWS Private CA sets the "Not Before" date to the
   * issuance time minus 60 minutes. This compensates for clock inconsistencies across computer
   * systems. The `ValidityNotBefore` parameter can be used to customize the “Not Before” value.
   *
   * Unlike the `Validity` parameter, the `ValidityNotBefore` parameter is optional.
   *
   * The `ValidityNotBefore` value is expressed as an explicit date and time, using the `Validity`
   * type value `ABSOLUTE` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificate.html#cfn-acmpca-certificate-validitynotbefore)
   */
  public fun validityNotBefore(): Any? = unwrap(this).getValidityNotBefore()

  /**
   * A builder for [CfnCertificateProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param apiPassthrough Specifies X.509 certificate information to be included in the issued
     * certificate. An `APIPassthrough` or `APICSRPassthrough` template variant must be selected, or
     * else this parameter is ignored.
     */
    public fun apiPassthrough(apiPassthrough: IResolvable)

    /**
     * @param apiPassthrough Specifies X.509 certificate information to be included in the issued
     * certificate. An `APIPassthrough` or `APICSRPassthrough` template variant must be selected, or
     * else this parameter is ignored.
     */
    public fun apiPassthrough(apiPassthrough: CfnCertificate.ApiPassthroughProperty)

    /**
     * @param apiPassthrough Specifies X.509 certificate information to be included in the issued
     * certificate. An `APIPassthrough` or `APICSRPassthrough` template variant must be selected, or
     * else this parameter is ignored.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("23cbad4145f44d42136bfd94d12a001f9ef4a65596a9db24a7c200909ce700bf")
    public
        fun apiPassthrough(apiPassthrough: CfnCertificate.ApiPassthroughProperty.Builder.() -> Unit)

    /**
     * @param certificateAuthorityArn The Amazon Resource Name (ARN) for the private CA issues the
     * certificate. 
     */
    public fun certificateAuthorityArn(certificateAuthorityArn: String)

    /**
     * @param certificateSigningRequest The certificate signing request (CSR) for the certificate. 
     */
    public fun certificateSigningRequest(certificateSigningRequest: String)

    /**
     * @param signingAlgorithm The name of the algorithm that will be used to sign the certificate
     * to be issued. 
     * This parameter should not be confused with the `SigningAlgorithm` parameter used to sign a
     * CSR in the `CreateCertificateAuthority` action.
     *
     *
     * The specified signing algorithm family (RSA or ECDSA) must match the algorithm family of the
     * CA's secret key.
     */
    public fun signingAlgorithm(signingAlgorithm: String)

    /**
     * @param templateArn Specifies a custom configuration template to use when issuing a
     * certificate.
     * If this parameter is not provided, AWS Private CA defaults to the `EndEntityCertificate/V1`
     * template. For more information about AWS Private CA templates, see [Using
     * Templates](https://docs.aws.amazon.com/privateca/latest/userguide/UsingTemplates.html) .
     */
    public fun templateArn(templateArn: String)

    /**
     * @param validity The period of time during which the certificate will be valid. 
     */
    public fun validity(validity: IResolvable)

    /**
     * @param validity The period of time during which the certificate will be valid. 
     */
    public fun validity(validity: CfnCertificate.ValidityProperty)

    /**
     * @param validity The period of time during which the certificate will be valid. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8b418ede2b97862b13595cbedbaa26b624edbb9db6a055495919cf025ee48f8e")
    public fun validity(validity: CfnCertificate.ValidityProperty.Builder.() -> Unit)

    /**
     * @param validityNotBefore Information describing the start of the validity period of the
     * certificate.
     * This parameter sets the “Not Before" date for the certificate.
     *
     * By default, when issuing a certificate, AWS Private CA sets the "Not Before" date to the
     * issuance time minus 60 minutes. This compensates for clock inconsistencies across computer
     * systems. The `ValidityNotBefore` parameter can be used to customize the “Not Before” value.
     *
     * Unlike the `Validity` parameter, the `ValidityNotBefore` parameter is optional.
     *
     * The `ValidityNotBefore` value is expressed as an explicit date and time, using the `Validity`
     * type value `ABSOLUTE` .
     */
    public fun validityNotBefore(validityNotBefore: IResolvable)

    /**
     * @param validityNotBefore Information describing the start of the validity period of the
     * certificate.
     * This parameter sets the “Not Before" date for the certificate.
     *
     * By default, when issuing a certificate, AWS Private CA sets the "Not Before" date to the
     * issuance time minus 60 minutes. This compensates for clock inconsistencies across computer
     * systems. The `ValidityNotBefore` parameter can be used to customize the “Not Before” value.
     *
     * Unlike the `Validity` parameter, the `ValidityNotBefore` parameter is optional.
     *
     * The `ValidityNotBefore` value is expressed as an explicit date and time, using the `Validity`
     * type value `ABSOLUTE` .
     */
    public fun validityNotBefore(validityNotBefore: CfnCertificate.ValidityProperty)

    /**
     * @param validityNotBefore Information describing the start of the validity period of the
     * certificate.
     * This parameter sets the “Not Before" date for the certificate.
     *
     * By default, when issuing a certificate, AWS Private CA sets the "Not Before" date to the
     * issuance time minus 60 minutes. This compensates for clock inconsistencies across computer
     * systems. The `ValidityNotBefore` parameter can be used to customize the “Not Before” value.
     *
     * Unlike the `Validity` parameter, the `ValidityNotBefore` parameter is optional.
     *
     * The `ValidityNotBefore` value is expressed as an explicit date and time, using the `Validity`
     * type value `ABSOLUTE` .
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("75a4d565321d16c81001aa9b08097db75f1d420a9a5b9a711d19a020c8856b17")
    public
        fun validityNotBefore(validityNotBefore: CfnCertificate.ValidityProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.acmpca.CfnCertificateProps.Builder =
        software.amazon.awscdk.services.acmpca.CfnCertificateProps.builder()

    /**
     * @param apiPassthrough Specifies X.509 certificate information to be included in the issued
     * certificate. An `APIPassthrough` or `APICSRPassthrough` template variant must be selected, or
     * else this parameter is ignored.
     */
    override fun apiPassthrough(apiPassthrough: IResolvable) {
      cdkBuilder.apiPassthrough(apiPassthrough.let(IResolvable::unwrap))
    }

    /**
     * @param apiPassthrough Specifies X.509 certificate information to be included in the issued
     * certificate. An `APIPassthrough` or `APICSRPassthrough` template variant must be selected, or
     * else this parameter is ignored.
     */
    override fun apiPassthrough(apiPassthrough: CfnCertificate.ApiPassthroughProperty) {
      cdkBuilder.apiPassthrough(apiPassthrough.let(CfnCertificate.ApiPassthroughProperty::unwrap))
    }

    /**
     * @param apiPassthrough Specifies X.509 certificate information to be included in the issued
     * certificate. An `APIPassthrough` or `APICSRPassthrough` template variant must be selected, or
     * else this parameter is ignored.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("23cbad4145f44d42136bfd94d12a001f9ef4a65596a9db24a7c200909ce700bf")
    override
        fun apiPassthrough(apiPassthrough: CfnCertificate.ApiPassthroughProperty.Builder.() -> Unit):
        Unit = apiPassthrough(CfnCertificate.ApiPassthroughProperty(apiPassthrough))

    /**
     * @param certificateAuthorityArn The Amazon Resource Name (ARN) for the private CA issues the
     * certificate. 
     */
    override fun certificateAuthorityArn(certificateAuthorityArn: String) {
      cdkBuilder.certificateAuthorityArn(certificateAuthorityArn)
    }

    /**
     * @param certificateSigningRequest The certificate signing request (CSR) for the certificate. 
     */
    override fun certificateSigningRequest(certificateSigningRequest: String) {
      cdkBuilder.certificateSigningRequest(certificateSigningRequest)
    }

    /**
     * @param signingAlgorithm The name of the algorithm that will be used to sign the certificate
     * to be issued. 
     * This parameter should not be confused with the `SigningAlgorithm` parameter used to sign a
     * CSR in the `CreateCertificateAuthority` action.
     *
     *
     * The specified signing algorithm family (RSA or ECDSA) must match the algorithm family of the
     * CA's secret key.
     */
    override fun signingAlgorithm(signingAlgorithm: String) {
      cdkBuilder.signingAlgorithm(signingAlgorithm)
    }

    /**
     * @param templateArn Specifies a custom configuration template to use when issuing a
     * certificate.
     * If this parameter is not provided, AWS Private CA defaults to the `EndEntityCertificate/V1`
     * template. For more information about AWS Private CA templates, see [Using
     * Templates](https://docs.aws.amazon.com/privateca/latest/userguide/UsingTemplates.html) .
     */
    override fun templateArn(templateArn: String) {
      cdkBuilder.templateArn(templateArn)
    }

    /**
     * @param validity The period of time during which the certificate will be valid. 
     */
    override fun validity(validity: IResolvable) {
      cdkBuilder.validity(validity.let(IResolvable::unwrap))
    }

    /**
     * @param validity The period of time during which the certificate will be valid. 
     */
    override fun validity(validity: CfnCertificate.ValidityProperty) {
      cdkBuilder.validity(validity.let(CfnCertificate.ValidityProperty::unwrap))
    }

    /**
     * @param validity The period of time during which the certificate will be valid. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8b418ede2b97862b13595cbedbaa26b624edbb9db6a055495919cf025ee48f8e")
    override fun validity(validity: CfnCertificate.ValidityProperty.Builder.() -> Unit): Unit =
        validity(CfnCertificate.ValidityProperty(validity))

    /**
     * @param validityNotBefore Information describing the start of the validity period of the
     * certificate.
     * This parameter sets the “Not Before" date for the certificate.
     *
     * By default, when issuing a certificate, AWS Private CA sets the "Not Before" date to the
     * issuance time minus 60 minutes. This compensates for clock inconsistencies across computer
     * systems. The `ValidityNotBefore` parameter can be used to customize the “Not Before” value.
     *
     * Unlike the `Validity` parameter, the `ValidityNotBefore` parameter is optional.
     *
     * The `ValidityNotBefore` value is expressed as an explicit date and time, using the `Validity`
     * type value `ABSOLUTE` .
     */
    override fun validityNotBefore(validityNotBefore: IResolvable) {
      cdkBuilder.validityNotBefore(validityNotBefore.let(IResolvable::unwrap))
    }

    /**
     * @param validityNotBefore Information describing the start of the validity period of the
     * certificate.
     * This parameter sets the “Not Before" date for the certificate.
     *
     * By default, when issuing a certificate, AWS Private CA sets the "Not Before" date to the
     * issuance time minus 60 minutes. This compensates for clock inconsistencies across computer
     * systems. The `ValidityNotBefore` parameter can be used to customize the “Not Before” value.
     *
     * Unlike the `Validity` parameter, the `ValidityNotBefore` parameter is optional.
     *
     * The `ValidityNotBefore` value is expressed as an explicit date and time, using the `Validity`
     * type value `ABSOLUTE` .
     */
    override fun validityNotBefore(validityNotBefore: CfnCertificate.ValidityProperty) {
      cdkBuilder.validityNotBefore(validityNotBefore.let(CfnCertificate.ValidityProperty::unwrap))
    }

    /**
     * @param validityNotBefore Information describing the start of the validity period of the
     * certificate.
     * This parameter sets the “Not Before" date for the certificate.
     *
     * By default, when issuing a certificate, AWS Private CA sets the "Not Before" date to the
     * issuance time minus 60 minutes. This compensates for clock inconsistencies across computer
     * systems. The `ValidityNotBefore` parameter can be used to customize the “Not Before” value.
     *
     * Unlike the `Validity` parameter, the `ValidityNotBefore` parameter is optional.
     *
     * The `ValidityNotBefore` value is expressed as an explicit date and time, using the `Validity`
     * type value `ABSOLUTE` .
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("75a4d565321d16c81001aa9b08097db75f1d420a9a5b9a711d19a020c8856b17")
    override
        fun validityNotBefore(validityNotBefore: CfnCertificate.ValidityProperty.Builder.() -> Unit):
        Unit = validityNotBefore(CfnCertificate.ValidityProperty(validityNotBefore))

    public fun build(): software.amazon.awscdk.services.acmpca.CfnCertificateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificateProps,
  ) : CdkObject(cdkObject), CfnCertificateProps {
    /**
     * Specifies X.509 certificate information to be included in the issued certificate. An
     * `APIPassthrough` or `APICSRPassthrough` template variant must be selected, or else this
     * parameter is ignored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificate.html#cfn-acmpca-certificate-apipassthrough)
     */
    override fun apiPassthrough(): Any? = unwrap(this).getApiPassthrough()

    /**
     * The Amazon Resource Name (ARN) for the private CA issues the certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificate.html#cfn-acmpca-certificate-certificateauthorityarn)
     */
    override fun certificateAuthorityArn(): String = unwrap(this).getCertificateAuthorityArn()

    /**
     * The certificate signing request (CSR) for the certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificate.html#cfn-acmpca-certificate-certificatesigningrequest)
     */
    override fun certificateSigningRequest(): String = unwrap(this).getCertificateSigningRequest()

    /**
     * The name of the algorithm that will be used to sign the certificate to be issued.
     *
     * This parameter should not be confused with the `SigningAlgorithm` parameter used to sign a
     * CSR in the `CreateCertificateAuthority` action.
     *
     *
     * The specified signing algorithm family (RSA or ECDSA) must match the algorithm family of the
     * CA's secret key.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificate.html#cfn-acmpca-certificate-signingalgorithm)
     */
    override fun signingAlgorithm(): String = unwrap(this).getSigningAlgorithm()

    /**
     * Specifies a custom configuration template to use when issuing a certificate.
     *
     * If this parameter is not provided, AWS Private CA defaults to the `EndEntityCertificate/V1`
     * template. For more information about AWS Private CA templates, see [Using
     * Templates](https://docs.aws.amazon.com/privateca/latest/userguide/UsingTemplates.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificate.html#cfn-acmpca-certificate-templatearn)
     */
    override fun templateArn(): String? = unwrap(this).getTemplateArn()

    /**
     * The period of time during which the certificate will be valid.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificate.html#cfn-acmpca-certificate-validity)
     */
    override fun validity(): Any = unwrap(this).getValidity()

    /**
     * Information describing the start of the validity period of the certificate.
     *
     * This parameter sets the “Not Before" date for the certificate.
     *
     * By default, when issuing a certificate, AWS Private CA sets the "Not Before" date to the
     * issuance time minus 60 minutes. This compensates for clock inconsistencies across computer
     * systems. The `ValidityNotBefore` parameter can be used to customize the “Not Before” value.
     *
     * Unlike the `Validity` parameter, the `ValidityNotBefore` parameter is optional.
     *
     * The `ValidityNotBefore` value is expressed as an explicit date and time, using the `Validity`
     * type value `ABSOLUTE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificate.html#cfn-acmpca-certificate-validitynotbefore)
     */
    override fun validityNotBefore(): Any? = unwrap(this).getValidityNotBefore()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCertificateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificateProps):
        CfnCertificateProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCertificateProps):
        software.amazon.awscdk.services.acmpca.CfnCertificateProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.acmpca.CfnCertificateProps
  }
}
