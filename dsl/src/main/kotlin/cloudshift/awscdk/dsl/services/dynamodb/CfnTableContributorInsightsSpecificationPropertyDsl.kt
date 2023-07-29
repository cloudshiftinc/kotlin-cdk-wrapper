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

package cloudshift.awscdk.dsl.services.dynamodb

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dynamodb.CfnTable

/**
 * The settings used to enable or disable CloudWatch Contributor Insights.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dynamodb.*;
 * ContributorInsightsSpecificationProperty contributorInsightsSpecificationProperty =
 * ContributorInsightsSpecificationProperty.builder()
 * .enabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-contributorinsightsspecification.html)
 */
@CdkDslMarker
public class CfnTableContributorInsightsSpecificationPropertyDsl {
    private val cdkBuilder: CfnTable.ContributorInsightsSpecificationProperty.Builder =
        CfnTable.ContributorInsightsSpecificationProperty.builder()

    /**
     * @param enabled Indicates whether CloudWatch Contributor Insights are to be enabled (true) or
     *   disabled (false).
     */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param enabled Indicates whether CloudWatch Contributor Insights are to be enabled (true) or
     *   disabled (false).
     */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun build(): CfnTable.ContributorInsightsSpecificationProperty = cdkBuilder.build()
}
