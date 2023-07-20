@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.apigateway.EndpointConfiguration
import software.amazon.awscdk.services.apigateway.EndpointType
import software.amazon.awscdk.services.ec2.IVpcEndpoint
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class EndpointConfigurationDsl {
    private val cdkBuilder: EndpointConfiguration.Builder = EndpointConfiguration.builder()

    private val _types: MutableList<EndpointType> = mutableListOf()

    private val _vpcEndpoints: MutableList<IVpcEndpoint> = mutableListOf()

    public fun types(vararg types: EndpointType) {
        _types.addAll(listOf(*types))
    }

    public fun types(types: Collection<EndpointType>) {
        _types.addAll(types)
    }

    public fun vpcEndpoints(vararg vpcEndpoints: IVpcEndpoint) {
        _vpcEndpoints.addAll(listOf(*vpcEndpoints))
    }

    public fun vpcEndpoints(vpcEndpoints: Collection<IVpcEndpoint>) {
        _vpcEndpoints.addAll(vpcEndpoints)
    }

    public fun build(): EndpointConfiguration {
        if (_types.isNotEmpty()) cdkBuilder.types(_types)
        if (_vpcEndpoints.isNotEmpty()) cdkBuilder.vpcEndpoints(_vpcEndpoints)
        return cdkBuilder.build()
    }
}
