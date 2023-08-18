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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

/**
 * An object that represents types of timeouts.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * GrpcTimeoutProperty grpcTimeoutProperty = GrpcTimeoutProperty.builder()
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-grpctimeout.html)
 */
@CdkDslMarker
public class CfnVirtualNodeGrpcTimeoutPropertyDsl {
    private val cdkBuilder: CfnVirtualNode.GrpcTimeoutProperty.Builder =
        CfnVirtualNode.GrpcTimeoutProperty.builder()

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
    public fun idle(idle: CfnVirtualNode.DurationProperty) {
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
    public fun perRequest(perRequest: CfnVirtualNode.DurationProperty) {
        cdkBuilder.perRequest(perRequest)
    }

    public fun build(): CfnVirtualNode.GrpcTimeoutProperty = cdkBuilder.build()
}
