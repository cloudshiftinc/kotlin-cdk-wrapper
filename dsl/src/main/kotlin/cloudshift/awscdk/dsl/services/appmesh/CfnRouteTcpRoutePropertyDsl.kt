@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnRoute

@CdkDslMarker
public class CfnRouteTcpRoutePropertyDsl {
  private val cdkBuilder: CfnRoute.TcpRouteProperty.Builder = CfnRoute.TcpRouteProperty.builder()

  public fun action(action: IResolvable) {
    cdkBuilder.action(action)
  }

  public fun action(action: CfnRoute.TcpRouteActionProperty) {
    cdkBuilder.action(action)
  }

  public fun match(match: IResolvable) {
    cdkBuilder.match(match)
  }

  public fun match(match: CfnRoute.TcpRouteMatchProperty) {
    cdkBuilder.match(match)
  }

  public fun timeout(timeout: IResolvable) {
    cdkBuilder.timeout(timeout)
  }

  public fun timeout(timeout: CfnRoute.TcpTimeoutProperty) {
    cdkBuilder.timeout(timeout)
  }

  public fun build(): CfnRoute.TcpRouteProperty = cdkBuilder.build()
}
