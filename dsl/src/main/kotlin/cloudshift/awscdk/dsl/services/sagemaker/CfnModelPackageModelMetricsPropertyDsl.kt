@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

@CdkDslMarker
public class CfnModelPackageModelMetricsPropertyDsl {
  private val cdkBuilder: CfnModelPackage.ModelMetricsProperty.Builder =
      CfnModelPackage.ModelMetricsProperty.builder()

  /**
   * @param bias Metrics that measure bais in a model.
   */
  public fun bias(bias: IResolvable) {
    cdkBuilder.bias(bias)
  }

  /**
   * @param bias Metrics that measure bais in a model.
   */
  public fun bias(bias: CfnModelPackage.BiasProperty) {
    cdkBuilder.bias(bias)
  }

  /**
   * @param explainability Metrics that help explain a model.
   */
  public fun explainability(explainability: IResolvable) {
    cdkBuilder.explainability(explainability)
  }

  /**
   * @param explainability Metrics that help explain a model.
   */
  public fun explainability(explainability: CfnModelPackage.ExplainabilityProperty) {
    cdkBuilder.explainability(explainability)
  }

  /**
   * @param modelDataQuality Metrics that measure the quality of the input data for a model.
   */
  public fun modelDataQuality(modelDataQuality: IResolvable) {
    cdkBuilder.modelDataQuality(modelDataQuality)
  }

  /**
   * @param modelDataQuality Metrics that measure the quality of the input data for a model.
   */
  public fun modelDataQuality(modelDataQuality: CfnModelPackage.ModelDataQualityProperty) {
    cdkBuilder.modelDataQuality(modelDataQuality)
  }

  /**
   * @param modelQuality Metrics that measure the quality of a model.
   */
  public fun modelQuality(modelQuality: IResolvable) {
    cdkBuilder.modelQuality(modelQuality)
  }

  /**
   * @param modelQuality Metrics that measure the quality of a model.
   */
  public fun modelQuality(modelQuality: CfnModelPackage.ModelQualityProperty) {
    cdkBuilder.modelQuality(modelQuality)
  }

  public fun build(): CfnModelPackage.ModelMetricsProperty = cdkBuilder.build()
}
