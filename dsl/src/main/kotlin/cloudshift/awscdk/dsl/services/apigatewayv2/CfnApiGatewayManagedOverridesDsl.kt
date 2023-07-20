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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnApiGatewayManagedOverridesDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnApiGatewayManagedOverrides.Builder =
        CfnApiGatewayManagedOverrides.Builder.create(scope, id)

    public fun apiId(apiId: String) {
        cdkBuilder.apiId(apiId)
    }

    public fun integration(integration: IResolvable) {
        cdkBuilder.integration(integration)
    }

    public fun integration(integration: CfnApiGatewayManagedOverrides.IntegrationOverridesProperty) {
        cdkBuilder.integration(integration)
    }

    public fun route(route: IResolvable) {
        cdkBuilder.route(route)
    }

    public fun route(route: CfnApiGatewayManagedOverrides.RouteOverridesProperty) {
        cdkBuilder.route(route)
    }

    public fun stage(stage: IResolvable) {
        cdkBuilder.stage(stage)
    }

    public fun stage(stage: CfnApiGatewayManagedOverrides.StageOverridesProperty) {
        cdkBuilder.stage(stage)
    }

    public fun build(): CfnApiGatewayManagedOverrides = cdkBuilder.build()
}
