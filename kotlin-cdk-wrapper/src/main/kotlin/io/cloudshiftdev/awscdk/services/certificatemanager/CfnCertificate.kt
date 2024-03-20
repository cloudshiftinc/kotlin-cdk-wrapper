@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.certificatemanager

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::CertificateManager::Certificate` resource requests an AWS Certificate Manager ( ACM )
 * certificate that you can use to enable secure connections.
 *
 * For example, you can deploy an ACM certificate to an Elastic Load Balancer to enable HTTPS
 * support. For more information, see
 * [RequestCertificate](https://docs.aws.amazon.com/acm/latest/APIReference/API_RequestCertificate.html)
 * in the AWS Certificate Manager API Reference.
 *
 *
 * When you use the `AWS::CertificateManager::Certificate` resource in a CloudFormation stack,
 * domain validation is handled automatically if all three of the following are true: The certificate
 * domain is hosted in Amazon Route 53, the domain resides in your AWS account , and you are using DNS
 * validation.
 *
 * However, if the certificate uses email validation, or if the domain is not hosted in Route 53,
 * then the stack will remain in the `CREATE_IN_PROGRESS` state. Further stack operations are delayed
 * until you validate the certificate request, either by acting upon the instructions in the validation
 * email, or by adding a CNAME record to your DNS configuration. For more information, see [Option 1:
 * DNS Validation](https://docs.aws.amazon.com/acm/latest/userguide/dns-validation.html) and [Option 2:
 * Email Validation](https://docs.aws.amazon.com/acm/latest/userguide/email-validation.html) .
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.certificatemanager.*;
 * CfnCertificate cfnCertificate = CfnCertificate.Builder.create(this, "MyCfnCertificate")
 * .domainName("domainName")
 * // the properties below are optional
 * .certificateAuthorityArn("certificateAuthorityArn")
 * .certificateTransparencyLoggingPreference("certificateTransparencyLoggingPreference")
 * .domainValidationOptions(List.of(DomainValidationOptionProperty.builder()
 * .domainName("domainName")
 * // the properties below are optional
 * .hostedZoneId("hostedZoneId")
 * .validationDomain("validationDomain")
 * .build()))
 * .keyAlgorithm("keyAlgorithm")
 * .subjectAlternativeNames(List.of("subjectAlternativeNames"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .validationMethod("validationMethod")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html)
 */
public open class CfnCertificate internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.certificatemanager.CfnCertificate,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCertificateProps,
  ) :
      this(software.amazon.awscdk.services.certificatemanager.CfnCertificate(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnCertificateProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCertificateProps.Builder.() -> Unit,
  ) : this(scope, id, CfnCertificateProps(props)
  )

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The Amazon Resource Name (ARN) of the private certificate authority (CA) that will be used to
   * issue the certificate.
   */
  public open fun certificateAuthorityArn(): String? = unwrap(this).getCertificateAuthorityArn()

  /**
   * The Amazon Resource Name (ARN) of the private certificate authority (CA) that will be used to
   * issue the certificate.
   */
  public open fun certificateAuthorityArn(`value`: String) {
    unwrap(this).setCertificateAuthorityArn(`value`)
  }

  /**
   * You can opt out of certificate transparency logging by specifying the `DISABLED` option.
   *
   * Opt in by specifying `ENABLED` .
   */
  public open fun certificateTransparencyLoggingPreference(): String? =
      unwrap(this).getCertificateTransparencyLoggingPreference()

  /**
   * You can opt out of certificate transparency logging by specifying the `DISABLED` option.
   *
   * Opt in by specifying `ENABLED` .
   */
  public open fun certificateTransparencyLoggingPreference(`value`: String) {
    unwrap(this).setCertificateTransparencyLoggingPreference(`value`)
  }

  /**
   * The fully qualified domain name (FQDN), such as www.example.com, with which you want to secure
   * an ACM certificate. Use an asterisk (*) to create a wildcard certificate that protects several
   * sites in the same domain. For example, `*.example.com` protects `www.example.com` ,
   * `site.example.com` , and `images.example.com.`.
   */
  public open fun domainName(): String = unwrap(this).getDomainName()

  /**
   * The fully qualified domain name (FQDN), such as www.example.com, with which you want to secure
   * an ACM certificate. Use an asterisk (*) to create a wildcard certificate that protects several
   * sites in the same domain. For example, `*.example.com` protects `www.example.com` ,
   * `site.example.com` , and `images.example.com.`.
   */
  public open fun domainName(`value`: String) {
    unwrap(this).setDomainName(`value`)
  }

  /**
   * Domain information that domain name registrars use to verify your identity.
   */
  public open fun domainValidationOptions(): Any? = unwrap(this).getDomainValidationOptions()

  /**
   * Domain information that domain name registrars use to verify your identity.
   */
  public open fun domainValidationOptions(`value`: IResolvable) {
    unwrap(this).setDomainValidationOptions(`value`.let(IResolvable::unwrap))
  }

  /**
   * Domain information that domain name registrars use to verify your identity.
   */
  public open fun domainValidationOptions(`value`: List<Any>) {
    unwrap(this).setDomainValidationOptions(`value`)
  }

  /**
   * Domain information that domain name registrars use to verify your identity.
   */
  public open fun domainValidationOptions(vararg `value`: Any): Unit =
      domainValidationOptions(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Specifies the algorithm of the public and private key pair that your certificate uses to
   * encrypt data.
   */
  public open fun keyAlgorithm(): String? = unwrap(this).getKeyAlgorithm()

  /**
   * Specifies the algorithm of the public and private key pair that your certificate uses to
   * encrypt data.
   */
  public open fun keyAlgorithm(`value`: String) {
    unwrap(this).setKeyAlgorithm(`value`)
  }

  /**
   * Additional FQDNs to be included in the Subject Alternative Name extension of the ACM
   * certificate.
   */
  public open fun subjectAlternativeNames(): List<String> =
      unwrap(this).getSubjectAlternativeNames() ?: emptyList()

  /**
   * Additional FQDNs to be included in the Subject Alternative Name extension of the ACM
   * certificate.
   */
  public open fun subjectAlternativeNames(`value`: List<String>) {
    unwrap(this).setSubjectAlternativeNames(`value`)
  }

  /**
   * Additional FQDNs to be included in the Subject Alternative Name extension of the ACM
   * certificate.
   */
  public open fun subjectAlternativeNames(vararg `value`: String): Unit =
      subjectAlternativeNames(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Key-value pairs that can identify the certificate.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Key-value pairs that can identify the certificate.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Key-value pairs that can identify the certificate.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The method you want to use to validate that you own or control the domain associated with a
   * public certificate.
   */
  public open fun validationMethod(): String? = unwrap(this).getValidationMethod()

  /**
   * The method you want to use to validate that you own or control the domain associated with a
   * public certificate.
   */
  public open fun validationMethod(`value`: String) {
    unwrap(this).setValidationMethod(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.certificatemanager.CfnCertificate].
   */
  @CdkDslMarker
  public interface Builder {
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
     * @param certificateAuthorityArn The Amazon Resource Name (ARN) of the private certificate
     * authority (CA) that will be used to issue the certificate. 
     */
    public fun certificateAuthorityArn(certificateAuthorityArn: String)

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
     * @param certificateTransparencyLoggingPreference You can opt out of certificate transparency
     * logging by specifying the `DISABLED` option. Opt in by specifying `ENABLED` . 
     */
    public
        fun certificateTransparencyLoggingPreference(certificateTransparencyLoggingPreference: String)

    /**
     * The fully qualified domain name (FQDN), such as www.example.com, with which you want to
     * secure an ACM certificate. Use an asterisk (*) to create a wildcard certificate that protects
     * several sites in the same domain. For example, `*.example.com` protects `www.example.com` ,
     * `site.example.com` , and `images.example.com.`.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-domainname)
     * @param domainName The fully qualified domain name (FQDN), such as www.example.com, with which
     * you want to secure an ACM certificate. Use an asterisk (*) to create a wildcard certificate that
     * protects several sites in the same domain. For example, `*.example.com` protects
     * `www.example.com` , `site.example.com` , and `images.example.com.`. 
     */
    public fun domainName(domainName: String)

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
     * @param domainValidationOptions Domain information that domain name registrars use to verify
     * your identity. 
     */
    public fun domainValidationOptions(domainValidationOptions: IResolvable)

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
     * @param domainValidationOptions Domain information that domain name registrars use to verify
     * your identity. 
     */
    public fun domainValidationOptions(domainValidationOptions: List<Any>)

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
     * @param domainValidationOptions Domain information that domain name registrars use to verify
     * your identity. 
     */
    public fun domainValidationOptions(vararg domainValidationOptions: Any)

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
     * @param keyAlgorithm Specifies the algorithm of the public and private key pair that your
     * certificate uses to encrypt data. 
     */
    public fun keyAlgorithm(keyAlgorithm: String)

    /**
     * Additional FQDNs to be included in the Subject Alternative Name extension of the ACM
     * certificate.
     *
     * For example, you can add www.example.net to a certificate for which the `DomainName` field is
     * www.example.com if users can reach your site by using either name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-subjectalternativenames)
     * @param subjectAlternativeNames Additional FQDNs to be included in the Subject Alternative
     * Name extension of the ACM certificate. 
     */
    public fun subjectAlternativeNames(subjectAlternativeNames: List<String>)

    /**
     * Additional FQDNs to be included in the Subject Alternative Name extension of the ACM
     * certificate.
     *
     * For example, you can add www.example.net to a certificate for which the `DomainName` field is
     * www.example.com if users can reach your site by using either name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-subjectalternativenames)
     * @param subjectAlternativeNames Additional FQDNs to be included in the Subject Alternative
     * Name extension of the ACM certificate. 
     */
    public fun subjectAlternativeNames(vararg subjectAlternativeNames: String)

    /**
     * Key-value pairs that can identify the certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-tags)
     * @param tags Key-value pairs that can identify the certificate. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Key-value pairs that can identify the certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-tags)
     * @param tags Key-value pairs that can identify the certificate. 
     */
    public fun tags(vararg tags: CfnTag)

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
     * @param validationMethod The method you want to use to validate that you own or control the
     * domain associated with a public certificate. 
     */
    public fun validationMethod(validationMethod: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.certificatemanager.CfnCertificate.Builder =
        software.amazon.awscdk.services.certificatemanager.CfnCertificate.Builder.create(scope, id)

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
     * @param certificateAuthorityArn The Amazon Resource Name (ARN) of the private certificate
     * authority (CA) that will be used to issue the certificate. 
     */
    override fun certificateAuthorityArn(certificateAuthorityArn: String) {
      cdkBuilder.certificateAuthorityArn(certificateAuthorityArn)
    }

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
     * @param certificateTransparencyLoggingPreference You can opt out of certificate transparency
     * logging by specifying the `DISABLED` option. Opt in by specifying `ENABLED` . 
     */
    override
        fun certificateTransparencyLoggingPreference(certificateTransparencyLoggingPreference: String) {
      cdkBuilder.certificateTransparencyLoggingPreference(certificateTransparencyLoggingPreference)
    }

    /**
     * The fully qualified domain name (FQDN), such as www.example.com, with which you want to
     * secure an ACM certificate. Use an asterisk (*) to create a wildcard certificate that protects
     * several sites in the same domain. For example, `*.example.com` protects `www.example.com` ,
     * `site.example.com` , and `images.example.com.`.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-domainname)
     * @param domainName The fully qualified domain name (FQDN), such as www.example.com, with which
     * you want to secure an ACM certificate. Use an asterisk (*) to create a wildcard certificate that
     * protects several sites in the same domain. For example, `*.example.com` protects
     * `www.example.com` , `site.example.com` , and `images.example.com.`. 
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

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
     * @param domainValidationOptions Domain information that domain name registrars use to verify
     * your identity. 
     */
    override fun domainValidationOptions(domainValidationOptions: IResolvable) {
      cdkBuilder.domainValidationOptions(domainValidationOptions.let(IResolvable::unwrap))
    }

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
     * @param domainValidationOptions Domain information that domain name registrars use to verify
     * your identity. 
     */
    override fun domainValidationOptions(domainValidationOptions: List<Any>) {
      cdkBuilder.domainValidationOptions(domainValidationOptions)
    }

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
     * @param domainValidationOptions Domain information that domain name registrars use to verify
     * your identity. 
     */
    override fun domainValidationOptions(vararg domainValidationOptions: Any): Unit =
        domainValidationOptions(domainValidationOptions.toList())

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
     * @param keyAlgorithm Specifies the algorithm of the public and private key pair that your
     * certificate uses to encrypt data. 
     */
    override fun keyAlgorithm(keyAlgorithm: String) {
      cdkBuilder.keyAlgorithm(keyAlgorithm)
    }

    /**
     * Additional FQDNs to be included in the Subject Alternative Name extension of the ACM
     * certificate.
     *
     * For example, you can add www.example.net to a certificate for which the `DomainName` field is
     * www.example.com if users can reach your site by using either name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-subjectalternativenames)
     * @param subjectAlternativeNames Additional FQDNs to be included in the Subject Alternative
     * Name extension of the ACM certificate. 
     */
    override fun subjectAlternativeNames(subjectAlternativeNames: List<String>) {
      cdkBuilder.subjectAlternativeNames(subjectAlternativeNames)
    }

    /**
     * Additional FQDNs to be included in the Subject Alternative Name extension of the ACM
     * certificate.
     *
     * For example, you can add www.example.net to a certificate for which the `DomainName` field is
     * www.example.com if users can reach your site by using either name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-subjectalternativenames)
     * @param subjectAlternativeNames Additional FQDNs to be included in the Subject Alternative
     * Name extension of the ACM certificate. 
     */
    override fun subjectAlternativeNames(vararg subjectAlternativeNames: String): Unit =
        subjectAlternativeNames(subjectAlternativeNames.toList())

    /**
     * Key-value pairs that can identify the certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-tags)
     * @param tags Key-value pairs that can identify the certificate. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Key-value pairs that can identify the certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-tags)
     * @param tags Key-value pairs that can identify the certificate. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

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
     * @param validationMethod The method you want to use to validate that you own or control the
     * domain associated with a public certificate. 
     */
    override fun validationMethod(validationMethod: String) {
      cdkBuilder.validationMethod(validationMethod)
    }

    public fun build(): software.amazon.awscdk.services.certificatemanager.CfnCertificate =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.certificatemanager.CfnCertificate.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCertificate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCertificate(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.certificatemanager.CfnCertificate):
        CfnCertificate = CfnCertificate(cdkObject)

    internal fun unwrap(wrapped: CfnCertificate):
        software.amazon.awscdk.services.certificatemanager.CfnCertificate = wrapped.cdkObject
  }

  /**
   * `DomainValidationOption` is a property of the
   * [AWS::CertificateManager::Certificate](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html)
   * resource that specifies the AWS Certificate Manager ( ACM ) certificate domain to validate.
   * Depending on the chosen validation method, ACM checks the domain's DNS record for a validation
   * CNAME, or it attempts to send a validation email message to the domain owner.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.certificatemanager.*;
   * DomainValidationOptionProperty domainValidationOptionProperty =
   * DomainValidationOptionProperty.builder()
   * .domainName("domainName")
   * // the properties below are optional
   * .hostedZoneId("hostedZoneId")
   * .validationDomain("validationDomain")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-certificatemanager-certificate-domainvalidationoption.html)
   */
  public interface DomainValidationOptionProperty {
    /**
     * A fully qualified domain name (FQDN) in the certificate request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-certificatemanager-certificate-domainvalidationoption.html#cfn-certificatemanager-certificate-domainvalidationoption-domainname)
     */
    public fun domainName(): String

    /**
     * The `HostedZoneId` option, which is available if you are using Route 53 as your domain
     * registrar, causes ACM to add your CNAME to the domain record.
     *
     * Your list of `DomainValidationOptions` must contain one and only one of the domain-validation
     * options, and the `HostedZoneId` can be used only when `DNS` is specified as your validation
     * method.
     *
     * Use the Route 53 `ListHostedZones` API to discover IDs for available hosted zones.
     *
     * This option is required for publicly trusted certificates.
     *
     *
     * The `ListHostedZones` API returns IDs in the format "/hostedzone/Z111111QQQQQQQ", but
     * CloudFormation requires the IDs to be in the format "Z111111QQQQQQQ".
     *
     *
     * When you change your `DomainValidationOptions` , a new resource is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-certificatemanager-certificate-domainvalidationoption.html#cfn-certificatemanager-certificate-domainvalidationoption-hostedzoneid)
     */
    public fun hostedZoneId(): String? = unwrap(this).getHostedZoneId()

    /**
     * The domain name to which you want ACM to send validation emails.
     *
     * This domain name is the suffix of the email addresses that you want ACM to use. This must be
     * the same as the `DomainName` value or a superdomain of the `DomainName` value. For example, if
     * you request a certificate for `testing.example.com` , you can specify `example.com` as this
     * value. In that case, ACM sends domain validation emails to the following five addresses:
     *
     * * admin&#64;example.com
     * * administrator&#64;example.com
     * * hostmaster&#64;example.com
     * * postmaster&#64;example.com
     * * webmaster&#64;example.com
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-certificatemanager-certificate-domainvalidationoption.html#cfn-certificatemanager-certificate-domainvalidationoption-validationdomain)
     */
    public fun validationDomain(): String? = unwrap(this).getValidationDomain()

    /**
     * A builder for [DomainValidationOptionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param domainName A fully qualified domain name (FQDN) in the certificate request. 
       */
      public fun domainName(domainName: String)

      /**
       * @param hostedZoneId The `HostedZoneId` option, which is available if you are using Route 53
       * as your domain registrar, causes ACM to add your CNAME to the domain record.
       * Your list of `DomainValidationOptions` must contain one and only one of the
       * domain-validation options, and the `HostedZoneId` can be used only when `DNS` is specified as
       * your validation method.
       *
       * Use the Route 53 `ListHostedZones` API to discover IDs for available hosted zones.
       *
       * This option is required for publicly trusted certificates.
       *
       *
       * The `ListHostedZones` API returns IDs in the format "/hostedzone/Z111111QQQQQQQ", but
       * CloudFormation requires the IDs to be in the format "Z111111QQQQQQQ".
       *
       *
       * When you change your `DomainValidationOptions` , a new resource is created.
       */
      public fun hostedZoneId(hostedZoneId: String)

      /**
       * @param validationDomain The domain name to which you want ACM to send validation emails.
       * This domain name is the suffix of the email addresses that you want ACM to use. This must
       * be the same as the `DomainName` value or a superdomain of the `DomainName` value. For example,
       * if you request a certificate for `testing.example.com` , you can specify `example.com` as this
       * value. In that case, ACM sends domain validation emails to the following five addresses:
       *
       * * admin&#64;example.com
       * * administrator&#64;example.com
       * * hostmaster&#64;example.com
       * * postmaster&#64;example.com
       * * webmaster&#64;example.com
       */
      public fun validationDomain(validationDomain: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.certificatemanager.CfnCertificate.DomainValidationOptionProperty.Builder
          =
          software.amazon.awscdk.services.certificatemanager.CfnCertificate.DomainValidationOptionProperty.builder()

      /**
       * @param domainName A fully qualified domain name (FQDN) in the certificate request. 
       */
      override fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
      }

      /**
       * @param hostedZoneId The `HostedZoneId` option, which is available if you are using Route 53
       * as your domain registrar, causes ACM to add your CNAME to the domain record.
       * Your list of `DomainValidationOptions` must contain one and only one of the
       * domain-validation options, and the `HostedZoneId` can be used only when `DNS` is specified as
       * your validation method.
       *
       * Use the Route 53 `ListHostedZones` API to discover IDs for available hosted zones.
       *
       * This option is required for publicly trusted certificates.
       *
       *
       * The `ListHostedZones` API returns IDs in the format "/hostedzone/Z111111QQQQQQQ", but
       * CloudFormation requires the IDs to be in the format "Z111111QQQQQQQ".
       *
       *
       * When you change your `DomainValidationOptions` , a new resource is created.
       */
      override fun hostedZoneId(hostedZoneId: String) {
        cdkBuilder.hostedZoneId(hostedZoneId)
      }

      /**
       * @param validationDomain The domain name to which you want ACM to send validation emails.
       * This domain name is the suffix of the email addresses that you want ACM to use. This must
       * be the same as the `DomainName` value or a superdomain of the `DomainName` value. For example,
       * if you request a certificate for `testing.example.com` , you can specify `example.com` as this
       * value. In that case, ACM sends domain validation emails to the following five addresses:
       *
       * * admin&#64;example.com
       * * administrator&#64;example.com
       * * hostmaster&#64;example.com
       * * postmaster&#64;example.com
       * * webmaster&#64;example.com
       */
      override fun validationDomain(validationDomain: String) {
        cdkBuilder.validationDomain(validationDomain)
      }

      public fun build():
          software.amazon.awscdk.services.certificatemanager.CfnCertificate.DomainValidationOptionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.certificatemanager.CfnCertificate.DomainValidationOptionProperty,
    ) : CdkObject(cdkObject), DomainValidationOptionProperty {
      /**
       * A fully qualified domain name (FQDN) in the certificate request.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-certificatemanager-certificate-domainvalidationoption.html#cfn-certificatemanager-certificate-domainvalidationoption-domainname)
       */
      override fun domainName(): String = unwrap(this).getDomainName()

      /**
       * The `HostedZoneId` option, which is available if you are using Route 53 as your domain
       * registrar, causes ACM to add your CNAME to the domain record.
       *
       * Your list of `DomainValidationOptions` must contain one and only one of the
       * domain-validation options, and the `HostedZoneId` can be used only when `DNS` is specified as
       * your validation method.
       *
       * Use the Route 53 `ListHostedZones` API to discover IDs for available hosted zones.
       *
       * This option is required for publicly trusted certificates.
       *
       *
       * The `ListHostedZones` API returns IDs in the format "/hostedzone/Z111111QQQQQQQ", but
       * CloudFormation requires the IDs to be in the format "Z111111QQQQQQQ".
       *
       *
       * When you change your `DomainValidationOptions` , a new resource is created.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-certificatemanager-certificate-domainvalidationoption.html#cfn-certificatemanager-certificate-domainvalidationoption-hostedzoneid)
       */
      override fun hostedZoneId(): String? = unwrap(this).getHostedZoneId()

      /**
       * The domain name to which you want ACM to send validation emails.
       *
       * This domain name is the suffix of the email addresses that you want ACM to use. This must
       * be the same as the `DomainName` value or a superdomain of the `DomainName` value. For example,
       * if you request a certificate for `testing.example.com` , you can specify `example.com` as this
       * value. In that case, ACM sends domain validation emails to the following five addresses:
       *
       * * admin&#64;example.com
       * * administrator&#64;example.com
       * * hostmaster&#64;example.com
       * * postmaster&#64;example.com
       * * webmaster&#64;example.com
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-certificatemanager-certificate-domainvalidationoption.html#cfn-certificatemanager-certificate-domainvalidationoption-validationdomain)
       */
      override fun validationDomain(): String? = unwrap(this).getValidationDomain()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DomainValidationOptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.certificatemanager.CfnCertificate.DomainValidationOptionProperty):
          DomainValidationOptionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DomainValidationOptionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DomainValidationOptionProperty):
          software.amazon.awscdk.services.certificatemanager.CfnCertificate.DomainValidationOptionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.certificatemanager.CfnCertificate.DomainValidationOptionProperty
    }
  }
}
