@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.certificatemanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.certificatemanager.CertificateValidation
import software.amazon.awscdk.services.certificatemanager.DnsValidatedCertificateProps
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.route53.IHostedZone

@CdkDslMarker
public class DnsValidatedCertificatePropsDsl {
  private val cdkBuilder: DnsValidatedCertificateProps.Builder =
      DnsValidatedCertificateProps.builder()

  private val _subjectAlternativeNames: MutableList<String> = mutableListOf()

  public fun certificateName(certificateName: String) {
    cdkBuilder.certificateName(certificateName)
  }

  public fun cleanupRoute53Records(cleanupRoute53Records: Boolean) {
    cdkBuilder.cleanupRoute53Records(cleanupRoute53Records)
  }

  public fun customResourceRole(customResourceRole: IRole) {
    cdkBuilder.customResourceRole(customResourceRole)
  }

  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  public fun hostedZone(hostedZone: IHostedZone) {
    cdkBuilder.hostedZone(hostedZone)
  }

  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  public fun route53Endpoint(route53Endpoint: String) {
    cdkBuilder.route53Endpoint(route53Endpoint)
  }

  public fun subjectAlternativeNames(vararg subjectAlternativeNames: String) {
    _subjectAlternativeNames.addAll(listOf(*subjectAlternativeNames))
  }

  public fun subjectAlternativeNames(subjectAlternativeNames: Collection<String>) {
    _subjectAlternativeNames.addAll(subjectAlternativeNames)
  }

  public fun transparencyLoggingEnabled(transparencyLoggingEnabled: Boolean) {
    cdkBuilder.transparencyLoggingEnabled(transparencyLoggingEnabled)
  }

  public fun validation(validation: CertificateValidation) {
    cdkBuilder.validation(validation)
  }

  public fun build(): DnsValidatedCertificateProps {
    if(_subjectAlternativeNames.isNotEmpty())
        cdkBuilder.subjectAlternativeNames(_subjectAlternativeNames)
    return cdkBuilder.build()
  }
}
