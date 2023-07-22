@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.appmesh.SubjectAlternativeNames
import software.amazon.awscdk.services.appmesh.TlsValidation
import software.amazon.awscdk.services.appmesh.TlsValidationTrust

@CdkDslMarker
public class TlsValidationDsl {
  private val cdkBuilder: TlsValidation.Builder = TlsValidation.builder()

  /**
   * @param subjectAlternativeNames Represents the subject alternative names (SANs) secured by the
   * certificate.
   * SANs must be in the FQDN or URI format.
   */
  public fun subjectAlternativeNames(subjectAlternativeNames: SubjectAlternativeNames) {
    cdkBuilder.subjectAlternativeNames(subjectAlternativeNames)
  }

  /**
   * @param trust Reference to where to retrieve the trust chain. 
   */
  public fun trust(trust: TlsValidationTrust) {
    cdkBuilder.trust(trust)
  }

  public fun build(): TlsValidation = cdkBuilder.build()
}
