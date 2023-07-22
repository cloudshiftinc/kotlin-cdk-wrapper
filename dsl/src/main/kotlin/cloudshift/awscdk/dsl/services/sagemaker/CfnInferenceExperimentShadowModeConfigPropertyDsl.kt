@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment

/**
 * The configuration of `ShadowMode` inference experiment type, which specifies a production variant
 * to take all the inference requests, and a shadow variant to which Amazon SageMaker replicates a
 * percentage of the inference requests.
 *
 * For the shadow variant it also specifies the percentage of requests that Amazon SageMaker
 * replicates.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * ShadowModeConfigProperty shadowModeConfigProperty = ShadowModeConfigProperty.builder()
 * .shadowModelVariants(List.of(ShadowModelVariantConfigProperty.builder()
 * .samplingPercentage(123)
 * .shadowModelVariantName("shadowModelVariantName")
 * .build()))
 * .sourceModelVariantName("sourceModelVariantName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-inferenceexperiment-shadowmodeconfig.html)
 */
@CdkDslMarker
public class CfnInferenceExperimentShadowModeConfigPropertyDsl {
  private val cdkBuilder: CfnInferenceExperiment.ShadowModeConfigProperty.Builder =
      CfnInferenceExperiment.ShadowModeConfigProperty.builder()

  private val _shadowModelVariants: MutableList<Any> = mutableListOf()

  /**
   * @param shadowModelVariants List of shadow variant configurations. 
   */
  public fun shadowModelVariants(vararg shadowModelVariants: Any) {
    _shadowModelVariants.addAll(listOf(*shadowModelVariants))
  }

  /**
   * @param shadowModelVariants List of shadow variant configurations. 
   */
  public fun shadowModelVariants(shadowModelVariants: Collection<Any>) {
    _shadowModelVariants.addAll(shadowModelVariants)
  }

  /**
   * @param shadowModelVariants List of shadow variant configurations. 
   */
  public fun shadowModelVariants(shadowModelVariants: IResolvable) {
    cdkBuilder.shadowModelVariants(shadowModelVariants)
  }

  /**
   * @param sourceModelVariantName The name of the production variant, which takes all the inference
   * requests. 
   */
  public fun sourceModelVariantName(sourceModelVariantName: String) {
    cdkBuilder.sourceModelVariantName(sourceModelVariantName)
  }

  public fun build(): CfnInferenceExperiment.ShadowModeConfigProperty {
    if(_shadowModelVariants.isNotEmpty()) cdkBuilder.shadowModelVariants(_shadowModelVariants)
    return cdkBuilder.build()
  }
}
