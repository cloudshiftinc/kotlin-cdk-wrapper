@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.resourceexplorer2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.resourceexplorer2.CfnView

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.resourceexplorer2.*;
 * FiltersProperty filtersProperty = FiltersProperty.builder()
 * .filterString("filterString")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resourceexplorer2-view-filters.html)
 */
@CdkDslMarker
public class CfnViewFiltersPropertyDsl {
    private val cdkBuilder: CfnView.FiltersProperty.Builder = CfnView.FiltersProperty.builder()

    /** @param filterString the value to be set. */
    public fun filterString(filterString: String) {
        cdkBuilder.filterString(filterString)
    }

    public fun build(): CfnView.FiltersProperty = cdkBuilder.build()
}
