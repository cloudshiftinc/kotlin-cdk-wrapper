@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTopic

@CdkDslMarker
public class CfnTopicTopicCategoryFilterPropertyDsl {
  private val cdkBuilder: CfnTopic.TopicCategoryFilterProperty.Builder =
      CfnTopic.TopicCategoryFilterProperty.builder()

  /**
   * @param categoryFilterFunction The category filter function.
   * Valid values for this structure are `EXACT` and `CONTAINS` .
   */
  public fun categoryFilterFunction(categoryFilterFunction: String) {
    cdkBuilder.categoryFilterFunction(categoryFilterFunction)
  }

  /**
   * @param categoryFilterType The category filter type.
   * This element is used to specify whether a filter is a simple category filter or an inverse
   * category filter.
   */
  public fun categoryFilterType(categoryFilterType: String) {
    cdkBuilder.categoryFilterType(categoryFilterType)
  }

  /**
   * @param constant The constant used in a category filter.
   */
  public fun constant(constant: IResolvable) {
    cdkBuilder.constant(constant)
  }

  /**
   * @param constant The constant used in a category filter.
   */
  public fun constant(constant: CfnTopic.TopicCategoryFilterConstantProperty) {
    cdkBuilder.constant(constant)
  }

  /**
   * @param inverse A Boolean value that indicates if the filter is inverse.
   */
  public fun inverse(inverse: Boolean) {
    cdkBuilder.inverse(inverse)
  }

  /**
   * @param inverse A Boolean value that indicates if the filter is inverse.
   */
  public fun inverse(inverse: IResolvable) {
    cdkBuilder.inverse(inverse)
  }

  public fun build(): CfnTopic.TopicCategoryFilterProperty = cdkBuilder.build()
}
