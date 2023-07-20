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

  public fun containerPort(containerPort: Number) {
    cdkBuilder.containerPort(containerPort)
  }

  public fun hostHeader(hostHeader: String) {
    cdkBuilder.hostHeader(hostHeader)
  }

  public fun listener(listener: String) {
    cdkBuilder.listener(listener)
  }

  public fun pathPattern(pathPattern: String) {
    cdkBuilder.pathPattern(pathPattern)
  }

  public fun priority(priority: Number) {
    cdkBuilder.priority(priority)
  }

  public fun protocol(protocol: Protocol) {
    cdkBuilder.protocol(protocol)
  }

  public fun build(): ApplicationTargetProps = cdkBuilder.build()
}
