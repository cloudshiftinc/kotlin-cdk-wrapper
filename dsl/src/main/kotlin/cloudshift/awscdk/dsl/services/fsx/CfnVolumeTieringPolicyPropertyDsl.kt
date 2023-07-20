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

package cloudshift.awscdk.dsl.services.fsx

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.fsx.CfnVolume
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnVolumeTieringPolicyPropertyDsl {
    private val cdkBuilder: CfnVolume.TieringPolicyProperty.Builder =
        CfnVolume.TieringPolicyProperty.builder()

    public fun coolingPeriod(coolingPeriod: Number) {
        cdkBuilder.coolingPeriod(coolingPeriod)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnVolume.TieringPolicyProperty = cdkBuilder.build()
}
