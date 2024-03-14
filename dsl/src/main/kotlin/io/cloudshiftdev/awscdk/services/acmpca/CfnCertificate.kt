package io.cloudshiftdev.awscdk.services.acmpca

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCertificate internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificate,
) : CfnResource(cdkObject), IInspectable {
  /**
   * Specifies X.509 certificate information to be included in the issued certificate. An
   * `APIPassthrough` or `APICSRPassthrough` template variant must be selected, or else this parameter
   * is ignored.
   */
  public open fun apiPassthrough(): Any? = unwrap(this).getApiPassthrough()

  /**
   * Specifies X.509 certificate information to be included in the issued certificate. An
   * `APIPassthrough` or `APICSRPassthrough` template variant must be selected, or else this parameter
   * is ignored.
   */
  public open fun apiPassthrough(`value`: IResolvable) {
    unwrap(this).setApiPassthrough(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies X.509 certificate information to be included in the issued certificate. An
   * `APIPassthrough` or `APICSRPassthrough` template variant must be selected, or else this parameter
   * is ignored.
   */
  public open fun apiPassthrough(`value`: ApiPassthroughProperty) {
    unwrap(this).setApiPassthrough(`value`.let(ApiPassthroughProperty::unwrap))
  }

  /**
   * Specifies X.509 certificate information to be included in the issued certificate. An
   * `APIPassthrough` or `APICSRPassthrough` template variant must be selected, or else this parameter
   * is ignored.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("565c1eb4508e02ca7ca34fce3c451b90ca042a9298862ac73b56d596bd6a0763")
  public open fun apiPassthrough(`value`: ApiPassthroughProperty.Builder.() -> Unit): Unit =
      apiPassthrough(ApiPassthroughProperty(`value`))

  /**
   * The Amazon Resource Name (ARN) of the issued certificate.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The issued Base64 PEM-encoded certificate.
   */
  public open fun attrCertificate(): String = unwrap(this).getAttrCertificate()

  /**
   * The Amazon Resource Name (ARN) for the private CA issues the certificate.
   */
  public open fun certificateAuthorityArn(): String = unwrap(this).getCertificateAuthorityArn()

  /**
   * The Amazon Resource Name (ARN) for the private CA issues the certificate.
   */
  public open fun certificateAuthorityArn(`value`: String) {
    unwrap(this).setCertificateAuthorityArn(`value`)
  }

  /**
   * The certificate signing request (CSR) for the certificate.
   */
  public open fun certificateSigningRequest(): String = unwrap(this).getCertificateSigningRequest()

  /**
   * The certificate signing request (CSR) for the certificate.
   */
  public open fun certificateSigningRequest(`value`: String) {
    unwrap(this).setCertificateSigningRequest(`value`)
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
   * The name of the algorithm that will be used to sign the certificate to be issued.
   */
  public open fun signingAlgorithm(): String = unwrap(this).getSigningAlgorithm()

  /**
   * The name of the algorithm that will be used to sign the certificate to be issued.
   */
  public open fun signingAlgorithm(`value`: String) {
    unwrap(this).setSigningAlgorithm(`value`)
  }

  /**
   * Specifies a custom configuration template to use when issuing a certificate.
   */
  public open fun templateArn(): String? = unwrap(this).getTemplateArn()

  /**
   * Specifies a custom configuration template to use when issuing a certificate.
   */
  public open fun templateArn(`value`: String) {
    unwrap(this).setTemplateArn(`value`)
  }

  /**
   * The period of time during which the certificate will be valid.
   */
  public open fun validity(): Any = unwrap(this).getValidity()

  /**
   * The period of time during which the certificate will be valid.
   */
  public open fun validity(`value`: IResolvable) {
    unwrap(this).setValidity(`value`.let(IResolvable::unwrap))
  }

  /**
   * The period of time during which the certificate will be valid.
   */
  public open fun validity(`value`: ValidityProperty) {
    unwrap(this).setValidity(`value`.let(ValidityProperty::unwrap))
  }

  /**
   * The period of time during which the certificate will be valid.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("49edde1d6c8262ee5dcb27fe688ac660fb85fa61e2337bf0b4e487da3603efcf")
  public open fun validity(`value`: ValidityProperty.Builder.() -> Unit): Unit =
      validity(ValidityProperty(`value`))

  /**
   * Information describing the start of the validity period of the certificate.
   */
  public open fun validityNotBefore(): Any? = unwrap(this).getValidityNotBefore()

  /**
   * Information describing the start of the validity period of the certificate.
   */
  public open fun validityNotBefore(`value`: IResolvable) {
    unwrap(this).setValidityNotBefore(`value`.let(IResolvable::unwrap))
  }

  /**
   * Information describing the start of the validity period of the certificate.
   */
  public open fun validityNotBefore(`value`: ValidityProperty) {
    unwrap(this).setValidityNotBefore(`value`.let(ValidityProperty::unwrap))
  }

  /**
   * Information describing the start of the validity period of the certificate.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2ba2695733c613ab9a83ef7001d6ab81b5677e6f4d6ebd3f8cee4103528512f5")
  public open fun validityNotBefore(`value`: ValidityProperty.Builder.() -> Unit): Unit =
      validityNotBefore(ValidityProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.acmpca.CfnCertificate].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies X.509 certificate information to be included in the issued certificate. An
     * `APIPassthrough` or `APICSRPassthrough` template variant must be selected, or else this
     * parameter is ignored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificate.html#cfn-acmpca-certificate-apipassthrough)
     * @param apiPassthrough Specifies X.509 certificate information to be included in the issued
     * certificate. An `APIPassthrough` or `APICSRPassthrough` template variant must be selected, or
     * else this parameter is ignored. 
     */
    public fun apiPassthrough(apiPassthrough: IResolvable)

    /**
     * Specifies X.509 certificate information to be included in the issued certificate. An
     * `APIPassthrough` or `APICSRPassthrough` template variant must be selected, or else this
     * parameter is ignored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificate.html#cfn-acmpca-certificate-apipassthrough)
     * @param apiPassthrough Specifies X.509 certificate information to be included in the issued
     * certificate. An `APIPassthrough` or `APICSRPassthrough` template variant must be selected, or
     * else this parameter is ignored. 
     */
    public fun apiPassthrough(apiPassthrough: ApiPassthroughProperty)

    /**
     * Specifies X.509 certificate information to be included in the issued certificate. An
     * `APIPassthrough` or `APICSRPassthrough` template variant must be selected, or else this
     * parameter is ignored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificate.html#cfn-acmpca-certificate-apipassthrough)
     * @param apiPassthrough Specifies X.509 certificate information to be included in the issued
     * certificate. An `APIPassthrough` or `APICSRPassthrough` template variant must be selected, or
     * else this parameter is ignored. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4a0f3e97e90bcc47dd6dd05629ad56eda48248296dea15b86de83bdfb30aae6c")
    public fun apiPassthrough(apiPassthrough: ApiPassthroughProperty.Builder.() -> Unit)

    /**
     * The Amazon Resource Name (ARN) for the private CA issues the certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificate.html#cfn-acmpca-certificate-certificateauthorityarn)
     * @param certificateAuthorityArn The Amazon Resource Name (ARN) for the private CA issues the
     * certificate. 
     */
    public fun certificateAuthorityArn(certificateAuthorityArn: String)

    /**
     * The certificate signing request (CSR) for the certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificate.html#cfn-acmpca-certificate-certificatesigningrequest)
     * @param certificateSigningRequest The certificate signing request (CSR) for the certificate. 
     */
    public fun certificateSigningRequest(certificateSigningRequest: String)

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
     * @param signingAlgorithm The name of the algorithm that will be used to sign the certificate
     * to be issued. 
     */
    public fun signingAlgorithm(signingAlgorithm: String)

    /**
     * Specifies a custom configuration template to use when issuing a certificate.
     *
     * If this parameter is not provided, AWS Private CA defaults to the `EndEntityCertificate/V1`
     * template. For more information about AWS Private CA templates, see [Using
     * Templates](https://docs.aws.amazon.com/privateca/latest/userguide/UsingTemplates.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificate.html#cfn-acmpca-certificate-templatearn)
     * @param templateArn Specifies a custom configuration template to use when issuing a
     * certificate. 
     */
    public fun templateArn(templateArn: String)

    /**
     * The period of time during which the certificate will be valid.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificate.html#cfn-acmpca-certificate-validity)
     * @param validity The period of time during which the certificate will be valid. 
     */
    public fun validity(validity: IResolvable)

    /**
     * The period of time during which the certificate will be valid.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificate.html#cfn-acmpca-certificate-validity)
     * @param validity The period of time during which the certificate will be valid. 
     */
    public fun validity(validity: ValidityProperty)

    /**
     * The period of time during which the certificate will be valid.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificate.html#cfn-acmpca-certificate-validity)
     * @param validity The period of time during which the certificate will be valid. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2135e3b738ee43a1c9aefd8287583ea25e162de9c55128b22203b9a5eb39483a")
    public fun validity(validity: ValidityProperty.Builder.() -> Unit)

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
     * @param validityNotBefore Information describing the start of the validity period of the
     * certificate. 
     */
    public fun validityNotBefore(validityNotBefore: IResolvable)

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
     * @param validityNotBefore Information describing the start of the validity period of the
     * certificate. 
     */
    public fun validityNotBefore(validityNotBefore: ValidityProperty)

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
     * @param validityNotBefore Information describing the start of the validity period of the
     * certificate. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ef057b0455ab55481fcb02ec9d1a835d1d51f8b02a71a15350ad792b8eca4b82")
    public fun validityNotBefore(validityNotBefore: ValidityProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.acmpca.CfnCertificate.Builder =
        software.amazon.awscdk.services.acmpca.CfnCertificate.Builder.create(scope, id)

    /**
     * Specifies X.509 certificate information to be included in the issued certificate. An
     * `APIPassthrough` or `APICSRPassthrough` template variant must be selected, or else this
     * parameter is ignored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificate.html#cfn-acmpca-certificate-apipassthrough)
     * @param apiPassthrough Specifies X.509 certificate information to be included in the issued
     * certificate. An `APIPassthrough` or `APICSRPassthrough` template variant must be selected, or
     * else this parameter is ignored. 
     */
    override fun apiPassthrough(apiPassthrough: IResolvable) {
      cdkBuilder.apiPassthrough(apiPassthrough.let(IResolvable::unwrap))
    }

    /**
     * Specifies X.509 certificate information to be included in the issued certificate. An
     * `APIPassthrough` or `APICSRPassthrough` template variant must be selected, or else this
     * parameter is ignored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificate.html#cfn-acmpca-certificate-apipassthrough)
     * @param apiPassthrough Specifies X.509 certificate information to be included in the issued
     * certificate. An `APIPassthrough` or `APICSRPassthrough` template variant must be selected, or
     * else this parameter is ignored. 
     */
    override fun apiPassthrough(apiPassthrough: ApiPassthroughProperty) {
      cdkBuilder.apiPassthrough(apiPassthrough.let(ApiPassthroughProperty::unwrap))
    }

    /**
     * Specifies X.509 certificate information to be included in the issued certificate. An
     * `APIPassthrough` or `APICSRPassthrough` template variant must be selected, or else this
     * parameter is ignored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificate.html#cfn-acmpca-certificate-apipassthrough)
     * @param apiPassthrough Specifies X.509 certificate information to be included in the issued
     * certificate. An `APIPassthrough` or `APICSRPassthrough` template variant must be selected, or
     * else this parameter is ignored. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4a0f3e97e90bcc47dd6dd05629ad56eda48248296dea15b86de83bdfb30aae6c")
    override fun apiPassthrough(apiPassthrough: ApiPassthroughProperty.Builder.() -> Unit): Unit =
        apiPassthrough(ApiPassthroughProperty(apiPassthrough))

    /**
     * The Amazon Resource Name (ARN) for the private CA issues the certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificate.html#cfn-acmpca-certificate-certificateauthorityarn)
     * @param certificateAuthorityArn The Amazon Resource Name (ARN) for the private CA issues the
     * certificate. 
     */
    override fun certificateAuthorityArn(certificateAuthorityArn: String) {
      cdkBuilder.certificateAuthorityArn(certificateAuthorityArn)
    }

    /**
     * The certificate signing request (CSR) for the certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificate.html#cfn-acmpca-certificate-certificatesigningrequest)
     * @param certificateSigningRequest The certificate signing request (CSR) for the certificate. 
     */
    override fun certificateSigningRequest(certificateSigningRequest: String) {
      cdkBuilder.certificateSigningRequest(certificateSigningRequest)
    }

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
     * @param signingAlgorithm The name of the algorithm that will be used to sign the certificate
     * to be issued. 
     */
    override fun signingAlgorithm(signingAlgorithm: String) {
      cdkBuilder.signingAlgorithm(signingAlgorithm)
    }

    /**
     * Specifies a custom configuration template to use when issuing a certificate.
     *
     * If this parameter is not provided, AWS Private CA defaults to the `EndEntityCertificate/V1`
     * template. For more information about AWS Private CA templates, see [Using
     * Templates](https://docs.aws.amazon.com/privateca/latest/userguide/UsingTemplates.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificate.html#cfn-acmpca-certificate-templatearn)
     * @param templateArn Specifies a custom configuration template to use when issuing a
     * certificate. 
     */
    override fun templateArn(templateArn: String) {
      cdkBuilder.templateArn(templateArn)
    }

    /**
     * The period of time during which the certificate will be valid.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificate.html#cfn-acmpca-certificate-validity)
     * @param validity The period of time during which the certificate will be valid. 
     */
    override fun validity(validity: IResolvable) {
      cdkBuilder.validity(validity.let(IResolvable::unwrap))
    }

    /**
     * The period of time during which the certificate will be valid.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificate.html#cfn-acmpca-certificate-validity)
     * @param validity The period of time during which the certificate will be valid. 
     */
    override fun validity(validity: ValidityProperty) {
      cdkBuilder.validity(validity.let(ValidityProperty::unwrap))
    }

    /**
     * The period of time during which the certificate will be valid.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-acmpca-certificate.html#cfn-acmpca-certificate-validity)
     * @param validity The period of time during which the certificate will be valid. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2135e3b738ee43a1c9aefd8287583ea25e162de9c55128b22203b9a5eb39483a")
    override fun validity(validity: ValidityProperty.Builder.() -> Unit): Unit =
        validity(ValidityProperty(validity))

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
     * @param validityNotBefore Information describing the start of the validity period of the
     * certificate. 
     */
    override fun validityNotBefore(validityNotBefore: IResolvable) {
      cdkBuilder.validityNotBefore(validityNotBefore.let(IResolvable::unwrap))
    }

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
     * @param validityNotBefore Information describing the start of the validity period of the
     * certificate. 
     */
    override fun validityNotBefore(validityNotBefore: ValidityProperty) {
      cdkBuilder.validityNotBefore(validityNotBefore.let(ValidityProperty::unwrap))
    }

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
     * @param validityNotBefore Information describing the start of the validity period of the
     * certificate. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ef057b0455ab55481fcb02ec9d1a835d1d51f8b02a71a15350ad792b8eca4b82")
    override fun validityNotBefore(validityNotBefore: ValidityProperty.Builder.() -> Unit): Unit =
        validityNotBefore(ValidityProperty(validityNotBefore))

    public fun build(): software.amazon.awscdk.services.acmpca.CfnCertificate = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCertificate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCertificate(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificate):
        CfnCertificate = CfnCertificate(cdkObject)

    internal fun unwrap(wrapped: CfnCertificate):
        software.amazon.awscdk.services.acmpca.CfnCertificate = wrapped.cdkObject
  }

  public interface PolicyInformationProperty {
    /**
     * Specifies the object identifier (OID) of the certificate policy under which the certificate
     * was issued.
     *
     * For more information, see NIST's definition of [Object Identifier
     * (OID)](https://docs.aws.amazon.com/https://csrc.nist.gov/glossary/term/Object_Identifier) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-policyinformation.html#cfn-acmpca-certificate-policyinformation-certpolicyid)
     */
    public fun certPolicyId(): String

    /**
     * Modifies the given `CertPolicyId` with a qualifier.
     *
     * AWS Private CA supports the certification practice statement (CPS) qualifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-policyinformation.html#cfn-acmpca-certificate-policyinformation-policyqualifiers)
     */
    public fun policyQualifiers(): Any? = unwrap(this).getPolicyQualifiers()

    /**
     * A builder for [PolicyInformationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param certPolicyId Specifies the object identifier (OID) of the certificate policy under
       * which the certificate was issued. 
       * For more information, see NIST's definition of [Object Identifier
       * (OID)](https://docs.aws.amazon.com/https://csrc.nist.gov/glossary/term/Object_Identifier) .
       */
      public fun certPolicyId(certPolicyId: String)

      /**
       * @param policyQualifiers Modifies the given `CertPolicyId` with a qualifier.
       * AWS Private CA supports the certification practice statement (CPS) qualifier.
       */
      public fun policyQualifiers(policyQualifiers: IResolvable)

      /**
       * @param policyQualifiers Modifies the given `CertPolicyId` with a qualifier.
       * AWS Private CA supports the certification practice statement (CPS) qualifier.
       */
      public fun policyQualifiers(policyQualifiers: List<Any>)

      /**
       * @param policyQualifiers Modifies the given `CertPolicyId` with a qualifier.
       * AWS Private CA supports the certification practice statement (CPS) qualifier.
       */
      public fun policyQualifiers(vararg policyQualifiers: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.acmpca.CfnCertificate.PolicyInformationProperty.Builder =
          software.amazon.awscdk.services.acmpca.CfnCertificate.PolicyInformationProperty.builder()

      /**
       * @param certPolicyId Specifies the object identifier (OID) of the certificate policy under
       * which the certificate was issued. 
       * For more information, see NIST's definition of [Object Identifier
       * (OID)](https://docs.aws.amazon.com/https://csrc.nist.gov/glossary/term/Object_Identifier) .
       */
      override fun certPolicyId(certPolicyId: String) {
        cdkBuilder.certPolicyId(certPolicyId)
      }

      /**
       * @param policyQualifiers Modifies the given `CertPolicyId` with a qualifier.
       * AWS Private CA supports the certification practice statement (CPS) qualifier.
       */
      override fun policyQualifiers(policyQualifiers: IResolvable) {
        cdkBuilder.policyQualifiers(policyQualifiers.let(IResolvable::unwrap))
      }

      /**
       * @param policyQualifiers Modifies the given `CertPolicyId` with a qualifier.
       * AWS Private CA supports the certification practice statement (CPS) qualifier.
       */
      override fun policyQualifiers(policyQualifiers: List<Any>) {
        cdkBuilder.policyQualifiers(policyQualifiers)
      }

      /**
       * @param policyQualifiers Modifies the given `CertPolicyId` with a qualifier.
       * AWS Private CA supports the certification practice statement (CPS) qualifier.
       */
      override fun policyQualifiers(vararg policyQualifiers: Any): Unit =
          policyQualifiers(policyQualifiers.toList())

      public fun build():
          software.amazon.awscdk.services.acmpca.CfnCertificate.PolicyInformationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.acmpca.CfnCertificate.PolicyInformationProperty,
    ) : CdkObject(cdkObject), PolicyInformationProperty {
      /**
       * Specifies the object identifier (OID) of the certificate policy under which the certificate
       * was issued.
       *
       * For more information, see NIST's definition of [Object Identifier
       * (OID)](https://docs.aws.amazon.com/https://csrc.nist.gov/glossary/term/Object_Identifier) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-policyinformation.html#cfn-acmpca-certificate-policyinformation-certpolicyid)
       */
      override fun certPolicyId(): String = unwrap(this).getCertPolicyId()

      /**
       * Modifies the given `CertPolicyId` with a qualifier.
       *
       * AWS Private CA supports the certification practice statement (CPS) qualifier.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-policyinformation.html#cfn-acmpca-certificate-policyinformation-policyqualifiers)
       */
      override fun policyQualifiers(): Any? = unwrap(this).getPolicyQualifiers()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PolicyInformationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificate.PolicyInformationProperty):
          PolicyInformationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PolicyInformationProperty):
          software.amazon.awscdk.services.acmpca.CfnCertificate.PolicyInformationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.acmpca.CfnCertificate.PolicyInformationProperty
    }
  }

  public interface SubjectProperty {
    /**
     * For CA and end-entity certificates in a private PKI, the common name (CN) can be any string
     * within the length limit.
     *
     * Note: In publicly trusted certificates, the common name must be a fully qualified domain name
     * (FQDN) associated with the certificate subject.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-subject.html#cfn-acmpca-certificate-subject-commonname)
     */
    public fun commonName(): String? = unwrap(this).getCommonName()

    /**
     * Two-digit code that specifies the country in which the certificate subject located.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-subject.html#cfn-acmpca-certificate-subject-country)
     */
    public fun country(): String? = unwrap(this).getCountry()

    /**
     * Contains a sequence of one or more X.500 relative distinguished names (RDNs), each of which
     * consists of an object identifier (OID) and a value. For more information, see NIST’s definition
     * of [Object Identifier
     * (OID)](https://docs.aws.amazon.com/https://csrc.nist.gov/glossary/term/Object_Identifier) .
     *
     *
     * Custom attributes cannot be used in combination with standard attributes.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-subject.html#cfn-acmpca-certificate-subject-customattributes)
     */
    public fun customAttributes(): Any? = unwrap(this).getCustomAttributes()

    /**
     * Disambiguating information for the certificate subject.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-subject.html#cfn-acmpca-certificate-subject-distinguishednamequalifier)
     */
    public fun distinguishedNameQualifier(): String? = unwrap(this).getDistinguishedNameQualifier()

    /**
     * Typically a qualifier appended to the name of an individual.
     *
     * Examples include Jr. for junior, Sr. for senior, and III for third.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-subject.html#cfn-acmpca-certificate-subject-generationqualifier)
     */
    public fun generationQualifier(): String? = unwrap(this).getGenerationQualifier()

    /**
     * First name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-subject.html#cfn-acmpca-certificate-subject-givenname)
     */
    public fun givenName(): String? = unwrap(this).getGivenName()

    /**
     * Concatenation that typically contains the first letter of the *GivenName* , the first letter
     * of the middle name if one exists, and the first letter of the *Surname* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-subject.html#cfn-acmpca-certificate-subject-initials)
     */
    public fun initials(): String? = unwrap(this).getInitials()

    /**
     * The locality (such as a city or town) in which the certificate subject is located.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-subject.html#cfn-acmpca-certificate-subject-locality)
     */
    public fun locality(): String? = unwrap(this).getLocality()

    /**
     * Legal name of the organization with which the certificate subject is affiliated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-subject.html#cfn-acmpca-certificate-subject-organization)
     */
    public fun organization(): String? = unwrap(this).getOrganization()

    /**
     * A subdivision or unit of the organization (such as sales or finance) with which the
     * certificate subject is affiliated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-subject.html#cfn-acmpca-certificate-subject-organizationalunit)
     */
    public fun organizationalUnit(): String? = unwrap(this).getOrganizationalUnit()

    /**
     * Typically a shortened version of a longer *GivenName* .
     *
     * For example, Jonathan is often shortened to John. Elizabeth is often shortened to Beth, Liz,
     * or Eliza.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-subject.html#cfn-acmpca-certificate-subject-pseudonym)
     */
    public fun pseudonym(): String? = unwrap(this).getPseudonym()

    /**
     * The certificate serial number.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-subject.html#cfn-acmpca-certificate-subject-serialnumber)
     */
    public fun serialNumber(): String? = unwrap(this).getSerialNumber()

    /**
     * State in which the subject of the certificate is located.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-subject.html#cfn-acmpca-certificate-subject-state)
     */
    public fun state(): String? = unwrap(this).getState()

    /**
     * Family name.
     *
     * In the US and the UK, for example, the surname of an individual is ordered last. In Asian
     * cultures the surname is typically ordered first.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-subject.html#cfn-acmpca-certificate-subject-surname)
     */
    public fun surname(): String? = unwrap(this).getSurname()

    /**
     * A title such as Mr.
     *
     * or Ms., which is pre-pended to the name to refer formally to the certificate subject.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-subject.html#cfn-acmpca-certificate-subject-title)
     */
    public fun title(): String? = unwrap(this).getTitle()

    /**
     * A builder for [SubjectProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param commonName For CA and end-entity certificates in a private PKI, the common name (CN)
       * can be any string within the length limit.
       * Note: In publicly trusted certificates, the common name must be a fully qualified domain
       * name (FQDN) associated with the certificate subject.
       */
      public fun commonName(commonName: String)

      /**
       * @param country Two-digit code that specifies the country in which the certificate subject
       * located.
       */
      public fun country(country: String)

      /**
       * @param customAttributes Contains a sequence of one or more X.500 relative distinguished
       * names (RDNs), each of which consists of an object identifier (OID) and a value. For more
       * information, see NIST’s definition of [Object Identifier
       * (OID)](https://docs.aws.amazon.com/https://csrc.nist.gov/glossary/term/Object_Identifier) .
       *
       * Custom attributes cannot be used in combination with standard attributes.
       */
      public fun customAttributes(customAttributes: IResolvable)

      /**
       * @param customAttributes Contains a sequence of one or more X.500 relative distinguished
       * names (RDNs), each of which consists of an object identifier (OID) and a value. For more
       * information, see NIST’s definition of [Object Identifier
       * (OID)](https://docs.aws.amazon.com/https://csrc.nist.gov/glossary/term/Object_Identifier) .
       *
       * Custom attributes cannot be used in combination with standard attributes.
       */
      public fun customAttributes(customAttributes: List<Any>)

      /**
       * @param customAttributes Contains a sequence of one or more X.500 relative distinguished
       * names (RDNs), each of which consists of an object identifier (OID) and a value. For more
       * information, see NIST’s definition of [Object Identifier
       * (OID)](https://docs.aws.amazon.com/https://csrc.nist.gov/glossary/term/Object_Identifier) .
       *
       * Custom attributes cannot be used in combination with standard attributes.
       */
      public fun customAttributes(vararg customAttributes: Any)

      /**
       * @param distinguishedNameQualifier Disambiguating information for the certificate subject.
       */
      public fun distinguishedNameQualifier(distinguishedNameQualifier: String)

      /**
       * @param generationQualifier Typically a qualifier appended to the name of an individual.
       * Examples include Jr. for junior, Sr. for senior, and III for third.
       */
      public fun generationQualifier(generationQualifier: String)

      /**
       * @param givenName First name.
       */
      public fun givenName(givenName: String)

      /**
       * @param initials Concatenation that typically contains the first letter of the *GivenName* ,
       * the first letter of the middle name if one exists, and the first letter of the *Surname* .
       */
      public fun initials(initials: String)

      /**
       * @param locality The locality (such as a city or town) in which the certificate subject is
       * located.
       */
      public fun locality(locality: String)

      /**
       * @param organization Legal name of the organization with which the certificate subject is
       * affiliated.
       */
      public fun organization(organization: String)

      /**
       * @param organizationalUnit A subdivision or unit of the organization (such as sales or
       * finance) with which the certificate subject is affiliated.
       */
      public fun organizationalUnit(organizationalUnit: String)

      /**
       * @param pseudonym Typically a shortened version of a longer *GivenName* .
       * For example, Jonathan is often shortened to John. Elizabeth is often shortened to Beth,
       * Liz, or Eliza.
       */
      public fun pseudonym(pseudonym: String)

      /**
       * @param serialNumber The certificate serial number.
       */
      public fun serialNumber(serialNumber: String)

      /**
       * @param state State in which the subject of the certificate is located.
       */
      public fun state(state: String)

      /**
       * @param surname Family name.
       * In the US and the UK, for example, the surname of an individual is ordered last. In Asian
       * cultures the surname is typically ordered first.
       */
      public fun surname(surname: String)

      /**
       * @param title A title such as Mr.
       * or Ms., which is pre-pended to the name to refer formally to the certificate subject.
       */
      public fun title(title: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.acmpca.CfnCertificate.SubjectProperty.Builder =
          software.amazon.awscdk.services.acmpca.CfnCertificate.SubjectProperty.builder()

      /**
       * @param commonName For CA and end-entity certificates in a private PKI, the common name (CN)
       * can be any string within the length limit.
       * Note: In publicly trusted certificates, the common name must be a fully qualified domain
       * name (FQDN) associated with the certificate subject.
       */
      override fun commonName(commonName: String) {
        cdkBuilder.commonName(commonName)
      }

      /**
       * @param country Two-digit code that specifies the country in which the certificate subject
       * located.
       */
      override fun country(country: String) {
        cdkBuilder.country(country)
      }

      /**
       * @param customAttributes Contains a sequence of one or more X.500 relative distinguished
       * names (RDNs), each of which consists of an object identifier (OID) and a value. For more
       * information, see NIST’s definition of [Object Identifier
       * (OID)](https://docs.aws.amazon.com/https://csrc.nist.gov/glossary/term/Object_Identifier) .
       *
       * Custom attributes cannot be used in combination with standard attributes.
       */
      override fun customAttributes(customAttributes: IResolvable) {
        cdkBuilder.customAttributes(customAttributes.let(IResolvable::unwrap))
      }

      /**
       * @param customAttributes Contains a sequence of one or more X.500 relative distinguished
       * names (RDNs), each of which consists of an object identifier (OID) and a value. For more
       * information, see NIST’s definition of [Object Identifier
       * (OID)](https://docs.aws.amazon.com/https://csrc.nist.gov/glossary/term/Object_Identifier) .
       *
       * Custom attributes cannot be used in combination with standard attributes.
       */
      override fun customAttributes(customAttributes: List<Any>) {
        cdkBuilder.customAttributes(customAttributes)
      }

      /**
       * @param customAttributes Contains a sequence of one or more X.500 relative distinguished
       * names (RDNs), each of which consists of an object identifier (OID) and a value. For more
       * information, see NIST’s definition of [Object Identifier
       * (OID)](https://docs.aws.amazon.com/https://csrc.nist.gov/glossary/term/Object_Identifier) .
       *
       * Custom attributes cannot be used in combination with standard attributes.
       */
      override fun customAttributes(vararg customAttributes: Any): Unit =
          customAttributes(customAttributes.toList())

      /**
       * @param distinguishedNameQualifier Disambiguating information for the certificate subject.
       */
      override fun distinguishedNameQualifier(distinguishedNameQualifier: String) {
        cdkBuilder.distinguishedNameQualifier(distinguishedNameQualifier)
      }

      /**
       * @param generationQualifier Typically a qualifier appended to the name of an individual.
       * Examples include Jr. for junior, Sr. for senior, and III for third.
       */
      override fun generationQualifier(generationQualifier: String) {
        cdkBuilder.generationQualifier(generationQualifier)
      }

      /**
       * @param givenName First name.
       */
      override fun givenName(givenName: String) {
        cdkBuilder.givenName(givenName)
      }

      /**
       * @param initials Concatenation that typically contains the first letter of the *GivenName* ,
       * the first letter of the middle name if one exists, and the first letter of the *Surname* .
       */
      override fun initials(initials: String) {
        cdkBuilder.initials(initials)
      }

      /**
       * @param locality The locality (such as a city or town) in which the certificate subject is
       * located.
       */
      override fun locality(locality: String) {
        cdkBuilder.locality(locality)
      }

      /**
       * @param organization Legal name of the organization with which the certificate subject is
       * affiliated.
       */
      override fun organization(organization: String) {
        cdkBuilder.organization(organization)
      }

      /**
       * @param organizationalUnit A subdivision or unit of the organization (such as sales or
       * finance) with which the certificate subject is affiliated.
       */
      override fun organizationalUnit(organizationalUnit: String) {
        cdkBuilder.organizationalUnit(organizationalUnit)
      }

      /**
       * @param pseudonym Typically a shortened version of a longer *GivenName* .
       * For example, Jonathan is often shortened to John. Elizabeth is often shortened to Beth,
       * Liz, or Eliza.
       */
      override fun pseudonym(pseudonym: String) {
        cdkBuilder.pseudonym(pseudonym)
      }

      /**
       * @param serialNumber The certificate serial number.
       */
      override fun serialNumber(serialNumber: String) {
        cdkBuilder.serialNumber(serialNumber)
      }

      /**
       * @param state State in which the subject of the certificate is located.
       */
      override fun state(state: String) {
        cdkBuilder.state(state)
      }

      /**
       * @param surname Family name.
       * In the US and the UK, for example, the surname of an individual is ordered last. In Asian
       * cultures the surname is typically ordered first.
       */
      override fun surname(surname: String) {
        cdkBuilder.surname(surname)
      }

      /**
       * @param title A title such as Mr.
       * or Ms., which is pre-pended to the name to refer formally to the certificate subject.
       */
      override fun title(title: String) {
        cdkBuilder.title(title)
      }

      public fun build(): software.amazon.awscdk.services.acmpca.CfnCertificate.SubjectProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificate.SubjectProperty,
    ) : CdkObject(cdkObject), SubjectProperty {
      /**
       * For CA and end-entity certificates in a private PKI, the common name (CN) can be any string
       * within the length limit.
       *
       * Note: In publicly trusted certificates, the common name must be a fully qualified domain
       * name (FQDN) associated with the certificate subject.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-subject.html#cfn-acmpca-certificate-subject-commonname)
       */
      override fun commonName(): String? = unwrap(this).getCommonName()

      /**
       * Two-digit code that specifies the country in which the certificate subject located.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-subject.html#cfn-acmpca-certificate-subject-country)
       */
      override fun country(): String? = unwrap(this).getCountry()

      /**
       * Contains a sequence of one or more X.500 relative distinguished names (RDNs), each of which
       * consists of an object identifier (OID) and a value. For more information, see NIST’s
       * definition of [Object Identifier
       * (OID)](https://docs.aws.amazon.com/https://csrc.nist.gov/glossary/term/Object_Identifier) .
       *
       *
       * Custom attributes cannot be used in combination with standard attributes.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-subject.html#cfn-acmpca-certificate-subject-customattributes)
       */
      override fun customAttributes(): Any? = unwrap(this).getCustomAttributes()

      /**
       * Disambiguating information for the certificate subject.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-subject.html#cfn-acmpca-certificate-subject-distinguishednamequalifier)
       */
      override fun distinguishedNameQualifier(): String? =
          unwrap(this).getDistinguishedNameQualifier()

      /**
       * Typically a qualifier appended to the name of an individual.
       *
       * Examples include Jr. for junior, Sr. for senior, and III for third.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-subject.html#cfn-acmpca-certificate-subject-generationqualifier)
       */
      override fun generationQualifier(): String? = unwrap(this).getGenerationQualifier()

      /**
       * First name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-subject.html#cfn-acmpca-certificate-subject-givenname)
       */
      override fun givenName(): String? = unwrap(this).getGivenName()

      /**
       * Concatenation that typically contains the first letter of the *GivenName* , the first
       * letter of the middle name if one exists, and the first letter of the *Surname* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-subject.html#cfn-acmpca-certificate-subject-initials)
       */
      override fun initials(): String? = unwrap(this).getInitials()

      /**
       * The locality (such as a city or town) in which the certificate subject is located.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-subject.html#cfn-acmpca-certificate-subject-locality)
       */
      override fun locality(): String? = unwrap(this).getLocality()

      /**
       * Legal name of the organization with which the certificate subject is affiliated.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-subject.html#cfn-acmpca-certificate-subject-organization)
       */
      override fun organization(): String? = unwrap(this).getOrganization()

      /**
       * A subdivision or unit of the organization (such as sales or finance) with which the
       * certificate subject is affiliated.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-subject.html#cfn-acmpca-certificate-subject-organizationalunit)
       */
      override fun organizationalUnit(): String? = unwrap(this).getOrganizationalUnit()

      /**
       * Typically a shortened version of a longer *GivenName* .
       *
       * For example, Jonathan is often shortened to John. Elizabeth is often shortened to Beth,
       * Liz, or Eliza.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-subject.html#cfn-acmpca-certificate-subject-pseudonym)
       */
      override fun pseudonym(): String? = unwrap(this).getPseudonym()

      /**
       * The certificate serial number.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-subject.html#cfn-acmpca-certificate-subject-serialnumber)
       */
      override fun serialNumber(): String? = unwrap(this).getSerialNumber()

      /**
       * State in which the subject of the certificate is located.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-subject.html#cfn-acmpca-certificate-subject-state)
       */
      override fun state(): String? = unwrap(this).getState()

      /**
       * Family name.
       *
       * In the US and the UK, for example, the surname of an individual is ordered last. In Asian
       * cultures the surname is typically ordered first.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-subject.html#cfn-acmpca-certificate-subject-surname)
       */
      override fun surname(): String? = unwrap(this).getSurname()

      /**
       * A title such as Mr.
       *
       * or Ms., which is pre-pended to the name to refer formally to the certificate subject.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-subject.html#cfn-acmpca-certificate-subject-title)
       */
      override fun title(): String? = unwrap(this).getTitle()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SubjectProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificate.SubjectProperty):
          SubjectProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SubjectProperty):
          software.amazon.awscdk.services.acmpca.CfnCertificate.SubjectProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.acmpca.CfnCertificate.SubjectProperty
    }
  }

  public interface PolicyQualifierInfoProperty {
    /**
     * Identifies the qualifier modifying a `CertPolicyId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-policyqualifierinfo.html#cfn-acmpca-certificate-policyqualifierinfo-policyqualifierid)
     */
    public fun policyQualifierId(): String

    /**
     * Defines the qualifier type.
     *
     * AWS Private CA supports the use of a URI for a CPS qualifier in this field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-policyqualifierinfo.html#cfn-acmpca-certificate-policyqualifierinfo-qualifier)
     */
    public fun qualifier(): Any

    /**
     * A builder for [PolicyQualifierInfoProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param policyQualifierId Identifies the qualifier modifying a `CertPolicyId` . 
       */
      public fun policyQualifierId(policyQualifierId: String)

      /**
       * @param qualifier Defines the qualifier type. 
       * AWS Private CA supports the use of a URI for a CPS qualifier in this field.
       */
      public fun qualifier(qualifier: IResolvable)

      /**
       * @param qualifier Defines the qualifier type. 
       * AWS Private CA supports the use of a URI for a CPS qualifier in this field.
       */
      public fun qualifier(qualifier: QualifierProperty)

      /**
       * @param qualifier Defines the qualifier type. 
       * AWS Private CA supports the use of a URI for a CPS qualifier in this field.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8ee9cc5d6a73f316af21c3d09037a6a30842ae9ad855c30559512fada499d86a")
      public fun qualifier(qualifier: QualifierProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.acmpca.CfnCertificate.PolicyQualifierInfoProperty.Builder
          =
          software.amazon.awscdk.services.acmpca.CfnCertificate.PolicyQualifierInfoProperty.builder()

      /**
       * @param policyQualifierId Identifies the qualifier modifying a `CertPolicyId` . 
       */
      override fun policyQualifierId(policyQualifierId: String) {
        cdkBuilder.policyQualifierId(policyQualifierId)
      }

      /**
       * @param qualifier Defines the qualifier type. 
       * AWS Private CA supports the use of a URI for a CPS qualifier in this field.
       */
      override fun qualifier(qualifier: IResolvable) {
        cdkBuilder.qualifier(qualifier.let(IResolvable::unwrap))
      }

      /**
       * @param qualifier Defines the qualifier type. 
       * AWS Private CA supports the use of a URI for a CPS qualifier in this field.
       */
      override fun qualifier(qualifier: QualifierProperty) {
        cdkBuilder.qualifier(qualifier.let(QualifierProperty::unwrap))
      }

      /**
       * @param qualifier Defines the qualifier type. 
       * AWS Private CA supports the use of a URI for a CPS qualifier in this field.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8ee9cc5d6a73f316af21c3d09037a6a30842ae9ad855c30559512fada499d86a")
      override fun qualifier(qualifier: QualifierProperty.Builder.() -> Unit): Unit =
          qualifier(QualifierProperty(qualifier))

      public fun build():
          software.amazon.awscdk.services.acmpca.CfnCertificate.PolicyQualifierInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.acmpca.CfnCertificate.PolicyQualifierInfoProperty,
    ) : CdkObject(cdkObject), PolicyQualifierInfoProperty {
      /**
       * Identifies the qualifier modifying a `CertPolicyId` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-policyqualifierinfo.html#cfn-acmpca-certificate-policyqualifierinfo-policyqualifierid)
       */
      override fun policyQualifierId(): String = unwrap(this).getPolicyQualifierId()

      /**
       * Defines the qualifier type.
       *
       * AWS Private CA supports the use of a URI for a CPS qualifier in this field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-policyqualifierinfo.html#cfn-acmpca-certificate-policyqualifierinfo-qualifier)
       */
      override fun qualifier(): Any = unwrap(this).getQualifier()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PolicyQualifierInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificate.PolicyQualifierInfoProperty):
          PolicyQualifierInfoProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PolicyQualifierInfoProperty):
          software.amazon.awscdk.services.acmpca.CfnCertificate.PolicyQualifierInfoProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.acmpca.CfnCertificate.PolicyQualifierInfoProperty
    }
  }

  public interface GeneralNameProperty {
    /**
     * Contains information about the certificate subject.
     *
     * The certificate can be one issued by your private certificate authority (CA) or it can be
     * your private CA certificate. The Subject field in the certificate identifies the entity that
     * owns or controls the public key in the certificate. The entity can be a user, computer, device,
     * or service. The Subject must contain an X.500 distinguished name (DN). A DN is a sequence of
     * relative distinguished names (RDNs). The RDNs are separated by commas in the certificate. The DN
     * must be unique for each entity, but your private CA can issue more than one certificate with the
     * same DN to the same entity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-generalname.html#cfn-acmpca-certificate-generalname-directoryname)
     */
    public fun directoryName(): Any? = unwrap(this).getDirectoryName()

    /**
     * Represents `GeneralName` as a DNS name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-generalname.html#cfn-acmpca-certificate-generalname-dnsname)
     */
    public fun dnsName(): String? = unwrap(this).getDnsName()

    /**
     * Represents `GeneralName` as an `EdiPartyName` object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-generalname.html#cfn-acmpca-certificate-generalname-edipartyname)
     */
    public fun ediPartyName(): Any? = unwrap(this).getEdiPartyName()

    /**
     * Represents `GeneralName` as an IPv4 or IPv6 address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-generalname.html#cfn-acmpca-certificate-generalname-ipaddress)
     */
    public fun ipAddress(): String? = unwrap(this).getIpAddress()

    /**
     * Represents `GeneralName` using an `OtherName` object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-generalname.html#cfn-acmpca-certificate-generalname-othername)
     */
    public fun otherName(): Any? = unwrap(this).getOtherName()

    /**
     * Represents `GeneralName` as an object identifier (OID).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-generalname.html#cfn-acmpca-certificate-generalname-registeredid)
     */
    public fun registeredId(): String? = unwrap(this).getRegisteredId()

    /**
     * Represents `GeneralName` as an [RFC
     * 822](https://docs.aws.amazon.com/https://datatracker.ietf.org/doc/html/rfc822) email address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-generalname.html#cfn-acmpca-certificate-generalname-rfc822name)
     */
    public fun rfc822Name(): String? = unwrap(this).getRfc822Name()

    /**
     * Represents `GeneralName` as a URI.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-generalname.html#cfn-acmpca-certificate-generalname-uniformresourceidentifier)
     */
    public fun uniformResourceIdentifier(): String? = unwrap(this).getUniformResourceIdentifier()

    /**
     * A builder for [GeneralNameProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param directoryName Contains information about the certificate subject.
       * The certificate can be one issued by your private certificate authority (CA) or it can be
       * your private CA certificate. The Subject field in the certificate identifies the entity that
       * owns or controls the public key in the certificate. The entity can be a user, computer,
       * device, or service. The Subject must contain an X.500 distinguished name (DN). A DN is a
       * sequence of relative distinguished names (RDNs). The RDNs are separated by commas in the
       * certificate. The DN must be unique for each entity, but your private CA can issue more than
       * one certificate with the same DN to the same entity.
       */
      public fun directoryName(directoryName: IResolvable)

      /**
       * @param directoryName Contains information about the certificate subject.
       * The certificate can be one issued by your private certificate authority (CA) or it can be
       * your private CA certificate. The Subject field in the certificate identifies the entity that
       * owns or controls the public key in the certificate. The entity can be a user, computer,
       * device, or service. The Subject must contain an X.500 distinguished name (DN). A DN is a
       * sequence of relative distinguished names (RDNs). The RDNs are separated by commas in the
       * certificate. The DN must be unique for each entity, but your private CA can issue more than
       * one certificate with the same DN to the same entity.
       */
      public fun directoryName(directoryName: SubjectProperty)

      /**
       * @param directoryName Contains information about the certificate subject.
       * The certificate can be one issued by your private certificate authority (CA) or it can be
       * your private CA certificate. The Subject field in the certificate identifies the entity that
       * owns or controls the public key in the certificate. The entity can be a user, computer,
       * device, or service. The Subject must contain an X.500 distinguished name (DN). A DN is a
       * sequence of relative distinguished names (RDNs). The RDNs are separated by commas in the
       * certificate. The DN must be unique for each entity, but your private CA can issue more than
       * one certificate with the same DN to the same entity.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("96b850009393b18157988126a30febc9603e07c94088e24394c1d0568c06bd3e")
      public fun directoryName(directoryName: SubjectProperty.Builder.() -> Unit)

      /**
       * @param dnsName Represents `GeneralName` as a DNS name.
       */
      public fun dnsName(dnsName: String)

      /**
       * @param ediPartyName Represents `GeneralName` as an `EdiPartyName` object.
       */
      public fun ediPartyName(ediPartyName: IResolvable)

      /**
       * @param ediPartyName Represents `GeneralName` as an `EdiPartyName` object.
       */
      public fun ediPartyName(ediPartyName: EdiPartyNameProperty)

      /**
       * @param ediPartyName Represents `GeneralName` as an `EdiPartyName` object.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e8f9859ee6c7e211c3066fc9466926f9f9403e42f2c69f794333b0ed6fe97aa6")
      public fun ediPartyName(ediPartyName: EdiPartyNameProperty.Builder.() -> Unit)

      /**
       * @param ipAddress Represents `GeneralName` as an IPv4 or IPv6 address.
       */
      public fun ipAddress(ipAddress: String)

      /**
       * @param otherName Represents `GeneralName` using an `OtherName` object.
       */
      public fun otherName(otherName: IResolvable)

      /**
       * @param otherName Represents `GeneralName` using an `OtherName` object.
       */
      public fun otherName(otherName: OtherNameProperty)

      /**
       * @param otherName Represents `GeneralName` using an `OtherName` object.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a26c7790fb156970216368ee9c7f92b35bf5d47e6291f46ff359bcc77c84b626")
      public fun otherName(otherName: OtherNameProperty.Builder.() -> Unit)

      /**
       * @param registeredId Represents `GeneralName` as an object identifier (OID).
       */
      public fun registeredId(registeredId: String)

      /**
       * @param rfc822Name Represents `GeneralName` as an [RFC
       * 822](https://docs.aws.amazon.com/https://datatracker.ietf.org/doc/html/rfc822) email address.
       */
      public fun rfc822Name(rfc822Name: String)

      /**
       * @param uniformResourceIdentifier Represents `GeneralName` as a URI.
       */
      public fun uniformResourceIdentifier(uniformResourceIdentifier: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.acmpca.CfnCertificate.GeneralNameProperty.Builder =
          software.amazon.awscdk.services.acmpca.CfnCertificate.GeneralNameProperty.builder()

      /**
       * @param directoryName Contains information about the certificate subject.
       * The certificate can be one issued by your private certificate authority (CA) or it can be
       * your private CA certificate. The Subject field in the certificate identifies the entity that
       * owns or controls the public key in the certificate. The entity can be a user, computer,
       * device, or service. The Subject must contain an X.500 distinguished name (DN). A DN is a
       * sequence of relative distinguished names (RDNs). The RDNs are separated by commas in the
       * certificate. The DN must be unique for each entity, but your private CA can issue more than
       * one certificate with the same DN to the same entity.
       */
      override fun directoryName(directoryName: IResolvable) {
        cdkBuilder.directoryName(directoryName.let(IResolvable::unwrap))
      }

      /**
       * @param directoryName Contains information about the certificate subject.
       * The certificate can be one issued by your private certificate authority (CA) or it can be
       * your private CA certificate. The Subject field in the certificate identifies the entity that
       * owns or controls the public key in the certificate. The entity can be a user, computer,
       * device, or service. The Subject must contain an X.500 distinguished name (DN). A DN is a
       * sequence of relative distinguished names (RDNs). The RDNs are separated by commas in the
       * certificate. The DN must be unique for each entity, but your private CA can issue more than
       * one certificate with the same DN to the same entity.
       */
      override fun directoryName(directoryName: SubjectProperty) {
        cdkBuilder.directoryName(directoryName.let(SubjectProperty::unwrap))
      }

      /**
       * @param directoryName Contains information about the certificate subject.
       * The certificate can be one issued by your private certificate authority (CA) or it can be
       * your private CA certificate. The Subject field in the certificate identifies the entity that
       * owns or controls the public key in the certificate. The entity can be a user, computer,
       * device, or service. The Subject must contain an X.500 distinguished name (DN). A DN is a
       * sequence of relative distinguished names (RDNs). The RDNs are separated by commas in the
       * certificate. The DN must be unique for each entity, but your private CA can issue more than
       * one certificate with the same DN to the same entity.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("96b850009393b18157988126a30febc9603e07c94088e24394c1d0568c06bd3e")
      override fun directoryName(directoryName: SubjectProperty.Builder.() -> Unit): Unit =
          directoryName(SubjectProperty(directoryName))

      /**
       * @param dnsName Represents `GeneralName` as a DNS name.
       */
      override fun dnsName(dnsName: String) {
        cdkBuilder.dnsName(dnsName)
      }

      /**
       * @param ediPartyName Represents `GeneralName` as an `EdiPartyName` object.
       */
      override fun ediPartyName(ediPartyName: IResolvable) {
        cdkBuilder.ediPartyName(ediPartyName.let(IResolvable::unwrap))
      }

      /**
       * @param ediPartyName Represents `GeneralName` as an `EdiPartyName` object.
       */
      override fun ediPartyName(ediPartyName: EdiPartyNameProperty) {
        cdkBuilder.ediPartyName(ediPartyName.let(EdiPartyNameProperty::unwrap))
      }

      /**
       * @param ediPartyName Represents `GeneralName` as an `EdiPartyName` object.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e8f9859ee6c7e211c3066fc9466926f9f9403e42f2c69f794333b0ed6fe97aa6")
      override fun ediPartyName(ediPartyName: EdiPartyNameProperty.Builder.() -> Unit): Unit =
          ediPartyName(EdiPartyNameProperty(ediPartyName))

      /**
       * @param ipAddress Represents `GeneralName` as an IPv4 or IPv6 address.
       */
      override fun ipAddress(ipAddress: String) {
        cdkBuilder.ipAddress(ipAddress)
      }

      /**
       * @param otherName Represents `GeneralName` using an `OtherName` object.
       */
      override fun otherName(otherName: IResolvable) {
        cdkBuilder.otherName(otherName.let(IResolvable::unwrap))
      }

      /**
       * @param otherName Represents `GeneralName` using an `OtherName` object.
       */
      override fun otherName(otherName: OtherNameProperty) {
        cdkBuilder.otherName(otherName.let(OtherNameProperty::unwrap))
      }

      /**
       * @param otherName Represents `GeneralName` using an `OtherName` object.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a26c7790fb156970216368ee9c7f92b35bf5d47e6291f46ff359bcc77c84b626")
      override fun otherName(otherName: OtherNameProperty.Builder.() -> Unit): Unit =
          otherName(OtherNameProperty(otherName))

      /**
       * @param registeredId Represents `GeneralName` as an object identifier (OID).
       */
      override fun registeredId(registeredId: String) {
        cdkBuilder.registeredId(registeredId)
      }

      /**
       * @param rfc822Name Represents `GeneralName` as an [RFC
       * 822](https://docs.aws.amazon.com/https://datatracker.ietf.org/doc/html/rfc822) email address.
       */
      override fun rfc822Name(rfc822Name: String) {
        cdkBuilder.rfc822Name(rfc822Name)
      }

      /**
       * @param uniformResourceIdentifier Represents `GeneralName` as a URI.
       */
      override fun uniformResourceIdentifier(uniformResourceIdentifier: String) {
        cdkBuilder.uniformResourceIdentifier(uniformResourceIdentifier)
      }

      public fun build(): software.amazon.awscdk.services.acmpca.CfnCertificate.GeneralNameProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.acmpca.CfnCertificate.GeneralNameProperty,
    ) : CdkObject(cdkObject), GeneralNameProperty {
      /**
       * Contains information about the certificate subject.
       *
       * The certificate can be one issued by your private certificate authority (CA) or it can be
       * your private CA certificate. The Subject field in the certificate identifies the entity that
       * owns or controls the public key in the certificate. The entity can be a user, computer,
       * device, or service. The Subject must contain an X.500 distinguished name (DN). A DN is a
       * sequence of relative distinguished names (RDNs). The RDNs are separated by commas in the
       * certificate. The DN must be unique for each entity, but your private CA can issue more than
       * one certificate with the same DN to the same entity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-generalname.html#cfn-acmpca-certificate-generalname-directoryname)
       */
      override fun directoryName(): Any? = unwrap(this).getDirectoryName()

      /**
       * Represents `GeneralName` as a DNS name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-generalname.html#cfn-acmpca-certificate-generalname-dnsname)
       */
      override fun dnsName(): String? = unwrap(this).getDnsName()

      /**
       * Represents `GeneralName` as an `EdiPartyName` object.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-generalname.html#cfn-acmpca-certificate-generalname-edipartyname)
       */
      override fun ediPartyName(): Any? = unwrap(this).getEdiPartyName()

      /**
       * Represents `GeneralName` as an IPv4 or IPv6 address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-generalname.html#cfn-acmpca-certificate-generalname-ipaddress)
       */
      override fun ipAddress(): String? = unwrap(this).getIpAddress()

      /**
       * Represents `GeneralName` using an `OtherName` object.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-generalname.html#cfn-acmpca-certificate-generalname-othername)
       */
      override fun otherName(): Any? = unwrap(this).getOtherName()

      /**
       * Represents `GeneralName` as an object identifier (OID).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-generalname.html#cfn-acmpca-certificate-generalname-registeredid)
       */
      override fun registeredId(): String? = unwrap(this).getRegisteredId()

      /**
       * Represents `GeneralName` as an [RFC
       * 822](https://docs.aws.amazon.com/https://datatracker.ietf.org/doc/html/rfc822) email address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-generalname.html#cfn-acmpca-certificate-generalname-rfc822name)
       */
      override fun rfc822Name(): String? = unwrap(this).getRfc822Name()

      /**
       * Represents `GeneralName` as a URI.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-generalname.html#cfn-acmpca-certificate-generalname-uniformresourceidentifier)
       */
      override fun uniformResourceIdentifier(): String? =
          unwrap(this).getUniformResourceIdentifier()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GeneralNameProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificate.GeneralNameProperty):
          GeneralNameProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GeneralNameProperty):
          software.amazon.awscdk.services.acmpca.CfnCertificate.GeneralNameProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.acmpca.CfnCertificate.GeneralNameProperty
    }
  }

  public interface EdiPartyNameProperty {
    /**
     * Specifies the name assigner.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-edipartyname.html#cfn-acmpca-certificate-edipartyname-nameassigner)
     */
    public fun nameAssigner(): String

    /**
     * Specifies the party name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-edipartyname.html#cfn-acmpca-certificate-edipartyname-partyname)
     */
    public fun partyName(): String

    /**
     * A builder for [EdiPartyNameProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param nameAssigner Specifies the name assigner. 
       */
      public fun nameAssigner(nameAssigner: String)

      /**
       * @param partyName Specifies the party name. 
       */
      public fun partyName(partyName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.acmpca.CfnCertificate.EdiPartyNameProperty.Builder =
          software.amazon.awscdk.services.acmpca.CfnCertificate.EdiPartyNameProperty.builder()

      /**
       * @param nameAssigner Specifies the name assigner. 
       */
      override fun nameAssigner(nameAssigner: String) {
        cdkBuilder.nameAssigner(nameAssigner)
      }

      /**
       * @param partyName Specifies the party name. 
       */
      override fun partyName(partyName: String) {
        cdkBuilder.partyName(partyName)
      }

      public fun build(): software.amazon.awscdk.services.acmpca.CfnCertificate.EdiPartyNameProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.acmpca.CfnCertificate.EdiPartyNameProperty,
    ) : CdkObject(cdkObject), EdiPartyNameProperty {
      /**
       * Specifies the name assigner.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-edipartyname.html#cfn-acmpca-certificate-edipartyname-nameassigner)
       */
      override fun nameAssigner(): String = unwrap(this).getNameAssigner()

      /**
       * Specifies the party name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-edipartyname.html#cfn-acmpca-certificate-edipartyname-partyname)
       */
      override fun partyName(): String = unwrap(this).getPartyName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EdiPartyNameProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificate.EdiPartyNameProperty):
          EdiPartyNameProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EdiPartyNameProperty):
          software.amazon.awscdk.services.acmpca.CfnCertificate.EdiPartyNameProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.acmpca.CfnCertificate.EdiPartyNameProperty
    }
  }

  public interface CustomExtensionProperty {
    /**
     * Specifies the critical flag of the X.509 extension.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-customextension.html#cfn-acmpca-certificate-customextension-critical)
     */
    public fun critical(): Any? = unwrap(this).getCritical()

    /**
     * Specifies the object identifier (OID) of the X.509 extension. For more information, see the
     * [Global OID reference database.](https://docs.aws.amazon.com/https://oidref.com/2.5.29).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-customextension.html#cfn-acmpca-certificate-customextension-objectidentifier)
     */
    public fun objectIdentifier(): String

    /**
     * Specifies the base64-encoded value of the X.509 extension.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-customextension.html#cfn-acmpca-certificate-customextension-value)
     */
    public fun `value`(): String

    /**
     * A builder for [CustomExtensionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param critical Specifies the critical flag of the X.509 extension.
       */
      public fun critical(critical: Boolean)

      /**
       * @param critical Specifies the critical flag of the X.509 extension.
       */
      public fun critical(critical: IResolvable)

      /**
       * @param objectIdentifier Specifies the object identifier (OID) of the X.509 extension. For
       * more information, see the [Global OID reference
       * database.](https://docs.aws.amazon.com/https://oidref.com/2.5.29). 
       */
      public fun objectIdentifier(objectIdentifier: String)

      /**
       * @param value Specifies the base64-encoded value of the X.509 extension. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.acmpca.CfnCertificate.CustomExtensionProperty.Builder =
          software.amazon.awscdk.services.acmpca.CfnCertificate.CustomExtensionProperty.builder()

      /**
       * @param critical Specifies the critical flag of the X.509 extension.
       */
      override fun critical(critical: Boolean) {
        cdkBuilder.critical(critical)
      }

      /**
       * @param critical Specifies the critical flag of the X.509 extension.
       */
      override fun critical(critical: IResolvable) {
        cdkBuilder.critical(critical.let(IResolvable::unwrap))
      }

      /**
       * @param objectIdentifier Specifies the object identifier (OID) of the X.509 extension. For
       * more information, see the [Global OID reference
       * database.](https://docs.aws.amazon.com/https://oidref.com/2.5.29). 
       */
      override fun objectIdentifier(objectIdentifier: String) {
        cdkBuilder.objectIdentifier(objectIdentifier)
      }

      /**
       * @param value Specifies the base64-encoded value of the X.509 extension. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.acmpca.CfnCertificate.CustomExtensionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.acmpca.CfnCertificate.CustomExtensionProperty,
    ) : CdkObject(cdkObject), CustomExtensionProperty {
      /**
       * Specifies the critical flag of the X.509 extension.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-customextension.html#cfn-acmpca-certificate-customextension-critical)
       */
      override fun critical(): Any? = unwrap(this).getCritical()

      /**
       * Specifies the object identifier (OID) of the X.509 extension. For more information, see the
       * [Global OID reference database.](https://docs.aws.amazon.com/https://oidref.com/2.5.29).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-customextension.html#cfn-acmpca-certificate-customextension-objectidentifier)
       */
      override fun objectIdentifier(): String = unwrap(this).getObjectIdentifier()

      /**
       * Specifies the base64-encoded value of the X.509 extension.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-customextension.html#cfn-acmpca-certificate-customextension-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CustomExtensionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificate.CustomExtensionProperty):
          CustomExtensionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomExtensionProperty):
          software.amazon.awscdk.services.acmpca.CfnCertificate.CustomExtensionProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.acmpca.CfnCertificate.CustomExtensionProperty
    }
  }

  public interface ApiPassthroughProperty {
    /**
     * Specifies X.509 extension information for a certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-apipassthrough.html#cfn-acmpca-certificate-apipassthrough-extensions)
     */
    public fun extensions(): Any? = unwrap(this).getExtensions()

    /**
     * Contains information about the certificate subject.
     *
     * The Subject field in the certificate identifies the entity that owns or controls the public
     * key in the certificate. The entity can be a user, computer, device, or service. The Subject must
     * contain an X.500 distinguished name (DN). A DN is a sequence of relative distinguished names
     * (RDNs). The RDNs are separated by commas in the certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-apipassthrough.html#cfn-acmpca-certificate-apipassthrough-subject)
     */
    public fun subject(): Any? = unwrap(this).getSubject()

    /**
     * A builder for [ApiPassthroughProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param extensions Specifies X.509 extension information for a certificate.
       */
      public fun extensions(extensions: IResolvable)

      /**
       * @param extensions Specifies X.509 extension information for a certificate.
       */
      public fun extensions(extensions: ExtensionsProperty)

      /**
       * @param extensions Specifies X.509 extension information for a certificate.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("737c1adb62e6848e2a5f445164e3c36994488e6feea295330c4dcc0fb119bb4d")
      public fun extensions(extensions: ExtensionsProperty.Builder.() -> Unit)

      /**
       * @param subject Contains information about the certificate subject.
       * The Subject field in the certificate identifies the entity that owns or controls the public
       * key in the certificate. The entity can be a user, computer, device, or service. The Subject
       * must contain an X.500 distinguished name (DN). A DN is a sequence of relative distinguished
       * names (RDNs). The RDNs are separated by commas in the certificate.
       */
      public fun subject(subject: IResolvable)

      /**
       * @param subject Contains information about the certificate subject.
       * The Subject field in the certificate identifies the entity that owns or controls the public
       * key in the certificate. The entity can be a user, computer, device, or service. The Subject
       * must contain an X.500 distinguished name (DN). A DN is a sequence of relative distinguished
       * names (RDNs). The RDNs are separated by commas in the certificate.
       */
      public fun subject(subject: SubjectProperty)

      /**
       * @param subject Contains information about the certificate subject.
       * The Subject field in the certificate identifies the entity that owns or controls the public
       * key in the certificate. The entity can be a user, computer, device, or service. The Subject
       * must contain an X.500 distinguished name (DN). A DN is a sequence of relative distinguished
       * names (RDNs). The RDNs are separated by commas in the certificate.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f3305f385f07191a605279b3db7c1e906d8d10c24265cc76c3142c585c3d0ffd")
      public fun subject(subject: SubjectProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.acmpca.CfnCertificate.ApiPassthroughProperty.Builder =
          software.amazon.awscdk.services.acmpca.CfnCertificate.ApiPassthroughProperty.builder()

      /**
       * @param extensions Specifies X.509 extension information for a certificate.
       */
      override fun extensions(extensions: IResolvable) {
        cdkBuilder.extensions(extensions.let(IResolvable::unwrap))
      }

      /**
       * @param extensions Specifies X.509 extension information for a certificate.
       */
      override fun extensions(extensions: ExtensionsProperty) {
        cdkBuilder.extensions(extensions.let(ExtensionsProperty::unwrap))
      }

      /**
       * @param extensions Specifies X.509 extension information for a certificate.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("737c1adb62e6848e2a5f445164e3c36994488e6feea295330c4dcc0fb119bb4d")
      override fun extensions(extensions: ExtensionsProperty.Builder.() -> Unit): Unit =
          extensions(ExtensionsProperty(extensions))

      /**
       * @param subject Contains information about the certificate subject.
       * The Subject field in the certificate identifies the entity that owns or controls the public
       * key in the certificate. The entity can be a user, computer, device, or service. The Subject
       * must contain an X.500 distinguished name (DN). A DN is a sequence of relative distinguished
       * names (RDNs). The RDNs are separated by commas in the certificate.
       */
      override fun subject(subject: IResolvable) {
        cdkBuilder.subject(subject.let(IResolvable::unwrap))
      }

      /**
       * @param subject Contains information about the certificate subject.
       * The Subject field in the certificate identifies the entity that owns or controls the public
       * key in the certificate. The entity can be a user, computer, device, or service. The Subject
       * must contain an X.500 distinguished name (DN). A DN is a sequence of relative distinguished
       * names (RDNs). The RDNs are separated by commas in the certificate.
       */
      override fun subject(subject: SubjectProperty) {
        cdkBuilder.subject(subject.let(SubjectProperty::unwrap))
      }

      /**
       * @param subject Contains information about the certificate subject.
       * The Subject field in the certificate identifies the entity that owns or controls the public
       * key in the certificate. The entity can be a user, computer, device, or service. The Subject
       * must contain an X.500 distinguished name (DN). A DN is a sequence of relative distinguished
       * names (RDNs). The RDNs are separated by commas in the certificate.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f3305f385f07191a605279b3db7c1e906d8d10c24265cc76c3142c585c3d0ffd")
      override fun subject(subject: SubjectProperty.Builder.() -> Unit): Unit =
          subject(SubjectProperty(subject))

      public fun build():
          software.amazon.awscdk.services.acmpca.CfnCertificate.ApiPassthroughProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.acmpca.CfnCertificate.ApiPassthroughProperty,
    ) : CdkObject(cdkObject), ApiPassthroughProperty {
      /**
       * Specifies X.509 extension information for a certificate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-apipassthrough.html#cfn-acmpca-certificate-apipassthrough-extensions)
       */
      override fun extensions(): Any? = unwrap(this).getExtensions()

      /**
       * Contains information about the certificate subject.
       *
       * The Subject field in the certificate identifies the entity that owns or controls the public
       * key in the certificate. The entity can be a user, computer, device, or service. The Subject
       * must contain an X.500 distinguished name (DN). A DN is a sequence of relative distinguished
       * names (RDNs). The RDNs are separated by commas in the certificate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-apipassthrough.html#cfn-acmpca-certificate-apipassthrough-subject)
       */
      override fun subject(): Any? = unwrap(this).getSubject()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ApiPassthroughProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificate.ApiPassthroughProperty):
          ApiPassthroughProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ApiPassthroughProperty):
          software.amazon.awscdk.services.acmpca.CfnCertificate.ApiPassthroughProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.acmpca.CfnCertificate.ApiPassthroughProperty
    }
  }

  public interface KeyUsageProperty {
    /**
     * Key can be used to sign CRLs.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-keyusage.html#cfn-acmpca-certificate-keyusage-crlsign)
     */
    public fun crlSign(): Any? = unwrap(this).getCrlSign()

    /**
     * Key can be used to decipher data.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-keyusage.html#cfn-acmpca-certificate-keyusage-dataencipherment)
     */
    public fun dataEncipherment(): Any? = unwrap(this).getDataEncipherment()

    /**
     * Key can be used only to decipher data.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-keyusage.html#cfn-acmpca-certificate-keyusage-decipheronly)
     */
    public fun decipherOnly(): Any? = unwrap(this).getDecipherOnly()

    /**
     * Key can be used for digital signing.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-keyusage.html#cfn-acmpca-certificate-keyusage-digitalsignature)
     */
    public fun digitalSignature(): Any? = unwrap(this).getDigitalSignature()

    /**
     * Key can be used only to encipher data.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-keyusage.html#cfn-acmpca-certificate-keyusage-encipheronly)
     */
    public fun encipherOnly(): Any? = unwrap(this).getEncipherOnly()

    /**
     * Key can be used in a key-agreement protocol.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-keyusage.html#cfn-acmpca-certificate-keyusage-keyagreement)
     */
    public fun keyAgreement(): Any? = unwrap(this).getKeyAgreement()

    /**
     * Key can be used to sign certificates.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-keyusage.html#cfn-acmpca-certificate-keyusage-keycertsign)
     */
    public fun keyCertSign(): Any? = unwrap(this).getKeyCertSign()

    /**
     * Key can be used to encipher data.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-keyusage.html#cfn-acmpca-certificate-keyusage-keyencipherment)
     */
    public fun keyEncipherment(): Any? = unwrap(this).getKeyEncipherment()

    /**
     * Key can be used for non-repudiation.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-keyusage.html#cfn-acmpca-certificate-keyusage-nonrepudiation)
     */
    public fun nonRepudiation(): Any? = unwrap(this).getNonRepudiation()

    /**
     * A builder for [KeyUsageProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param crlSign Key can be used to sign CRLs.
       */
      public fun crlSign(crlSign: Boolean)

      /**
       * @param crlSign Key can be used to sign CRLs.
       */
      public fun crlSign(crlSign: IResolvable)

      /**
       * @param dataEncipherment Key can be used to decipher data.
       */
      public fun dataEncipherment(dataEncipherment: Boolean)

      /**
       * @param dataEncipherment Key can be used to decipher data.
       */
      public fun dataEncipherment(dataEncipherment: IResolvable)

      /**
       * @param decipherOnly Key can be used only to decipher data.
       */
      public fun decipherOnly(decipherOnly: Boolean)

      /**
       * @param decipherOnly Key can be used only to decipher data.
       */
      public fun decipherOnly(decipherOnly: IResolvable)

      /**
       * @param digitalSignature Key can be used for digital signing.
       */
      public fun digitalSignature(digitalSignature: Boolean)

      /**
       * @param digitalSignature Key can be used for digital signing.
       */
      public fun digitalSignature(digitalSignature: IResolvable)

      /**
       * @param encipherOnly Key can be used only to encipher data.
       */
      public fun encipherOnly(encipherOnly: Boolean)

      /**
       * @param encipherOnly Key can be used only to encipher data.
       */
      public fun encipherOnly(encipherOnly: IResolvable)

      /**
       * @param keyAgreement Key can be used in a key-agreement protocol.
       */
      public fun keyAgreement(keyAgreement: Boolean)

      /**
       * @param keyAgreement Key can be used in a key-agreement protocol.
       */
      public fun keyAgreement(keyAgreement: IResolvable)

      /**
       * @param keyCertSign Key can be used to sign certificates.
       */
      public fun keyCertSign(keyCertSign: Boolean)

      /**
       * @param keyCertSign Key can be used to sign certificates.
       */
      public fun keyCertSign(keyCertSign: IResolvable)

      /**
       * @param keyEncipherment Key can be used to encipher data.
       */
      public fun keyEncipherment(keyEncipherment: Boolean)

      /**
       * @param keyEncipherment Key can be used to encipher data.
       */
      public fun keyEncipherment(keyEncipherment: IResolvable)

      /**
       * @param nonRepudiation Key can be used for non-repudiation.
       */
      public fun nonRepudiation(nonRepudiation: Boolean)

      /**
       * @param nonRepudiation Key can be used for non-repudiation.
       */
      public fun nonRepudiation(nonRepudiation: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.acmpca.CfnCertificate.KeyUsageProperty.Builder =
          software.amazon.awscdk.services.acmpca.CfnCertificate.KeyUsageProperty.builder()

      /**
       * @param crlSign Key can be used to sign CRLs.
       */
      override fun crlSign(crlSign: Boolean) {
        cdkBuilder.crlSign(crlSign)
      }

      /**
       * @param crlSign Key can be used to sign CRLs.
       */
      override fun crlSign(crlSign: IResolvable) {
        cdkBuilder.crlSign(crlSign.let(IResolvable::unwrap))
      }

      /**
       * @param dataEncipherment Key can be used to decipher data.
       */
      override fun dataEncipherment(dataEncipherment: Boolean) {
        cdkBuilder.dataEncipherment(dataEncipherment)
      }

      /**
       * @param dataEncipherment Key can be used to decipher data.
       */
      override fun dataEncipherment(dataEncipherment: IResolvable) {
        cdkBuilder.dataEncipherment(dataEncipherment.let(IResolvable::unwrap))
      }

      /**
       * @param decipherOnly Key can be used only to decipher data.
       */
      override fun decipherOnly(decipherOnly: Boolean) {
        cdkBuilder.decipherOnly(decipherOnly)
      }

      /**
       * @param decipherOnly Key can be used only to decipher data.
       */
      override fun decipherOnly(decipherOnly: IResolvable) {
        cdkBuilder.decipherOnly(decipherOnly.let(IResolvable::unwrap))
      }

      /**
       * @param digitalSignature Key can be used for digital signing.
       */
      override fun digitalSignature(digitalSignature: Boolean) {
        cdkBuilder.digitalSignature(digitalSignature)
      }

      /**
       * @param digitalSignature Key can be used for digital signing.
       */
      override fun digitalSignature(digitalSignature: IResolvable) {
        cdkBuilder.digitalSignature(digitalSignature.let(IResolvable::unwrap))
      }

      /**
       * @param encipherOnly Key can be used only to encipher data.
       */
      override fun encipherOnly(encipherOnly: Boolean) {
        cdkBuilder.encipherOnly(encipherOnly)
      }

      /**
       * @param encipherOnly Key can be used only to encipher data.
       */
      override fun encipherOnly(encipherOnly: IResolvable) {
        cdkBuilder.encipherOnly(encipherOnly.let(IResolvable::unwrap))
      }

      /**
       * @param keyAgreement Key can be used in a key-agreement protocol.
       */
      override fun keyAgreement(keyAgreement: Boolean) {
        cdkBuilder.keyAgreement(keyAgreement)
      }

      /**
       * @param keyAgreement Key can be used in a key-agreement protocol.
       */
      override fun keyAgreement(keyAgreement: IResolvable) {
        cdkBuilder.keyAgreement(keyAgreement.let(IResolvable::unwrap))
      }

      /**
       * @param keyCertSign Key can be used to sign certificates.
       */
      override fun keyCertSign(keyCertSign: Boolean) {
        cdkBuilder.keyCertSign(keyCertSign)
      }

      /**
       * @param keyCertSign Key can be used to sign certificates.
       */
      override fun keyCertSign(keyCertSign: IResolvable) {
        cdkBuilder.keyCertSign(keyCertSign.let(IResolvable::unwrap))
      }

      /**
       * @param keyEncipherment Key can be used to encipher data.
       */
      override fun keyEncipherment(keyEncipherment: Boolean) {
        cdkBuilder.keyEncipherment(keyEncipherment)
      }

      /**
       * @param keyEncipherment Key can be used to encipher data.
       */
      override fun keyEncipherment(keyEncipherment: IResolvable) {
        cdkBuilder.keyEncipherment(keyEncipherment.let(IResolvable::unwrap))
      }

      /**
       * @param nonRepudiation Key can be used for non-repudiation.
       */
      override fun nonRepudiation(nonRepudiation: Boolean) {
        cdkBuilder.nonRepudiation(nonRepudiation)
      }

      /**
       * @param nonRepudiation Key can be used for non-repudiation.
       */
      override fun nonRepudiation(nonRepudiation: IResolvable) {
        cdkBuilder.nonRepudiation(nonRepudiation.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.acmpca.CfnCertificate.KeyUsageProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.acmpca.CfnCertificate.KeyUsageProperty,
    ) : CdkObject(cdkObject), KeyUsageProperty {
      /**
       * Key can be used to sign CRLs.
       *
       * Default: - false
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-keyusage.html#cfn-acmpca-certificate-keyusage-crlsign)
       */
      override fun crlSign(): Any? = unwrap(this).getCrlSign()

      /**
       * Key can be used to decipher data.
       *
       * Default: - false
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-keyusage.html#cfn-acmpca-certificate-keyusage-dataencipherment)
       */
      override fun dataEncipherment(): Any? = unwrap(this).getDataEncipherment()

      /**
       * Key can be used only to decipher data.
       *
       * Default: - false
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-keyusage.html#cfn-acmpca-certificate-keyusage-decipheronly)
       */
      override fun decipherOnly(): Any? = unwrap(this).getDecipherOnly()

      /**
       * Key can be used for digital signing.
       *
       * Default: - false
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-keyusage.html#cfn-acmpca-certificate-keyusage-digitalsignature)
       */
      override fun digitalSignature(): Any? = unwrap(this).getDigitalSignature()

      /**
       * Key can be used only to encipher data.
       *
       * Default: - false
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-keyusage.html#cfn-acmpca-certificate-keyusage-encipheronly)
       */
      override fun encipherOnly(): Any? = unwrap(this).getEncipherOnly()

      /**
       * Key can be used in a key-agreement protocol.
       *
       * Default: - false
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-keyusage.html#cfn-acmpca-certificate-keyusage-keyagreement)
       */
      override fun keyAgreement(): Any? = unwrap(this).getKeyAgreement()

      /**
       * Key can be used to sign certificates.
       *
       * Default: - false
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-keyusage.html#cfn-acmpca-certificate-keyusage-keycertsign)
       */
      override fun keyCertSign(): Any? = unwrap(this).getKeyCertSign()

      /**
       * Key can be used to encipher data.
       *
       * Default: - false
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-keyusage.html#cfn-acmpca-certificate-keyusage-keyencipherment)
       */
      override fun keyEncipherment(): Any? = unwrap(this).getKeyEncipherment()

      /**
       * Key can be used for non-repudiation.
       *
       * Default: - false
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-keyusage.html#cfn-acmpca-certificate-keyusage-nonrepudiation)
       */
      override fun nonRepudiation(): Any? = unwrap(this).getNonRepudiation()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KeyUsageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificate.KeyUsageProperty):
          KeyUsageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KeyUsageProperty):
          software.amazon.awscdk.services.acmpca.CfnCertificate.KeyUsageProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.acmpca.CfnCertificate.KeyUsageProperty
    }
  }

  public interface CustomAttributeProperty {
    /**
     * Specifies the object identifier (OID) of the attribute type of the relative distinguished
     * name (RDN).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-customattribute.html#cfn-acmpca-certificate-customattribute-objectidentifier)
     */
    public fun objectIdentifier(): String

    /**
     * Specifies the attribute value of relative distinguished name (RDN).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-customattribute.html#cfn-acmpca-certificate-customattribute-value)
     */
    public fun `value`(): String

    /**
     * A builder for [CustomAttributeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param objectIdentifier Specifies the object identifier (OID) of the attribute type of the
       * relative distinguished name (RDN). 
       */
      public fun objectIdentifier(objectIdentifier: String)

      /**
       * @param value Specifies the attribute value of relative distinguished name (RDN). 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.acmpca.CfnCertificate.CustomAttributeProperty.Builder =
          software.amazon.awscdk.services.acmpca.CfnCertificate.CustomAttributeProperty.builder()

      /**
       * @param objectIdentifier Specifies the object identifier (OID) of the attribute type of the
       * relative distinguished name (RDN). 
       */
      override fun objectIdentifier(objectIdentifier: String) {
        cdkBuilder.objectIdentifier(objectIdentifier)
      }

      /**
       * @param value Specifies the attribute value of relative distinguished name (RDN). 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.acmpca.CfnCertificate.CustomAttributeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.acmpca.CfnCertificate.CustomAttributeProperty,
    ) : CdkObject(cdkObject), CustomAttributeProperty {
      /**
       * Specifies the object identifier (OID) of the attribute type of the relative distinguished
       * name (RDN).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-customattribute.html#cfn-acmpca-certificate-customattribute-objectidentifier)
       */
      override fun objectIdentifier(): String = unwrap(this).getObjectIdentifier()

      /**
       * Specifies the attribute value of relative distinguished name (RDN).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-customattribute.html#cfn-acmpca-certificate-customattribute-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CustomAttributeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificate.CustomAttributeProperty):
          CustomAttributeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomAttributeProperty):
          software.amazon.awscdk.services.acmpca.CfnCertificate.CustomAttributeProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.acmpca.CfnCertificate.CustomAttributeProperty
    }
  }

  public interface ExtensionsProperty {
    /**
     * Contains a sequence of one or more policy information terms, each of which consists of an
     * object identifier (OID) and optional qualifiers.
     *
     * For more information, see NIST's definition of [Object Identifier
     * (OID)](https://docs.aws.amazon.com/https://csrc.nist.gov/glossary/term/Object_Identifier) .
     *
     * In an end-entity certificate, these terms indicate the policy under which the certificate was
     * issued and the purposes for which it may be used. In a CA certificate, these terms limit the set
     * of policies for certification paths that include this certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-extensions.html#cfn-acmpca-certificate-extensions-certificatepolicies)
     */
    public fun certificatePolicies(): Any? = unwrap(this).getCertificatePolicies()

    /**
     * Contains a sequence of one or more X.509 extensions, each of which consists of an object
     * identifier (OID), a base64-encoded value, and the critical flag. For more information, see the
     * [Global OID reference database.](https://docs.aws.amazon.com/https://oidref.com/2.5.29).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-extensions.html#cfn-acmpca-certificate-extensions-customextensions)
     */
    public fun customExtensions(): Any? = unwrap(this).getCustomExtensions()

    /**
     * Specifies additional purposes for which the certified public key may be used other than basic
     * purposes indicated in the `KeyUsage` extension.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-extensions.html#cfn-acmpca-certificate-extensions-extendedkeyusage)
     */
    public fun extendedKeyUsage(): Any? = unwrap(this).getExtendedKeyUsage()

    /**
     * Defines one or more purposes for which the key contained in the certificate can be used.
     *
     * Default value for each option is false.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-extensions.html#cfn-acmpca-certificate-extensions-keyusage)
     */
    public fun keyUsage(): Any? = unwrap(this).getKeyUsage()

    /**
     * The subject alternative name extension allows identities to be bound to the subject of the
     * certificate.
     *
     * These identities may be included in addition to or in place of the identity in the subject
     * field of the certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-extensions.html#cfn-acmpca-certificate-extensions-subjectalternativenames)
     */
    public fun subjectAlternativeNames(): Any? = unwrap(this).getSubjectAlternativeNames()

    /**
     * A builder for [ExtensionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param certificatePolicies Contains a sequence of one or more policy information terms,
       * each of which consists of an object identifier (OID) and optional qualifiers.
       * For more information, see NIST's definition of [Object Identifier
       * (OID)](https://docs.aws.amazon.com/https://csrc.nist.gov/glossary/term/Object_Identifier) .
       *
       * In an end-entity certificate, these terms indicate the policy under which the certificate
       * was issued and the purposes for which it may be used. In a CA certificate, these terms limit
       * the set of policies for certification paths that include this certificate.
       */
      public fun certificatePolicies(certificatePolicies: IResolvable)

      /**
       * @param certificatePolicies Contains a sequence of one or more policy information terms,
       * each of which consists of an object identifier (OID) and optional qualifiers.
       * For more information, see NIST's definition of [Object Identifier
       * (OID)](https://docs.aws.amazon.com/https://csrc.nist.gov/glossary/term/Object_Identifier) .
       *
       * In an end-entity certificate, these terms indicate the policy under which the certificate
       * was issued and the purposes for which it may be used. In a CA certificate, these terms limit
       * the set of policies for certification paths that include this certificate.
       */
      public fun certificatePolicies(certificatePolicies: List<Any>)

      /**
       * @param certificatePolicies Contains a sequence of one or more policy information terms,
       * each of which consists of an object identifier (OID) and optional qualifiers.
       * For more information, see NIST's definition of [Object Identifier
       * (OID)](https://docs.aws.amazon.com/https://csrc.nist.gov/glossary/term/Object_Identifier) .
       *
       * In an end-entity certificate, these terms indicate the policy under which the certificate
       * was issued and the purposes for which it may be used. In a CA certificate, these terms limit
       * the set of policies for certification paths that include this certificate.
       */
      public fun certificatePolicies(vararg certificatePolicies: Any)

      /**
       * @param customExtensions Contains a sequence of one or more X.509 extensions, each of which
       * consists of an object identifier (OID), a base64-encoded value, and the critical flag. For
       * more information, see the [Global OID reference
       * database.](https://docs.aws.amazon.com/https://oidref.com/2.5.29).
       */
      public fun customExtensions(customExtensions: IResolvable)

      /**
       * @param customExtensions Contains a sequence of one or more X.509 extensions, each of which
       * consists of an object identifier (OID), a base64-encoded value, and the critical flag. For
       * more information, see the [Global OID reference
       * database.](https://docs.aws.amazon.com/https://oidref.com/2.5.29).
       */
      public fun customExtensions(customExtensions: List<Any>)

      /**
       * @param customExtensions Contains a sequence of one or more X.509 extensions, each of which
       * consists of an object identifier (OID), a base64-encoded value, and the critical flag. For
       * more information, see the [Global OID reference
       * database.](https://docs.aws.amazon.com/https://oidref.com/2.5.29).
       */
      public fun customExtensions(vararg customExtensions: Any)

      /**
       * @param extendedKeyUsage Specifies additional purposes for which the certified public key
       * may be used other than basic purposes indicated in the `KeyUsage` extension.
       */
      public fun extendedKeyUsage(extendedKeyUsage: IResolvable)

      /**
       * @param extendedKeyUsage Specifies additional purposes for which the certified public key
       * may be used other than basic purposes indicated in the `KeyUsage` extension.
       */
      public fun extendedKeyUsage(extendedKeyUsage: List<Any>)

      /**
       * @param extendedKeyUsage Specifies additional purposes for which the certified public key
       * may be used other than basic purposes indicated in the `KeyUsage` extension.
       */
      public fun extendedKeyUsage(vararg extendedKeyUsage: Any)

      /**
       * @param keyUsage Defines one or more purposes for which the key contained in the certificate
       * can be used.
       * Default value for each option is false.
       */
      public fun keyUsage(keyUsage: IResolvable)

      /**
       * @param keyUsage Defines one or more purposes for which the key contained in the certificate
       * can be used.
       * Default value for each option is false.
       */
      public fun keyUsage(keyUsage: KeyUsageProperty)

      /**
       * @param keyUsage Defines one or more purposes for which the key contained in the certificate
       * can be used.
       * Default value for each option is false.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("54805af00844784ad9ab9b73287f368f891631f66e0dfcec483a64c96173c64d")
      public fun keyUsage(keyUsage: KeyUsageProperty.Builder.() -> Unit)

      /**
       * @param subjectAlternativeNames The subject alternative name extension allows identities to
       * be bound to the subject of the certificate.
       * These identities may be included in addition to or in place of the identity in the subject
       * field of the certificate.
       */
      public fun subjectAlternativeNames(subjectAlternativeNames: IResolvable)

      /**
       * @param subjectAlternativeNames The subject alternative name extension allows identities to
       * be bound to the subject of the certificate.
       * These identities may be included in addition to or in place of the identity in the subject
       * field of the certificate.
       */
      public fun subjectAlternativeNames(subjectAlternativeNames: List<Any>)

      /**
       * @param subjectAlternativeNames The subject alternative name extension allows identities to
       * be bound to the subject of the certificate.
       * These identities may be included in addition to or in place of the identity in the subject
       * field of the certificate.
       */
      public fun subjectAlternativeNames(vararg subjectAlternativeNames: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.acmpca.CfnCertificate.ExtensionsProperty.Builder =
          software.amazon.awscdk.services.acmpca.CfnCertificate.ExtensionsProperty.builder()

      /**
       * @param certificatePolicies Contains a sequence of one or more policy information terms,
       * each of which consists of an object identifier (OID) and optional qualifiers.
       * For more information, see NIST's definition of [Object Identifier
       * (OID)](https://docs.aws.amazon.com/https://csrc.nist.gov/glossary/term/Object_Identifier) .
       *
       * In an end-entity certificate, these terms indicate the policy under which the certificate
       * was issued and the purposes for which it may be used. In a CA certificate, these terms limit
       * the set of policies for certification paths that include this certificate.
       */
      override fun certificatePolicies(certificatePolicies: IResolvable) {
        cdkBuilder.certificatePolicies(certificatePolicies.let(IResolvable::unwrap))
      }

      /**
       * @param certificatePolicies Contains a sequence of one or more policy information terms,
       * each of which consists of an object identifier (OID) and optional qualifiers.
       * For more information, see NIST's definition of [Object Identifier
       * (OID)](https://docs.aws.amazon.com/https://csrc.nist.gov/glossary/term/Object_Identifier) .
       *
       * In an end-entity certificate, these terms indicate the policy under which the certificate
       * was issued and the purposes for which it may be used. In a CA certificate, these terms limit
       * the set of policies for certification paths that include this certificate.
       */
      override fun certificatePolicies(certificatePolicies: List<Any>) {
        cdkBuilder.certificatePolicies(certificatePolicies)
      }

      /**
       * @param certificatePolicies Contains a sequence of one or more policy information terms,
       * each of which consists of an object identifier (OID) and optional qualifiers.
       * For more information, see NIST's definition of [Object Identifier
       * (OID)](https://docs.aws.amazon.com/https://csrc.nist.gov/glossary/term/Object_Identifier) .
       *
       * In an end-entity certificate, these terms indicate the policy under which the certificate
       * was issued and the purposes for which it may be used. In a CA certificate, these terms limit
       * the set of policies for certification paths that include this certificate.
       */
      override fun certificatePolicies(vararg certificatePolicies: Any): Unit =
          certificatePolicies(certificatePolicies.toList())

      /**
       * @param customExtensions Contains a sequence of one or more X.509 extensions, each of which
       * consists of an object identifier (OID), a base64-encoded value, and the critical flag. For
       * more information, see the [Global OID reference
       * database.](https://docs.aws.amazon.com/https://oidref.com/2.5.29).
       */
      override fun customExtensions(customExtensions: IResolvable) {
        cdkBuilder.customExtensions(customExtensions.let(IResolvable::unwrap))
      }

      /**
       * @param customExtensions Contains a sequence of one or more X.509 extensions, each of which
       * consists of an object identifier (OID), a base64-encoded value, and the critical flag. For
       * more information, see the [Global OID reference
       * database.](https://docs.aws.amazon.com/https://oidref.com/2.5.29).
       */
      override fun customExtensions(customExtensions: List<Any>) {
        cdkBuilder.customExtensions(customExtensions)
      }

      /**
       * @param customExtensions Contains a sequence of one or more X.509 extensions, each of which
       * consists of an object identifier (OID), a base64-encoded value, and the critical flag. For
       * more information, see the [Global OID reference
       * database.](https://docs.aws.amazon.com/https://oidref.com/2.5.29).
       */
      override fun customExtensions(vararg customExtensions: Any): Unit =
          customExtensions(customExtensions.toList())

      /**
       * @param extendedKeyUsage Specifies additional purposes for which the certified public key
       * may be used other than basic purposes indicated in the `KeyUsage` extension.
       */
      override fun extendedKeyUsage(extendedKeyUsage: IResolvable) {
        cdkBuilder.extendedKeyUsage(extendedKeyUsage.let(IResolvable::unwrap))
      }

      /**
       * @param extendedKeyUsage Specifies additional purposes for which the certified public key
       * may be used other than basic purposes indicated in the `KeyUsage` extension.
       */
      override fun extendedKeyUsage(extendedKeyUsage: List<Any>) {
        cdkBuilder.extendedKeyUsage(extendedKeyUsage)
      }

      /**
       * @param extendedKeyUsage Specifies additional purposes for which the certified public key
       * may be used other than basic purposes indicated in the `KeyUsage` extension.
       */
      override fun extendedKeyUsage(vararg extendedKeyUsage: Any): Unit =
          extendedKeyUsage(extendedKeyUsage.toList())

      /**
       * @param keyUsage Defines one or more purposes for which the key contained in the certificate
       * can be used.
       * Default value for each option is false.
       */
      override fun keyUsage(keyUsage: IResolvable) {
        cdkBuilder.keyUsage(keyUsage.let(IResolvable::unwrap))
      }

      /**
       * @param keyUsage Defines one or more purposes for which the key contained in the certificate
       * can be used.
       * Default value for each option is false.
       */
      override fun keyUsage(keyUsage: KeyUsageProperty) {
        cdkBuilder.keyUsage(keyUsage.let(KeyUsageProperty::unwrap))
      }

      /**
       * @param keyUsage Defines one or more purposes for which the key contained in the certificate
       * can be used.
       * Default value for each option is false.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("54805af00844784ad9ab9b73287f368f891631f66e0dfcec483a64c96173c64d")
      override fun keyUsage(keyUsage: KeyUsageProperty.Builder.() -> Unit): Unit =
          keyUsage(KeyUsageProperty(keyUsage))

      /**
       * @param subjectAlternativeNames The subject alternative name extension allows identities to
       * be bound to the subject of the certificate.
       * These identities may be included in addition to or in place of the identity in the subject
       * field of the certificate.
       */
      override fun subjectAlternativeNames(subjectAlternativeNames: IResolvable) {
        cdkBuilder.subjectAlternativeNames(subjectAlternativeNames.let(IResolvable::unwrap))
      }

      /**
       * @param subjectAlternativeNames The subject alternative name extension allows identities to
       * be bound to the subject of the certificate.
       * These identities may be included in addition to or in place of the identity in the subject
       * field of the certificate.
       */
      override fun subjectAlternativeNames(subjectAlternativeNames: List<Any>) {
        cdkBuilder.subjectAlternativeNames(subjectAlternativeNames)
      }

      /**
       * @param subjectAlternativeNames The subject alternative name extension allows identities to
       * be bound to the subject of the certificate.
       * These identities may be included in addition to or in place of the identity in the subject
       * field of the certificate.
       */
      override fun subjectAlternativeNames(vararg subjectAlternativeNames: Any): Unit =
          subjectAlternativeNames(subjectAlternativeNames.toList())

      public fun build(): software.amazon.awscdk.services.acmpca.CfnCertificate.ExtensionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.acmpca.CfnCertificate.ExtensionsProperty,
    ) : CdkObject(cdkObject), ExtensionsProperty {
      /**
       * Contains a sequence of one or more policy information terms, each of which consists of an
       * object identifier (OID) and optional qualifiers.
       *
       * For more information, see NIST's definition of [Object Identifier
       * (OID)](https://docs.aws.amazon.com/https://csrc.nist.gov/glossary/term/Object_Identifier) .
       *
       * In an end-entity certificate, these terms indicate the policy under which the certificate
       * was issued and the purposes for which it may be used. In a CA certificate, these terms limit
       * the set of policies for certification paths that include this certificate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-extensions.html#cfn-acmpca-certificate-extensions-certificatepolicies)
       */
      override fun certificatePolicies(): Any? = unwrap(this).getCertificatePolicies()

      /**
       * Contains a sequence of one or more X.509 extensions, each of which consists of an object
       * identifier (OID), a base64-encoded value, and the critical flag. For more information, see the
       * [Global OID reference database.](https://docs.aws.amazon.com/https://oidref.com/2.5.29).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-extensions.html#cfn-acmpca-certificate-extensions-customextensions)
       */
      override fun customExtensions(): Any? = unwrap(this).getCustomExtensions()

      /**
       * Specifies additional purposes for which the certified public key may be used other than
       * basic purposes indicated in the `KeyUsage` extension.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-extensions.html#cfn-acmpca-certificate-extensions-extendedkeyusage)
       */
      override fun extendedKeyUsage(): Any? = unwrap(this).getExtendedKeyUsage()

      /**
       * Defines one or more purposes for which the key contained in the certificate can be used.
       *
       * Default value for each option is false.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-extensions.html#cfn-acmpca-certificate-extensions-keyusage)
       */
      override fun keyUsage(): Any? = unwrap(this).getKeyUsage()

      /**
       * The subject alternative name extension allows identities to be bound to the subject of the
       * certificate.
       *
       * These identities may be included in addition to or in place of the identity in the subject
       * field of the certificate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-extensions.html#cfn-acmpca-certificate-extensions-subjectalternativenames)
       */
      override fun subjectAlternativeNames(): Any? = unwrap(this).getSubjectAlternativeNames()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ExtensionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificate.ExtensionsProperty):
          ExtensionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExtensionsProperty):
          software.amazon.awscdk.services.acmpca.CfnCertificate.ExtensionsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.acmpca.CfnCertificate.ExtensionsProperty
    }
  }

  public interface ExtendedKeyUsageProperty {
    /**
     * Specifies a custom `ExtendedKeyUsage` with an object identifier (OID).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-extendedkeyusage.html#cfn-acmpca-certificate-extendedkeyusage-extendedkeyusageobjectidentifier)
     */
    public fun extendedKeyUsageObjectIdentifier(): String? =
        unwrap(this).getExtendedKeyUsageObjectIdentifier()

    /**
     * Specifies a standard `ExtendedKeyUsage` as defined as in [RFC
     * 5280](https://docs.aws.amazon.com/https://datatracker.ietf.org/doc/html/rfc5280#section-4.2.1.12)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-extendedkeyusage.html#cfn-acmpca-certificate-extendedkeyusage-extendedkeyusagetype)
     */
    public fun extendedKeyUsageType(): String? = unwrap(this).getExtendedKeyUsageType()

    /**
     * A builder for [ExtendedKeyUsageProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param extendedKeyUsageObjectIdentifier Specifies a custom `ExtendedKeyUsage` with an
       * object identifier (OID).
       */
      public fun extendedKeyUsageObjectIdentifier(extendedKeyUsageObjectIdentifier: String)

      /**
       * @param extendedKeyUsageType Specifies a standard `ExtendedKeyUsage` as defined as in [RFC
       * 5280](https://docs.aws.amazon.com/https://datatracker.ietf.org/doc/html/rfc5280#section-4.2.1.12)
       * .
       */
      public fun extendedKeyUsageType(extendedKeyUsageType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.acmpca.CfnCertificate.ExtendedKeyUsageProperty.Builder =
          software.amazon.awscdk.services.acmpca.CfnCertificate.ExtendedKeyUsageProperty.builder()

      /**
       * @param extendedKeyUsageObjectIdentifier Specifies a custom `ExtendedKeyUsage` with an
       * object identifier (OID).
       */
      override fun extendedKeyUsageObjectIdentifier(extendedKeyUsageObjectIdentifier: String) {
        cdkBuilder.extendedKeyUsageObjectIdentifier(extendedKeyUsageObjectIdentifier)
      }

      /**
       * @param extendedKeyUsageType Specifies a standard `ExtendedKeyUsage` as defined as in [RFC
       * 5280](https://docs.aws.amazon.com/https://datatracker.ietf.org/doc/html/rfc5280#section-4.2.1.12)
       * .
       */
      override fun extendedKeyUsageType(extendedKeyUsageType: String) {
        cdkBuilder.extendedKeyUsageType(extendedKeyUsageType)
      }

      public fun build():
          software.amazon.awscdk.services.acmpca.CfnCertificate.ExtendedKeyUsageProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.acmpca.CfnCertificate.ExtendedKeyUsageProperty,
    ) : CdkObject(cdkObject), ExtendedKeyUsageProperty {
      /**
       * Specifies a custom `ExtendedKeyUsage` with an object identifier (OID).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-extendedkeyusage.html#cfn-acmpca-certificate-extendedkeyusage-extendedkeyusageobjectidentifier)
       */
      override fun extendedKeyUsageObjectIdentifier(): String? =
          unwrap(this).getExtendedKeyUsageObjectIdentifier()

      /**
       * Specifies a standard `ExtendedKeyUsage` as defined as in [RFC
       * 5280](https://docs.aws.amazon.com/https://datatracker.ietf.org/doc/html/rfc5280#section-4.2.1.12)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-extendedkeyusage.html#cfn-acmpca-certificate-extendedkeyusage-extendedkeyusagetype)
       */
      override fun extendedKeyUsageType(): String? = unwrap(this).getExtendedKeyUsageType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ExtendedKeyUsageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificate.ExtendedKeyUsageProperty):
          ExtendedKeyUsageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExtendedKeyUsageProperty):
          software.amazon.awscdk.services.acmpca.CfnCertificate.ExtendedKeyUsageProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.acmpca.CfnCertificate.ExtendedKeyUsageProperty
    }
  }

  public interface QualifierProperty {
    /**
     * Contains a pointer to a certification practice statement (CPS) published by the CA.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-qualifier.html#cfn-acmpca-certificate-qualifier-cpsuri)
     */
    public fun cpsUri(): String

    /**
     * A builder for [QualifierProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cpsUri Contains a pointer to a certification practice statement (CPS) published by
       * the CA. 
       */
      public fun cpsUri(cpsUri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.acmpca.CfnCertificate.QualifierProperty.Builder =
          software.amazon.awscdk.services.acmpca.CfnCertificate.QualifierProperty.builder()

      /**
       * @param cpsUri Contains a pointer to a certification practice statement (CPS) published by
       * the CA. 
       */
      override fun cpsUri(cpsUri: String) {
        cdkBuilder.cpsUri(cpsUri)
      }

      public fun build(): software.amazon.awscdk.services.acmpca.CfnCertificate.QualifierProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.acmpca.CfnCertificate.QualifierProperty,
    ) : CdkObject(cdkObject), QualifierProperty {
      /**
       * Contains a pointer to a certification practice statement (CPS) published by the CA.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-qualifier.html#cfn-acmpca-certificate-qualifier-cpsuri)
       */
      override fun cpsUri(): String = unwrap(this).getCpsUri()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): QualifierProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificate.QualifierProperty):
          QualifierProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: QualifierProperty):
          software.amazon.awscdk.services.acmpca.CfnCertificate.QualifierProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.acmpca.CfnCertificate.QualifierProperty
    }
  }

  public interface OtherNameProperty {
    /**
     * Specifies an OID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-othername.html#cfn-acmpca-certificate-othername-typeid)
     */
    public fun typeId(): String

    /**
     * Specifies an OID value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-othername.html#cfn-acmpca-certificate-othername-value)
     */
    public fun `value`(): String

    /**
     * A builder for [OtherNameProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param typeId Specifies an OID. 
       */
      public fun typeId(typeId: String)

      /**
       * @param value Specifies an OID value. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.acmpca.CfnCertificate.OtherNameProperty.Builder =
          software.amazon.awscdk.services.acmpca.CfnCertificate.OtherNameProperty.builder()

      /**
       * @param typeId Specifies an OID. 
       */
      override fun typeId(typeId: String) {
        cdkBuilder.typeId(typeId)
      }

      /**
       * @param value Specifies an OID value. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.acmpca.CfnCertificate.OtherNameProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.acmpca.CfnCertificate.OtherNameProperty,
    ) : CdkObject(cdkObject), OtherNameProperty {
      /**
       * Specifies an OID.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-othername.html#cfn-acmpca-certificate-othername-typeid)
       */
      override fun typeId(): String = unwrap(this).getTypeId()

      /**
       * Specifies an OID value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-othername.html#cfn-acmpca-certificate-othername-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OtherNameProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificate.OtherNameProperty):
          OtherNameProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OtherNameProperty):
          software.amazon.awscdk.services.acmpca.CfnCertificate.OtherNameProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.acmpca.CfnCertificate.OtherNameProperty
    }
  }

  public interface ValidityProperty {
    /**
     * Specifies whether the `Value` parameter represents days, months, or years.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-validity.html#cfn-acmpca-certificate-validity-type)
     */
    public fun type(): String

    /**
     * A long integer interpreted according to the value of `Type` , below.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-validity.html#cfn-acmpca-certificate-validity-value)
     */
    public fun `value`(): Number

    /**
     * A builder for [ValidityProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param type Specifies whether the `Value` parameter represents days, months, or years. 
       */
      public fun type(type: String)

      /**
       * @param value A long integer interpreted according to the value of `Type` , below. 
       */
      public fun `value`(`value`: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.acmpca.CfnCertificate.ValidityProperty.Builder =
          software.amazon.awscdk.services.acmpca.CfnCertificate.ValidityProperty.builder()

      /**
       * @param type Specifies whether the `Value` parameter represents days, months, or years. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      /**
       * @param value A long integer interpreted according to the value of `Type` , below. 
       */
      override fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.acmpca.CfnCertificate.ValidityProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.acmpca.CfnCertificate.ValidityProperty,
    ) : CdkObject(cdkObject), ValidityProperty {
      /**
       * Specifies whether the `Value` parameter represents days, months, or years.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-validity.html#cfn-acmpca-certificate-validity-type)
       */
      override fun type(): String = unwrap(this).getType()

      /**
       * A long integer interpreted according to the value of `Type` , below.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-validity.html#cfn-acmpca-certificate-validity-value)
       */
      override fun `value`(): Number = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ValidityProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.acmpca.CfnCertificate.ValidityProperty):
          ValidityProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ValidityProperty):
          software.amazon.awscdk.services.acmpca.CfnCertificate.ValidityProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.acmpca.CfnCertificate.ValidityProperty
    }
  }
}
