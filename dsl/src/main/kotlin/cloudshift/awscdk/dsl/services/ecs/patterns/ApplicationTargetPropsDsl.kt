@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs.patterns

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ecs.Protocol
import software.amazon.awscdk.services.ecs.patterns.ApplicationTargetProps

@CdkDslMarker
public class ApplicationTargetPropsDsl {
  private val cdkBuilder: ApplicationTargetProps.Builder = ApplicationTargetProps.builder()

  /**
   * @param containerPort The port number of the container. 
   * Only applicable when using application/network load balancers.
   */
  public fun containerPort(containerPort: Number) {
    cdkBuilder.containerPort(containerPort)
  }

  /**
   * @param hostHeader Rule applies if the requested host matches the indicated host.
   * May contain up to three '*' wildcards.
   *
   * Requires that priority is set.
   */
  public fun hostHeader(hostHeader: String) {
    cdkBuilder.hostHeader(hostHeader)
  }

  /**
   * @param listener Name of the listener the target group attached to.
   */
  public fun listener(listener: String) {
    cdkBuilder.listener(listener)
  }

  /**
   * @param pathPattern Rule applies if the requested path matches the given path pattern.
   * May contain up to three '*' wildcards.
   *
   * Requires that priority is set.
   */
  public fun pathPattern(pathPattern: String) {
    cdkBuilder.pathPattern(pathPattern)
  }

  /**
   * @param priority Priority of this target group.
   * The rule with the lowest priority will be used for every request.
   * If priority is not given, these target groups will be added as
   * defaults, and must not have conditions.
   *
   * Priorities must be unique.
   */
  public fun priority(priority: Number) {
    cdkBuilder.priority(priority)
  }

  /**
   * @param protocol The protocol used for the port mapping.
   * Only applicable when using application load balancers.
   */
  public fun protocol(protocol: Protocol) {
    cdkBuilder.protocol(protocol)
  }

  public fun build(): ApplicationTargetProps = cdkBuilder.build()
}
