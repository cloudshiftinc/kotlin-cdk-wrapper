@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelCard

/**
 * An overview about the model.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * ModelOverviewProperty modelOverviewProperty = ModelOverviewProperty.builder()
 * .algorithmType("algorithmType")
 * .inferenceEnvironment(InferenceEnvironmentProperty.builder()
 * .containerImage(List.of("containerImage"))
 * .build())
 * .modelArtifact(List.of("modelArtifact"))
 * .modelCreator("modelCreator")
 * .modelDescription("modelDescription")
 * .modelId("modelId")
 * .modelName("modelName")
 * .modelOwner("modelOwner")
 * .modelVersion(123)
 * .problemType("problemType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-modeloverview.html)
 */
@CdkDslMarker
public class CfnModelCardModelOverviewPropertyDsl {
  private val cdkBuilder: CfnModelCard.ModelOverviewProperty.Builder =
      CfnModelCard.ModelOverviewProperty.builder()

  private val _modelArtifact: MutableList<String> = mutableListOf()

  /**
   * @param algorithmType The algorithm used to solve the problem.
   */
  public fun algorithmType(algorithmType: String) {
    cdkBuilder.algorithmType(algorithmType)
  }

  /**
   * @param inferenceEnvironment An overview about model inference.
   */
  public fun inferenceEnvironment(inferenceEnvironment: IResolvable) {
    cdkBuilder.inferenceEnvironment(inferenceEnvironment)
  }

  /**
   * @param inferenceEnvironment An overview about model inference.
   */
  public fun inferenceEnvironment(inferenceEnvironment: CfnModelCard.InferenceEnvironmentProperty) {
    cdkBuilder.inferenceEnvironment(inferenceEnvironment)
  }

  /**
   * @param modelArtifact The location of the model artifact.
   */
  public fun modelArtifact(vararg modelArtifact: String) {
    _modelArtifact.addAll(listOf(*modelArtifact))
  }

  /**
   * @param modelArtifact The location of the model artifact.
   */
  public fun modelArtifact(modelArtifact: Collection<String>) {
    _modelArtifact.addAll(modelArtifact)
  }

  /**
   * @param modelCreator The creator of the model.
   */
  public fun modelCreator(modelCreator: String) {
    cdkBuilder.modelCreator(modelCreator)
  }

  /**
   * @param modelDescription A description of the model.
   */
  public fun modelDescription(modelDescription: String) {
    cdkBuilder.modelDescription(modelDescription)
  }

  /**
   * @param modelId The SageMaker Model ARN or non- SageMaker Model ID.
   */
  public fun modelId(modelId: String) {
    cdkBuilder.modelId(modelId)
  }

  /**
   * @param modelName The name of the model.
   */
  public fun modelName(modelName: String) {
    cdkBuilder.modelName(modelName)
  }

  /**
   * @param modelOwner The owner of the model.
   */
  public fun modelOwner(modelOwner: String) {
    cdkBuilder.modelOwner(modelOwner)
  }

  /**
   * @param modelVersion The version of the model.
   */
  public fun modelVersion(modelVersion: Number) {
    cdkBuilder.modelVersion(modelVersion)
  }

  /**
   * @param problemType The problem being solved with the model.
   */
  public fun problemType(problemType: String) {
    cdkBuilder.problemType(problemType)
  }

  public fun build(): CfnModelCard.ModelOverviewProperty {
    if(_modelArtifact.isNotEmpty()) cdkBuilder.modelArtifact(_modelArtifact)
    return cdkBuilder.build()
  }
}
