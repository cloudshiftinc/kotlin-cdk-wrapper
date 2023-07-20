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
import software.amazon.awscdk.services.apigatewayv2.CfnDeploymentProps
import kotlin.String

@CdkDslMarker
public class CfnDeploymentPropsDsl {
    private val cdkBuilder: CfnDeploymentProps.Builder = CfnDeploymentProps.builder()

    public fun apiId(apiId: String) {
        cdkBuilder.apiId(apiId)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun stageName(stageName: String) {
        cdkBuilder.stageName(stageName)
    }

    public fun build(): CfnDeploymentProps = cdkBuilder.build()
}
