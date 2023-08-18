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

package io.cloudshiftdev.awscdkdsl.services.dynamodb

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dynamodb.CfnGlobalTable

/**
 * Configures contributor insights settings for a replica or one of its indexes.
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-contributorinsightsspecification.html)
 */
@CdkDslMarker
public class CfnGlobalTableContributorInsightsSpecificationPropertyDsl {
    private val cdkBuilder: CfnGlobalTable.ContributorInsightsSpecificationProperty.Builder =
        CfnGlobalTable.ContributorInsightsSpecificationProperty.builder()

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

    public fun build(): CfnGlobalTable.ContributorInsightsSpecificationProperty = cdkBuilder.build()
}
