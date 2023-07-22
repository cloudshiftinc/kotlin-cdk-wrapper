@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs.patterns

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.certificatemanager.ICertificate
import software.amazon.awscdk.services.ecs.patterns.ApplicationListenerProps
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol
import software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy

/**
 * Properties to define an application listener.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.certificatemanager.*;
 * import software.amazon.awscdk.services.ecs.patterns.*;
 * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
 * Certificate certificate;
 * ApplicationListenerProps applicationListenerProps = ApplicationListenerProps.builder()
 * .name("name")
 * // the properties below are optional
 * .certificate(certificate)
 * .port(123)
 * .protocol(ApplicationProtocol.HTTP)
 * .sslPolicy(SslPolicy.RECOMMENDED_TLS)
 * .build();
 * ```
 */
@CdkDslMarker
public class ApplicationListenerPropsDsl {
  private val cdkBuilder: ApplicationListenerProps.Builder = ApplicationListenerProps.builder()

  /**
   * @param certificate Certificate Manager certificate to associate with the load balancer.
   * Setting this option will set the load balancer protocol to HTTPS.
   */
  public fun certificate(certificate: ICertificate) {
    cdkBuilder.certificate(certificate)
  }

  /**
   * @param name Name of the listener. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param port The port on which the listener listens for requests.
   */
  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  /**
   * @param protocol The protocol for connections from clients to the load balancer.
   * The load balancer port is determined from the protocol (port 80 for
   * HTTP, port 443 for HTTPS).  A domain name and zone must be also be
   * specified if using HTTPS.
   */
  public fun protocol(protocol: ApplicationProtocol) {
    cdkBuilder.protocol(protocol)
  }

  /**
   * @param sslPolicy The security policy that defines which ciphers and protocols are supported by
   * the ALB Listener.
   */
  public fun sslPolicy(sslPolicy: SslPolicy) {
    cdkBuilder.sslPolicy(sslPolicy)
  }

  public fun build(): ApplicationListenerProps = cdkBuilder.build()
}
