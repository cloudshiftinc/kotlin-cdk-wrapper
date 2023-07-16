@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTopic

@CdkDslMarker
public class CfnTopicTopicNumericRangeFilterPropertyDsl {
  private val cdkBuilder: CfnTopic.TopicNumericRangeFilterProperty.Builder =
      CfnTopic.TopicNumericRangeFilterProperty.builder()

  public fun aggregation(aggregation: String) {
    cdkBuilder.aggregation(aggregation)
  }

  public fun constant(constant: IResolvable) {
    cdkBuilder.constant(constant)
  }

  public fun constant(constant: CfnTopic.TopicRangeFilterConstantProperty) {
    cdkBuilder.constant(constant)
  }

  public fun inclusive(inclusive: Boolean) {
    cdkBuilder.inclusive(inclusive)
  }

  public fun inclusive(inclusive: IResolvable) {
    cdkBuilder.inclusive(inclusive)
  }

  public fun build(): CfnTopic.TopicNumericRangeFilterProperty = cdkBuilder.build()
}
