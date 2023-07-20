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

package cloudshift.awscdk.dsl.services.inspectorv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.inspectorv2.CfnFilter
import kotlin.Number

@CdkDslMarker
public class CfnFilterNumberFilterPropertyDsl {
    private val cdkBuilder: CfnFilter.NumberFilterProperty.Builder =
        CfnFilter.NumberFilterProperty.builder()

    public fun lowerInclusive(lowerInclusive: Number) {
        cdkBuilder.lowerInclusive(lowerInclusive)
    }

    public fun upperInclusive(upperInclusive: Number) {
        cdkBuilder.upperInclusive(upperInclusive)
    }

    public fun build(): CfnFilter.NumberFilterProperty = cdkBuilder.build()
}
