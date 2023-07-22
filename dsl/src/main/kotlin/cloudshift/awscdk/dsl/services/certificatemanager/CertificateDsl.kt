@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.certificatemanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.certificatemanager.Certificate
import software.amazon.awscdk.services.certificatemanager.CertificateValidation
import software.constructs.Construct

@CdkDslMarker
public class CertificateDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: Certificate.Builder = Certificate.Builder.create(scope, id)

  private val _subjectAlternativeNames: MutableList<String> = mutableListOf()

  /**
   * The Certifcate name.
   *
   * Since the Certifcate resource doesn't support providing a physical name, the value provided
   * here will be recorded in the `Name` tag
   *
   * Default: the full, absolute path of this construct
   *
   * @param certificateName The Certifcate name. 
   */
  public fun certificateName(certificateName: String) {
    cdkBuilder.certificateName(certificateName)
  }

  /**
   * Fully-qualified domain name to request a certificate for.
   *
   * May contain wildcards, such as `*.domain.com`.
   *
   * @param domainName Fully-qualified domain name to request a certificate for. 
   */
  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  /**
   * Alternative domain names on your certificate.
   *
   * Use this to register alternative domain names that represent the same site.
   *
   * Default: - No additional FQDNs will be included as alternative domain names.
   *
   * @param subjectAlternativeNames Alternative domain names on your certificate. 
   */
  public fun subjectAlternativeNames(vararg subjectAlternativeNames: String) {
    _subjectAlternativeNames.addAll(listOf(*subjectAlternativeNames))
  }

  /**
   * Alternative domain names on your certificate.
   *
   * Use this to register alternative domain names that represent the same site.
   *
   * Default: - No additional FQDNs will be included as alternative domain names.
   *
   * @param subjectAlternativeNames Alternative domain names on your certificate. 
   */
  public fun subjectAlternativeNames(subjectAlternativeNames: Collection<String>) {
    _subjectAlternativeNames.addAll(subjectAlternativeNames)
  }

  /**
   * Enable or disable transparency logging for this certificate.
   *
   * Once a certificate has been logged, it cannot be removed from the log.
   * Opting out at that point will have no effect. If you opt out of logging
   * when you request a certificate and then choose later to opt back in,
   * your certificate will not be logged until it is renewed.
   * If you want the certificate to be logged immediately, we recommend that you issue a new one.
   *
   * Default: true
   *
   * [Documentation](https://docs.aws.amazon.com/acm/latest/userguide/acm-bestpractices.html#best-practices-transparency)
   * @param transparencyLoggingEnabled Enable or disable transparency logging for this certificate. 
   */
  public fun transparencyLoggingEnabled(transparencyLoggingEnabled: Boolean) {
    cdkBuilder.transparencyLoggingEnabled(transparencyLoggingEnabled)
  }

  /**
   * How to validate this certificate.
   *
   * Default: CertificateValidation.fromEmail()
   *
   * @param validation How to validate this certificate. 
   */
  public fun validation(validation: CertificateValidation) {
    cdkBuilder.validation(validation)
  }

  public fun build(): Certificate {
    if(_subjectAlternativeNames.isNotEmpty())
        cdkBuilder.subjectAlternativeNames(_subjectAlternativeNames)
    return cdkBuilder.build()
  }
}
