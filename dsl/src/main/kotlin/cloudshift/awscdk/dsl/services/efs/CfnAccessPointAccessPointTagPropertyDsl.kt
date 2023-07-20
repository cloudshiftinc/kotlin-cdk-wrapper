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

package cloudshift.awscdk.dsl.services.efs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.efs.CfnAccessPoint
import kotlin.String

@CdkDslMarker
public class CfnAccessPointAccessPointTagPropertyDsl {
    private val cdkBuilder: CfnAccessPoint.AccessPointTagProperty.Builder =
        CfnAccessPoint.AccessPointTagProperty.builder()

    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnAccessPoint.AccessPointTagProperty = cdkBuilder.build()
}
