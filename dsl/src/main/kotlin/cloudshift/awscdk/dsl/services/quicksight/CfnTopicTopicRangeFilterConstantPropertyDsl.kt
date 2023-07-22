@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTopic

@CdkDslMarker
public class CfnTopicTopicRangeFilterConstantPropertyDsl {
  private val cdkBuilder: CfnTopic.TopicRangeFilterConstantProperty.Builder =
      CfnTopic.TopicRangeFilterConstantProperty.builder()

  /**
   * @param constantType The data type of the constant value that is used in a range filter.
   * Valid values for this structure are `RANGE` .
   */
  public fun constantType(constantType: String) {
    cdkBuilder.constantType(constantType)
  }

  /**
   * @param rangeConstant The value of the constant that is used to specify the endpoints of a range
   * filter.
   */
  public fun rangeConstant(rangeConstant: IResolvable) {
    cdkBuilder.rangeConstant(rangeConstant)
  }

  /**
   * @param rangeConstant The value of the constant that is used to specify the endpoints of a range
   * filter.
   */
  public fun rangeConstant(rangeConstant: CfnTopic.RangeConstantProperty) {
    cdkBuilder.rangeConstant(rangeConstant)
  }

  public fun build(): CfnTopic.TopicRangeFilterConstantProperty = cdkBuilder.build()
}
