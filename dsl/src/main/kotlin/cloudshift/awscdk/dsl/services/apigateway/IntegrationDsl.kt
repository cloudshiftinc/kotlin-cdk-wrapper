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
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.services.apigateway.Integration
import software.amazon.awscdk.services.apigateway.IntegrationOptions
import software.amazon.awscdk.services.apigateway.IntegrationType
import kotlin.Any
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class IntegrationDsl {
    private val cdkBuilder: Integration.Builder = Integration.Builder.create()

    public fun integrationHttpMethod(integrationHttpMethod: String) {
        cdkBuilder.integrationHttpMethod(integrationHttpMethod)
    }

    public fun options(block: IntegrationOptionsDsl.() -> Unit = {}) {
        val builder = IntegrationOptionsDsl()
        builder.apply(block)
        cdkBuilder.options(builder.build())
    }

    public fun options(options: IntegrationOptions) {
        cdkBuilder.options(options)
    }

    public fun type(type: IntegrationType) {
        cdkBuilder.type(type)
    }

    public fun uri(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.uri(builder.map)
    }

    public fun uri(uri: Any) {
        cdkBuilder.uri(uri)
    }

    public fun build(): Integration = cdkBuilder.build()
}
