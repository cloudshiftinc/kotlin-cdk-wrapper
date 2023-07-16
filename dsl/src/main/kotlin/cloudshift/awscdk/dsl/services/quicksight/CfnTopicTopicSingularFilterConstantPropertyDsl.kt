@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTopic

@CdkDslMarker
public class CfnTopicTopicSingularFilterConstantPropertyDsl {
  private val cdkBuilder: CfnTopic.TopicSingularFilterConstantProperty.Builder =
      CfnTopic.TopicSingularFilterConstantProperty.builder()

  public fun constantType(constantType: String) {
    cdkBuilder.constantType(constantType)
  }

  public fun singularConstant(singularConstant: String) {
    cdkBuilder.singularConstant(singularConstant)
  }

  public fun build(): CfnTopic.TopicSingularFilterConstantProperty = cdkBuilder.build()
}
