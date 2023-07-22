@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.certificatemanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.acmpca.ICertificateAuthority
import software.amazon.awscdk.services.certificatemanager.PrivateCertificate
import software.constructs.Construct

@CdkDslMarker
public class PrivateCertificateDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: PrivateCertificate.Builder = PrivateCertificate.Builder.create(scope, id)

  private val _subjectAlternativeNames: MutableList<String> = mutableListOf()

  /**
   * Private certificate authority (CA) that will be used to issue the certificate.
   *
   * @param certificateAuthority Private certificate authority (CA) that will be used to issue the
   * certificate. 
   */
  public fun certificateAuthority(certificateAuthority: ICertificateAuthority) {
    cdkBuilder.certificateAuthority(certificateAuthority)
  }

  /**
   * Fully-qualified domain name to request a private certificate for.
   *
   * May contain wildcards, such as `*.domain.com`.
   *
   * @param domainName Fully-qualified domain name to request a private certificate for. 
   */
  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  /**
   * Alternative domain names on your private certificate.
   *
   * Use this to register alternative domain names that represent the same site.
   *
   * Default: - No additional FQDNs will be included as alternative domain names.
   *
   * @param subjectAlternativeNames Alternative domain names on your private certificate. 
   */
  public fun subjectAlternativeNames(vararg subjectAlternativeNames: String) {
    _subjectAlternativeNames.addAll(listOf(*subjectAlternativeNames))
  }

  /**
   * Alternative domain names on your private certificate.
   *
   * Use this to register alternative domain names that represent the same site.
   *
   * Default: - No additional FQDNs will be included as alternative domain names.
   *
   * @param subjectAlternativeNames Alternative domain names on your private certificate. 
   */
  public fun subjectAlternativeNames(subjectAlternativeNames: Collection<String>) {
    _subjectAlternativeNames.addAll(subjectAlternativeNames)
  }

  public fun build(): PrivateCertificate {
    if(_subjectAlternativeNames.isNotEmpty())
        cdkBuilder.subjectAlternativeNames(_subjectAlternativeNames)
    return cdkBuilder.build()
  }
}
