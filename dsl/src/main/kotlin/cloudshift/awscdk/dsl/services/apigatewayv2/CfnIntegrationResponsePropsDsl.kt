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
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.services.apigatewayv2.CfnIntegrationResponseProps
import kotlin.Any
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class CfnIntegrationResponsePropsDsl {
    private val cdkBuilder: CfnIntegrationResponseProps.Builder =
        CfnIntegrationResponseProps.builder()

    public fun apiId(apiId: String) {
        cdkBuilder.apiId(apiId)
    }

    public fun contentHandlingStrategy(contentHandlingStrategy: String) {
        cdkBuilder.contentHandlingStrategy(contentHandlingStrategy)
    }

    public fun integrationId(integrationId: String) {
        cdkBuilder.integrationId(integrationId)
    }

    public fun integrationResponseKey(integrationResponseKey: String) {
        cdkBuilder.integrationResponseKey(integrationResponseKey)
    }

    public fun responseParameters(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.responseParameters(builder.map)
    }

    public fun responseParameters(responseParameters: Any) {
        cdkBuilder.responseParameters(responseParameters)
    }

    public fun responseTemplates(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.responseTemplates(builder.map)
    }

    public fun responseTemplates(responseTemplates: Any) {
        cdkBuilder.responseTemplates(responseTemplates)
    }

    public fun templateSelectionExpression(templateSelectionExpression: String) {
        cdkBuilder.templateSelectionExpression(templateSelectionExpression)
    }

    public fun build(): CfnIntegrationResponseProps = cdkBuilder.build()
}
