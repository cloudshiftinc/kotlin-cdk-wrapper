@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTopic

@CdkDslMarker
public class CfnTopicTopicRelativeDateFilterPropertyDsl {
  private val cdkBuilder: CfnTopic.TopicRelativeDateFilterProperty.Builder =
      CfnTopic.TopicRelativeDateFilterProperty.builder()

  /**
   * @param constant The constant used in a relative date filter.
   */
  public fun constant(constant: IResolvable) {
    cdkBuilder.constant(constant)
  }

  /**
   * @param constant The constant used in a relative date filter.
   */
  public fun constant(constant: CfnTopic.TopicSingularFilterConstantProperty) {
    cdkBuilder.constant(constant)
  }

  /**
   * @param relativeDateFilterFunction The function to be used in a relative date filter to
   * determine the range of dates to include in the results.
   * Valid values for this structure are `BEFORE` , `AFTER` , and `BETWEEN` .
   */
  public fun relativeDateFilterFunction(relativeDateFilterFunction: String) {
    cdkBuilder.relativeDateFilterFunction(relativeDateFilterFunction)
  }

  /**
   * @param timeGranularity The level of time precision that is used to aggregate `DateTime` values.
   */
  public fun timeGranularity(timeGranularity: String) {
    cdkBuilder.timeGranularity(timeGranularity)
  }

  public fun build(): CfnTopic.TopicRelativeDateFilterProperty = cdkBuilder.build()
}
