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

package cloudshift.awscdk.dsl.services.iotsitewise

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy
import kotlin.String

@CdkDslMarker
public class CfnAccessPolicyUserPropertyDsl {
    private val cdkBuilder: CfnAccessPolicy.UserProperty.Builder =
        CfnAccessPolicy.UserProperty.builder()

    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    public fun build(): CfnAccessPolicy.UserProperty = cdkBuilder.build()
}
