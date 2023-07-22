@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnModel

/**
 * Specifies details about how containers in a multi-container endpoint are run.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * InferenceExecutionConfigProperty inferenceExecutionConfigProperty =
 * InferenceExecutionConfigProperty.builder()
 * .mode("mode")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-inferenceexecutionconfig.html)
 */
@CdkDslMarker
public class CfnModelInferenceExecutionConfigPropertyDsl {
  private val cdkBuilder: CfnModel.InferenceExecutionConfigProperty.Builder =
      CfnModel.InferenceExecutionConfigProperty.builder()

  /**
   * @param mode How containers in a multi-container are run. The following values are valid. 
   * * `Serial` - Containers run as a serial pipeline.
   * * `Direct` - Only the individual container that you specify is run.
   */
  public fun mode(mode: String) {
    cdkBuilder.mode(mode)
  }

  public fun build(): CfnModel.InferenceExecutionConfigProperty = cdkBuilder.build()
}
