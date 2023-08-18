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

package io.cloudshiftdev.awscdkdsl.services.groundstation

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup

/**
 * The address of the endpoint, such as `192.168.1.1` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.groundstation.*;
 * SocketAddressProperty socketAddressProperty = SocketAddressProperty.builder()
 * .name("name")
 * .port(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-socketaddress.html)
 */
@CdkDslMarker
public class CfnDataflowEndpointGroupSocketAddressPropertyDsl {
    private val cdkBuilder: CfnDataflowEndpointGroup.SocketAddressProperty.Builder =
        CfnDataflowEndpointGroup.SocketAddressProperty.builder()

    /** @param name The name of the endpoint, such as `Endpoint 1` . */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param port The port of the endpoint, such as `55888` . */
    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    public fun build(): CfnDataflowEndpointGroup.SocketAddressProperty = cdkBuilder.build()
}
