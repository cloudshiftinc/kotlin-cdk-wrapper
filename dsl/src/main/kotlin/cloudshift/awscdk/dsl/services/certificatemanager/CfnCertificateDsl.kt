@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.certificatemanager

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.certificatemanager.CfnCertificate
import software.constructs.Construct

/**
 * The `AWS::CertificateManager::Certificate` resource requests an AWS Certificate Manager ( ACM )
 * certificate that you can use to enable secure connections.
 *
 * For example, you can deploy an ACM certificate to an Elastic Load Balancer to enable HTTPS
 * support. For more information, see
 * [RequestCertificate](https://docs.aws.amazon.com/acm/latest/APIReference/API_RequestCertificate.html)
 * in the AWS Certificate Manager API Reference.
 *
 * When you use the `AWS::CertificateManager::Certificate` resource in a CloudFormation stack,
 * domain validation is handled automatically if all three of the following are true: The
 * certificate domain is hosted in Amazon Route 53, the domain resides in your AWS account , and you
 * are using DNS validation.
 *
 * However, if the certificate uses email validation, or if the domain is not hosted in Route 53,
 * then the stack will remain in the `CREATE_IN_PROGRESS` state. Further stack operations are
 * delayed until you validate the certificate request, either by acting upon the instructions in the
 * validation email, or by adding a CNAME record to your DNS configuration. For more information,
 * see
 * [Option 1: DNS Validation](https://docs.aws.amazon.com/acm/latest/userguide/dns-validation.html)
 * and
 * [Option 2: Email Validation](https://docs.aws.amazon.com/acm/latest/userguide/email-validation.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.certificatemanager.*;
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
@CdkDslMarker
public class CfnCertificateDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnCertificate.Builder = CfnCertificate.Builder.create(scope, id)

    private val _domainValidationOptions: MutableList<Any> = mutableListOf()

    private val _subjectAlternativeNames: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The Amazon Resource Name (ARN) of the private certificate authority (CA) that will be used to
     * issue the certificate.
     *
     * If you do not provide an ARN and you are trying to request a private certificate, ACM will
     * attempt to issue a public certificate. For more information about private CAs, see the
     * [AWS Private Certificate Authority](https://docs.aws.amazon.com/privateca/latest/userguide/PcaWelcome.html)
     * user guide. The ARN must have the following form:
     *
     * `arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-certificateauthorityarn)
     *
     * @param certificateAuthorityArn The Amazon Resource Name (ARN) of the private certificate
     *   authority (CA) that will be used to issue the certificate.
     */
    public fun certificateAuthorityArn(certificateAuthorityArn: String) {
        cdkBuilder.certificateAuthorityArn(certificateAuthorityArn)
    }

    /**
     * You can opt out of certificate transparency logging by specifying the `DISABLED` option. Opt
     * in by specifying `ENABLED` .
     *
     * If you do not specify a certificate transparency logging preference on a new CloudFormation
     * template, or if you remove the logging preference from an existing template, this is the same
     * as explicitly enabling the preference.
     *
     * Changing the certificate transparency logging preference will update the existing resource by
     * calling `UpdateCertificateOptions` on the certificate. This action will not create a new
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-certificatetransparencyloggingpreference)
     *
     * @param certificateTransparencyLoggingPreference You can opt out of certificate transparency
     *   logging by specifying the `DISABLED` option. Opt in by specifying `ENABLED` .
     */
    public fun certificateTransparencyLoggingPreference(
        certificateTransparencyLoggingPreference: String
    ) {
        cdkBuilder.certificateTransparencyLoggingPreference(
            certificateTransparencyLoggingPreference
        )
    }

    /**
     * The fully qualified domain name (FQDN), such as www.example.com, with which you want to
     * secure an ACM certificate. Use an asterisk (*) to create a wildcard certificate that protects
     * several sites in the same domain. For example, `*.example.com` protects `www.example.com` ,
     * `site.example.com` , and `images.example.com.`.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-domainname)
     *
     * @param domainName The fully qualified domain name (FQDN), such as www.example.com, with which
     *   you want to secure an ACM certificate. Use an asterisk (*) to create a wildcard certificate
     *   that protects several sites in the same domain. For example, `*.example.com` protects
     *   `www.example.com` , `site.example.com` , and `images.example.com.`.
     */
    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    /**
     * Domain information that domain name registrars use to verify your identity.
     *
     * In order for a AWS::CertificateManager::Certificate to be provisioned and validated in
     * CloudFormation automatically, the `DomainName` property needs to be identical to one of the
     * `DomainName` property supplied in DomainValidationOptions, if the ValidationMethod is
     * **DNS**. Failing to keep them like-for-like will result in failure to create the domain
     * validation records in Route53.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-domainvalidationoptions)
     *
     * @param domainValidationOptions Domain information that domain name registrars use to verify
     *   your identity.
     */
    public fun domainValidationOptions(vararg domainValidationOptions: Any) {
        _domainValidationOptions.addAll(listOf(*domainValidationOptions))
    }

    /**
     * Domain information that domain name registrars use to verify your identity.
     *
     * In order for a AWS::CertificateManager::Certificate to be provisioned and validated in
     * CloudFormation automatically, the `DomainName` property needs to be identical to one of the
     * `DomainName` property supplied in DomainValidationOptions, if the ValidationMethod is
     * **DNS**. Failing to keep them like-for-like will result in failure to create the domain
     * validation records in Route53.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-domainvalidationoptions)
     *
     * @param domainValidationOptions Domain information that domain name registrars use to verify
     *   your identity.
     */
    public fun domainValidationOptions(domainValidationOptions: Collection<Any>) {
        _domainValidationOptions.addAll(domainValidationOptions)
    }

    /**
     * Domain information that domain name registrars use to verify your identity.
     *
     * In order for a AWS::CertificateManager::Certificate to be provisioned and validated in
     * CloudFormation automatically, the `DomainName` property needs to be identical to one of the
     * `DomainName` property supplied in DomainValidationOptions, if the ValidationMethod is
     * **DNS**. Failing to keep them like-for-like will result in failure to create the domain
     * validation records in Route53.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-domainvalidationoptions)
     *
     * @param domainValidationOptions Domain information that domain name registrars use to verify
     *   your identity.
     */
    public fun domainValidationOptions(domainValidationOptions: IResolvable) {
        cdkBuilder.domainValidationOptions(domainValidationOptions)
    }

    /**
     * Additional FQDNs to be included in the Subject Alternative Name extension of the ACM
     * certificate.
     *
     * For example, you can add www.example.net to a certificate for which the `DomainName` field is
     * www.example.com if users can reach your site by using either name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-subjectalternativenames)
     *
     * @param subjectAlternativeNames Additional FQDNs to be included in the Subject Alternative
     *   Name extension of the ACM certificate.
     */
    public fun subjectAlternativeNames(vararg subjectAlternativeNames: String) {
        _subjectAlternativeNames.addAll(listOf(*subjectAlternativeNames))
    }

    /**
     * Additional FQDNs to be included in the Subject Alternative Name extension of the ACM
     * certificate.
     *
     * For example, you can add www.example.net to a certificate for which the `DomainName` field is
     * www.example.com if users can reach your site by using either name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-subjectalternativenames)
     *
     * @param subjectAlternativeNames Additional FQDNs to be included in the Subject Alternative
     *   Name extension of the ACM certificate.
     */
    public fun subjectAlternativeNames(subjectAlternativeNames: Collection<String>) {
        _subjectAlternativeNames.addAll(subjectAlternativeNames)
    }

    /**
     * Key-value pairs that can identify the certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-tags)
     *
     * @param tags Key-value pairs that can identify the certificate.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * Key-value pairs that can identify the certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-tags)
     *
     * @param tags Key-value pairs that can identify the certificate.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The method you want to use to validate that you own or control the domain associated with a
     * public certificate.
     *
     * You can
     * [validate with DNS](https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-validate-dns.html)
     * or
     * [validate with email](https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-validate-email.html)
     * . We recommend that you use DNS validation.
     *
     * If not specified, this property defaults to email validation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-certificate.html#cfn-certificatemanager-certificate-validationmethod)
     *
     * @param validationMethod The method you want to use to validate that you own or control the
     *   domain associated with a public certificate.
     */
    public fun validationMethod(validationMethod: String) {
        cdkBuilder.validationMethod(validationMethod)
    }

    public fun build(): CfnCertificate {
        if (_domainValidationOptions.isNotEmpty())
            cdkBuilder.domainValidationOptions(_domainValidationOptions)
        if (_subjectAlternativeNames.isNotEmpty())
            cdkBuilder.subjectAlternativeNames(_subjectAlternativeNames)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
