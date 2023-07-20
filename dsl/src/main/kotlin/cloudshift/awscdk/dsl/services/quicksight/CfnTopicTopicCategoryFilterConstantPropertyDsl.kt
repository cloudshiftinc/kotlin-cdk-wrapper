@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTopic

@CdkDslMarker
public class CfnTopicTopicCategoryFilterConstantPropertyDsl {
  private val cdkBuilder: CfnTopic.TopicCategoryFilterConstantProperty.Builder =
      CfnTopic.TopicCategoryFilterConstantProperty.builder()

  public fun collectiveConstant(collectiveConstant: IResolvable) {
    cdkBuilder.collectiveConstant(collectiveConstant)
  }

  public fun collectiveConstant(collectiveConstant: CfnTopic.CollectiveConstantProperty) {
    cdkBuilder.collectiveConstant(collectiveConstant)
  }

  public fun constantType(constantType: String) {
    cdkBuilder.constantType(constantType)
  }

  public fun singularConstant(singularConstant: String) {
    cdkBuilder.singularConstant(singularConstant)
  }

  public fun build(): CfnTopic.TopicCategoryFilterConstantProperty = cdkBuilder.build()
}
