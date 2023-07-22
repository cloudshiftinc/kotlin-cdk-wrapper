@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.certificatemanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.acmpca.ICertificateAuthority
import software.amazon.awscdk.services.certificatemanager.PrivateCertificateProps

@CdkDslMarker
public class PrivateCertificatePropsDsl {
  private val cdkBuilder: PrivateCertificateProps.Builder = PrivateCertificateProps.builder()

  private val _subjectAlternativeNames: MutableList<String> = mutableListOf()

  /**
   * @param certificateAuthority Private certificate authority (CA) that will be used to issue the
   * certificate. 
   */
  public fun certificateAuthority(certificateAuthority: ICertificateAuthority) {
    cdkBuilder.certificateAuthority(certificateAuthority)
  }

  /**
   * @param domainName Fully-qualified domain name to request a private certificate for. 
   * May contain wildcards, such as `*.domain.com`.
   */
  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  /**
   * @param subjectAlternativeNames Alternative domain names on your private certificate.
   * Use this to register alternative domain names that represent the same site.
   */
  public fun subjectAlternativeNames(vararg subjectAlternativeNames: String) {
    _subjectAlternativeNames.addAll(listOf(*subjectAlternativeNames))
  }

  /**
   * @param subjectAlternativeNames Alternative domain names on your private certificate.
   * Use this to register alternative domain names that represent the same site.
   */
  public fun subjectAlternativeNames(subjectAlternativeNames: Collection<String>) {
    _subjectAlternativeNames.addAll(subjectAlternativeNames)
  }

  public fun build(): PrivateCertificateProps {
    if(_subjectAlternativeNames.isNotEmpty())
        cdkBuilder.subjectAlternativeNames(_subjectAlternativeNames)
    return cdkBuilder.build()
  }
}
