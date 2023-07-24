@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

/**
 * The contribution analysis visual display for a line, pie, or bar chart.
 *
 * Example:
 *
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-contributionanalysisdefault.html)
 */
@CdkDslMarker
public class CfnAnalysisContributionAnalysisDefaultPropertyDsl {
    private val cdkBuilder: CfnAnalysis.ContributionAnalysisDefaultProperty.Builder =
        CfnAnalysis.ContributionAnalysisDefaultProperty.builder()

    private val _contributorDimensions: MutableList<Any> = mutableListOf()

    /**
     * @param contributorDimensions The dimensions columns that are used in the contribution analysis,
     * usually a list of `ColumnIdentifiers` .
     */
    public fun contributorDimensions(vararg contributorDimensions: Any) {
        _contributorDimensions.addAll(listOf(*contributorDimensions))
    }

    /**
     * @param contributorDimensions The dimensions columns that are used in the contribution analysis,
     * usually a list of `ColumnIdentifiers` .
     */
    public fun contributorDimensions(contributorDimensions: Collection<Any>) {
        _contributorDimensions.addAll(contributorDimensions)
    }

    /**
     * @param contributorDimensions The dimensions columns that are used in the contribution analysis,
     * usually a list of `ColumnIdentifiers` .
     */
    public fun contributorDimensions(contributorDimensions: IResolvable) {
        cdkBuilder.contributorDimensions(contributorDimensions)
    }

    /**
     * @param measureFieldId The measure field that is used in the contribution analysis.
     */
    public fun measureFieldId(measureFieldId: String) {
        cdkBuilder.measureFieldId(measureFieldId)
    }

    public fun build(): CfnAnalysis.ContributionAnalysisDefaultProperty {
        if (_contributorDimensions.isNotEmpty()) cdkBuilder.contributorDimensions(_contributorDimensions)
        return cdkBuilder.build()
    }
}
