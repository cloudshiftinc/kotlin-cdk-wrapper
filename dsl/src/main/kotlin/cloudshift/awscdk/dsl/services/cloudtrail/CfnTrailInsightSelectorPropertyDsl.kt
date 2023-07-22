@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudtrail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudtrail.CfnTrail

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
