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

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.batch.CfnJobDefinition
import kotlin.String

@CdkDslMarker
public class CfnJobDefinitionAuthorizationConfigPropertyDsl {
    private val cdkBuilder: CfnJobDefinition.AuthorizationConfigProperty.Builder =
        CfnJobDefinition.AuthorizationConfigProperty.builder()

    public fun accessPointId(accessPointId: String) {
        cdkBuilder.accessPointId(accessPointId)
    }

    public fun iam(iam: String) {
        cdkBuilder.iam(iam)
    }

    public fun build(): CfnJobDefinition.AuthorizationConfigProperty = cdkBuilder.build()
}
