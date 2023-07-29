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
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnGatewayRoute

/**
 * An object that represents the criteria for determining a request match.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * GrpcGatewayRouteMatchProperty grpcGatewayRouteMatchProperty =
 * GrpcGatewayRouteMatchProperty.builder()
 * .hostname(GatewayRouteHostnameMatchProperty.builder()
 * .exact("exact")
 * .suffix("suffix")
 * .build())
 * .metadata(List.of(GrpcGatewayRouteMetadataProperty.builder()
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
 * .build()))
 * .port(123)
 * .serviceName("serviceName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-gatewayroute-grpcgatewayroutematch.html)
 */
@CdkDslMarker
public class CfnGatewayRouteGrpcGatewayRouteMatchPropertyDsl {
    private val cdkBuilder: CfnGatewayRoute.GrpcGatewayRouteMatchProperty.Builder =
        CfnGatewayRoute.GrpcGatewayRouteMatchProperty.builder()

    private val _metadata: MutableList<Any> = mutableListOf()

    /** @param hostname The gateway route host name to be matched on. */
    public fun hostname(hostname: IResolvable) {
        cdkBuilder.hostname(hostname)
    }

    /** @param hostname The gateway route host name to be matched on. */
    public fun hostname(hostname: CfnGatewayRoute.GatewayRouteHostnameMatchProperty) {
        cdkBuilder.hostname(hostname)
    }

    /** @param metadata The gateway route metadata to be matched on. */
    public fun metadata(vararg metadata: Any) {
        _metadata.addAll(listOf(*metadata))
    }

    /** @param metadata The gateway route metadata to be matched on. */
    public fun metadata(metadata: Collection<Any>) {
        _metadata.addAll(metadata)
    }

    /** @param metadata The gateway route metadata to be matched on. */
    public fun metadata(metadata: IResolvable) {
        cdkBuilder.metadata(metadata)
    }

    /** @param port The gateway route port to be matched on. */
    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    /**
     * @param serviceName The fully qualified domain name for the service to match from the request.
     */
    public fun serviceName(serviceName: String) {
        cdkBuilder.serviceName(serviceName)
    }

    public fun build(): CfnGatewayRoute.GrpcGatewayRouteMatchProperty {
        if (_metadata.isNotEmpty()) cdkBuilder.metadata(_metadata)
        return cdkBuilder.build()
    }
}
