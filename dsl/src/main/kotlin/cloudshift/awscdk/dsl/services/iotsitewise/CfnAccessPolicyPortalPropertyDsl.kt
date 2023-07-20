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
public class CfnAccessPolicyPortalPropertyDsl {
    private val cdkBuilder: CfnAccessPolicy.PortalProperty.Builder =
        CfnAccessPolicy.PortalProperty.builder()

    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    public fun build(): CfnAccessPolicy.PortalProperty = cdkBuilder.build()
}
