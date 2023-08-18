@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.appmesh

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute

/**
 * An object that represents the HTTP header in the gateway route.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * HttpGatewayRouteHeaderProperty httpGatewayRouteHeaderProperty =
 * HttpGatewayRouteHeaderProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .invert(false)
 * .match(HttpGatewayRouteHeaderMatchProperty.builder()
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-httpgatewayrouteheader.html)
 */
@CdkDslMarker
public class CfnGatewayRouteHttpGatewayRouteHeaderPropertyDsl {
    private val cdkBuilder: CfnGatewayRoute.HttpGatewayRouteHeaderProperty.Builder =
        CfnGatewayRoute.HttpGatewayRouteHeaderProperty.builder()

    /**
     * @param invert Specify `True` to match anything except the match criteria. The default value
     *   is `False` .
     */
    public fun invert(invert: Boolean) {
        cdkBuilder.invert(invert)
    }

    /**
     * @param invert Specify `True` to match anything except the match criteria. The default value
     *   is `False` .
     */
    public fun invert(invert: IResolvable) {
        cdkBuilder.invert(invert)
    }

    /**
     * @param match An object that represents the method and value to match with the header value
     *   sent in a request. Specify one match method.
     */
    public fun match(match: IResolvable) {
        cdkBuilder.match(match)
    }

    /**
     * @param match An object that represents the method and value to match with the header value
     *   sent in a request. Specify one match method.
     */
    public fun match(match: CfnGatewayRoute.HttpGatewayRouteHeaderMatchProperty) {
        cdkBuilder.match(match)
    }

    /** @param name A name for the HTTP header in the gateway route that will be matched on. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnGatewayRoute.HttpGatewayRouteHeaderProperty = cdkBuilder.build()
}
