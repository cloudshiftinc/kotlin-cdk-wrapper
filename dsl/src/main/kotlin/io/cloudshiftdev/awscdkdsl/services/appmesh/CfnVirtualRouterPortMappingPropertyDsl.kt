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
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.appmesh.CfnVirtualRouter

/**
 * An object representing a virtual router listener port mapping.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * PortMappingProperty portMappingProperty = PortMappingProperty.builder()
 * .port(123)
 * .protocol("protocol")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualrouter-portmapping.html)
 */
@CdkDslMarker
public class CfnVirtualRouterPortMappingPropertyDsl {
    private val cdkBuilder: CfnVirtualRouter.PortMappingProperty.Builder =
        CfnVirtualRouter.PortMappingProperty.builder()

    /** @param port The port used for the port mapping. */
    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    /** @param protocol The protocol used for the port mapping. Specify one protocol. */
    public fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
    }

    public fun build(): CfnVirtualRouter.PortMappingProperty = cdkBuilder.build()
}
