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
import software.amazon.awscdk.services.apigateway.CfnGatewayResponseProps
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class CfnGatewayResponsePropsDsl {
    private val cdkBuilder: CfnGatewayResponseProps.Builder = CfnGatewayResponseProps.builder()

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

    public fun responseType(responseType: String) {
        cdkBuilder.responseType(responseType)
    }

    public fun restApiId(restApiId: String) {
        cdkBuilder.restApiId(restApiId)
    }

    public fun statusCode(statusCode: String) {
        cdkBuilder.statusCode(statusCode)
    }

    public fun build(): CfnGatewayResponseProps = cdkBuilder.build()
}
