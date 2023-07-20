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

package cloudshift.awscdk.dsl.services.resourceexplorer2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.resourceexplorer2.CfnView
import kotlin.String

@CdkDslMarker
public class CfnViewFiltersPropertyDsl {
    private val cdkBuilder: CfnView.FiltersProperty.Builder = CfnView.FiltersProperty.builder()

    public fun filterString(filterString: String) {
        cdkBuilder.filterString(filterString)
    }

    public fun build(): CfnView.FiltersProperty = cdkBuilder.build()
}
