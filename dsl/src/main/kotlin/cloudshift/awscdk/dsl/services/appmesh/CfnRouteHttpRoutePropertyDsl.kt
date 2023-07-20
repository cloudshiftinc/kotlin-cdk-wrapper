@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnRoute

@CdkDslMarker
public class CfnRouteHttpRoutePropertyDsl {
  private val cdkBuilder: CfnRoute.HttpRouteProperty.Builder = CfnRoute.HttpRouteProperty.builder()

  public fun action(action: IResolvable) {
    cdkBuilder.action(action)
  }

  public fun action(action: CfnRoute.HttpRouteActionProperty) {
    cdkBuilder.action(action)
  }

  public fun match(match: IResolvable) {
    cdkBuilder.match(match)
  }

  public fun match(match: CfnRoute.HttpRouteMatchProperty) {
    cdkBuilder.match(match)
  }

  public fun retryPolicy(retryPolicy: IResolvable) {
    cdkBuilder.retryPolicy(retryPolicy)
  }

  public fun retryPolicy(retryPolicy: CfnRoute.HttpRetryPolicyProperty) {
    cdkBuilder.retryPolicy(retryPolicy)
  }

  public fun timeout(timeout: IResolvable) {
    cdkBuilder.timeout(timeout)
  }

  public fun timeout(timeout: CfnRoute.HttpTimeoutProperty) {
    cdkBuilder.timeout(timeout)
  }

  public fun build(): CfnRoute.HttpRouteProperty = cdkBuilder.build()
}
