@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTopic

@CdkDslMarker
public class CfnTopicTopicDateRangeFilterPropertyDsl {
  private val cdkBuilder: CfnTopic.TopicDateRangeFilterProperty.Builder =
      CfnTopic.TopicDateRangeFilterProperty.builder()

  /**
   * @param constant The constant used in a date range filter.
   */
  public fun constant(constant: IResolvable) {
    cdkBuilder.constant(constant)
  }

  /**
   * @param constant The constant used in a date range filter.
   */
  public fun constant(constant: CfnTopic.TopicRangeFilterConstantProperty) {
    cdkBuilder.constant(constant)
  }

  /**
   * @param inclusive A Boolean value that indicates whether the date range filter should include
   * the boundary values.
   * If set to true, the filter includes the start and end dates. If set to false, the filter
   * excludes them.
   */
  public fun inclusive(inclusive: Boolean) {
    cdkBuilder.inclusive(inclusive)
  }

  /**
   * @param inclusive A Boolean value that indicates whether the date range filter should include
   * the boundary values.
   * If set to true, the filter includes the start and end dates. If set to false, the filter
   * excludes them.
   */
  public fun inclusive(inclusive: IResolvable) {
    cdkBuilder.inclusive(inclusive)
  }

  public fun build(): CfnTopic.TopicDateRangeFilterProperty = cdkBuilder.build()
}
