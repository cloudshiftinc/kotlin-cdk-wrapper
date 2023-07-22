@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.events.CfnRule

@CdkDslMarker
public class CfnRuleSageMakerPipelineParameterPropertyDsl {
  private val cdkBuilder: CfnRule.SageMakerPipelineParameterProperty.Builder =
      CfnRule.SageMakerPipelineParameterProperty.builder()

  /**
   * @param name Name of parameter to start execution of a SageMaker Model Building Pipeline. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param value Value of parameter to start execution of a SageMaker Model Building Pipeline. 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnRule.SageMakerPipelineParameterProperty = cdkBuilder.build()
}
