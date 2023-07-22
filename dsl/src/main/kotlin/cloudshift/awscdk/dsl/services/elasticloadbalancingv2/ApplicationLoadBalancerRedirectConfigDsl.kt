@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerRedirectConfig
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol

/**
 * Properties for a redirection config.
 *
 * Example:
 *
 * ```
 * ApplicationLoadBalancer lb;
 * lb.addRedirect(ApplicationLoadBalancerRedirectConfig.builder()
 * .sourceProtocol(ApplicationProtocol.HTTPS)
 * .sourcePort(8443)
 * .targetProtocol(ApplicationProtocol.HTTP)
 * .targetPort(8080)
 * .build());
 * ```
 */
@CdkDslMarker
public class ApplicationLoadBalancerRedirectConfigDsl {
  private val cdkBuilder: ApplicationLoadBalancerRedirectConfig.Builder =
      ApplicationLoadBalancerRedirectConfig.builder()

  /**
   * @param open Allow anyone to connect to this listener.
   * If this is specified, the listener will be opened up to anyone who can reach it.
   * For internal load balancers this is anyone in the same VPC. For public load
   * balancers, this is anyone on the internet.
   *
   * If you want to be more selective about who can access this load
   * balancer, set this to `false` and use the listener's `connections`
   * object to selectively grant access to the listener.
   */
  public fun `open`(`open`: Boolean) {
    cdkBuilder.`open`(`open`)
  }

  /**
   * @param sourcePort The port number to listen to.
   */
  public fun sourcePort(sourcePort: Number) {
    cdkBuilder.sourcePort(sourcePort)
  }

  /**
   * @param sourceProtocol The protocol of the listener being created.
   */
  public fun sourceProtocol(sourceProtocol: ApplicationProtocol) {
    cdkBuilder.sourceProtocol(sourceProtocol)
  }

  /**
   * @param targetPort The port number to redirect to.
   */
  public fun targetPort(targetPort: Number) {
    cdkBuilder.targetPort(targetPort)
  }

  /**
   * @param targetProtocol The protocol of the redirection target.
   */
  public fun targetProtocol(targetProtocol: ApplicationProtocol) {
    cdkBuilder.targetProtocol(targetProtocol)
  }

  public fun build(): ApplicationLoadBalancerRedirectConfig = cdkBuilder.build()
}
