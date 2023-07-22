@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTopic

@CdkDslMarker
public class CfnTopicTopicSingularFilterConstantPropertyDsl {
  private val cdkBuilder: CfnTopic.TopicSingularFilterConstantProperty.Builder =
      CfnTopic.TopicSingularFilterConstantProperty.builder()

  /**
   * @param constantType The type of the singular filter constant.
   * Valid values for this structure are `SINGULAR` .
   */
  public fun constantType(constantType: String) {
    cdkBuilder.constantType(constantType)
  }

  /**
   * @param singularConstant The value of the singular filter constant.
   */
  public fun singularConstant(singularConstant: String) {
    cdkBuilder.singularConstant(singularConstant)
  }

  public fun build(): CfnTopic.TopicSingularFilterConstantProperty = cdkBuilder.build()
}
