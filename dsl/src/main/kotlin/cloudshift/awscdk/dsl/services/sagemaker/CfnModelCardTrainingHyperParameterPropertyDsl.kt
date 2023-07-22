@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnModelCard

/**
 * A hyper parameter that was configured in training the model.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * TrainingHyperParameterProperty trainingHyperParameterProperty =
 * TrainingHyperParameterProperty.builder()
 * .name("name")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-traininghyperparameter.html)
 */
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
