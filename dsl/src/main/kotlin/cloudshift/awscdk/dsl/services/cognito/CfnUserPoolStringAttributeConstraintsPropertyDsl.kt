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

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.cognito.CfnUserPool
import kotlin.String

@CdkDslMarker
public class CfnUserPoolStringAttributeConstraintsPropertyDsl {
    private val cdkBuilder: CfnUserPool.StringAttributeConstraintsProperty.Builder =
        CfnUserPool.StringAttributeConstraintsProperty.builder()

    public fun maxLength(maxLength: String) {
        cdkBuilder.maxLength(maxLength)
    }

    public fun minLength(minLength: String) {
        cdkBuilder.minLength(minLength)
    }

    public fun build(): CfnUserPool.StringAttributeConstraintsProperty = cdkBuilder.build()
}
