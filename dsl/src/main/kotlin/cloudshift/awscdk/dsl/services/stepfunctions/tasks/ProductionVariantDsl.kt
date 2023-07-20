@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ec2.InstanceType
import software.amazon.awscdk.services.stepfunctions.tasks.AcceleratorType
import software.amazon.awscdk.services.stepfunctions.tasks.ProductionVariant

@CdkDslMarker
public class ProductionVariantDsl {
  private val cdkBuilder: ProductionVariant.Builder = ProductionVariant.builder()

  public fun acceleratorType(acceleratorType: AcceleratorType) {
    cdkBuilder.acceleratorType(acceleratorType)
  }

  public fun initialInstanceCount(initialInstanceCount: Number) {
    cdkBuilder.initialInstanceCount(initialInstanceCount)
  }

  public fun initialVariantWeight(initialVariantWeight: Number) {
    cdkBuilder.initialVariantWeight(initialVariantWeight)
  }

  public fun instanceType(instanceType: InstanceType) {
    cdkBuilder.instanceType(instanceType)
  }

  public fun modelName(modelName: String) {
    cdkBuilder.modelName(modelName)
  }

  public fun variantName(variantName: String) {
    cdkBuilder.variantName(variantName)
  }

  public fun build(): ProductionVariant = cdkBuilder.build()
}
