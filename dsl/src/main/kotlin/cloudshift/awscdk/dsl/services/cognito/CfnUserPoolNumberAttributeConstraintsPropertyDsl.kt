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
public class CfnUserPoolNumberAttributeConstraintsPropertyDsl {
    private val cdkBuilder: CfnUserPool.NumberAttributeConstraintsProperty.Builder =
        CfnUserPool.NumberAttributeConstraintsProperty.builder()

    public fun maxValue(maxValue: String) {
        cdkBuilder.maxValue(maxValue)
    }

    public fun minValue(minValue: String) {
        cdkBuilder.minValue(minValue)
    }

    public fun build(): CfnUserPool.NumberAttributeConstraintsProperty = cdkBuilder.build()
}
