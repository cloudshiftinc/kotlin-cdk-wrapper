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
import software.amazon.awscdk.services.apigatewayv2.CfnDeployment
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnDeploymentDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDeployment.Builder = CfnDeployment.Builder.create(scope, id)

    public fun apiId(apiId: String) {
        cdkBuilder.apiId(apiId)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun stageName(stageName: String) {
        cdkBuilder.stageName(stageName)
    }

    public fun build(): CfnDeployment = cdkBuilder.build()
}
