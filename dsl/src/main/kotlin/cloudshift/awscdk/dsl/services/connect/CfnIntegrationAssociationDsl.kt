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

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.connect.CfnIntegrationAssociation
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnIntegrationAssociationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnIntegrationAssociation.Builder =
        CfnIntegrationAssociation.Builder.create(scope, id)

    public fun instanceId(instanceId: String) {
        cdkBuilder.instanceId(instanceId)
    }

    public fun integrationArn(integrationArn: String) {
        cdkBuilder.integrationArn(integrationArn)
    }

    public fun integrationType(integrationType: String) {
        cdkBuilder.integrationType(integrationType)
    }

    public fun build(): CfnIntegrationAssociation = cdkBuilder.build()
}
