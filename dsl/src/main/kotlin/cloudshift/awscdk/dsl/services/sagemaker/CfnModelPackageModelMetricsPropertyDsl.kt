@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

@CdkDslMarker
public class CfnModelPackageModelMetricsPropertyDsl {
  private val cdkBuilder: CfnModelPackage.ModelMetricsProperty.Builder =
      CfnModelPackage.ModelMetricsProperty.builder()

  public fun bias(bias: IResolvable) {
    cdkBuilder.bias(bias)
  }

  public fun bias(bias: CfnModelPackage.BiasProperty) {
    cdkBuilder.bias(bias)
  }

  public fun explainability(explainability: IResolvable) {
    cdkBuilder.explainability(explainability)
  }

  public fun explainability(explainability: CfnModelPackage.ExplainabilityProperty) {
    cdkBuilder.explainability(explainability)
  }

  public fun modelDataQuality(modelDataQuality: IResolvable) {
    cdkBuilder.modelDataQuality(modelDataQuality)
  }

  public fun modelDataQuality(modelDataQuality: CfnModelPackage.ModelDataQualityProperty) {
    cdkBuilder.modelDataQuality(modelDataQuality)
  }

  public fun modelQuality(modelQuality: IResolvable) {
    cdkBuilder.modelQuality(modelQuality)
  }

  public fun modelQuality(modelQuality: CfnModelPackage.ModelQualityProperty) {
    cdkBuilder.modelQuality(modelQuality)
  }

  public fun build(): CfnModelPackage.ModelMetricsProperty = cdkBuilder.build()
}
