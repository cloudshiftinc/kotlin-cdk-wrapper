@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnModelCard

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * ContainerProperty containerProperty = ContainerProperty.builder()
 * .image("image")
 * // the properties below are optional
 * .modelDataUrl("modelDataUrl")
 * .nearestModelName("nearestModelName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-container.html)
 */
@CdkDslMarker
public class CfnModelCardContainerPropertyDsl {
  private val cdkBuilder: CfnModelCard.ContainerProperty.Builder =
      CfnModelCard.ContainerProperty.builder()

  /**
   * @param image Inference environment path. 
   * The Amazon EC2 Container Registry (Amazon ECR) path where inference code is stored.
   */
  public fun image(image: String) {
    cdkBuilder.image(image)
  }

  /**
   * @param modelDataUrl The Amazon S3 path where the model artifacts, which result from model
   * training, are stored.
   */
  public fun modelDataUrl(modelDataUrl: String) {
    cdkBuilder.modelDataUrl(modelDataUrl)
  }

  /**
   * @param nearestModelName The name of a pre-trained machine learning benchmarked by Amazon
   * SageMaker Inference Recommender model that matches your model.
   */
  public fun nearestModelName(nearestModelName: String) {
    cdkBuilder.nearestModelName(nearestModelName)
  }

  public fun build(): CfnModelCard.ContainerProperty = cdkBuilder.build()
}
