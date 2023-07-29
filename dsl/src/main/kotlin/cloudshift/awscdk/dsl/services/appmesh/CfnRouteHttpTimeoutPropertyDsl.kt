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

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnRoute

/**
 * An object that represents types of timeouts.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * HttpTimeoutProperty httpTimeoutProperty = HttpTimeoutProperty.builder()
 * .idle(DurationProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .perRequest(DurationProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-route-httptimeout.html)
 */
@CdkDslMarker
public class CfnRouteHttpTimeoutPropertyDsl {
    private val cdkBuilder: CfnRoute.HttpTimeoutProperty.Builder =
        CfnRoute.HttpTimeoutProperty.builder()

    /**
     * @param idle An object that represents an idle timeout. An idle timeout bounds the amount of
     *   time that a connection may be idle. The default value is none.
     */
    public fun idle(idle: IResolvable) {
        cdkBuilder.idle(idle)
    }

    /**
     * @param idle An object that represents an idle timeout. An idle timeout bounds the amount of
     *   time that a connection may be idle. The default value is none.
     */
    public fun idle(idle: CfnRoute.DurationProperty) {
        cdkBuilder.idle(idle)
    }

    /**
     * @param perRequest An object that represents a per request timeout. The default value is 15
     *   seconds. If you set a higher timeout, then make sure that the higher value is set for each
     *   App Mesh resource in a conversation. For example, if a virtual node backend uses a virtual
     *   router provider to route to another virtual node, then the timeout should be greater than
     *   15 seconds for the source and destination virtual node and the route.
     */
    public fun perRequest(perRequest: IResolvable) {
        cdkBuilder.perRequest(perRequest)
    }

    /**
     * @param perRequest An object that represents a per request timeout. The default value is 15
     *   seconds. If you set a higher timeout, then make sure that the higher value is set for each
     *   App Mesh resource in a conversation. For example, if a virtual node backend uses a virtual
     *   router provider to route to another virtual node, then the timeout should be greater than
     *   15 seconds for the source and destination virtual node and the route.
     */
    public fun perRequest(perRequest: CfnRoute.DurationProperty) {
        cdkBuilder.perRequest(perRequest)
    }

    public fun build(): CfnRoute.HttpTimeoutProperty = cdkBuilder.build()
}
