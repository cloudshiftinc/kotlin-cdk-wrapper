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
import software.amazon.awscdk.services.apigateway.HttpIntegration
import software.amazon.awscdk.services.apigateway.IntegrationOptions
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class HttpIntegrationDsl(
    url: String,
) {
    private val cdkBuilder: HttpIntegration.Builder = HttpIntegration.Builder.create(url)

    public fun httpMethod(httpMethod: String) {
        cdkBuilder.httpMethod(httpMethod)
    }

    public fun options(block: IntegrationOptionsDsl.() -> Unit = {}) {
        val builder = IntegrationOptionsDsl()
        builder.apply(block)
        cdkBuilder.options(builder.build())
    }

    public fun options(options: IntegrationOptions) {
        cdkBuilder.options(options)
    }

    public fun proxy(proxy: Boolean) {
        cdkBuilder.proxy(proxy)
    }

    public fun build(): HttpIntegration = cdkBuilder.build()
}
