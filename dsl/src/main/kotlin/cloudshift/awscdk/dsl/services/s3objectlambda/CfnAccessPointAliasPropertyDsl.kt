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

package cloudshift.awscdk.dsl.services.s3objectlambda

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint
import kotlin.String

@CdkDslMarker
public class CfnAccessPointAliasPropertyDsl {
    private val cdkBuilder: CfnAccessPoint.AliasProperty.Builder =
        CfnAccessPoint.AliasProperty.builder()

    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnAccessPoint.AliasProperty = cdkBuilder.build()
}
