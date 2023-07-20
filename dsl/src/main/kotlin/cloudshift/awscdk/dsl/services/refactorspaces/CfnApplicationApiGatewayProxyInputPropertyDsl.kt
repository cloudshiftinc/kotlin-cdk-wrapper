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

package cloudshift.awscdk.dsl.services.refactorspaces

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.refactorspaces.CfnApplication
import kotlin.String

@CdkDslMarker
public class CfnApplicationApiGatewayProxyInputPropertyDsl {
    private val cdkBuilder: CfnApplication.ApiGatewayProxyInputProperty.Builder =
        CfnApplication.ApiGatewayProxyInputProperty.builder()

    public fun endpointType(endpointType: String) {
        cdkBuilder.endpointType(endpointType)
    }

    public fun stageName(stageName: String) {
        cdkBuilder.stageName(stageName)
    }

    public fun build(): CfnApplication.ApiGatewayProxyInputProperty = cdkBuilder.build()
}
