@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudtrail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudtrail.CfnTrail

@CdkDslMarker
public class CfnTrailInsightSelectorPropertyDsl {
  private val cdkBuilder: CfnTrail.InsightSelectorProperty.Builder =
      CfnTrail.InsightSelectorProperty.builder()

  public fun insightType(insightType: String) {
    cdkBuilder.insightType(insightType)
  }

  public fun build(): CfnTrail.InsightSelectorProperty = cdkBuilder.build()
}
