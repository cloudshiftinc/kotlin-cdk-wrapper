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

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.lambda.CfnLayerVersionPermission
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnLayerVersionPermissionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnLayerVersionPermission.Builder =
        CfnLayerVersionPermission.Builder.create(scope, id)

    public fun action(action: String) {
        cdkBuilder.action(action)
    }

    public fun layerVersionArn(layerVersionArn: String) {
        cdkBuilder.layerVersionArn(layerVersionArn)
    }

    public fun organizationId(organizationId: String) {
        cdkBuilder.organizationId(organizationId)
    }

    public fun principal(principal: String) {
        cdkBuilder.principal(principal)
    }

    public fun build(): CfnLayerVersionPermission = cdkBuilder.build()
}
