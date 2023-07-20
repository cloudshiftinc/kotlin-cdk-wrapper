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
import software.amazon.awscdk.services.apigateway.Deployment
import software.amazon.awscdk.services.apigateway.IRestApi
import software.constructs.Construct
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class DeploymentDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: Deployment.Builder = Deployment.Builder.create(scope, id)

    public fun api(api: IRestApi) {
        cdkBuilder.api(api)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun retainDeployments(retainDeployments: Boolean) {
        cdkBuilder.retainDeployments(retainDeployments)
    }

    public fun build(): Deployment = cdkBuilder.build()
}
