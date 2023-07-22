@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition

@CdkDslMarker
public class CfnModelExplainabilityJobDefinitionModelExplainabilityAppSpecificationPropertyDsl {
  private val cdkBuilder:
      CfnModelExplainabilityJobDefinition.ModelExplainabilityAppSpecificationProperty.Builder =
      CfnModelExplainabilityJobDefinition.ModelExplainabilityAppSpecificationProperty.builder()

  /**
   * @param configUri JSON formatted S3 file that defines explainability parameters. 
   * For more information on this JSON configuration file, see [Configure model explainability
   * parameters](https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-config-json-monitor-model-explainability-parameters.html)
   * .
   */
  public fun configUri(configUri: String) {
    cdkBuilder.configUri(configUri)
  }

  /**
   * @param environment Sets the environment variables in the Docker container.
   */
  public fun environment(environment: Map<String, String>) {
    cdkBuilder.environment(environment)
  }

  /**
   * @param environment Sets the environment variables in the Docker container.
   */
  public fun environment(environment: IResolvable) {
    cdkBuilder.environment(environment)
  }

  /**
   * @param imageUri The container image to be run by the model explainability job. 
   */
  public fun imageUri(imageUri: String) {
    cdkBuilder.imageUri(imageUri)
  }

  public fun build():
      CfnModelExplainabilityJobDefinition.ModelExplainabilityAppSpecificationProperty =
      cdkBuilder.build()
}
