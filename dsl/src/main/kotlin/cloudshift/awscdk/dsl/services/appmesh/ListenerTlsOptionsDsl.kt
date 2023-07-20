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

  public fun certificate(certificate: TlsCertificate) {
    cdkBuilder.certificate(certificate)
  }

  public fun mode(mode: TlsMode) {
    cdkBuilder.mode(mode)
  }

  public fun mutualTlsValidation(block: MutualTlsValidationDsl.() -> Unit = {}) {
    val builder = MutualTlsValidationDsl()
    builder.apply(block)
    cdkBuilder.mutualTlsValidation(builder.build())
  }

  public fun mutualTlsValidation(mutualTlsValidation: MutualTlsValidation) {
    cdkBuilder.mutualTlsValidation(mutualTlsValidation)
  }

  public fun build(): ListenerTlsOptions = cdkBuilder.build()
}
