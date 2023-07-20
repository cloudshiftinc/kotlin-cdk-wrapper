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

  public fun categoryFilterFunction(categoryFilterFunction: String) {
    cdkBuilder.categoryFilterFunction(categoryFilterFunction)
  }

  public fun categoryFilterType(categoryFilterType: String) {
    cdkBuilder.categoryFilterType(categoryFilterType)
  }

  public fun constant(constant: IResolvable) {
    cdkBuilder.constant(constant)
  }

  public fun constant(constant: CfnTopic.TopicCategoryFilterConstantProperty) {
    cdkBuilder.constant(constant)
  }

  public fun inverse(inverse: Boolean) {
    cdkBuilder.inverse(inverse)
  }

  public fun inverse(inverse: IResolvable) {
    cdkBuilder.inverse(inverse)
  }

  public fun build(): CfnTopic.TopicCategoryFilterProperty = cdkBuilder.build()
}
