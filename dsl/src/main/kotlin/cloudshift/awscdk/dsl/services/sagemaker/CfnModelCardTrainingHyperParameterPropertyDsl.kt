@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnModelCard

@CdkDslMarker
public class CfnModelCardTrainingHyperParameterPropertyDsl {
  private val cdkBuilder: CfnModelCard.TrainingHyperParameterProperty.Builder =
      CfnModelCard.TrainingHyperParameterProperty.builder()

  /**
   * @param name The name of the hyper parameter. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param value The value specified for the hyper parameter. 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnModelCard.TrainingHyperParameterProperty = cdkBuilder.build()
}
