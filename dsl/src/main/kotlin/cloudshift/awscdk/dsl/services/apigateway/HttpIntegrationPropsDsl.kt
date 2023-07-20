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
import software.amazon.awscdk.services.apigateway.HttpIntegrationProps
import software.amazon.awscdk.services.apigateway.IntegrationOptions
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class HttpIntegrationPropsDsl {
    private val cdkBuilder: HttpIntegrationProps.Builder = HttpIntegrationProps.builder()

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

    public fun build(): HttpIntegrationProps = cdkBuilder.build()
}
