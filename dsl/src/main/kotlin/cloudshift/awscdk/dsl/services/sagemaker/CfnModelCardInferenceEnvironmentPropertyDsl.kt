@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.sagemaker.CfnModelCard

/**
 * An overview of a model's inference environment.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * InferenceEnvironmentProperty inferenceEnvironmentProperty =
 * InferenceEnvironmentProperty.builder()
 * .containerImage(List.of("containerImage"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-inferenceenvironment.html)
 */
@CdkDslMarker
public class CfnModelCardInferenceEnvironmentPropertyDsl {
  private val cdkBuilder: CfnModelCard.InferenceEnvironmentProperty.Builder =
      CfnModelCard.InferenceEnvironmentProperty.builder()

  private val _containerImage: MutableList<String> = mutableListOf()

  /**
   * @param containerImage The container used to run the inference environment.
   */
  public fun containerImage(vararg containerImage: String) {
    _containerImage.addAll(listOf(*containerImage))
  }

  /**
   * @param containerImage The container used to run the inference environment.
   */
  public fun containerImage(containerImage: Collection<String>) {
    _containerImage.addAll(containerImage)
  }

  public fun build(): CfnModelCard.InferenceEnvironmentProperty {
    if(_containerImage.isNotEmpty()) cdkBuilder.containerImage(_containerImage)
    return cdkBuilder.build()
  }
}
