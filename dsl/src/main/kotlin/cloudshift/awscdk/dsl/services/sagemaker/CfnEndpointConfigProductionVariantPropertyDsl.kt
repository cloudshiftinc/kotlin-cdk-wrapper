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

  /**
   * @param acceleratorType The size of the Elastic Inference (EI) instance to use for the
   * production variant.
   * EI instances provide on-demand GPU computing for inference. For more information, see [Using
   * Elastic Inference in Amazon SageMaker](https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html) .
   * For more information, see [Using Elastic Inference in Amazon
   * SageMaker](https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html) .
   */
  public fun acceleratorType(acceleratorType: String) {
    cdkBuilder.acceleratorType(acceleratorType)
  }

  /**
   * @param containerStartupHealthCheckTimeoutInSeconds the value to be set.
   */
  public
      fun containerStartupHealthCheckTimeoutInSeconds(containerStartupHealthCheckTimeoutInSeconds: Number) {
    cdkBuilder.containerStartupHealthCheckTimeoutInSeconds(containerStartupHealthCheckTimeoutInSeconds)
  }

  /**
   * @param enableSsmAccess the value to be set.
   */
  public fun enableSsmAccess(enableSsmAccess: Boolean) {
    cdkBuilder.enableSsmAccess(enableSsmAccess)
  }

  /**
   * @param enableSsmAccess the value to be set.
   */
  public fun enableSsmAccess(enableSsmAccess: IResolvable) {
    cdkBuilder.enableSsmAccess(enableSsmAccess)
  }

  /**
   * @param initialInstanceCount Number of instances to launch initially.
   */
  public fun initialInstanceCount(initialInstanceCount: Number) {
    cdkBuilder.initialInstanceCount(initialInstanceCount)
  }

  /**
   * @param initialVariantWeight Determines initial traffic distribution among all of the models
   * that you specify in the endpoint configuration. 
   * The traffic to a production variant is determined by the ratio of the `VariantWeight` to the
   * sum of all `VariantWeight` values across all ProductionVariants. If unspecified, it defaults to
   * 1.0.
   */
  public fun initialVariantWeight(initialVariantWeight: Number) {
    cdkBuilder.initialVariantWeight(initialVariantWeight)
  }

  /**
   * @param instanceType The ML compute instance type.
   */
  public fun instanceType(instanceType: String) {
    cdkBuilder.instanceType(instanceType)
  }

  /**
   * @param modelDataDownloadTimeoutInSeconds the value to be set.
   */
  public fun modelDataDownloadTimeoutInSeconds(modelDataDownloadTimeoutInSeconds: Number) {
    cdkBuilder.modelDataDownloadTimeoutInSeconds(modelDataDownloadTimeoutInSeconds)
  }

  /**
   * @param modelName The name of the model that you want to host. 
   * This is the name that you specified when creating the model.
   */
  public fun modelName(modelName: String) {
    cdkBuilder.modelName(modelName)
  }

  /**
   * @param serverlessConfig The serverless configuration for an endpoint.
   * Specifies a serverless endpoint configuration instead of an instance-based endpoint
   * configuration.
   */
  public fun serverlessConfig(serverlessConfig: IResolvable) {
    cdkBuilder.serverlessConfig(serverlessConfig)
  }

  /**
   * @param serverlessConfig The serverless configuration for an endpoint.
   * Specifies a serverless endpoint configuration instead of an instance-based endpoint
   * configuration.
   */
  public fun serverlessConfig(serverlessConfig: CfnEndpointConfig.ServerlessConfigProperty) {
    cdkBuilder.serverlessConfig(serverlessConfig)
  }

  /**
   * @param variantName The name of the production variant. 
   */
  public fun variantName(variantName: String) {
    cdkBuilder.variantName(variantName)
  }

  /**
   * @param volumeSizeInGb the value to be set.
   */
  public fun volumeSizeInGb(volumeSizeInGb: Number) {
    cdkBuilder.volumeSizeInGb(volumeSizeInGb)
  }

  public fun build(): CfnEndpointConfig.ProductionVariantProperty = cdkBuilder.build()
}
