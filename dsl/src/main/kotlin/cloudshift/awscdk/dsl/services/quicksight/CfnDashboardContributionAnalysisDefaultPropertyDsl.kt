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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The contribution analysis visual display for a line, pie, or bar chart.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ContributionAnalysisDefaultProperty contributionAnalysisDefaultProperty =
 * ContributionAnalysisDefaultProperty.builder()
 * .contributorDimensions(List.of(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build()))
 * .measureFieldId("measureFieldId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-contributionanalysisdefault.html)
 */
@CdkDslMarker
public class CfnDashboardContributionAnalysisDefaultPropertyDsl {
    private val cdkBuilder: CfnDashboard.ContributionAnalysisDefaultProperty.Builder =
        CfnDashboard.ContributionAnalysisDefaultProperty.builder()

    private val _contributorDimensions: MutableList<Any> = mutableListOf()

    /**
     * @param contributorDimensions The dimensions columns that are used in the contribution
     *   analysis, usually a list of `ColumnIdentifiers` .
     */
    public fun contributorDimensions(vararg contributorDimensions: Any) {
        _contributorDimensions.addAll(listOf(*contributorDimensions))
    }

    /**
     * @param contributorDimensions The dimensions columns that are used in the contribution
     *   analysis, usually a list of `ColumnIdentifiers` .
     */
    public fun contributorDimensions(contributorDimensions: Collection<Any>) {
        _contributorDimensions.addAll(contributorDimensions)
    }

    /**
     * @param contributorDimensions The dimensions columns that are used in the contribution
     *   analysis, usually a list of `ColumnIdentifiers` .
     */
    public fun contributorDimensions(contributorDimensions: IResolvable) {
        cdkBuilder.contributorDimensions(contributorDimensions)
    }

    /** @param measureFieldId The measure field that is used in the contribution analysis. */
    public fun measureFieldId(measureFieldId: String) {
        cdkBuilder.measureFieldId(measureFieldId)
    }

    public fun build(): CfnDashboard.ContributionAnalysisDefaultProperty {
        if (_contributorDimensions.isNotEmpty())
            cdkBuilder.contributorDimensions(_contributorDimensions)
        return cdkBuilder.build()
    }
}
