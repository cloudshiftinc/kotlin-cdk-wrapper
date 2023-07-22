@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnRoute

@CdkDslMarker
public class CfnRouteHttpRoutePropertyDsl {
  private val cdkBuilder: CfnRoute.HttpRouteProperty.Builder = CfnRoute.HttpRouteProperty.builder()

  /**
   * @param action An object that represents the action to take if a match is determined. 
   */
  public fun action(action: IResolvable) {
    cdkBuilder.action(action)
  }

  /**
   * @param action An object that represents the action to take if a match is determined. 
   */
  public fun action(action: CfnRoute.HttpRouteActionProperty) {
    cdkBuilder.action(action)
  }

  /**
   * @param match An object that represents the criteria for determining a request match. 
   */
  public fun match(match: IResolvable) {
    cdkBuilder.match(match)
  }

  /**
   * @param match An object that represents the criteria for determining a request match. 
   */
  public fun match(match: CfnRoute.HttpRouteMatchProperty) {
    cdkBuilder.match(match)
  }

  /**
   * @param retryPolicy An object that represents a retry policy.
   */
  public fun retryPolicy(retryPolicy: IResolvable) {
    cdkBuilder.retryPolicy(retryPolicy)
  }

  /**
   * @param retryPolicy An object that represents a retry policy.
   */
  public fun retryPolicy(retryPolicy: CfnRoute.HttpRetryPolicyProperty) {
    cdkBuilder.retryPolicy(retryPolicy)
  }

  /**
   * @param timeout An object that represents types of timeouts.
   */
  public fun timeout(timeout: IResolvable) {
    cdkBuilder.timeout(timeout)
  }

  /**
   * @param timeout An object that represents types of timeouts.
   */
  public fun timeout(timeout: CfnRoute.HttpTimeoutProperty) {
    cdkBuilder.timeout(timeout)
  }

  public fun build(): CfnRoute.HttpRouteProperty = cdkBuilder.build()
}
