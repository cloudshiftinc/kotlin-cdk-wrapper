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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.inspectorv2.CfnFilter
import software.amazon.awscdk.services.inspectorv2.CfnFilterProps
import kotlin.String

@CdkDslMarker
public class CfnFilterPropsDsl {
    private val cdkBuilder: CfnFilterProps.Builder = CfnFilterProps.builder()

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun filterAction(filterAction: String) {
        cdkBuilder.filterAction(filterAction)
    }

    public fun filterCriteria(filterCriteria: IResolvable) {
        cdkBuilder.filterCriteria(filterCriteria)
    }

    public fun filterCriteria(filterCriteria: CfnFilter.FilterCriteriaProperty) {
        cdkBuilder.filterCriteria(filterCriteria)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnFilterProps = cdkBuilder.build()
}
