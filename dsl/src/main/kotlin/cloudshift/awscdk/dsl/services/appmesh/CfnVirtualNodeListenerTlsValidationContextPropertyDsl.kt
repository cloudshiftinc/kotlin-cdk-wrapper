@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@CdkDslMarker
public class CfnVirtualNodeListenerTlsValidationContextPropertyDsl {
  private val cdkBuilder: CfnVirtualNode.ListenerTlsValidationContextProperty.Builder =
      CfnVirtualNode.ListenerTlsValidationContextProperty.builder()

  /**
   * @param subjectAlternativeNames A reference to an object that represents the SANs for a
   * listener's Transport Layer Security (TLS) validation context.
   */
  public fun subjectAlternativeNames(subjectAlternativeNames: IResolvable) {
    cdkBuilder.subjectAlternativeNames(subjectAlternativeNames)
  }

  /**
   * @param subjectAlternativeNames A reference to an object that represents the SANs for a
   * listener's Transport Layer Security (TLS) validation context.
   */
  public
      fun subjectAlternativeNames(subjectAlternativeNames: CfnVirtualNode.SubjectAlternativeNamesProperty) {
    cdkBuilder.subjectAlternativeNames(subjectAlternativeNames)
  }

  /**
   * @param trust A reference to where to retrieve the trust chain when validating a peer’s
   * Transport Layer Security (TLS) certificate. 
   */
  public fun trust(trust: IResolvable) {
    cdkBuilder.trust(trust)
  }

  /**
   * @param trust A reference to where to retrieve the trust chain when validating a peer’s
   * Transport Layer Security (TLS) certificate. 
   */
  public fun trust(trust: CfnVirtualNode.ListenerTlsValidationContextTrustProperty) {
    cdkBuilder.trust(trust)
  }

  public fun build(): CfnVirtualNode.ListenerTlsValidationContextProperty = cdkBuilder.build()
}
