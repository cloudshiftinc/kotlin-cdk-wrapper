@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnSegment

@CdkDslMarker
public class CfnSegmentBehaviorPropertyDsl {
  private val cdkBuilder: CfnSegment.BehaviorProperty.Builder =
      CfnSegment.BehaviorProperty.builder()

  public fun recency(recency: IResolvable) {
    cdkBuilder.recency(recency)
  }

  public fun recency(recency: CfnSegment.RecencyProperty) {
    cdkBuilder.recency(recency)
  }

  public fun build(): CfnSegment.BehaviorProperty = cdkBuilder.build()
}
