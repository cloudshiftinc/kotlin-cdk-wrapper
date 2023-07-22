@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudtrail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudtrail.CfnTrail

/**
 * A JSON string that contains a list of Insights types that are logged on a trail.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudtrail.*;
 * InsightSelectorProperty insightSelectorProperty = InsightSelectorProperty.builder()
 * .insightType("insightType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudtrail-trail-insightselector.html)
 */
@CdkDslMarker
public class CfnTrailInsightSelectorPropertyDsl {
  private val cdkBuilder: CfnTrail.InsightSelectorProperty.Builder =
      CfnTrail.InsightSelectorProperty.builder()

  /**
   * @param insightType The type of Insights events to log on a trail. `ApiCallRateInsight` and
   * `ApiErrorRateInsight` are valid Insight types.
   * The `ApiCallRateInsight` Insights type analyzes write-only management API calls that are
   * aggregated per minute against a baseline API call volume.
   *
   * The `ApiErrorRateInsight` Insights type analyzes management API calls that result in error
   * codes. The error is shown if the API call is unsuccessful.
   */
  public fun insightType(insightType: String) {
    cdkBuilder.insightType(insightType)
  }

  public fun build(): CfnTrail.InsightSelectorProperty = cdkBuilder.build()
}
