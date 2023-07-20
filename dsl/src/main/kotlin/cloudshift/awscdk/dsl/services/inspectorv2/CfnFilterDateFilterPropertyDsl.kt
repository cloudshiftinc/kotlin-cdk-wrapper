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
public class CfnFilterDateFilterPropertyDsl {
    private val cdkBuilder: CfnFilter.DateFilterProperty.Builder =
        CfnFilter.DateFilterProperty.builder()

    public fun endInclusive(endInclusive: Number) {
        cdkBuilder.endInclusive(endInclusive)
    }

    public fun startInclusive(startInclusive: Number) {
        cdkBuilder.startInclusive(startInclusive)
    }

    public fun build(): CfnFilter.DateFilterProperty = cdkBuilder.build()
}
