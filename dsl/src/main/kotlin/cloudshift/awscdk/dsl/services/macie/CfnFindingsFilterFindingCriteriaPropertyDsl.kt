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

package cloudshift.awscdk.dsl.services.macie

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.macie.CfnFindingsFilter

/**
 * Specifies, as a map, one or more property-based conditions for a findings filter.
 *
 * A *findings filter* , also referred to as a *filter rule* , is a set of custom criteria that
 * specifies which findings to include or exclude from the results of a query for findings. You can
 * also configure a findings filter to suppress (automatically archive) findings that match the
 * filter's criteria. For more information, see
 * [Filtering findings](https://docs.aws.amazon.com/macie/latest/user/findings-filter-overview.html)
 * in the *Amazon Macie User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.macie.*;
 * FindingCriteriaProperty findingCriteriaProperty = FindingCriteriaProperty.builder()
 * .criterion(Map.of(
 * "criterionKey", CriterionAdditionalPropertiesProperty.builder()
 * .eq(List.of("eq"))
 * .gt(123)
 * .gte(123)
 * .lt(123)
 * .lte(123)
 * .neq(List.of("neq"))
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-macie-findingsfilter-findingcriteria.html)
 */
@CdkDslMarker
public class CfnFindingsFilterFindingCriteriaPropertyDsl {
    private val cdkBuilder: CfnFindingsFilter.FindingCriteriaProperty.Builder =
        CfnFindingsFilter.FindingCriteriaProperty.builder()

    /**
     * @param criterion Specifies a condition that defines the property, operator, and one or more
     *   values to use to filter the results.
     */
    public fun criterion(criterion: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(criterion)
        cdkBuilder.criterion(builder.map)
    }

    /**
     * @param criterion Specifies a condition that defines the property, operator, and one or more
     *   values to use to filter the results.
     */
    public fun criterion(criterion: Map<String, Any>) {
        cdkBuilder.criterion(criterion)
    }

    /**
     * @param criterion Specifies a condition that defines the property, operator, and one or more
     *   values to use to filter the results.
     */
    public fun criterion(criterion: IResolvable) {
        cdkBuilder.criterion(criterion)
    }

    public fun build(): CfnFindingsFilter.FindingCriteriaProperty = cdkBuilder.build()
}
