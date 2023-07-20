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
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class CfnMethodIntegrationResponsePropertyDsl {
    private val cdkBuilder: CfnMethod.IntegrationResponseProperty.Builder =
        CfnMethod.IntegrationResponseProperty.builder()

    public fun contentHandling(contentHandling: String) {
        cdkBuilder.contentHandling(contentHandling)
    }

    public fun responseParameters(responseParameters: Map<String, String>) {
        cdkBuilder.responseParameters(responseParameters)
    }

    public fun responseParameters(responseParameters: IResolvable) {
        cdkBuilder.responseParameters(responseParameters)
    }

    public fun responseTemplates(responseTemplates: Map<String, String>) {
        cdkBuilder.responseTemplates(responseTemplates)
    }

    public fun responseTemplates(responseTemplates: IResolvable) {
        cdkBuilder.responseTemplates(responseTemplates)
    }

    public fun selectionPattern(selectionPattern: String) {
        cdkBuilder.selectionPattern(selectionPattern)
    }

    public fun statusCode(statusCode: String) {
        cdkBuilder.statusCode(statusCode)
    }

    public fun build(): CfnMethod.IntegrationResponseProperty = cdkBuilder.build()
}
