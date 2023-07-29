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

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.apigateway.EndpointConfiguration
import software.amazon.awscdk.services.apigateway.EndpointType
import software.amazon.awscdk.services.ec2.IVpcEndpoint

/**
 * The endpoint configuration of a REST API, including VPCs and endpoint types.
 *
 * EndpointConfiguration is a property of the AWS::ApiGateway::RestApi resource.
 *
 * Example:
 * ```
 * RestApi api = RestApi.Builder.create(this, "api")
 * .endpointConfiguration(EndpointConfiguration.builder()
 * .types(List.of(EndpointType.EDGE))
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class EndpointConfigurationDsl {
    private val cdkBuilder: EndpointConfiguration.Builder = EndpointConfiguration.builder()

    private val _types: MutableList<EndpointType> = mutableListOf()

    private val _vpcEndpoints: MutableList<IVpcEndpoint> = mutableListOf()

    /** @param types A list of endpoint types of an API or its custom domain name. */
    public fun types(vararg types: EndpointType) {
        _types.addAll(listOf(*types))
    }

    /** @param types A list of endpoint types of an API or its custom domain name. */
    public fun types(types: Collection<EndpointType>) {
        _types.addAll(types)
    }

    /** @param vpcEndpoints A list of VPC Endpoints against which to create Route53 ALIASes. */
    public fun vpcEndpoints(vararg vpcEndpoints: IVpcEndpoint) {
        _vpcEndpoints.addAll(listOf(*vpcEndpoints))
    }

    /** @param vpcEndpoints A list of VPC Endpoints against which to create Route53 ALIASes. */
    public fun vpcEndpoints(vpcEndpoints: Collection<IVpcEndpoint>) {
        _vpcEndpoints.addAll(vpcEndpoints)
    }

    public fun build(): EndpointConfiguration {
        if (_types.isNotEmpty()) cdkBuilder.types(_types)
        if (_vpcEndpoints.isNotEmpty()) cdkBuilder.vpcEndpoints(_vpcEndpoints)
        return cdkBuilder.build()
    }
}
