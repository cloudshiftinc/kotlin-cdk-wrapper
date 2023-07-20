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
import software.amazon.awscdk.services.apigateway.AwsIntegration
import software.amazon.awscdk.services.apigateway.IntegrationOptions
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

@CdkDslMarker
public class AwsIntegrationDsl {
    private val cdkBuilder: AwsIntegration.Builder = AwsIntegration.Builder.create()

    public fun action(action: String) {
        cdkBuilder.action(action)
    }

    public fun actionParameters(actionParameters: Map<String, String>) {
        cdkBuilder.actionParameters(actionParameters)
    }

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

    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    public fun proxy(proxy: Boolean) {
        cdkBuilder.proxy(proxy)
    }

    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    public fun service(service: String) {
        cdkBuilder.service(service)
    }

    public fun subdomain(subdomain: String) {
        cdkBuilder.subdomain(subdomain)
    }

    public fun build(): AwsIntegration = cdkBuilder.build()
}
