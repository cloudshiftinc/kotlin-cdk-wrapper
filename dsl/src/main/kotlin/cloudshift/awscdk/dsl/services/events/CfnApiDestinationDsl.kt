@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.events.CfnApiDestination
import software.constructs.Construct

@CdkDslMarker
public class CfnApiDestinationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnApiDestination.Builder = CfnApiDestination.Builder.create(scope, id)

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

  public fun build(): CfnApiDestination = cdkBuilder.build()
}
