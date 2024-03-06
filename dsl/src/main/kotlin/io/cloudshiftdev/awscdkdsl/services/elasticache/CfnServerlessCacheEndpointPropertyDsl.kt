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

package io.cloudshiftdev.awscdkdsl.services.elasticache

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.elasticache.CfnServerlessCache

/**
 * Represents the information required for client programs to connect to a cache node.
 *
 * This value is read-only.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticache.*;
 * EndpointProperty endpointProperty = EndpointProperty.builder()
 * .address("address")
 * .port("port")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-serverlesscache-endpoint.html)
 */
@CdkDslMarker
public class CfnServerlessCacheEndpointPropertyDsl {
    private val cdkBuilder: CfnServerlessCache.EndpointProperty.Builder =
        CfnServerlessCache.EndpointProperty.builder()

    /** @param address The DNS hostname of the cache node. */
    public fun address(address: String) {
        cdkBuilder.address(address)
    }

    /** @param port The port number that the cache engine is listening on. */
    public fun port(port: String) {
        cdkBuilder.port(port)
    }

    public fun build(): CfnServerlessCache.EndpointProperty = cdkBuilder.build()
}
