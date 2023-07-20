@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfig

@CdkDslMarker
public class CfnEndpointConfigProductionVariantPropertyDsl {
  private val cdkBuilder: CfnEndpointConfig.ProductionVariantProperty.Builder =
      CfnEndpointConfig.ProductionVariantProperty.builder()

  public fun acceleratorType(acceleratorType: String) {
    cdkBuilder.acceleratorType(acceleratorType)
  }

  public
      fun containerStartupHealthCheckTimeoutInSeconds(containerStartupHealthCheckTimeoutInSeconds: Number) {
    cdkBuilder.containerStartupHealthCheckTimeoutInSeconds(containerStartupHealthCheckTimeoutInSeconds)
  }

  public fun enableSsmAccess(enableSsmAccess: Boolean) {
    cdkBuilder.enableSsmAccess(enableSsmAccess)
  }

  public fun enableSsmAccess(enableSsmAccess: IResolvable) {
    cdkBuilder.enableSsmAccess(enableSsmAccess)
  }

  public fun initialInstanceCount(initialInstanceCount: Number) {
    cdkBuilder.initialInstanceCount(initialInstanceCount)
  }

  public fun initialVariantWeight(initialVariantWeight: Number) {
    cdkBuilder.initialVariantWeight(initialVariantWeight)
  }

  public fun instanceType(instanceType: String) {
    cdkBuilder.instanceType(instanceType)
  }

  public fun modelDataDownloadTimeoutInSeconds(modelDataDownloadTimeoutInSeconds: Number) {
    cdkBuilder.modelDataDownloadTimeoutInSeconds(modelDataDownloadTimeoutInSeconds)
  }

  public fun modelName(modelName: String) {
    cdkBuilder.modelName(modelName)
  }

  public fun serverlessConfig(serverlessConfig: IResolvable) {
    cdkBuilder.serverlessConfig(serverlessConfig)
  }

  public fun serverlessConfig(serverlessConfig: CfnEndpointConfig.ServerlessConfigProperty) {
    cdkBuilder.serverlessConfig(serverlessConfig)
  }

  public fun variantName(variantName: String) {
    cdkBuilder.variantName(variantName)
  }

  public fun volumeSizeInGb(volumeSizeInGb: Number) {
    cdkBuilder.volumeSizeInGb(volumeSizeInGb)
  }

  public fun build(): CfnEndpointConfig.ProductionVariantProperty = cdkBuilder.build()
}
