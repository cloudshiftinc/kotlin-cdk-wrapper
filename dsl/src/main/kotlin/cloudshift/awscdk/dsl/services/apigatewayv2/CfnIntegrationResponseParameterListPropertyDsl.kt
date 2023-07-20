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

package cloudshift.awscdk.dsl.services.apigatewayv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigatewayv2.CfnIntegration
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnIntegrationResponseParameterListPropertyDsl {
    private val cdkBuilder: CfnIntegration.ResponseParameterListProperty.Builder =
        CfnIntegration.ResponseParameterListProperty.builder()

    private val _responseParameters: MutableList<Any> = mutableListOf()

    public fun responseParameters(vararg responseParameters: Any) {
        _responseParameters.addAll(listOf(*responseParameters))
    }

    public fun responseParameters(responseParameters: Collection<Any>) {
        _responseParameters.addAll(responseParameters)
    }

    public fun responseParameters(responseParameters: IResolvable) {
        cdkBuilder.responseParameters(responseParameters)
    }

    public fun build(): CfnIntegration.ResponseParameterListProperty {
        if (_responseParameters.isNotEmpty()) cdkBuilder.responseParameters(_responseParameters)
        return cdkBuilder.build()
    }
}
