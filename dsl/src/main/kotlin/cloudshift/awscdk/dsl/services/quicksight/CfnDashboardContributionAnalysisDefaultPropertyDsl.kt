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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDashboardContributionAnalysisDefaultPropertyDsl {
    private val cdkBuilder: CfnDashboard.ContributionAnalysisDefaultProperty.Builder =
        CfnDashboard.ContributionAnalysisDefaultProperty.builder()

    private val _contributorDimensions: MutableList<Any> = mutableListOf()

    public fun contributorDimensions(vararg contributorDimensions: Any) {
        _contributorDimensions.addAll(listOf(*contributorDimensions))
    }

    public fun contributorDimensions(contributorDimensions: Collection<Any>) {
        _contributorDimensions.addAll(contributorDimensions)
    }

    public fun contributorDimensions(contributorDimensions: IResolvable) {
        cdkBuilder.contributorDimensions(contributorDimensions)
    }

    public fun measureFieldId(measureFieldId: String) {
        cdkBuilder.measureFieldId(measureFieldId)
    }

    public fun build(): CfnDashboard.ContributionAnalysisDefaultProperty {
        if (_contributorDimensions.isNotEmpty()) cdkBuilder.contributorDimensions(_contributorDimensions)
        return cdkBuilder.build()
    }
}
