@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerAttributes

@CdkDslMarker
public class ApplicationListenerAttributesDsl {
  private val cdkBuilder: ApplicationListenerAttributes.Builder =
      ApplicationListenerAttributes.builder()

  /**
   * @param defaultPort The default port on which this listener is listening.
   */
  public fun defaultPort(defaultPort: Number) {
    cdkBuilder.defaultPort(defaultPort)
  }

  /**
   * @param listenerArn ARN of the listener. 
   */
  public fun listenerArn(listenerArn: String) {
    cdkBuilder.listenerArn(listenerArn)
  }

  /**
   * @param securityGroup Security group of the load balancer this listener is associated with. 
   */
  public fun securityGroup(securityGroup: ISecurityGroup) {
    cdkBuilder.securityGroup(securityGroup)
  }

  public fun build(): ApplicationListenerAttributes = cdkBuilder.build()
}
