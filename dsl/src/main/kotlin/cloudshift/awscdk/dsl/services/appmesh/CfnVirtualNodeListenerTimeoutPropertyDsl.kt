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
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

/**
 * An object that represents timeouts for different protocols.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * ListenerTimeoutProperty listenerTimeoutProperty = ListenerTimeoutProperty.builder()
 * .grpc(GrpcTimeoutProperty.builder()
 * .idle(DurationProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .perRequest(DurationProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .build())
 * .http(HttpTimeoutProperty.builder()
 * .idle(DurationProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .perRequest(DurationProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .build())
 * .http2(HttpTimeoutProperty.builder()
 * .idle(DurationProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .perRequest(DurationProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .build())
 * .tcp(TcpTimeoutProperty.builder()
 * .idle(DurationProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertimeout.html)
 */
@CdkDslMarker
public class CfnVirtualNodeListenerTimeoutPropertyDsl {
    private val cdkBuilder: CfnVirtualNode.ListenerTimeoutProperty.Builder =
        CfnVirtualNode.ListenerTimeoutProperty.builder()

    /** @param grpc An object that represents types of timeouts. */
    public fun grpc(grpc: IResolvable) {
        cdkBuilder.grpc(grpc)
    }

    /** @param grpc An object that represents types of timeouts. */
    public fun grpc(grpc: CfnVirtualNode.GrpcTimeoutProperty) {
        cdkBuilder.grpc(grpc)
    }

    /** @param http An object that represents types of timeouts. */
    public fun http(http: IResolvable) {
        cdkBuilder.http(http)
    }

    /** @param http An object that represents types of timeouts. */
    public fun http(http: CfnVirtualNode.HttpTimeoutProperty) {
        cdkBuilder.http(http)
    }

    /** @param http2 An object that represents types of timeouts. */
    public fun http2(http2: IResolvable) {
        cdkBuilder.http2(http2)
    }

    /** @param http2 An object that represents types of timeouts. */
    public fun http2(http2: CfnVirtualNode.HttpTimeoutProperty) {
        cdkBuilder.http2(http2)
    }

    /** @param tcp An object that represents types of timeouts. */
    public fun tcp(tcp: IResolvable) {
        cdkBuilder.tcp(tcp)
    }

    /** @param tcp An object that represents types of timeouts. */
    public fun tcp(tcp: CfnVirtualNode.TcpTimeoutProperty) {
        cdkBuilder.tcp(tcp)
    }

    public fun build(): CfnVirtualNode.ListenerTimeoutProperty = cdkBuilder.build()
}
