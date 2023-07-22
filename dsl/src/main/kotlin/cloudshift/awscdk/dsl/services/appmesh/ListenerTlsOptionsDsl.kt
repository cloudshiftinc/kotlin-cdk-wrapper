@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.ListenerTlsOptions
import software.amazon.awscdk.services.appmesh.MutualTlsValidation
import software.amazon.awscdk.services.appmesh.TlsCertificate
import software.amazon.awscdk.services.appmesh.TlsMode

@CdkDslMarker
public class ListenerTlsOptionsDsl {
  private val cdkBuilder: ListenerTlsOptions.Builder = ListenerTlsOptions.builder()

  /**
   * @param certificate Represents TLS certificate. 
   */
  public fun certificate(certificate: TlsCertificate) {
    cdkBuilder.certificate(certificate)
  }

  /**
   * @param mode The TLS mode. 
   */
  public fun mode(mode: TlsMode) {
    cdkBuilder.mode(mode)
  }

  /**
   * @param mutualTlsValidation Represents a listener's TLS validation context.
   * The client certificate will only be validated if the client provides it, enabling mutual TLS.
   */
  public fun mutualTlsValidation(mutualTlsValidation: MutualTlsValidationDsl.() -> Unit = {}) {
    val builder = MutualTlsValidationDsl()
    builder.apply(mutualTlsValidation)
    cdkBuilder.mutualTlsValidation(builder.build())
  }

  /**
   * @param mutualTlsValidation Represents a listener's TLS validation context.
   * The client certificate will only be validated if the client provides it, enabling mutual TLS.
   */
  public fun mutualTlsValidation(mutualTlsValidation: MutualTlsValidation) {
    cdkBuilder.mutualTlsValidation(mutualTlsValidation)
  }

  public fun build(): ListenerTlsOptions = cdkBuilder.build()
}
