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

package cloudshift.awscdk.dsl.services.groundstation

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.groundstation.CfnConfig
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnConfigFrequencyPropertyDsl {
    private val cdkBuilder: CfnConfig.FrequencyProperty.Builder =
        CfnConfig.FrequencyProperty.builder()

    public fun units(units: String) {
        cdkBuilder.units(units)
    }

    public fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnConfig.FrequencyProperty = cdkBuilder.build()
}
