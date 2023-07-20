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
import software.amazon.awscdk.services.connect.CfnIntegrationAssociationProps
import kotlin.String

@CdkDslMarker
public class CfnIntegrationAssociationPropsDsl {
    private val cdkBuilder: CfnIntegrationAssociationProps.Builder =
        CfnIntegrationAssociationProps.builder()

    public fun instanceId(instanceId: String) {
        cdkBuilder.instanceId(instanceId)
    }

    public fun integrationArn(integrationArn: String) {
        cdkBuilder.integrationArn(integrationArn)
    }

    public fun integrationType(integrationType: String) {
        cdkBuilder.integrationType(integrationType)
    }

    public fun build(): CfnIntegrationAssociationProps = cdkBuilder.build()
}
