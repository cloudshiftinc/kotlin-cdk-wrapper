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

package cloudshift.awscdk.dsl.services.codepipeline.actions

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.codepipeline.actions.CommonCloudFormationStackSetOptions
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CommonCloudFormationStackSetOptionsDsl {
    private val cdkBuilder: CommonCloudFormationStackSetOptions.Builder =
        CommonCloudFormationStackSetOptions.builder()

    public fun failureTolerancePercentage(failureTolerancePercentage: Number) {
        cdkBuilder.failureTolerancePercentage(failureTolerancePercentage)
    }

    public fun maxAccountConcurrencyPercentage(maxAccountConcurrencyPercentage: Number) {
        cdkBuilder.maxAccountConcurrencyPercentage(maxAccountConcurrencyPercentage)
    }

    public fun stackSetRegion(stackSetRegion: String) {
        cdkBuilder.stackSetRegion(stackSetRegion)
    }

    public fun build(): CommonCloudFormationStackSetOptions = cdkBuilder.build()
}
