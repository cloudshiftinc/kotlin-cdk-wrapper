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

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ecs.AuthorizationConfig
import kotlin.String

@CdkDslMarker
public class AuthorizationConfigDsl {
    private val cdkBuilder: AuthorizationConfig.Builder = AuthorizationConfig.builder()

    public fun accessPointId(accessPointId: String) {
        cdkBuilder.accessPointId(accessPointId)
    }

    public fun iam(iam: String) {
        cdkBuilder.iam(iam)
    }

    public fun build(): AuthorizationConfig = cdkBuilder.build()
}
