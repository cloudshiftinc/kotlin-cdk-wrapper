@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute

/**
 * An object representing the method header to be matched.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * GatewayRouteMetadataMatchProperty gatewayRouteMetadataMatchProperty =
 * GatewayRouteMetadataMatchProperty.builder()
 * .exact("exact")
 * .prefix("prefix")
 * .range(GatewayRouteRangeMatchProperty.builder()
 * .end(123)
 * .start(123)
 * .build())
 * .regex("regex")
 * .suffix("suffix")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-gatewayroutemetadatamatch.html)
 */
@CdkDslMarker
public class CfnGatewayRouteGatewayRouteMetadataMatchPropertyDsl {
  private val cdkBuilder: CfnGatewayRoute.GatewayRouteMetadataMatchProperty.Builder =
      CfnGatewayRoute.GatewayRouteMetadataMatchProperty.builder()

  /**
   * @param exact The exact method header to be matched on.
   */
  public fun exact(exact: String) {
    cdkBuilder.exact(exact)
  }

  /**
   * @param prefix The specified beginning characters of the method header to be matched on.
   */
  public fun prefix(prefix: String) {
    cdkBuilder.prefix(prefix)
  }

  /**
   * @param range An object that represents the range of values to match on.
   */
  public fun range(range: IResolvable) {
    cdkBuilder.range(range)
  }

  /**
   * @param range An object that represents the range of values to match on.
   */
  public fun range(range: CfnGatewayRoute.GatewayRouteRangeMatchProperty) {
    cdkBuilder.range(range)
  }

  /**
   * @param regex The regex used to match the method header.
   */
  public fun regex(regex: String) {
    cdkBuilder.regex(regex)
  }

  /**
   * @param suffix The specified ending characters of the method header to match on.
   */
  public fun suffix(suffix: String) {
    cdkBuilder.suffix(suffix)
  }

  public fun build(): CfnGatewayRoute.GatewayRouteMetadataMatchProperty = cdkBuilder.build()
}
