@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute

/**
 * An object representing the metadata of the gateway route.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * GrpcGatewayRouteMetadataProperty grpcGatewayRouteMetadataProperty =
 * GrpcGatewayRouteMetadataProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-grpcgatewayroutemetadata.html)
 */
@CdkDslMarker
public class CfnGatewayRouteGrpcGatewayRouteMetadataPropertyDsl {
  private val cdkBuilder: CfnGatewayRoute.GrpcGatewayRouteMetadataProperty.Builder =
      CfnGatewayRoute.GrpcGatewayRouteMetadataProperty.builder()

  /**
   * @param invert Specify `True` to match anything except the match criteria.
   * The default value is `False` .
   */
  public fun invert(invert: Boolean) {
    cdkBuilder.invert(invert)
  }

  /**
   * @param invert Specify `True` to match anything except the match criteria.
   * The default value is `False` .
   */
  public fun invert(invert: IResolvable) {
    cdkBuilder.invert(invert)
  }

  /**
   * @param match The criteria for determining a metadata match.
   */
  public fun match(match: IResolvable) {
    cdkBuilder.match(match)
  }

  /**
   * @param match The criteria for determining a metadata match.
   */
  public fun match(match: CfnGatewayRoute.GatewayRouteMetadataMatchProperty) {
    cdkBuilder.match(match)
  }

  /**
   * @param name A name for the gateway route metadata. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnGatewayRoute.GrpcGatewayRouteMetadataProperty = cdkBuilder.build()
}
