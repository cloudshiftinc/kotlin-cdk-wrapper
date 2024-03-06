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

package io.cloudshiftdev.awscdkdsl.services.cloudtrail

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudtrail.CfnEventDataStore

/**
 * A JSON string that contains a list of Insights types that are logged on an event data store.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudtrail.*;
 * InsightSelectorProperty insightSelectorProperty = InsightSelectorProperty.builder()
 * .insightType("insightType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-eventdatastore-insightselector.html)
 */
@CdkDslMarker
public class CfnEventDataStoreInsightSelectorPropertyDsl {
    private val cdkBuilder: CfnEventDataStore.InsightSelectorProperty.Builder =
        CfnEventDataStore.InsightSelectorProperty.builder()

    /**
     * @param insightType The type of Insights events to log on an event data store.
     *   `ApiCallRateInsight` and `ApiErrorRateInsight` are valid Insight types. The
     *   `ApiCallRateInsight` Insights type analyzes write-only management API calls that are
     *   aggregated per minute against a baseline API call volume.
     *
     * The `ApiErrorRateInsight` Insights type analyzes management API calls that result in error
     * codes. The error is shown if the API call is unsuccessful.
     */
    public fun insightType(insightType: String) {
        cdkBuilder.insightType(insightType)
    }

    public fun build(): CfnEventDataStore.InsightSelectorProperty = cdkBuilder.build()
}
