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
import software.amazon.awscdk.services.apigateway.IResource
import software.amazon.awscdk.services.apigateway.Integration
import software.amazon.awscdk.services.apigateway.MethodOptions
import software.amazon.awscdk.services.apigateway.MethodProps
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class MethodPropsDsl {
    private val cdkBuilder: MethodProps.Builder = MethodProps.builder()

    public fun httpMethod(httpMethod: String) {
        cdkBuilder.httpMethod(httpMethod)
    }

    public fun integration(block: IntegrationDsl.() -> Unit = {}) {
        val builder = IntegrationDsl()
        builder.apply(block)
        cdkBuilder.integration(builder.build())
    }

    public fun integration(integration: Integration) {
        cdkBuilder.integration(integration)
    }

    public fun options(block: MethodOptionsDsl.() -> Unit = {}) {
        val builder = MethodOptionsDsl()
        builder.apply(block)
        cdkBuilder.options(builder.build())
    }

    public fun options(options: MethodOptions) {
        cdkBuilder.options(options)
    }

    public fun resource(resource: IResource) {
        cdkBuilder.resource(resource)
    }

    public fun build(): MethodProps = cdkBuilder.build()
}
