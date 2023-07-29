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
 * An object that represents types of timeouts.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * TcpTimeoutProperty tcpTimeoutProperty = TcpTimeoutProperty.builder()
 * .idle(DurationProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-tcptimeout.html)
 */
@CdkDslMarker
public class CfnVirtualNodeTcpTimeoutPropertyDsl {
    private val cdkBuilder: CfnVirtualNode.TcpTimeoutProperty.Builder =
        CfnVirtualNode.TcpTimeoutProperty.builder()

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

    public fun build(): CfnVirtualNode.TcpTimeoutProperty = cdkBuilder.build()
}
