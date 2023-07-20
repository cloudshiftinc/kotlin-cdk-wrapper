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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigateway.CfnMethod
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnMethodIntegrationPropertyDsl {
    private val cdkBuilder: CfnMethod.IntegrationProperty.Builder =
        CfnMethod.IntegrationProperty.builder()

    private val _cacheKeyParameters: MutableList<String> = mutableListOf()

    private val _integrationResponses: MutableList<Any> = mutableListOf()

    public fun cacheKeyParameters(vararg cacheKeyParameters: String) {
        _cacheKeyParameters.addAll(listOf(*cacheKeyParameters))
    }

    public fun cacheKeyParameters(cacheKeyParameters: Collection<String>) {
        _cacheKeyParameters.addAll(cacheKeyParameters)
    }

    public fun cacheNamespace(cacheNamespace: String) {
        cdkBuilder.cacheNamespace(cacheNamespace)
    }

    public fun connectionId(connectionId: String) {
        cdkBuilder.connectionId(connectionId)
    }

    public fun connectionType(connectionType: String) {
        cdkBuilder.connectionType(connectionType)
    }

    public fun contentHandling(contentHandling: String) {
        cdkBuilder.contentHandling(contentHandling)
    }

    public fun credentials(credentials: String) {
        cdkBuilder.credentials(credentials)
    }

    public fun integrationHttpMethod(integrationHttpMethod: String) {
        cdkBuilder.integrationHttpMethod(integrationHttpMethod)
    }

    public fun integrationResponses(vararg integrationResponses: Any) {
        _integrationResponses.addAll(listOf(*integrationResponses))
    }

    public fun integrationResponses(integrationResponses: Collection<Any>) {
        _integrationResponses.addAll(integrationResponses)
    }

    public fun integrationResponses(integrationResponses: IResolvable) {
        cdkBuilder.integrationResponses(integrationResponses)
    }

    public fun passthroughBehavior(passthroughBehavior: String) {
        cdkBuilder.passthroughBehavior(passthroughBehavior)
    }

    public fun requestParameters(requestParameters: Map<String, String>) {
        cdkBuilder.requestParameters(requestParameters)
    }

    public fun requestParameters(requestParameters: IResolvable) {
        cdkBuilder.requestParameters(requestParameters)
    }

    public fun requestTemplates(requestTemplates: Map<String, String>) {
        cdkBuilder.requestTemplates(requestTemplates)
    }

    public fun requestTemplates(requestTemplates: IResolvable) {
        cdkBuilder.requestTemplates(requestTemplates)
    }

    public fun timeoutInMillis(timeoutInMillis: Number) {
        cdkBuilder.timeoutInMillis(timeoutInMillis)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun uri(uri: String) {
        cdkBuilder.uri(uri)
    }

    public fun build(): CfnMethod.IntegrationProperty {
        if (_cacheKeyParameters.isNotEmpty()) cdkBuilder.cacheKeyParameters(_cacheKeyParameters)
        if (_integrationResponses.isNotEmpty()) cdkBuilder.integrationResponses(_integrationResponses)
        return cdkBuilder.build()
    }
}
