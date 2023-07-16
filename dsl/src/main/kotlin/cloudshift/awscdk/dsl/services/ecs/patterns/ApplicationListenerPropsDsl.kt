@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs.patterns

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.certificatemanager.ICertificate
import software.amazon.awscdk.services.ecs.patterns.ApplicationListenerProps
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol
import software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy

@CdkDslMarker
public class ApplicationListenerPropsDsl {
  private val cdkBuilder: ApplicationListenerProps.Builder = ApplicationListenerProps.builder()

  public fun certificate(certificate: ICertificate) {
    cdkBuilder.certificate(certificate)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  public fun protocol(protocol: ApplicationProtocol) {
    cdkBuilder.protocol(protocol)
  }

  public fun sslPolicy(sslPolicy: SslPolicy) {
    cdkBuilder.sslPolicy(sslPolicy)
  }

  public fun build(): ApplicationListenerProps = cdkBuilder.build()
}
