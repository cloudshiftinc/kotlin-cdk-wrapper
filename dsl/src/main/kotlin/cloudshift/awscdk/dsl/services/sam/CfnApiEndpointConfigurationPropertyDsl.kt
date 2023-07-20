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

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.sam.CfnApi
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnApiEndpointConfigurationPropertyDsl {
    private val cdkBuilder: CfnApi.EndpointConfigurationProperty.Builder =
        CfnApi.EndpointConfigurationProperty.builder()

    private val _vpcEndpointIds: MutableList<String> = mutableListOf()

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun vpcEndpointIds(vararg vpcEndpointIds: String) {
        _vpcEndpointIds.addAll(listOf(*vpcEndpointIds))
    }

    public fun vpcEndpointIds(vpcEndpointIds: Collection<String>) {
        _vpcEndpointIds.addAll(vpcEndpointIds)
    }

    public fun build(): CfnApi.EndpointConfigurationProperty {
        if (_vpcEndpointIds.isNotEmpty()) cdkBuilder.vpcEndpointIds(_vpcEndpointIds)
        return cdkBuilder.build()
    }
}
