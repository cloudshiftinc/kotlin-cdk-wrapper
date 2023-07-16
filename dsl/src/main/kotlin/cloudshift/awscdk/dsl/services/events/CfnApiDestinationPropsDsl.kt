@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.events.CfnApiDestinationProps

@CdkDslMarker
public class CfnApiDestinationPropsDsl {
  private val cdkBuilder: CfnApiDestinationProps.Builder = CfnApiDestinationProps.builder()

  public fun connectionArn(connectionArn: String) {
    cdkBuilder.connectionArn(connectionArn)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun httpMethod(httpMethod: String) {
    cdkBuilder.httpMethod(httpMethod)
  }

  public fun invocationEndpoint(invocationEndpoint: String) {
    cdkBuilder.invocationEndpoint(invocationEndpoint)
  }

  public fun invocationRateLimitPerSecond(invocationRateLimitPerSecond: Number) {
    cdkBuilder.invocationRateLimitPerSecond(invocationRateLimitPerSecond)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnApiDestinationProps = cdkBuilder.build()
}
