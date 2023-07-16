@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnRoute

@CdkDslMarker
public class CfnRouteGrpcRoutePropertyDsl {
  private val cdkBuilder: CfnRoute.GrpcRouteProperty.Builder = CfnRoute.GrpcRouteProperty.builder()

  public fun action(action: IResolvable) {
    cdkBuilder.action(action)
  }

  public fun action(action: CfnRoute.GrpcRouteActionProperty) {
    cdkBuilder.action(action)
  }

  public fun match(match: IResolvable) {
    cdkBuilder.match(match)
  }

  public fun match(match: CfnRoute.GrpcRouteMatchProperty) {
    cdkBuilder.match(match)
  }

  public fun retryPolicy(retryPolicy: IResolvable) {
    cdkBuilder.retryPolicy(retryPolicy)
  }

  public fun retryPolicy(retryPolicy: CfnRoute.GrpcRetryPolicyProperty) {
    cdkBuilder.retryPolicy(retryPolicy)
  }

  public fun timeout(timeout: IResolvable) {
    cdkBuilder.timeout(timeout)
  }

  public fun timeout(timeout: CfnRoute.GrpcTimeoutProperty) {
    cdkBuilder.timeout(timeout)
  }

  public fun build(): CfnRoute.GrpcRouteProperty = cdkBuilder.build()
}
