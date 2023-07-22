@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.appmesh.MutualTlsValidation
import software.amazon.awscdk.services.appmesh.MutualTlsValidationTrust
import software.amazon.awscdk.services.appmesh.SubjectAlternativeNames

@CdkDslMarker
public class MutualTlsValidationDsl {
  private val cdkBuilder: MutualTlsValidation.Builder = MutualTlsValidation.builder()

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
  public fun trust(trust: MutualTlsValidationTrust) {
    cdkBuilder.trust(trust)
  }

  public fun build(): MutualTlsValidation = cdkBuilder.build()
}
