@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute

/**
 * An object that represents a gRPC gateway route.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * GrpcGatewayRouteProperty grpcGatewayRouteProperty = GrpcGatewayRouteProperty.builder()
 * .action(GrpcGatewayRouteActionProperty.builder()
 * .target(GatewayRouteTargetProperty.builder()
 * .virtualService(GatewayRouteVirtualServiceProperty.builder()
 * .virtualServiceName("virtualServiceName")
 * .build())
 * // the properties below are optional
 * .port(123)
 * .build())
 * // the properties below are optional
 * .rewrite(GrpcGatewayRouteRewriteProperty.builder()
 * .hostname(GatewayRouteHostnameRewriteProperty.builder()
 * .defaultTargetHostname("defaultTargetHostname")
 * .build())
 * .build())
 * .build())
 * .match(GrpcGatewayRouteMatchProperty.builder()
 * .hostname(GatewayRouteHostnameMatchProperty.builder()
 * .exact("exact")
 * .suffix("suffix")
 * .build())
 * .metadata(List.of(GrpcGatewayRouteMetadataProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .invert(false)
 * .match(GatewayRouteMetadataMatchProperty.builder()
 * .exact("exact")
 * .prefix("prefix")
 * .range(GatewayRouteRangeMatchProperty.builder()
 * .end(123)
 * .start(123)
 * .build())
 * .regex("regex")
 * .suffix("suffix")
 * .build())
 * .build()))
 * .port(123)
 * .serviceName("serviceName")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-grpcgatewayroute.html)
 */
@CdkDslMarker
public class CfnGatewayRouteGrpcGatewayRoutePropertyDsl {
  private val cdkBuilder: CfnGatewayRoute.GrpcGatewayRouteProperty.Builder =
      CfnGatewayRoute.GrpcGatewayRouteProperty.builder()

  /**
   * @param action An object that represents the action to take if a match is determined. 
   */
  public fun action(action: IResolvable) {
    cdkBuilder.action(action)
  }

  /**
   * @param action An object that represents the action to take if a match is determined. 
   */
  public fun action(action: CfnGatewayRoute.GrpcGatewayRouteActionProperty) {
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
  public fun match(match: CfnGatewayRoute.GrpcGatewayRouteMatchProperty) {
    cdkBuilder.match(match)
  }

  public fun build(): CfnGatewayRoute.GrpcGatewayRouteProperty = cdkBuilder.build()
}
