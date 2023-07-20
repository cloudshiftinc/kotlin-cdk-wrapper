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
import software.amazon.awscdk.services.apigateway.CfnDomainName
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDomainNameEndpointConfigurationPropertyDsl {
    private val cdkBuilder: CfnDomainName.EndpointConfigurationProperty.Builder =
        CfnDomainName.EndpointConfigurationProperty.builder()

    private val _types: MutableList<String> = mutableListOf()

    public fun types(vararg types: String) {
        _types.addAll(listOf(*types))
    }

    public fun types(types: Collection<String>) {
        _types.addAll(types)
    }

    public fun build(): CfnDomainName.EndpointConfigurationProperty {
        if (_types.isNotEmpty()) cdkBuilder.types(_types)
        return cdkBuilder.build()
    }
}
