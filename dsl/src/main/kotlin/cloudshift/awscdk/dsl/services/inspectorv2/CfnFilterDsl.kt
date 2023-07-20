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
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnFilterDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnFilter.Builder = CfnFilter.Builder.create(scope, id)

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

    public fun build(): CfnFilter = cdkBuilder.build()
}
