package io.cloudshiftdev.awscdk.services.certificatemanager

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnCertificateProps {
  /**
   * The Amazon Resource Name (ARN) of the private certificate authority (CA) that will be used to
   * issue the certificate.
   *
   * If you do not provide an ARN and you are trying to request a private certificate, ACM will
   * attempt to issue a public certificate. For more information about private CAs, see the [AWS
   * Private Certificate
   * Authority](https://docs.aws.amazon.com/privateca/latest/userguide/PcaWelcome.html) user guide. The
   * ARN must have the following form:
   *
   * `arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-certificateauthorityarn)
   */
  public fun certificateAuthorityArn(): String? = unwrap(this).getCertificateAuthorityArn()

  /**
   * You can opt out of certificate transparency logging by specifying the `DISABLED` option. Opt in
   * by specifying `ENABLED` .
   *
   * If you do not specify a certificate transparency logging preference on a new CloudFormation
   * template, or if you remove the logging preference from an existing template, this is the same as
   * explicitly enabling the preference.
   *
   * Changing the certificate transparency logging preference will update the existing resource by
   * calling `UpdateCertificateOptions` on the certificate. This action will not create a new resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-certificatetransparencyloggingpreference)
   */
  public fun certificateTransparencyLoggingPreference(): String? =
      unwrap(this).getCertificateTransparencyLoggingPreference()

  /**
   * The fully qualified domain name (FQDN), such as www.example.com, with which you want to secure
   * an ACM certificate. Use an asterisk (*) to create a wildcard certificate that protects several
   * sites in the same domain. For example, `*.example.com` protects `www.example.com` ,
   * `site.example.com` , and `images.example.com.`.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-domainname)
   */
  public fun domainName(): String

  /**
   * Domain information that domain name registrars use to verify your identity.
   *
   *
   * In order for a AWS::CertificateManager::Certificate to be provisioned and validated in
   * CloudFormation automatically, the `DomainName` property needs to be identical to one of the
   * `DomainName` property supplied in DomainValidationOptions, if the ValidationMethod is **DNS**.
   * Failing to keep them like-for-like will result in failure to create the domain validation records
   * in Route53.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-domainvalidationoptions)
   */
  public fun domainValidationOptions(): Any? = unwrap(this).getDomainValidationOptions()

  /**
   * Specifies the algorithm of the public and private key pair that your certificate uses to
   * encrypt data.
   *
   * RSA is the default key algorithm for ACM certificates. Elliptic Curve Digital Signature
   * Algorithm (ECDSA) keys are smaller, offering security comparable to RSA keys but with greater
   * computing efficiency. However, ECDSA is not supported by all network clients. Some AWS services
   * may require RSA keys, or only support ECDSA keys of a particular size, while others allow the use
   * of either RSA and ECDSA keys to ensure that compatibility is not broken. Check the requirements
   * for the AWS service where you plan to deploy your certificate. For more information about
   * selecting an algorithm, see [Key
   * algorithms](https://docs.aws.amazon.com/acm/latest/userguide/acm-certificate.html#algorithms) .
   *
   *
   * Algorithms supported for an ACM certificate request include:
   *
   * * `RSA_2048`
   * * `EC_prime256v1`
   * * `EC_secp384r1`
   *
   * Other listed algorithms are for imported certificates only. &gt; When you request a private PKI
   * certificate signed by a CA from AWS Private CA, the specified signing algorithm family (RSA or
   * ECDSA) must match the algorithm family of the CA's secret key.
   *
   *
   * Default: RSA_2048
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-keyalgorithm)
   */
  public fun keyAlgorithm(): String? = unwrap(this).getKeyAlgorithm()

  /**
   * Additional FQDNs to be included in the Subject Alternative Name extension of the ACM
   * certificate.
   *
   * For example, you can add www.example.net to a certificate for which the `DomainName` field is
   * www.example.com if users can reach your site by using either name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-subjectalternativenames)
   */
  public fun subjectAlternativeNames(): List<String> = unwrap(this).getSubjectAlternativeNames() ?:
      emptyList()

  /**
   * Key-value pairs that can identify the certificate.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The method you want to use to validate that you own or control the domain associated with a
   * public certificate.
   *
   * You can [validate with
   * DNS](https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-validate-dns.html) or [validate with
   * email](https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-validate-email.html) . We recommend
   * that you use DNS validation.
   *
   * If not specified, this property defaults to email validation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-validationmethod)
   */
  public fun validationMethod(): String? = unwrap(this).getValidationMethod()

  /**
   * A builder for [CfnCertificateProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param certificateAuthorityArn The Amazon Resource Name (ARN) of the private certificate
     * authority (CA) that will be used to issue the certificate.
     * If you do not provide an ARN and you are trying to request a private certificate, ACM will
     * attempt to issue a public certificate. For more information about private CAs, see the [AWS
     * Private Certificate
     * Authority](https://docs.aws.amazon.com/privateca/latest/userguide/PcaWelcome.html) user guide.
     * The ARN must have the following form:
     *
     * `arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012`
     */
    public fun certificateAuthorityArn(certificateAuthorityArn: String)

    /**
     * @param certificateTransparencyLoggingPreference You can opt out of certificate transparency
     * logging by specifying the `DISABLED` option. Opt in by specifying `ENABLED` .
     * If you do not specify a certificate transparency logging preference on a new CloudFormation
     * template, or if you remove the logging preference from an existing template, this is the same as
     * explicitly enabling the preference.
     *
     * Changing the certificate transparency logging preference will update the existing resource by
     * calling `UpdateCertificateOptions` on the certificate. This action will not create a new
     * resource.
     */
    public
        fun certificateTransparencyLoggingPreference(certificateTransparencyLoggingPreference: String)

    /**
     * @param domainName The fully qualified domain name (FQDN), such as www.example.com, with which
     * you want to secure an ACM certificate. Use an asterisk (*) to create a wildcard certificate that
     * protects several sites in the same domain. For example, `*.example.com` protects
     * `www.example.com` , `site.example.com` , and `images.example.com.`. 
     */
    public fun domainName(domainName: String)

    /**
     * @param domainValidationOptions Domain information that domain name registrars use to verify
     * your identity.
     *
     * In order for a AWS::CertificateManager::Certificate to be provisioned and validated in
     * CloudFormation automatically, the `DomainName` property needs to be identical to one of the
     * `DomainName` property supplied in DomainValidationOptions, if the ValidationMethod is **DNS**.
     * Failing to keep them like-for-like will result in failure to create the domain validation
     * records in Route53.
     */
    public fun domainValidationOptions(domainValidationOptions: IResolvable)

    /**
     * @param domainValidationOptions Domain information that domain name registrars use to verify
     * your identity.
     *
     * In order for a AWS::CertificateManager::Certificate to be provisioned and validated in
     * CloudFormation automatically, the `DomainName` property needs to be identical to one of the
     * `DomainName` property supplied in DomainValidationOptions, if the ValidationMethod is **DNS**.
     * Failing to keep them like-for-like will result in failure to create the domain validation
     * records in Route53.
     */
    public fun domainValidationOptions(domainValidationOptions: List<Any>)

    /**
     * @param domainValidationOptions Domain information that domain name registrars use to verify
     * your identity.
     *
     * In order for a AWS::CertificateManager::Certificate to be provisioned and validated in
     * CloudFormation automatically, the `DomainName` property needs to be identical to one of the
     * `DomainName` property supplied in DomainValidationOptions, if the ValidationMethod is **DNS**.
     * Failing to keep them like-for-like will result in failure to create the domain validation
     * records in Route53.
     */
    public fun domainValidationOptions(vararg domainValidationOptions: Any)

    /**
     * @param keyAlgorithm Specifies the algorithm of the public and private key pair that your
     * certificate uses to encrypt data.
     * RSA is the default key algorithm for ACM certificates. Elliptic Curve Digital Signature
     * Algorithm (ECDSA) keys are smaller, offering security comparable to RSA keys but with greater
     * computing efficiency. However, ECDSA is not supported by all network clients. Some AWS services
     * may require RSA keys, or only support ECDSA keys of a particular size, while others allow the
     * use of either RSA and ECDSA keys to ensure that compatibility is not broken. Check the
     * requirements for the AWS service where you plan to deploy your certificate. For more information
     * about selecting an algorithm, see [Key
     * algorithms](https://docs.aws.amazon.com/acm/latest/userguide/acm-certificate.html#algorithms) .
     *
     *
     * Algorithms supported for an ACM certificate request include:
     *
     * * `RSA_2048`
     * * `EC_prime256v1`
     * * `EC_secp384r1`
     *
     * Other listed algorithms are for imported certificates only. &gt; When you request a private
     * PKI certificate signed by a CA from AWS Private CA, the specified signing algorithm family (RSA
     * or ECDSA) must match the algorithm family of the CA's secret key.
     *
     *
     * Default: RSA_2048
     */
    public fun keyAlgorithm(keyAlgorithm: String)

    /**
     * @param subjectAlternativeNames Additional FQDNs to be included in the Subject Alternative
     * Name extension of the ACM certificate.
     * For example, you can add www.example.net to a certificate for which the `DomainName` field is
     * www.example.com if users can reach your site by using either name.
     */
    public fun subjectAlternativeNames(subjectAlternativeNames: List<String>)

    /**
     * @param subjectAlternativeNames Additional FQDNs to be included in the Subject Alternative
     * Name extension of the ACM certificate.
     * For example, you can add www.example.net to a certificate for which the `DomainName` field is
     * www.example.com if users can reach your site by using either name.
     */
    public fun subjectAlternativeNames(vararg subjectAlternativeNames: String)

    /**
     * @param tags Key-value pairs that can identify the certificate.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Key-value pairs that can identify the certificate.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param validationMethod The method you want to use to validate that you own or control the
     * domain associated with a public certificate.
     * You can [validate with
     * DNS](https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-validate-dns.html) or [validate
     * with email](https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-validate-email.html) . We
     * recommend that you use DNS validation.
     *
     * If not specified, this property defaults to email validation.
     */
    public fun validationMethod(validationMethod: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.certificatemanager.CfnCertificateProps.Builder =
        software.amazon.awscdk.services.certificatemanager.CfnCertificateProps.builder()

    /**
     * @param certificateAuthorityArn The Amazon Resource Name (ARN) of the private certificate
     * authority (CA) that will be used to issue the certificate.
     * If you do not provide an ARN and you are trying to request a private certificate, ACM will
     * attempt to issue a public certificate. For more information about private CAs, see the [AWS
     * Private Certificate
     * Authority](https://docs.aws.amazon.com/privateca/latest/userguide/PcaWelcome.html) user guide.
     * The ARN must have the following form:
     *
     * `arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012`
     */
    override fun certificateAuthorityArn(certificateAuthorityArn: String) {
      cdkBuilder.certificateAuthorityArn(certificateAuthorityArn)
    }

    /**
     * @param certificateTransparencyLoggingPreference You can opt out of certificate transparency
     * logging by specifying the `DISABLED` option. Opt in by specifying `ENABLED` .
     * If you do not specify a certificate transparency logging preference on a new CloudFormation
     * template, or if you remove the logging preference from an existing template, this is the same as
     * explicitly enabling the preference.
     *
     * Changing the certificate transparency logging preference will update the existing resource by
     * calling `UpdateCertificateOptions` on the certificate. This action will not create a new
     * resource.
     */
    override
        fun certificateTransparencyLoggingPreference(certificateTransparencyLoggingPreference: String) {
      cdkBuilder.certificateTransparencyLoggingPreference(certificateTransparencyLoggingPreference)
    }

    /**
     * @param domainName The fully qualified domain name (FQDN), such as www.example.com, with which
     * you want to secure an ACM certificate. Use an asterisk (*) to create a wildcard certificate that
     * protects several sites in the same domain. For example, `*.example.com` protects
     * `www.example.com` , `site.example.com` , and `images.example.com.`. 
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * @param domainValidationOptions Domain information that domain name registrars use to verify
     * your identity.
     *
     * In order for a AWS::CertificateManager::Certificate to be provisioned and validated in
     * CloudFormation automatically, the `DomainName` property needs to be identical to one of the
     * `DomainName` property supplied in DomainValidationOptions, if the ValidationMethod is **DNS**.
     * Failing to keep them like-for-like will result in failure to create the domain validation
     * records in Route53.
     */
    override fun domainValidationOptions(domainValidationOptions: IResolvable) {
      cdkBuilder.domainValidationOptions(domainValidationOptions.let(IResolvable::unwrap))
    }

    /**
     * @param domainValidationOptions Domain information that domain name registrars use to verify
     * your identity.
     *
     * In order for a AWS::CertificateManager::Certificate to be provisioned and validated in
     * CloudFormation automatically, the `DomainName` property needs to be identical to one of the
     * `DomainName` property supplied in DomainValidationOptions, if the ValidationMethod is **DNS**.
     * Failing to keep them like-for-like will result in failure to create the domain validation
     * records in Route53.
     */
    override fun domainValidationOptions(domainValidationOptions: List<Any>) {
      cdkBuilder.domainValidationOptions(domainValidationOptions)
    }

    /**
     * @param domainValidationOptions Domain information that domain name registrars use to verify
     * your identity.
     *
     * In order for a AWS::CertificateManager::Certificate to be provisioned and validated in
     * CloudFormation automatically, the `DomainName` property needs to be identical to one of the
     * `DomainName` property supplied in DomainValidationOptions, if the ValidationMethod is **DNS**.
     * Failing to keep them like-for-like will result in failure to create the domain validation
     * records in Route53.
     */
    override fun domainValidationOptions(vararg domainValidationOptions: Any): Unit =
        domainValidationOptions(domainValidationOptions.toList())

    /**
     * @param keyAlgorithm Specifies the algorithm of the public and private key pair that your
     * certificate uses to encrypt data.
     * RSA is the default key algorithm for ACM certificates. Elliptic Curve Digital Signature
     * Algorithm (ECDSA) keys are smaller, offering security comparable to RSA keys but with greater
     * computing efficiency. However, ECDSA is not supported by all network clients. Some AWS services
     * may require RSA keys, or only support ECDSA keys of a particular size, while others allow the
     * use of either RSA and ECDSA keys to ensure that compatibility is not broken. Check the
     * requirements for the AWS service where you plan to deploy your certificate. For more information
     * about selecting an algorithm, see [Key
     * algorithms](https://docs.aws.amazon.com/acm/latest/userguide/acm-certificate.html#algorithms) .
     *
     *
     * Algorithms supported for an ACM certificate request include:
     *
     * * `RSA_2048`
     * * `EC_prime256v1`
     * * `EC_secp384r1`
     *
     * Other listed algorithms are for imported certificates only. &gt; When you request a private
     * PKI certificate signed by a CA from AWS Private CA, the specified signing algorithm family (RSA
     * or ECDSA) must match the algorithm family of the CA's secret key.
     *
     *
     * Default: RSA_2048
     */
    override fun keyAlgorithm(keyAlgorithm: String) {
      cdkBuilder.keyAlgorithm(keyAlgorithm)
    }

    /**
     * @param subjectAlternativeNames Additional FQDNs to be included in the Subject Alternative
     * Name extension of the ACM certificate.
     * For example, you can add www.example.net to a certificate for which the `DomainName` field is
     * www.example.com if users can reach your site by using either name.
     */
    override fun subjectAlternativeNames(subjectAlternativeNames: List<String>) {
      cdkBuilder.subjectAlternativeNames(subjectAlternativeNames)
    }

    /**
     * @param subjectAlternativeNames Additional FQDNs to be included in the Subject Alternative
     * Name extension of the ACM certificate.
     * For example, you can add www.example.net to a certificate for which the `DomainName` field is
     * www.example.com if users can reach your site by using either name.
     */
    override fun subjectAlternativeNames(vararg subjectAlternativeNames: String): Unit =
        subjectAlternativeNames(subjectAlternativeNames.toList())

    /**
     * @param tags Key-value pairs that can identify the certificate.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Key-value pairs that can identify the certificate.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param validationMethod The method you want to use to validate that you own or control the
     * domain associated with a public certificate.
     * You can [validate with
     * DNS](https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-validate-dns.html) or [validate
     * with email](https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-validate-email.html) . We
     * recommend that you use DNS validation.
     *
     * If not specified, this property defaults to email validation.
     */
    override fun validationMethod(validationMethod: String) {
      cdkBuilder.validationMethod(validationMethod)
    }

    public fun build(): software.amazon.awscdk.services.certificatemanager.CfnCertificateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.certificatemanager.CfnCertificateProps,
  ) : CdkObject(cdkObject), CfnCertificateProps {
    /**
     * The Amazon Resource Name (ARN) of the private certificate authority (CA) that will be used to
     * issue the certificate.
     *
     * If you do not provide an ARN and you are trying to request a private certificate, ACM will
     * attempt to issue a public certificate. For more information about private CAs, see the [AWS
     * Private Certificate
     * Authority](https://docs.aws.amazon.com/privateca/latest/userguide/PcaWelcome.html) user guide.
     * The ARN must have the following form:
     *
     * `arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-certificateauthorityarn)
     */
    override fun certificateAuthorityArn(): String? = unwrap(this).getCertificateAuthorityArn()

    /**
     * You can opt out of certificate transparency logging by specifying the `DISABLED` option. Opt
     * in by specifying `ENABLED` .
     *
     * If you do not specify a certificate transparency logging preference on a new CloudFormation
     * template, or if you remove the logging preference from an existing template, this is the same as
     * explicitly enabling the preference.
     *
     * Changing the certificate transparency logging preference will update the existing resource by
     * calling `UpdateCertificateOptions` on the certificate. This action will not create a new
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-certificatetransparencyloggingpreference)
     */
    override fun certificateTransparencyLoggingPreference(): String? =
        unwrap(this).getCertificateTransparencyLoggingPreference()

    /**
     * The fully qualified domain name (FQDN), such as www.example.com, with which you want to
     * secure an ACM certificate. Use an asterisk (*) to create a wildcard certificate that protects
     * several sites in the same domain. For example, `*.example.com` protects `www.example.com` ,
     * `site.example.com` , and `images.example.com.`.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-domainname)
     */
    override fun domainName(): String = unwrap(this).getDomainName()

    /**
     * Domain information that domain name registrars use to verify your identity.
     *
     *
     * In order for a AWS::CertificateManager::Certificate to be provisioned and validated in
     * CloudFormation automatically, the `DomainName` property needs to be identical to one of the
     * `DomainName` property supplied in DomainValidationOptions, if the ValidationMethod is **DNS**.
     * Failing to keep them like-for-like will result in failure to create the domain validation
     * records in Route53.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-domainvalidationoptions)
     */
    override fun domainValidationOptions(): Any? = unwrap(this).getDomainValidationOptions()

    /**
     * Specifies the algorithm of the public and private key pair that your certificate uses to
     * encrypt data.
     *
     * RSA is the default key algorithm for ACM certificates. Elliptic Curve Digital Signature
     * Algorithm (ECDSA) keys are smaller, offering security comparable to RSA keys but with greater
     * computing efficiency. However, ECDSA is not supported by all network clients. Some AWS services
     * may require RSA keys, or only support ECDSA keys of a particular size, while others allow the
     * use of either RSA and ECDSA keys to ensure that compatibility is not broken. Check the
     * requirements for the AWS service where you plan to deploy your certificate. For more information
     * about selecting an algorithm, see [Key
     * algorithms](https://docs.aws.amazon.com/acm/latest/userguide/acm-certificate.html#algorithms) .
     *
     *
     * Algorithms supported for an ACM certificate request include:
     *
     * * `RSA_2048`
     * * `EC_prime256v1`
     * * `EC_secp384r1`
     *
     * Other listed algorithms are for imported certificates only. &gt; When you request a private
     * PKI certificate signed by a CA from AWS Private CA, the specified signing algorithm family (RSA
     * or ECDSA) must match the algorithm family of the CA's secret key.
     *
     *
     * Default: RSA_2048
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-keyalgorithm)
     */
    override fun keyAlgorithm(): String? = unwrap(this).getKeyAlgorithm()

    /**
     * Additional FQDNs to be included in the Subject Alternative Name extension of the ACM
     * certificate.
     *
     * For example, you can add www.example.net to a certificate for which the `DomainName` field is
     * www.example.com if users can reach your site by using either name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-subjectalternativenames)
     */
    override fun subjectAlternativeNames(): List<String> = unwrap(this).getSubjectAlternativeNames()
        ?: emptyList()

    /**
     * Key-value pairs that can identify the certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The method you want to use to validate that you own or control the domain associated with a
     * public certificate.
     *
     * You can [validate with
     * DNS](https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-validate-dns.html) or [validate
     * with email](https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-validate-email.html) . We
     * recommend that you use DNS validation.
     *
     * If not specified, this property defaults to email validation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-validationmethod)
     */
    override fun validationMethod(): String? = unwrap(this).getValidationMethod()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCertificateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.certificatemanager.CfnCertificateProps):
        CfnCertificateProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCertificateProps):
        software.amazon.awscdk.services.certificatemanager.CfnCertificateProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.certificatemanager.CfnCertificateProps
  }
}
