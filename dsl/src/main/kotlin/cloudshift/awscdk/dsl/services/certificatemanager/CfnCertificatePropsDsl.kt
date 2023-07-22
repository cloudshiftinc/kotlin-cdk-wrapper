@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

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
import software.amazon.awscdk.services.certificatemanager.CfnCertificateProps

@CdkDslMarker
public class CfnCertificatePropsDsl {
  private val cdkBuilder: CfnCertificateProps.Builder = CfnCertificateProps.builder()

  private val _domainValidationOptions: MutableList<Any> = mutableListOf()

  private val _subjectAlternativeNames: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param certificateAuthorityArn The Amazon Resource Name (ARN) of the private certificate
   * authority (CA) that will be used to issue the certificate.
   * If you do not provide an ARN and you are trying to request a private certificate, ACM will
   * attempt to issue a public certificate. For more information about private CAs, see the [AWS
   * Private Certificate
   * Authority](https://docs.aws.amazon.com/privateca/latest/userguide/PcaWelcome.html) user guide. The
   * ARN must have the following form:
   *
   * `arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012`
   */
  public fun certificateAuthorityArn(certificateAuthorityArn: String) {
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
   * calling `UpdateCertificateOptions` on the certificate. This action will not create a new resource.
   */
  public
      fun certificateTransparencyLoggingPreference(certificateTransparencyLoggingPreference: String) {
    cdkBuilder.certificateTransparencyLoggingPreference(certificateTransparencyLoggingPreference)
  }

  /**
   * @param domainName The fully qualified domain name (FQDN), such as www.example.com, with which
   * you want to secure an ACM certificate. Use an asterisk (*) to create a wildcard certificate that
   * protects several sites in the same domain. For example, `*.example.com` protects `www.example.com`
   * , `site.example.com` , and `images.example.com.`. 
   */
  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  /**
   * @param domainValidationOptions Domain information that domain name registrars use to verify
   * your identity.
   *
   * In order for a AWS::CertificateManager::Certificate to be provisioned and validated in
   * CloudFormation automatically, the `DomainName` property needs to be identical to one of the
   * `DomainName` property supplied in DomainValidationOptions, if the ValidationMethod is **DNS**.
   * Failing to keep them like-for-like will result in failure to create the domain validation records
   * in Route53.
   */
  public fun domainValidationOptions(vararg domainValidationOptions: Any) {
    _domainValidationOptions.addAll(listOf(*domainValidationOptions))
  }

  /**
   * @param domainValidationOptions Domain information that domain name registrars use to verify
   * your identity.
   *
   * In order for a AWS::CertificateManager::Certificate to be provisioned and validated in
   * CloudFormation automatically, the `DomainName` property needs to be identical to one of the
   * `DomainName` property supplied in DomainValidationOptions, if the ValidationMethod is **DNS**.
   * Failing to keep them like-for-like will result in failure to create the domain validation records
   * in Route53.
   */
  public fun domainValidationOptions(domainValidationOptions: Collection<Any>) {
    _domainValidationOptions.addAll(domainValidationOptions)
  }

  /**
   * @param domainValidationOptions Domain information that domain name registrars use to verify
   * your identity.
   *
   * In order for a AWS::CertificateManager::Certificate to be provisioned and validated in
   * CloudFormation automatically, the `DomainName` property needs to be identical to one of the
   * `DomainName` property supplied in DomainValidationOptions, if the ValidationMethod is **DNS**.
   * Failing to keep them like-for-like will result in failure to create the domain validation records
   * in Route53.
   */
  public fun domainValidationOptions(domainValidationOptions: IResolvable) {
    cdkBuilder.domainValidationOptions(domainValidationOptions)
  }

  /**
   * @param subjectAlternativeNames Additional FQDNs to be included in the Subject Alternative Name
   * extension of the ACM certificate.
   * For example, you can add www.example.net to a certificate for which the `DomainName` field is
   * www.example.com if users can reach your site by using either name.
   */
  public fun subjectAlternativeNames(vararg subjectAlternativeNames: String) {
    _subjectAlternativeNames.addAll(listOf(*subjectAlternativeNames))
  }

  /**
   * @param subjectAlternativeNames Additional FQDNs to be included in the Subject Alternative Name
   * extension of the ACM certificate.
   * For example, you can add www.example.net to a certificate for which the `DomainName` field is
   * www.example.com if users can reach your site by using either name.
   */
  public fun subjectAlternativeNames(subjectAlternativeNames: Collection<String>) {
    _subjectAlternativeNames.addAll(subjectAlternativeNames)
  }

  /**
   * @param tags Key-value pairs that can identify the certificate.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags Key-value pairs that can identify the certificate.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param validationMethod The method you want to use to validate that you own or control the
   * domain associated with a public certificate.
   * You can [validate with
   * DNS](https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-validate-dns.html) or [validate with
   * email](https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-validate-email.html) . We recommend
   * that you use DNS validation.
   *
   * If not specified, this property defaults to email validation.
   */
  public fun validationMethod(validationMethod: String) {
    cdkBuilder.validationMethod(validationMethod)
  }

  public fun build(): CfnCertificateProps {
    if(_domainValidationOptions.isNotEmpty())
        cdkBuilder.domainValidationOptions(_domainValidationOptions)
    if(_subjectAlternativeNames.isNotEmpty())
        cdkBuilder.subjectAlternativeNames(_subjectAlternativeNames)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
